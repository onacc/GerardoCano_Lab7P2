/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerardocano_lab9p2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author gcano
 */
public class adminCarpeta {
     private ArrayList<Carpeta> carpetas = new ArrayList();
    private File archivo = null;

    public adminCarpeta(String path) {
        archivo = new File(path);
    }

    public ArrayList<Carpeta> getListaPersonas() {
        return carpetas;
    }

    public void setListaPersonas(ArrayList<Carpeta> carpetas) {
        this.carpetas = carpetas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return  "."+carpetas;
    }

    //extra mutador
    public void setPersona(Carpeta p) {
        this.carpetas.add(p);
    }

    public void cargarArchivo() {
        try {            
            carpetas = new ArrayList();
            Carpeta temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto= new ObjectInputStream(entrada);
                try {
                    while ((temp = (Carpeta) objeto.readObject()) != null) {
                        carpetas.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Carpeta t : carpetas) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
