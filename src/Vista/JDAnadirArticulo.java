/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import Controlador.ControladorJDAnadirArticulo;
import javax.swing.JTextField;

/**
 *
 * @author Joaquin
 */
public class JDAnadirArticulo extends javax.swing.JDialog {

    private ControladorJDAnadirArticulo controlador;

    /**
     * Creates new form JDAnadirArticulo
     *
     * @param parent
     * @param modal
     */
    public JDAnadirArticulo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * Establece el controlador de la vista
     *
     * @param controlador
     */
    public void setControlador(ControladorJDAnadirArticulo controlador) {
        this.controlador = controlador;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldStockArticulo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNombreArticulo1 = new javax.swing.JTextField();
        jTextFieldPrecioUnitarioArticulo = new javax.swing.JTextField();
        jTextFieldImpuestoArticulo = new javax.swing.JTextField();
        jTextFieldDescripcionArticulo = new javax.swing.JTextField();
        jButtonAceptar = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Añadir Articulo");
        setResizable(false);

        jTextFieldStockArticulo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Stock", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jTextFieldStockArticulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldStockArticuloKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldStockArticuloKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Añadir Articulo");

        jTextFieldNombreArticulo1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jTextFieldNombreArticulo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreArticulo1ActionPerformed(evt);
            }
        });
        jTextFieldNombreArticulo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNombreArticulo1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreArticulo1KeyTyped(evt);
            }
        });

        jTextFieldPrecioUnitarioArticulo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Precio Unitario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jTextFieldPrecioUnitarioArticulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPrecioUnitarioArticuloKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPrecioUnitarioArticuloKeyTyped(evt);
            }
        });

        jTextFieldImpuestoArticulo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Impuesto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jTextFieldImpuestoArticulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldImpuestoArticuloKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldImpuestoArticuloKeyTyped(evt);
            }
        });

        jTextFieldDescripcionArticulo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descripcion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jTextFieldDescripcionArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescripcionArticuloActionPerformed(evt);
            }
        });
        jTextFieldDescripcionArticulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldDescripcionArticuloKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDescripcionArticuloKeyTyped(evt);
            }
        });

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonBorrar.setText("Borrar Todo");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAceptar)
                        .addGap(37, 37, 37)
                        .addComponent(jButtonBorrar)
                        .addGap(37, 37, 37)
                        .addComponent(jButtonCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldNombreArticulo1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(jTextFieldDescripcionArticulo)
                            .addComponent(jTextFieldStockArticulo)
                            .addComponent(jTextFieldPrecioUnitarioArticulo)
                            .addComponent(jTextFieldImpuestoArticulo))))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jTextFieldNombreArticulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldDescripcionArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldStockArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldPrecioUnitarioArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldImpuestoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar)
                    .addComponent(jButtonBorrar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldStockArticuloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldStockArticuloKeyPressed
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && evt.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
            if (evt.getKeyCode() != 8 || evt.getKeyCode() != 16) {

            } else {
                evt.consume();
                JOptionPane.showMessageDialog(this, "Debes introducir letras o numeros", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTextFieldStockArticuloKeyPressed

    private void jTextFieldStockArticuloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldStockArticuloKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && evt.getKeyCode() != KeyEvent.VK_BACK_SPACE && evt.getKeyCode() != '.') {
            if (evt.getKeyCode() != 8 || evt.getKeyCode() != 16) {

            } else {
                evt.consume();
                JOptionPane.showMessageDialog(this, "Debes introducir letras o numeros", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTextFieldStockArticuloKeyTyped

    private void jTextFieldNombreArticulo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreArticulo1KeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        System.out.println(evt.getKeyCode());
        if (!Character.isAlphabetic(c) && !Character.isDigit(c) && evt.getKeyCode() != KeyEvent.VK_DELETE && evt.getKeyCode() != 8 && evt.getKeyCode() != KeyEvent.VK_BACK_SPACE && evt.getKeyCode() != KeyEvent.VK_CAPS_LOCK && evt.getKeyCode() != KeyEvent.VK_COMMA) {
            if (evt.getKeyCode() != 8 || evt.getKeyCode() != 16) {
            } else {
                evt.consume();

            }
        }
    }//GEN-LAST:event_jTextFieldNombreArticulo1KeyPressed

    private void jTextFieldNombreArticulo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreArticulo1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isAlphabetic(c) && !Character.isDigit(c) && evt.getKeyCode() != KeyEvent.VK_DELETE && evt.getKeyCode() != 8 && evt.getKeyCode() != KeyEvent.VK_BACK_SPACE && evt.getKeyCode() != KeyEvent.VK_CAPS_LOCK && evt.getKeyCode() != KeyEvent.VK_COMMA) {
            if (evt.getKeyCode() != 8 || evt.getKeyCode() != 16) {
                //esto esta hecho porque si lo metemos en el if anterior no funciona por alguna extraña razon
            } else {
                evt.consume();
                JOptionPane.showMessageDialog(this, "Debes introducir letras o numeros", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTextFieldNombreArticulo1KeyTyped

    private void jTextFieldNombreArticulo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreArticulo1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextFieldNombreArticulo1ActionPerformed

    private void jTextFieldPrecioUnitarioArticuloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPrecioUnitarioArticuloKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (Character.isLetter(c) || !Character.isDigit(c) && evt.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
            if (c == '.' || evt.getKeyCode() != 8 || evt.getKeyCode() != 16) {

            } else {
                evt.consume();

            }
        }
    }//GEN-LAST:event_jTextFieldPrecioUnitarioArticuloKeyPressed

    private void jTextFieldPrecioUnitarioArticuloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPrecioUnitarioArticuloKeyTyped
        // TODO add your handling code here:char c = evt.getKeyChar();
        char c = evt.getKeyChar();

        if (Character.isLetter(c) || !Character.isDigit(c) && evt.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
            if (c == '.' || evt.getKeyCode() != 8 || evt.getKeyCode() != 16) {

            } else {
                evt.consume();
                JOptionPane.showMessageDialog(this, "Debes introducir letras o numeros", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTextFieldPrecioUnitarioArticuloKeyTyped

    private void jTextFieldImpuestoArticuloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldImpuestoArticuloKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (Character.isLetter(c) || !Character.isDigit(c) && evt.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
            if (c == '.' || evt.getKeyCode() != 8 || evt.getKeyCode() != 16) {

            } else {
                evt.consume();
                JOptionPane.showMessageDialog(this, "Debes introducir letras o numeros", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTextFieldImpuestoArticuloKeyPressed

    private void jTextFieldImpuestoArticuloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldImpuestoArticuloKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (Character.isLetter(c) || !Character.isDigit(c) && evt.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
            if (c == '.' || evt.getKeyCode() != 8 || evt.getKeyCode() != 16) {

            } else {
                evt.consume();
                JOptionPane.showMessageDialog(this, "Debes introducir letras o numeros", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTextFieldImpuestoArticuloKeyTyped

    private void jTextFieldDescripcionArticuloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescripcionArticuloKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isAlphabetic(c) && !Character.isDigit(c) && evt.getKeyCode() != KeyEvent.VK_DELETE && evt.getKeyCode() != 8 && evt.getKeyCode() != KeyEvent.VK_BACK_SPACE && evt.getKeyCode() != KeyEvent.VK_CAPS_LOCK && evt.getKeyCode() != KeyEvent.VK_COMMA) {
            if (evt.getKeyCode() != 8 || evt.getKeyCode() != 16) {
                //esto esta hecho porque si lo metemos en el if anterior no funciona por alguna extraña razon
            } else {
                evt.consume();

            }
        }

    }//GEN-LAST:event_jTextFieldDescripcionArticuloKeyPressed

    private void jTextFieldDescripcionArticuloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescripcionArticuloKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isAlphabetic(c) && !Character.isDigit(c) && evt.getKeyCode() != KeyEvent.VK_DELETE && evt.getKeyCode() != 8 && evt.getKeyCode() != KeyEvent.VK_BACK_SPACE && evt.getKeyCode() != KeyEvent.VK_CAPS_LOCK && evt.getKeyCode() != KeyEvent.VK_COMMA) {
            if (evt.getKeyCode() != 8 || evt.getKeyCode() != 16) {
                //esto esta hecho porque si lo metemos en el if anterior no funciona por alguna extraña razon
            } else {
                evt.consume();
                JOptionPane.showMessageDialog(this, "Debes introducir letras o numeros", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTextFieldDescripcionArticuloKeyTyped

    private void jTextFieldDescripcionArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescripcionArticuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescripcionArticuloActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        // TODO add your handling code here:
        controlador.compruebaCampos();
        controlador.anadirArticulo();
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        // TODO add your handling code here:
        controlador.limpiaDatos();
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    /**
     * Devuelve el objeto jtextfield descripcion
     *
     * @return
     */
    public JTextField getjTextFieldDescripcionArticulo() {
        return jTextFieldDescripcionArticulo;
    }

    /**
     * Establece el valor del objeto jtextfield descripcion
     *
     * @param jTextFieldDescripcionArticulo
     */
    public void setjTextFieldDescripcionArticulo(JTextField jTextFieldDescripcionArticulo) {
        this.jTextFieldDescripcionArticulo = jTextFieldDescripcionArticulo;
    }

    /**
     * Devuelve el objeto jtextfield impuesto
     *
     * @return
     */
    public JTextField getjTextFieldImpuestoArticulo() {
        return jTextFieldImpuestoArticulo;
    }

    /**
     * Establece el valor del objeto jtextfield impuesto
     *
     * @param jTextFieldImpuestoArticulo
     */
    public void setjTextFieldImpuestoArticulo(JTextField jTextFieldImpuestoArticulo) {
        this.jTextFieldImpuestoArticulo = jTextFieldImpuestoArticulo;
    }

    /**
     * Devuelve el objeto jtextfield nombre
     *
     * @return
     */
    public JTextField getjTextFieldNombreArticulo1() {
        return jTextFieldNombreArticulo1;
    }

    /**
     * Establece el valor del objeto jtextfield nombre
     *
     * @param jTextFieldNombreArticulo1
     */
    public void setjTextFieldNombreArticulo1(JTextField jTextFieldNombreArticulo1) {
        this.jTextFieldNombreArticulo1 = jTextFieldNombreArticulo1;
    }

    /**
     * Devuelve el objeto jtextfield precioUnitario
     *
     * @return
     */
    public JTextField getjTextFieldPrecioUnitarioArticulo() {
        return jTextFieldPrecioUnitarioArticulo;
    }

    /**
     * Establece el valor del objeto jtextfield precioUnitario
     *
     * @param jTextFieldPrecioUnitarioArticulo
     */
    public void setjTextFieldPrecioUnitarioArticulo(JTextField jTextFieldPrecioUnitarioArticulo) {
        this.jTextFieldPrecioUnitarioArticulo = jTextFieldPrecioUnitarioArticulo;
    }

    /**
     * Devuelve el objeto jtextfield stock
     *
     * @return
     */
    public JTextField getjTextFieldStockArticulo() {
        return jTextFieldStockArticulo;
    }

    /**
     * Establece el valor del objeto jtextfield stock
     *
     * @param jTextFieldStockArticulo
     */
    public void setjTextFieldStockArticulo(JTextField jTextFieldStockArticulo) {
        this.jTextFieldStockArticulo = jTextFieldStockArticulo;
    }

    /**
     *
     * @param args
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
            java.util.logging.Logger.getLogger(JDAnadirArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDAnadirArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDAnadirArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDAnadirArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDAnadirArticulo dialog = new JDAnadirArticulo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldDescripcionArticulo;
    private javax.swing.JTextField jTextFieldImpuestoArticulo;
    private javax.swing.JTextField jTextFieldNombreArticulo1;
    private javax.swing.JTextField jTextFieldPrecioUnitarioArticulo;
    private javax.swing.JTextField jTextFieldStockArticulo;
    // End of variables declaration//GEN-END:variables
}