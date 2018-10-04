/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fernandopaniagua.supercarreras2;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author Alumno
 */
public class JPCircuito extends javax.swing.JPanel {

    Car f1;
    Car f2;
    Car f3;
    
    public JPCircuito() {
        try {
            initComponents();
            BufferedImage sprite1
                = ImageIO.read(
                    new File(
                    JPCircuito.class.getResource("/sprites/f1.png").getFile()));
            f1 = new Car("TORRENTE", sprite1, 10f, 10f, 0.001f);
        } catch (Exception e){
            System.out.println("Error de ejecución");
            e.printStackTrace();
        }
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2g = (Graphics2D)g;
        g2g.drawImage(f1.getSprite(), (int)f1.getxPos(), (int)f1.getyPos(), 150, 50, null);
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
