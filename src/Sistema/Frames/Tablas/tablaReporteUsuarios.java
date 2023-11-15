/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema.Frames.Tablas;

import Sistema.Clases.Alumno;
import Sistema.Clases.Profesor;
import Sistema.Clases.Usuario;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class tablaReporteUsuarios {
    
    public void actualizarTabla(ArrayList<Usuario> lista, String[] columnas, JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        
        //PARA REEMPLAZAR
        for(String columna : columnas){
            modelo.addColumn(columna);
        }

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        for (Usuario elemento : lista) {
            Object datos[]  = obtenerDatos(elemento);
            modelo.addRow(datos);
        }

        tabla.setModel(modelo);

    }
    
      private Object[] obtenerDatos(Usuario elemento) {
        
        if (elemento instanceof Alumno || elemento instanceof Profesor) {
            Usuario usuario = elemento;
            return new Object[]{usuario.getId_usuario(), usuario.getNombre(), usuario.getEdad(), usuario.getTelefono(), usuario.getTipo_usuario()};
        }

        return new Object[0];
    }
}
