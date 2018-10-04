package com.fernandopaniagua.supercarreras2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CircuitoPainter extends Thread {
    private JPCircuito jpc;
    public CircuitoPainter(JPCircuito jpc){
        this.jpc = jpc;
    }

    @Override
    public void run() {
        while(true){
            try {
                jpc.repaint();
                sleep(30);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    
}
