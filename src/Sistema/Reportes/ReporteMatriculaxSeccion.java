/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Customizer.java to edit this template
 */
package Sistema.Reportes;

import Sistema.Clases.ReporteMatricula;
import Sistema.Frames.Tablas.tableDesigner;
import Sistema.Frames.Tablas.tablaGenérica;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class ReporteMatriculaxSeccion extends javax.swing.JPanel{
    
    ReporteMatriculas rm = new ReporteMatriculas();
    /**
     * Creates new customizer ReporteUsuarios
     */
    public ReporteMatriculaxSeccion() {
        initComponents();
        tableDesigner tabla = new tableDesigner();
        tabla.designTable(tblMatriculaxSeccion);
        actualizar();
    }
    public void actualizar(){
        tablaGenérica<ReporteMatriculas> tru = new tablaGenérica<>();
        String[] columna = {"Id_Matricula","Alumno","Profesor","Seccion","Horario","Fecha Matrícula"};
        tru.actualizarTabla(rm.filtrarDatos(), columna, tblMatriculaxSeccion);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMatriculaxSeccion = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButtonTXT = new javax.swing.JButton();

        setBackground(new java.awt.Color(253, 253, 253));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMatriculaxSeccion.setModel(new javax.swing.table.DefaultTableModel(
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
        tblMatriculaxSeccion.setRowHeight(40);
        tblMatriculaxSeccion.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tblMatriculaxSeccion.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tblMatriculaxSeccion);

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
        add(jButtonTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonTXTActionPerformed

    private void jButtonTXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTXTMouseClicked
        ArrayList<ReporteMatricula> listaReporteMatricula = rm.filtrarDatos(); // Obtén la lista real de reportes

    if (listaReporteMatricula != null && !listaReporteMatricula.isEmpty()) {
        exportarTXT(listaReporteMatricula);
    } else {
        System.out.println("La lista de reportes de matrícula está vacía o es nula.");
    }
    }//GEN-LAST:event_jButtonTXTMouseClicked
    public static void exportarTXT(ArrayList<ReporteMatricula> listaReporteMatricula) {
        try {
            // Crear un archivo de texto en el directorio del proyecto
            File txtFile = new File("ReporteMatriculas.txt");
            FileWriter writer = new FileWriter(txtFile);

            // Escribir encabezado
            writer.write("Reporte de Matrículas\n");
            writer.write("ID Matrícula\tFecha\tNombre del Alumno\tNombre del Profesor\n");

            // Escribir datos
            for (ReporteMatricula reporteMatricula : listaReporteMatricula) {
                writer.write(reporteMatricula.getIdMatricula() + "\t");
                writer.write(reporteMatricula.getFecha() + "\t");
                writer.write(reporteMatricula.getNombreA() + "\t");
                writer.write(reporteMatricula.getNombreP() + "\n");
            }

            // Cerrar el escritor
            writer.close();

            System.out.println("ReporteMatriculas.txt creado con éxito.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblMatriculaxSeccion;
    // End of variables declaration//GEN-END:variables
}
