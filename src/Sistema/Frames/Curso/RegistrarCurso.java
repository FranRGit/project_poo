/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Sistema.Frames.Curso;

import Sistema.Clases.*;
import Sistema.Frames.RegistroExitosoDialog;
import java.awt.Color;
import javax.swing.JFrame;

public class RegistrarCurso extends javax.swing.JDialog {

    /**
     * Creates new form RegistrarCurso
     */
    public RegistrarCurso(java.awt.Frame parent, boolean modal) {
        super(parent,modal);
        initComponents();
        llenarComboBoxPeriodo();
        llenarComboBoxCategoria();
        setBackground(new Color(0, 0, 0, 80)); // Configura el fondo transparente
//         setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlUpAlumno5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txtIdNombreCurso = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jComboBoxPeriodo = new javax.swing.JComboBox<>();

        setUndecorated(true);

        pnlUpAlumno5.setBackground(new java.awt.Color(255, 255, 255));
        pnlUpAlumno5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        pnlUpAlumno5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 6, -1, -1));

        jLabel41.setFont(new java.awt.Font("Consolas", 0, 30)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(72, 99, 124));
        jLabel41.setText("SUBIR NUEVO CURSO");
        jLabel41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlUpAlumno5.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 320, 51));

        jLabel42.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel42.setText("Nombre:");
        pnlUpAlumno5.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 105, 30));

        txtIdNombreCurso.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtIdNombreCurso.setText("Series Y Ecuaciones Diferenciales");
        txtIdNombreCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdNombreCursoActionPerformed(evt);
            }
        });
        pnlUpAlumno5.add(txtIdNombreCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 356, 30));

        jLabel43.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel43.setText("Periodo:");
        pnlUpAlumno5.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 173, 25));

        jLabel46.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel46.setText("Categoría:");
        pnlUpAlumno5.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 135, 27));

        jButton1.setText("SUBIR CURSO");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnlUpAlumno5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 196, 44));

        jLabel48.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("X");
        jLabel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel48MouseClicked(evt);
            }
        });
        pnlUpAlumno5.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 49, -1));

        jComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matemática", "Ciencia", "Inglés" }));
        jComboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriaActionPerformed(evt);
            }
        });
        pnlUpAlumno5.add(jComboBoxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 350, 30));

        jComboBoxPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022-I", "2022-II", "2023-I", "2023-II" }));
        jComboBoxPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPeriodoActionPerformed(evt);
            }
        });
        pnlUpAlumno5.add(jComboBoxPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 350, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(342, 342, 342)
                .addComponent(pnlUpAlumno5, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(342, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(pnlUpAlumno5, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdNombreCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdNombreCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdNombreCursoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        dispose();
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try {
            
            Curso curso = new Curso(0, txtIdNombreCurso.getText(), (String)jComboBoxPeriodo.getSelectedItem(), (String)jComboBoxCategoria.getSelectedItem());
            daoCurso dCurso = new daoCurso(curso);

            if(dCurso.agregar()){
                System.out.println("Se agregó el nuevo curso");
                RegistroExitosoDialog re = new RegistroExitosoDialog();
                re.setVisible(true);
            } else {
                throw new Exception("ERROR");
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jLabel48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel48MouseClicked

    private void jComboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCategoriaActionPerformed

    private void jComboBoxPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPeriodoActionPerformed
        // TODO add your handling code here:
                
    }//GEN-LAST:event_jComboBoxPeriodoActionPerformed

    //LLENAR COMBOBOX DE PERIODO
    public void llenarComboBoxPeriodo(){
        jComboBoxPeriodo.removeAllItems();
        jComboBoxPeriodo.addItem("2022-I");
        jComboBoxPeriodo.addItem("2022-II");
        jComboBoxPeriodo.addItem("2023-I");
        jComboBoxPeriodo.addItem("2023-II");
    }
    //LLENAR COMBOBOX DE CATEGORÍA
    public void llenarComboBoxCategoria(){
        jComboBoxPeriodo.removeAllItems();
        jComboBoxPeriodo.addItem("Matemática");
        jComboBoxPeriodo.addItem("Ciencia");
        jComboBoxPeriodo.addItem("Inglés");
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
            java.util.logging.Logger.getLogger(RegistrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistrarCurso dialog = new RegistrarCurso(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JComboBox<String> jComboBoxPeriodo;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel pnlUpAlumno5;
    private javax.swing.JTextField txtIdNombreCurso;
    // End of variables declaration//GEN-END:variables
}
