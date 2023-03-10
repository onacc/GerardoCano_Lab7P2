/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerardocano_lab9p2;

import java.util.Random;

/**
 *
 * @author gcano
 */
public class Archivo {
    private String link, nombre, extension;
    private double tam;

    public Archivo(String link, String nombre, String extension, double tam) {
        this.link = link;
        this.nombre = nombre;
        this.extension = extension;
        this.tam = tam;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public double getTam() {
        return tam;
    }

    public void setTam(double tam) {
        this.tam = tam;
    }
   
    

    @Override
    public String toString() {
        return   nombre + "/" + extension + "" + link + "/" + tam +"MB";
    }
    
}
