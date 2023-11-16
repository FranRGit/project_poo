/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Sistema.Frames.Seccion;

import Sistema.Clases.Curso;
import Sistema.Clases.Profesor;
import Sistema.Clases.Seccion;
import Sistema.Clases.Usuario;
import Sistema.Clases.daoCurso;
import Sistema.Clases.daoSeccion;
import Sistema.Clases.daoUsuario;
import Sistema.Frames.RegistroExitosoDialog;
import Sistema.Frames.Tablas.tablaGenérica;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class RegistrarSeccion extends javax.swing.JDialog {

    /**
     * Creates new form RegistrarSeccion
     */
    public RegistrarSeccion() {

    }

    public RegistrarSeccion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        llenarComboBoxCursos();
        llenarComboBoxProfesores();
        setBackground(new Color(0, 0, 0, 80)); // Configura el fondo transparente
        actualizar();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
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
        txtIdNombre = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        btnSubirCurso = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jComboBoxCurso = new javax.swing.JComboBox<>();
        jComboBoxProfesor = new javax.swing.JComboBox<>();
        jComboBoxHorario = new javax.swing.JComboBox<>();

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
        jLabel41.setText("SUBIR NUEVA SECCIÓN");
        jLabel41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlUpAlumno5.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 76, 340, 51));

        jLabel42.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel42.setText("Nombre:");
        pnlUpAlumno5.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 140, 105, 30));

        txtIdNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtIdNombre.setText("Series Y Ecuaciones Diferenciales");
        txtIdNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIdNombreMouseClicked(evt);
            }
        });
        txtIdNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdNombreActionPerformed(evt);
            }
        });
        pnlUpAlumno5.add(txtIdNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 188, 356, 30));

        jLabel43.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel43.setText("Curso:");
        pnlUpAlumno5.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 236, 173, 25));

        jLabel46.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel46.setText("Profesor:");
        pnlUpAlumno5.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 330, 135, 27));

        btnSubirCurso.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        btnSubirCurso.setText("SUBIR SECCIÓN");
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
        pnlUpAlumno5.add(btnSubirCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 196, 44));

        jLabel47.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel47.setText("Horario:");
        pnlUpAlumno5.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 135, 27));

        jComboBoxCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnlUpAlumno5.add(jComboBoxCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 280, 40));

        jComboBoxProfesor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProfesorActionPerformed(evt);
            }
        });
        pnlUpAlumno5.add(jComboBoxProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 280, 40));

        jComboBoxHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnlUpAlumno5.add(jComboBoxHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 210, 40));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 184;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(78, 235, 77, 235);
        getContentPane().add(pnlUpAlumno5, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //LLENAR COMBOBOX DE HORARIO
    public void llenarComboBoxHorario(){
        jComboBoxHorario.removeAllItems();
        jComboBoxHorario.addItem("Lunes 8:00-12:00");
        jComboBoxHorario.addItem("Lunes 14:00-18:00");
        jComboBoxHorario.addItem("Martes 8:00-12:00");
        jComboBoxHorario.addItem("Martes 14:00-18:00");
        jComboBoxHorario.addItem("Miércoles 8:00-12:00");
        jComboBoxHorario.addItem("Miércoles 14:00-18:00");
        jComboBoxHorario.addItem("Jueves 8:00-12:00");
        jComboBoxHorario.addItem("Jueves 14:00-18:00");
        jComboBoxHorario.addItem("Viernes 8:00-12:00");
        jComboBoxHorario.addItem("Viernes 14:00-18:00");
    }
    
    private void actualizar() {
        tablaGenérica<Curso> tablaActualizada = new tablaGenérica<>(); //TABLA GENERICA
        String[] columnas = {"ID_Curso", "Nombre", "Periodo", "Categoria"}; //COLUMNAS
//        tablaActualizada.actualizarTabla(dao.obtenerLista(), columnas, tblCurso);

    }
    //LLENAR COMBOBOX DE CURSOS
    public void llenarComboBoxCursos() {
        daoCurso cursos = new daoCurso();
        jComboBoxCurso.removeAllItems();
        ArrayList<Curso> listaCursos = cursos.obtenerLista();
        for (Curso curso : listaCursos) {
            jComboBoxCurso.addItem(curso.getNombreCurso());
        }
    }

    //LLENAR COMBOBOX DE CURSOS
    public void llenarComboBoxProfesores() {
        Usuario usuario = new Profesor();
        daoUsuario dUsuario = new daoUsuario();
//        daoCurso cursos = new daoCurso();
        jComboBoxProfesor.removeAllItems();
        ArrayList<Profesor> listaProfesor = dUsuario.obtenerListaProfesor();
        for (Profesor profe : listaProfesor) {
            jComboBoxProfesor.addItem(profe.getNombre());
        }
    }

    //OBTENER ULTIMO CURSO
    public String obtenerUltimoCurso() {
        daoCurso cursos = new daoCurso();
        String zz = null;
//        jComboBoxCurso.removeAllItems();
        ArrayList<Curso> listaCursos = cursos.obtenerLista();
        // Verificar si la lista de cursos no está vacía
        if (!listaCursos.isEmpty()) {
            // Obtener el último curso de la lista
            Curso ultimoCurso = listaCursos.get(listaCursos.size() - 1);
            zz = ultimoCurso.getNombreCurso();
            // Agregar el último curso al JComboBox
//            jComboBox.addItem(ultimoCurso.getNombreCurso());
        }
        return zz;
    }

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        dispose();
    }//GEN-LAST:event_jPanel6MouseClicked

    private void txtIdNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdNombreActionPerformed
//        // TODO add your handling code here:
//        txtIdNombre.setText(obtenerUltimoCurso()+"ctmre");
//        actualizar();
    }//GEN-LAST:event_txtIdNombreActionPerformed

    private void btnSubirCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubirCursoMouseClicked
        try {
            Seccion seccion = new Seccion(0, txtIdNombre.getText(), 0, 0, jComboBoxHorario.getSelectedItem().toString());
            daoSeccion dSeccion = new daoSeccion(seccion);

            if (dSeccion.agregar()) {
                System.out.println("Se agregó el nuevo curso");
                RegistroExitosoDialog re = new RegistroExitosoDialog();
                re.setVisible(true);
            } else {
                throw new Exception("ERROR");
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }//GEN-LAST:event_btnSubirCursoMouseClicked

    private void btnSubirCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubirCursoActionPerformed

    private void jComboBoxProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProfesorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxProfesorActionPerformed

    private void txtIdNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdNombreMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        txtIdNombre.setText(obtenerUltimoCurso()+" - Sección " );
        actualizar();
    }//GEN-LAST:event_txtIdNombreMouseClicked

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
    private javax.swing.JComboBox<String> jComboBoxCurso;
    private javax.swing.JComboBox<String> jComboBoxHorario;
    private javax.swing.JComboBox<String> jComboBoxProfesor;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel pnlUpAlumno5;
    private javax.swing.JTextField txtIdNombre;
    // End of variables declaration//GEN-END:variables
}
