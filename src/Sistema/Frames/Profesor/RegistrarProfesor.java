/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Sistema.Frames.Profesor;


import Sistema.Frames.Alumno.*;
import Sistema.Clases.*;
import Sistema.Frames.RegistroExitosoDialog;
import java.awt.Color;



/**
 *
 * @author USUARIO
 */
public class RegistrarProfesor extends javax.swing.JDialog {

    /**
     * Creates new form RegistrarAlumno2
     */
    public RegistrarProfesor(java.awt.Frame parent, boolean modal) {
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

        pnlUpProfe = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        lbCodigo = new javax.swing.JLabel();
        txtfCodigoP = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtfNombreP = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtfCursoP = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtfEmailP = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtNacionalidadP = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtfHorarioP = new javax.swing.JTextField();
        txtfSeccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtfsexo = new javax.swing.JTextField();
        exitPanel = new javax.swing.JPanel();
        exittxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1190, 750));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1190, 750));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pnlUpProfe.setBackground(new java.awt.Color(255, 255, 255));
        pnlUpProfe.setPreferredSize(new java.awt.Dimension(780, 580));
        pnlUpProfe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Consolas", 0, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(72, 99, 124));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("SUBIR NUEVO PROFESOR");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        pnlUpProfe.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 342, 41));

        jButton8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jButton8.setText("SUBIR ");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        pnlUpProfe.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 510, 185, 43));

        lbCodigo.setBackground(new java.awt.Color(255, 255, 255));
        lbCodigo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lbCodigo.setForeground(new java.awt.Color(51, 51, 0));
        lbCodigo.setText("Código:");
        pnlUpProfe.add(lbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 104, 176, 32));

        txtfCodigoP.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtfCodigoP.setForeground(new java.awt.Color(204, 204, 204));
        txtfCodigoP.setText("Ingrese código del profesor");
        txtfCodigoP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtfCodigoP.setCaretColor(new java.awt.Color(102, 102, 255));
        pnlUpProfe.add(txtfCodigoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 142, 274, 31));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 0));
        jLabel13.setText("Nombre Completo:");
        pnlUpProfe.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 191, 254, 25));

        txtfNombreP.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtfNombreP.setForeground(new java.awt.Color(204, 204, 204));
        txtfNombreP.setText("Ingrese nombre completo del profesor");
        txtfNombreP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlUpProfe.add(txtfNombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 228, 274, 31));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 0));
        jLabel14.setText("Curso:");
        pnlUpProfe.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 285, 342, -1));

        txtfCursoP.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtfCursoP.setForeground(new java.awt.Color(204, 204, 204));
        txtfCursoP.setText("Ingrese el curso a dictar");
        txtfCursoP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlUpProfe.add(txtfCursoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 318, 273, 31));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel15.setText("Sección:");
        pnlUpProfe.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 400, 84, -1));

        jLabel16.setBackground(new java.awt.Color(96, 131, 165));
        jLabel16.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 0));
        jLabel16.setText("E-mail:");
        pnlUpProfe.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 104, 281, 32));

        txtfEmailP.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtfEmailP.setForeground(new java.awt.Color(204, 204, 204));
        txtfEmailP.setText("Ingrese e-mail");
        txtfEmailP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlUpProfe.add(txtfEmailP, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 142, 251, 31));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 0));
        jLabel17.setText("Nacionalidad:");
        pnlUpProfe.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 193, 332, -1));

        txtNacionalidadP.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtNacionalidadP.setForeground(new java.awt.Color(204, 204, 204));
        txtNacionalidadP.setText("Ingrese  nacionalidad");
        txtNacionalidadP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlUpProfe.add(txtNacionalidadP, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 228, 252, 31));

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 0));
        jLabel18.setText("Horario:");
        pnlUpProfe.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 285, 197, -1));

        txtfHorarioP.setText("jTextField1");
        pnlUpProfe.add(txtfHorarioP, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 318, 252, 31));

        txtfSeccion.setText("jTextField2");
        pnlUpProfe.add(txtfSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 439, 273, 31));

        jLabel1.setText("Sexo:");
        pnlUpProfe.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 378, 187, -1));

        txtfsexo.setText("jTextField1");
        pnlUpProfe.add(txtfsexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 442, 222, -1));

        exitPanel.setBackground(new java.awt.Color(255, 255, 255));
        exitPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitPanelMouseClicked(evt);
            }
        });

        exittxt.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        exittxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exittxt.setText("X");

        javax.swing.GroupLayout exitPanelLayout = new javax.swing.GroupLayout(exitPanel);
        exitPanel.setLayout(exitPanelLayout);
        exitPanelLayout.setHorizontalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(exitPanelLayout.createSequentialGroup()
                    .addGap(0, 6, Short.MAX_VALUE)
                    .addComponent(exittxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 6, Short.MAX_VALUE)))
        );
        exitPanelLayout.setVerticalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(exitPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(exittxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pnlUpProfe.add(exitPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, -1, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(70, 230, 100, 266);
        getContentPane().add(pnlUpProfe, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
        try {

            Usuario usuario = new Profesor("zzz",0,1,txtfNombreP.getText(),9, txtfsexo.getText(),"", txtfEmailP.getText(), txtNacionalidadP.getText(), "");
            //int id_usuario, String nombre, int edad, String sexo, String telefono, String email, String nacionalidad, String contrasenia
            daoUsuario dUsuario = new daoUsuario(usuario);

            if(dUsuario.agregar()){
                System.out.println("Se agregó al usuario");
            } else {
                System.out.println("Error al agregar usuario");
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void exitPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPanelMouseClicked
        dispose();
    }//GEN-LAST:event_exitPanelMouseClicked

    
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
            java.util.logging.Logger.getLogger(RegistrarProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistrarProfesor dialog = new RegistrarProfesor(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel exitPanel;
    private javax.swing.JLabel exittxt;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JPanel pnlUpProfe;
    private javax.swing.JTextField txtNacionalidadP;
    private javax.swing.JTextField txtfCodigoP;
    private javax.swing.JTextField txtfCursoP;
    private javax.swing.JTextField txtfEmailP;
    private javax.swing.JTextField txtfHorarioP;
    private javax.swing.JTextField txtfNombreP;
    private javax.swing.JTextField txtfSeccion;
    private javax.swing.JTextField txtfsexo;
    // End of variables declaration//GEN-END:variables
}
