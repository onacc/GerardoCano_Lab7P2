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
    boolean avanzar;
    

    public adminBarra(JProgressBar barra, boolean avanzar) {
        this.barra = barra;
        this.avanzar = avanzar;
    }
    public void run(){
        while(avanzar){
            if(avanzar){
                barra.setValue(barra.getValue()+1);
                if(barra.getValue()==100000000){
                    //vive=false;
                }                
            } //FIN IF
            
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
            }
        }
    }
}
