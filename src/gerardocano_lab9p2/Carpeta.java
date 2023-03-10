/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerardocano_lab9p2;

import java.util.ArrayList;

/**
 *
 * @author gcano
 */
public class Carpeta {
    private String nombrelink;
    private ArrayList<Archivo> archives = new ArrayList();
    private ArrayList<Carpeta> carpetas = new ArrayList();

    public Carpeta(String nombrelink) {
        this.nombrelink = nombrelink;
    }

    public String getNombrelink() {
        return nombrelink;
    }

    public void setNombrelink(String nombrelink) {
        this.nombrelink = nombrelink;
    }

    public ArrayList<Archivo> getArchives() {
        return archives;
    }

    public void setArchives(ArrayList<Archivo> archives) {
        this.archives = archives;
    }

    public ArrayList<Carpeta> getCarpetas() {
        return carpetas;
    }

    public void setCarpetas(ArrayList<Carpeta> carpetas) {
        this.carpetas = carpetas;
    }

    @Override
    public String toString() {
        return "Carpeta{" + "nombrelink=" + nombrelink + ", archives=" + archives + ", carpetas=" + carpetas + '}';
    }
    
}
