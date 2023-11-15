/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Customizer.java to edit this template
 */
package Sistema.Reportes;

import Sistema.Clases.Usuario;
import Sistema.Clases.daoUsuario;
import Sistema.Frames.Tablas.tableDesigner;
import Sistema.Frames.Tablas.tablaGenérica;
import Sistema.Frames.Tablas.tablaReporteUsuarios;

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
        tblUsuarios.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(tblUsuarios);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 760, 580));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(96, 131, 165));
        jLabel1.setText("REPORTE  USUARIOS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 269, 39));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblUsuarios;
    // End of variables declaration//GEN-END:variables
}
