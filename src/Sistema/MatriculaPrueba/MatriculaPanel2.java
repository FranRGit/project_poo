/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Sistema.MatriculaPrueba;

/**
 *
 * @author User
 */
public class MatriculaPanel2 extends javax.swing.JPanel {

    /**
     * Creates new form SeccionPanel
     */
    public MatriculaPanel2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        lblName = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        lblHorario1 = new javax.swing.JLabel();
        lblCurso = new javax.swing.JLabel();
        cbSeccion = new javax.swing.JComboBox<>();
        lblEstado = new javax.swing.JLabel();
        cbCurso1 = new javax.swing.JComboBox<>();
        tfEstado = new javax.swing.JTextField();

        jToggleButton1.setText("jToggleButton1");

        setBackground(new java.awt.Color(255, 255, 255));

        lblName.setText("Alumno a matricular : ");

        tfName.setText("jTextField1");

        lblHorario1.setText("Curso");

        lblCurso.setText("Seccion");

        cbSeccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblEstado.setText("Estado");

        cbCurso1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCurso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCurso1ActionPerformed(evt);
            }
        });

        tfEstado.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEstado)
                    .addComponent(lblCurso)
                    .addComponent(lblName)
                    .addComponent(tfName)
                    .addComponent(cbSeccion, 0, 263, Short.MAX_VALUE)
                    .addComponent(lblHorario1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCurso1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfEstado))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblHorario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbCurso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblCurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbCurso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCurso1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCurso1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbCurso1;
    private javax.swing.JComboBox<String> cbSeccion;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblHorario1;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField tfEstado;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}