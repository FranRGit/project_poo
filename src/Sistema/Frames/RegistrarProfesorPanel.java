/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Sistema.Frames;

/**
 *
 * @author USUARIO
 */
public class RegistrarProfesorPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegistrarProfesorPanel
     */
    public RegistrarProfesorPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        spHorario1P = new javax.swing.JSpinner();
        spHorario2P = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();

        setPreferredSize(new java.awt.Dimension(780, 580));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlUpProfe.setBackground(new java.awt.Color(255, 249, 249));
        pnlUpProfe.setPreferredSize(new java.awt.Dimension(780, 580));

        jLabel10.setFont(new java.awt.Font("Consolas", 0, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(72, 99, 124));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("SUBIR NUEVO PROFESOR");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jButton8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jButton8.setText("SUBIR ");

        lbCodigo.setBackground(new java.awt.Color(255, 255, 255));
        lbCodigo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        lbCodigo.setForeground(new java.awt.Color(51, 51, 0));
        lbCodigo.setText("Código:");

        txtfCodigoP.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtfCodigoP.setForeground(new java.awt.Color(204, 204, 204));
        txtfCodigoP.setText("Ingrese código del profesor");
        txtfCodigoP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtfCodigoP.setCaretColor(new java.awt.Color(102, 102, 255));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 0));
        jLabel13.setText("Nombre Completo:");

        txtfNombreP.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtfNombreP.setForeground(new java.awt.Color(204, 204, 204));
        txtfNombreP.setText("Ingrese nombre completo del profesor");
        txtfNombreP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 0));
        jLabel14.setText("Curso:");

        txtfCursoP.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtfCursoP.setForeground(new java.awt.Color(204, 204, 204));
        txtfCursoP.setText("Ingrese el curso a dictar");
        txtfCursoP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel15.setText("Sección:");

        jLabel16.setBackground(new java.awt.Color(96, 131, 165));
        jLabel16.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 0));
        jLabel16.setText("E-mail:");

        txtfEmailP.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtfEmailP.setForeground(new java.awt.Color(204, 204, 204));
        txtfEmailP.setText("Ingrese e-mail");
        txtfEmailP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 0));
        jLabel17.setText("Nacionalidad:");

        txtNacionalidadP.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtNacionalidadP.setForeground(new java.awt.Color(204, 204, 204));
        txtNacionalidadP.setText("Ingrese  nacionalidad");
        txtNacionalidadP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 0));
        jLabel18.setText("Horario:");

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 0));
        jLabel19.setText("De");

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 0));
        jLabel20.setText("a");

        javax.swing.GroupLayout pnlUpProfeLayout = new javax.swing.GroupLayout(pnlUpProfe);
        pnlUpProfe.setLayout(pnlUpProfeLayout);
        pnlUpProfeLayout.setHorizontalGroup(
            pnlUpProfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUpProfeLayout.createSequentialGroup()
                .addGroup(pnlUpProfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUpProfeLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnlUpProfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlUpProfeLayout.createSequentialGroup()
                                .addGroup(pnlUpProfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlUpProfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtfNombreP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                        .addComponent(txtfCodigoP, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(txtfCursoP, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlUpProfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfEmailP, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlUpProfeLayout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(39, 39, 39)
                                        .addComponent(spHorario1P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(spHorario2P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNacionalidadP, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlUpProfeLayout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUpProfeLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        pnlUpProfeLayout.setVerticalGroup(
            pnlUpProfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUpProfeLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUpProfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUpProfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtfEmailP)
                    .addComponent(txtfCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlUpProfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUpProfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNacionalidadP)
                    .addComponent(txtfNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(pnlUpProfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUpProfeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfCursoP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(spHorario1P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spHorario2P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        add(pnlUpProfe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JPanel pnlUpProfe;
    private javax.swing.JSpinner spHorario1P;
    private javax.swing.JSpinner spHorario2P;
    private javax.swing.JTextField txtNacionalidadP;
    private javax.swing.JTextField txtfCodigoP;
    private javax.swing.JTextField txtfCursoP;
    private javax.swing.JTextField txtfEmailP;
    private javax.swing.JTextField txtfNombreP;
    // End of variables declaration//GEN-END:variables
}
