/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Sistema.Frames;

import Sistema.Frames.Alumno.MenuAlumno;
import Sistema.Frames.Profesor.MenuProfesor;
import Sistema.Frames.Curso.MenuCurso;
import Sistema.Frames.Seccion.RegistrarSeccion;
import Sistema.Reportes.MenuReporte;
import java.awt.Container;

/**
 *
 * @author USUARIO
 */
public class InicioPanel extends javax.swing.JPanel {

    /**
     * Creates new form InicioPanel
     */
    public InicioPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Alumno = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Profesor = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Reportes = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Materia = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1190, 750));
        setPreferredSize(new java.awt.Dimension(1190, 750));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setBackground(new java.awt.Color(255, 255, 255));
        Title.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));

        Titulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("SISTEMA DE MATRÍCULAS");

        javax.swing.GroupLayout TitleLayout = new javax.swing.GroupLayout(Title);
        Title.setLayout(TitleLayout);
        TitleLayout.setHorizontalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleLayout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                .addContainerGap())
        );
        TitleLayout.setVerticalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 600, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/Imagenes/principal.gif"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 139));

        Alumno.setBackground(new java.awt.Color(255, 255, 255));
        Alumno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Alumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlumnoMouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/Imagenes/alumna.gif"))); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(350, 350));

        jLabel3.setText("ALUMNO");

        javax.swing.GroupLayout AlumnoLayout = new javax.swing.GroupLayout(Alumno);
        Alumno.setLayout(AlumnoLayout);
        AlumnoLayout.setHorizontalGroup(
            AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlumnoLayout.createSequentialGroup()
                .addGroup(AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AlumnoLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel3))
                    .addGroup(AlumnoLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        AlumnoLayout.setVerticalGroup(
            AlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlumnoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        add(Alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 220, 200));

        Profesor.setBackground(new java.awt.Color(255, 255, 255));
        Profesor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Profesor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfesorMouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/Imagenes/profesor1.gif"))); // NOI18N
        jLabel6.setPreferredSize(new java.awt.Dimension(145, 145));

        jLabel2.setText("PROFESOR");

        javax.swing.GroupLayout ProfesorLayout = new javax.swing.GroupLayout(Profesor);
        Profesor.setLayout(ProfesorLayout);
        ProfesorLayout.setHorizontalGroup(
            ProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfesorLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(ProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ProfesorLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        ProfesorLayout.setVerticalGroup(
            ProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfesorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        add(Profesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 220, 200));

        Reportes.setBackground(new java.awt.Color(255, 255, 255));
        Reportes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Reportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReportesMouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/Imagenes/documento.png"))); // NOI18N
        jLabel7.setPreferredSize(new java.awt.Dimension(145, 145));

        jLabel5.setText("REPORTES");

        javax.swing.GroupLayout ReportesLayout = new javax.swing.GroupLayout(Reportes);
        Reportes.setLayout(ReportesLayout);
        ReportesLayout.setHorizontalGroup(
            ReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportesLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(ReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ReportesLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        ReportesLayout.setVerticalGroup(
            ReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportesLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        add(Reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 220, 220));

        Materia.setBackground(new java.awt.Color(255, 255, 255));
        Materia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Materia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MateriaMouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/Imagenes/cursos.png"))); // NOI18N
        jLabel8.setPreferredSize(new java.awt.Dimension(145, 145));

        jLabel9.setText("MATERIA");

        javax.swing.GroupLayout MateriaLayout = new javax.swing.GroupLayout(Materia);
        Materia.setLayout(MateriaLayout);
        MateriaLayout.setHorizontalGroup(
            MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MateriaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MateriaLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel9)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        MateriaLayout.setVerticalGroup(
            MateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MateriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        add(Materia, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 220, 220));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("¡Bienvenido al Sistema de Matrículas!\nEstamos emocionados de darte la \nbienvenida a nuestra aplicación, \ndiseñada para simplificar y agilizar el \nproceso de matrícula en nuestra \ninstitución. Con esta plataforma, hemos \ncreado una experiencia intuitiva y \neficiente que te permitirá gestionar tu \nmatrícula de manera fácil y conveniente. \nDesde la comodidad de tu hogar, podrás\nexplorar cursos, seleccionar tus \nasignaturas preferidas y completar tu \nmatrícula con unos pocos clics. Estamos \ncomprometidos a brindarte una \nherramienta que no solo facilita el \nproceso, sino que también mejora tu \nexperiencia académica. ¡Explora, elige y \nmatricúlate para iniciar tu viaje \neducativo con nosotros!");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 290, 430));
    }// </editor-fold>//GEN-END:initComponents

    private void MateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MateriaMouseClicked
        // TODO add your handling code here:
        MenuCurso mc = new MenuCurso();
        mc.setSize(840, 720);
        mc.setLocation(0, 0);

        // Obtén el contenedor principal
        Container contenedorPrincipal = this.getParent();

        // Elimina el panel actual
        contenedorPrincipal.remove(this);

        // Agrega el nuevo panel (MenuUsuario)
        contenedorPrincipal.add(mc);

        // Valida y repinta el contenedor principal
        contenedorPrincipal.validate();
        contenedorPrincipal.repaint();
    }//GEN-LAST:event_MateriaMouseClicked

    private void ReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportesMouseClicked
        // TODO add your handling code here:
        MenuReporte mr = new MenuReporte();
        mr.setSize(830, 450);
        mr.setLocation(0, 0);

        // Obtén el contenedor principal
        Container contenedorPrincipal = this.getParent();

        // Elimina el panel actual
        contenedorPrincipal.remove(this);

        // Agrega el nuevo panel (MenuUsuario)
        contenedorPrincipal.add(mr);

        // Valida y repinta el contenedor principal
        contenedorPrincipal.validate();
        contenedorPrincipal.repaint();
    }//GEN-LAST:event_ReportesMouseClicked

    private void ProfesorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfesorMouseClicked
        // TODO add your handling code here:
        MenuProfesor mp = new MenuProfesor();
        mp.setSize(860, 720);
        mp.setLocation(0, 0);

        // Obtén el contenedor principal
        Container contenedorPrincipal = this.getParent();

        // Elimina el panel actual
        contenedorPrincipal.remove(this);

        // Agrega el nuevo panel (MenuUsuario)
        contenedorPrincipal.add(mp);

        // Valida y repinta el contenedor principal
        contenedorPrincipal.validate();
        contenedorPrincipal.repaint();

    }//GEN-LAST:event_ProfesorMouseClicked

    private void AlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlumnoMouseClicked
        MenuAlumno ma = new MenuAlumno();
        ma.setSize(860, 720);
        ma.setLocation(0, 0);

        // Obtén el contenedor principal
        Container contenedorPrincipal = this.getParent();

        // Elimina el panel actual
        contenedorPrincipal.remove(this);

        // Agrega el nuevo panel (MenuUsuario)
        contenedorPrincipal.add(ma);

        // Valida y repinta el contenedor principal
        contenedorPrincipal.validate();
        contenedorPrincipal.repaint();
    }//GEN-LAST:event_AlumnoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Alumno;
    private javax.swing.JPanel Materia;
    private javax.swing.JPanel Profesor;
    private javax.swing.JPanel Reportes;
    private javax.swing.JPanel Title;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
