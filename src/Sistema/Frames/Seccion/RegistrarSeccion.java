/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Sistema.Frames.Seccion;

import java.awt.Color;

/**
 *
 * @author USUARIO
 */
public class RegistrarSeccion extends javax.swing.JDialog {

    /**
     * Creates new form RegistrarSeccion
     */
    public RegistrarSeccion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        setBackground(new Color(0, 0, 0, 80)); // Configura el fondo transparente

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlUpAlumno5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txtIdAlumno = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnSubirCurso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pnlUpAlumno5.setBackground(new java.awt.Color(255, 255, 255));
        pnlUpAlumno5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("X");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlUpAlumno5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 6, -1, -1));

        jLabel41.setFont(new java.awt.Font("Consolas", 0, 30)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(72, 99, 124));
        jLabel41.setText("SUBIR NUEVO CURSO");
        jLabel41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlUpAlumno5.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 76, 320, 51));

        jLabel42.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel42.setText("Nombre:");
        pnlUpAlumno5.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 140, 105, 30));

        txtIdAlumno.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtIdAlumno.setText("Series Y Ecuaciones Diferenciales");
        txtIdAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdAlumnoActionPerformed(evt);
            }
        });
        pnlUpAlumno5.add(txtIdAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 188, 356, 30));

        jLabel43.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel43.setText("Periodo:");
        pnlUpAlumno5.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 236, 173, 25));

        txtNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNombre.setText("2023 - I");
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        pnlUpAlumno5.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 279, 356, 33));

        jLabel46.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel46.setText("Categoría:");
        pnlUpAlumno5.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 330, 135, 27));

        txtEmail.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtEmail.setText("jTextField3");
        pnlUpAlumno5.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 375, 206, 30));

        btnSubirCurso.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        btnSubirCurso.setText("SUBIR CURSO");
        btnSubirCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubirCursoMouseClicked(evt);
            }
        });
        btnSubirCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirCursoActionPerformed(evt);
            }
        });
        pnlUpAlumno5.add(btnSubirCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 236, 196, 44));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 184;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(78, 235, 77, 235);
        getContentPane().add(pnlUpAlumno5, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        dispose();
    }//GEN-LAST:event_jPanel6MouseClicked

    private void txtIdAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdAlumnoActionPerformed

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMouseClicked

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnSubirCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubirCursoMouseClicked

    }//GEN-LAST:event_btnSubirCursoMouseClicked

    private void btnSubirCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubirCursoActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarSeccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarSeccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarSeccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarSeccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistrarSeccion dialog = new RegistrarSeccion(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnSubirCurso;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel pnlUpAlumno5;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdAlumno;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
