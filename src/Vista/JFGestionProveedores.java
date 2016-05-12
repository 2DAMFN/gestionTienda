/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorJFGestionProveedores;

/**
 *
 * @author Mario
 */
public class JFGestionProveedores extends javax.swing.JFrame {

    private ControladorJFGestionProveedores controlador;
    /**
     * Creates new form JFGestionProveedores
     */
    public JFGestionProveedores() {
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

        jButtonAnadirProveedor = new javax.swing.JButton();
        jButtonBorrarProveedor = new javax.swing.JButton();
        jButtonModificarProveedor = new javax.swing.JButton();
        jButtonVerProveedores = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú de Gestion de Proveedores");
        setResizable(false);

        jButtonAnadirProveedor.setText("Añadir Proveedor");
        jButtonAnadirProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnadirProveedorActionPerformed(evt);
            }
        });

        jButtonBorrarProveedor.setText("Borrar Proveedor");
        jButtonBorrarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarProveedorActionPerformed(evt);
            }
        });

        jButtonModificarProveedor.setText("Modificar Proveedor");
        jButtonModificarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarProveedorActionPerformed(evt);
            }
        });

        jButtonVerProveedores.setText("Ver Proveedores");
        jButtonVerProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerProveedoresActionPerformed(evt);
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
        jLabel7.setText("Proveedores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonModificarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBorrarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAnadirProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVerProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(28, 28, 28)
                .addComponent(jButtonAnadirProveedor)
                .addGap(18, 18, 18)
                .addComponent(jButtonBorrarProveedor)
                .addGap(18, 18, 18)
                .addComponent(jButtonModificarProveedor)
                .addGap(18, 18, 18)
                .addComponent(jButtonVerProveedores)
                .addGap(18, 18, 18)
                .addComponent(jButtonVolver)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnadirProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnadirProveedorActionPerformed
        // TODO add your handling code here:
        controlador.anadirProveedor();
    }//GEN-LAST:event_jButtonAnadirProveedorActionPerformed

    private void jButtonBorrarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarProveedorActionPerformed
        // TODO add your handling code here:
        controlador.borrarProveedor();
    }//GEN-LAST:event_jButtonBorrarProveedorActionPerformed

    private void jButtonModificarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarProveedorActionPerformed
        // TODO add your handling code here:
        controlador.modificarProveedor();
    }//GEN-LAST:event_jButtonModificarProveedorActionPerformed

    private void jButtonVerProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerProveedoresActionPerformed
        // TODO add your handling code here:
        controlador.verProveedor();
    }//GEN-LAST:event_jButtonVerProveedoresActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        // TODO add your handling code here:
        controlador.volver();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    public void setControlador(ControladorJFGestionProveedores controlador) {
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
            java.util.logging.Logger.getLogger(JFGestionProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFGestionProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFGestionProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFGestionProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFGestionProveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnadirProveedor;
    private javax.swing.JButton jButtonBorrarProveedor;
    private javax.swing.JButton jButtonModificarProveedor;
    private javax.swing.JButton jButtonVerProveedores;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
