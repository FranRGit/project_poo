/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Sistema.Frames.Profesor;


import Sistema.Frames.Alumno.*;
import Sistema.Clases.*;
import Sistema.Frames.ErrorDialog;
import Sistema.Frames.RegistroExitosoDialog;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;



/**
 *
 * @author USUARIO
 */
public final class RegistrarProfesor extends javax.swing.JDialog {

    /**
     * Creates new form RegistrarAlumno2
     */
    public RegistrarProfesor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        llenarComboBoxSexo();
        llenarComboBoxEspecialidad();
        llenarComboBoxNacionalidad();
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
        jLabel41 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        btnSubirAlumno = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtNombre1 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        exitPanel = new javax.swing.JPanel();
        exittxt = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jcbNacionalidad = new javax.swing.JComboBox<>();
        jcbEspecialidad = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        jcbSexo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pnlUpAlumno5.setBackground(new java.awt.Color(255, 255, 255));
        pnlUpAlumno5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setFont(new java.awt.Font("Consolas", 0, 30)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(72, 99, 124));
        jLabel41.setText("SUBIR NUEVO PROFESOR");
        jLabel41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlUpAlumno5.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 360, 51));

        jLabel43.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel43.setText("Nombre Completo:");
        pnlUpAlumno5.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 173, 25));

        jLabel44.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel44.setText("Edad:");
        pnlUpAlumno5.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 114, 25));

        jLabel45.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel45.setText("Sexo:");
        pnlUpAlumno5.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 110, 24));

        jLabel46.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel46.setText("E-mail:");
        pnlUpAlumno5.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 135, 27));

        jLabel47.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel47.setText("Teléfono");
        pnlUpAlumno5.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 172, -1));

        btnSubirAlumno.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        btnSubirAlumno.setText("SUBIR PROFESOR");
        btnSubirAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubirAlumnoMouseClicked(evt);
            }
        });
        btnSubirAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirAlumnoActionPerformed(evt);
            }
        });
        pnlUpAlumno5.add(btnSubirAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 196, 44));

        txtEmail.setText(" Ingrese el email del profesor");
        txtEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmailMouseClicked(evt);
            }
        });
        pnlUpAlumno5.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 350, 33));

        txtEdad.setText(" Ingrese la edad...");
        txtEdad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEdadMouseClicked(evt);
            }
        });
        pnlUpAlumno5.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 200, 32));

        txtNombre1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNombre1.setText(" Ingrese nombre del profesor ");
        txtNombre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombre1MouseClicked(evt);
            }
        });
        txtNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre1ActionPerformed(evt);
            }
        });
        pnlUpAlumno5.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 356, 33));

        jLabel49.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel49.setText("Nacionalidad");
        pnlUpAlumno5.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 172, -1));

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
            .addGap(0, 38, Short.MAX_VALUE)
            .addGroup(exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(exitPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(exittxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        exitPanelLayout.setVerticalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
            .addGroup(exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(exitPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(exittxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pnlUpAlumno5.add(exitPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, -1, -1));

        txtTelefono.setText("Ingrese el teléfono");
        txtTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTelefonoMouseClicked(evt);
            }
        });
        pnlUpAlumno5.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 200, 33));

        jcbNacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNacionalidadActionPerformed(evt);
            }
        });
        pnlUpAlumno5.add(jcbNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 160, 30));

        jcbEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEspecialidadActionPerformed(evt);
            }
        });
        pnlUpAlumno5.add(jcbEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 300, 30));

        jLabel48.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel48.setText("Especialidad");
        pnlUpAlumno5.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 135, 27));

        jcbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSexoActionPerformed(evt);
            }
        });
        pnlUpAlumno5.add(jcbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 200, 30));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 56;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(90, 240, 110, 272);
        getContentPane().add(pnlUpAlumno5, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
     //LLENAR COMBOBOX DE SEXO
    public void llenarComboBoxSexo(){
        jcbSexo.removeAllItems();
        jcbSexo.addItem("Masculino");
        jcbSexo.addItem("Femenino");
    }
    
    //LLENAR COMBOBOX DE NACADEMICO
    public void llenarComboBoxEspecialidad(){
        jcbEspecialidad.removeAllItems();
        jcbEspecialidad.addItem("Matematicas");
        jcbEspecialidad.addItem("Ciencias");
        jcbEspecialidad.addItem("Idiomas");
        jcbEspecialidad.addItem("Sociales");
        jcbEspecialidad.addItem("Otro");
    }
    
    //LLENAR COMBOBOX DE Nacionalidad
    public void llenarComboBoxNacionalidad(){
        jcbNacionalidad.removeAllItems();
        // Obtener todos los países y eliminar duplicados
        Locale[] locales = Locale.getAvailableLocales();
        String[] paises = Arrays.stream(locales)
                .filter(locale -> !locale.getDisplayCountry().isEmpty())
                .map(Locale::getDisplayCountry)
                .distinct()
                .toArray(String[]::new);
        // Ordenar alfabéticamente
        Arrays.sort(paises);

        // Establecer los países en el JComboBox
        jcbNacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(paises));
        
    }
    
    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        dispose();
    }//GEN-LAST:event_jPanel6MouseClicked

    private void btnSubirAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubirAlumnoMouseClicked

        try {
            int edad = Integer.parseInt(txtEdad.getText());
            Usuario usuario = new Profesor(jcbEspecialidad.getSelectedItem().toString(), 0,0, txtNombre1.getText().toString(),edad,jcbSexo.getSelectedItem().toString(),txtTelefono.getText(), txtEmail.getText(), jcbNacionalidad.getSelectedItem().toString(), "");
            daoUsuario dUsuario = new daoUsuario(usuario);

            if(dUsuario.agregar()){
                System.out.println("Se agregó al usuario");
                RegistroExitosoDialog re = new RegistroExitosoDialog();
                re.setVisible(true);
            } else {
                
            }
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_btnSubirAlumnoMouseClicked
    
    private void mostrarErrorDialog(String errorMessage) {
        ErrorDialog errorDialog = new ErrorDialog(errorMessage);
        errorDialog.setVisible(true);
    }
    
    private void btnSubirAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubirAlumnoActionPerformed

    private void txtNombre1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombre1MouseClicked
        txtNombre1.setText("");
    }//GEN-LAST:event_txtNombre1MouseClicked

    private void exitPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPanelMouseClicked
        dispose();
    }//GEN-LAST:event_exitPanelMouseClicked

    private void jcbNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNacionalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbNacionalidadActionPerformed

    private void jcbEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbEspecialidadActionPerformed

    private void jcbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbSexoActionPerformed

    private void txtNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre1ActionPerformed

    private void txtEdadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEdadMouseClicked
        txtEdad.setText("");
    }//GEN-LAST:event_txtEdadMouseClicked

    private void txtEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMouseClicked
        txtEmail.setText("");
    }//GEN-LAST:event_txtEmailMouseClicked

    private void txtTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoMouseClicked
        txtTelefono.setText("");
    }//GEN-LAST:event_txtTelefonoMouseClicked

    
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
    private javax.swing.JButton btnSubirAlumno;
    private javax.swing.JPanel exitPanel;
    private javax.swing.JLabel exittxt;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JComboBox<String> jcbEspecialidad;
    private javax.swing.JComboBox<String> jcbNacionalidad;
    private javax.swing.JComboBox<String> jcbSexo;
    private javax.swing.JPanel pnlUpAlumno5;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
