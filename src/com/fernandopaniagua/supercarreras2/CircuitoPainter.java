package com.fernandopaniagua.supercarreras2;

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
                sleep(16);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    
}
