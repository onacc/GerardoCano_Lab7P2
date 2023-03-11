/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerardocano_lab9p2;

import javax.swing.JProgressBar;

/**
 *
 * @author gcano
 */
public class adminBarra extends Thread {
    JProgressBar barra;
    boolean avanzar,vive;

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }
    

    public adminBarra(JProgressBar barra) {
        this.barra = barra;
        this.avanzar = avanzar;
    }
    public void run(){
        while(avanzar){
            if(avanzar){
                barra.setValue(barra.getValue()+1);
                if(barra.getValue()==100000000){
                    vive=false;
                } }
            
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
            }
        }
    }
}
