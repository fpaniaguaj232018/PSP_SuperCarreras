package com.fernandopaniagua.supercarreras2;
public class JFSuperCarreras extends javax.swing.JFrame {

    public JFSuperCarreras() {
        initComponents();
        setBounds(0,0,800,400);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbArrancar = new javax.swing.JButton();
        jbReiniciar = new javax.swing.JButton();
        jPCircuito1 = new com.fernandopaniagua.supercarreras2.JPCircuito();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbArrancar.setText("Arrancar");
        jbArrancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbArrancarActionPerformed(evt);
            }
        });
        jPanel1.add(jbArrancar);

        jbReiniciar.setText("Reiniciar");
        jPanel1.add(jbReiniciar);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jPCircuito1Layout = new javax.swing.GroupLayout(jPCircuito1);
        jPCircuito1.setLayout(jPCircuito1Layout);
        jPCircuito1Layout.setHorizontalGroup(
            jPCircuito1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPCircuito1Layout.setVerticalGroup(
            jPCircuito1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
        );

        getContentPane().add(jPCircuito1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbArrancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbArrancarActionPerformed
        //NECESITO LLAMAR AL ARRANCAR DE LOS COCHES.
        jPCircuito1.getF1().arrancar(jPCircuito1);
        jPCircuito1.getF2().arrancar(jPCircuito1);
        jPCircuito1.getF3().arrancar(jPCircuito1);
    }//GEN-LAST:event_jbArrancarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFSuperCarreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFSuperCarreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFSuperCarreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFSuperCarreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFSuperCarreras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.fernandopaniagua.supercarreras2.JPCircuito jPCircuito1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbArrancar;
    private javax.swing.JButton jbReiniciar;
    // End of variables declaration//GEN-END:variables
}
