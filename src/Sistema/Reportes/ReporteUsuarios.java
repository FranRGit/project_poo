/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Customizer.java to edit this template
 */
package Sistema.Reportes;

import Sistema.Clases.Usuario;
import Sistema.Clases.daoUsuario;
import Sistema.Frames.Tablas.tableDesigner;
import Sistema.Frames.Tablas.tablaReporteUsuarios;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class ReporteUsuarios extends javax.swing.JPanel{
    
    daoUsuario daousuario = new daoUsuario();
    /**
     * Creates new customizer ReporteUsuarios
     */
    public ReporteUsuarios() {
        initComponents();
        tableDesigner tabla = new tableDesigner();
        tabla.designTable(tblUsuarios);
        actualizar();
    }
    public void actualizar(){
        tablaReporteUsuarios tru = new tablaReporteUsuarios();
        String[] columna = {"Id_Usuario","Nombre","Edad","Teléfono","Tipo_Usuario"};
        tru.actualizarTabla(daousuario.obtenerLista(), columna, tblUsuarios);
    }
    public static void exportarTXT(List<Usuario> listaUsuarios) {
        try {
            // Utilizar FileOutputStream y OutputStreamWriter para escribir en el archivo
            FileOutputStream fos = new FileOutputStream(new File("ReporteUsuarios.txt"));
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter writer = new BufferedWriter(osw);

            // Escribir encabezado
            writer.write("Reporte de Usuarios\n");
            writer.write("Nombre\tEdad\tTeléfono\n");

            // Escribir datos
            for (Usuario usuario : listaUsuarios) {
                writer.write(usuario.getNombre() + "\t");
                writer.write(usuario.getEdad() + "\t");
                writer.write(usuario.getTelefono() + "\n");
            }

            // Cerrar el escritor
            writer.close();

            System.out.println("ReporteUsuarios.txt creado con éxito.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButtonTXT = new javax.swing.JButton();

        setBackground(new java.awt.Color(253, 253, 253));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "ttitulo5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuarios.setRowHeight(40);
        tblUsuarios.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tblUsuarios.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tblUsuarios);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 760, 580));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(96, 131, 165));
        jLabel1.setText("REPORTE  USUARIOS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 269, 39));

        jButtonTXT.setBackground(new java.awt.Color(255, 0, 0));
        jButtonTXT.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jButtonTXT.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTXT.setText("DESCARGAR TXT");
        jButtonTXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonTXTMouseClicked(evt);
            }
        });
        jButtonTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTXTActionPerformed(evt);
            }
        });
        add(jButtonTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTXTMouseClicked
        // Obtener la lista real de usuarios desde tu fuente de datos
    List<Usuario> listaUsuarios = daousuario.obtenerLista();

    if (listaUsuarios != null && !listaUsuarios.isEmpty()) {
        // Llamar al método exportarTXT solo si la lista de usuarios tiene datos
        exportarTXT(listaUsuarios);
    } else {
        System.out.println("La lista de usuarios está vacía o es nula.");
    }
    }//GEN-LAST:event_jButtonTXTMouseClicked

    private void jButtonTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonTXTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblUsuarios;
    // End of variables declaration//GEN-END:variables
}
