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
    private String nombre,link;
    private ArrayList<Archivo> archives = new ArrayList();
    private ArrayList<Carpeta> carpetas = new ArrayList();

    public Carpeta(String nombrelink) {
        this.nombre = nombrelink;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getNombrelink() {
        return nombre;
    }

    public void setNombrelink(String nombrelink) {
        this.nombre = nombrelink;
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
        return   nombre+"/"+link +"/" + archives + "/" + carpetas ;
    }

    public Carpeta(String nombre, String link) {
        this.nombre = nombre;
        this.link = link;
    }
    
}
