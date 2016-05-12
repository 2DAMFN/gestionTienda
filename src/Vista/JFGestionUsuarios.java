/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorJFGestionUsuarios;

/**
 *
 * @author Mario
 */
public class JFGestionUsuarios extends javax.swing.JFrame {

    private ControladorJFGestionUsuarios controlador;
    /**
     * Creates new form JFGestionUsuarios
     */
    public JFGestionUsuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAnadirCliente = new javax.swing.JButton();
        jButtonBorraCliente = new javax.swing.JButton();
        jButtonModificaCliente = new javax.swing.JButton();
        jButtonVerCliente = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú de Gestión de Usuarios");
        setResizable(false);

        jButtonAnadirCliente.setText("Añadir Usuario");
        jButtonAnadirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnadirClienteActionPerformed(evt);
            }
        });

        jButtonBorraCliente.setText("Borrar Usuario");
        jButtonBorraCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorraClienteActionPerformed(evt);
            }
        });

        jButtonModificaCliente.setText("Modificar Usuario");
        jButtonModificaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificaClienteActionPerformed(evt);
            }
        });

        jButtonVerCliente.setText("Ver Usuarios");
        jButtonVerCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerClienteActionPerformed(evt);
            }
        });

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Usuarios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonModificaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAnadirCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBorraCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVerCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(39, 39, 39)
                .addComponent(jButtonAnadirCliente)
                .addGap(18, 18, 18)
                .addComponent(jButtonBorraCliente)
                .addGap(18, 18, 18)
                .addComponent(jButtonModificaCliente)
                .addGap(18, 18, 18)
                .addComponent(jButtonVerCliente)
                .addGap(18, 18, 18)
                .addComponent(jButtonVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnadirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnadirClienteActionPerformed
        // TODO add your handling code here:
        controlador.anadirUsuario();
    }//GEN-LAST:event_jButtonAnadirClienteActionPerformed

    private void jButtonBorraClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorraClienteActionPerformed
        // TODO add your handling code here:
        controlador.borrarUsuarios();
    }//GEN-LAST:event_jButtonBorraClienteActionPerformed

    private void jButtonModificaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificaClienteActionPerformed
        // TODO add your handling code here:
        controlador.modificarUsuarios();
    }//GEN-LAST:event_jButtonModificaClienteActionPerformed

    private void jButtonVerClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerClienteActionPerformed
        // TODO add your handling code here:
        controlador.verUsuarios();
    }//GEN-LAST:event_jButtonVerClienteActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        // TODO add your handling code here:
        controlador.volver();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    public void setControlador(ControladorJFGestionUsuarios controlador) {
        this.controlador = controlador;
    }
    
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
            java.util.logging.Logger.getLogger(JFGestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFGestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFGestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFGestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFGestionUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnadirCliente;
    private javax.swing.JButton jButtonBorraCliente;
    private javax.swing.JButton jButtonModificaCliente;
    private javax.swing.JButton jButtonVerCliente;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
