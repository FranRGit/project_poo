/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema.Frames.Tablas;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Sistema.Clases.*;
import javax.swing.JTable;


/**
 *
 * @author USUARIO
 */

//CLASE GENÉRICA
public class tablaGenérica<T> {
    
    public void actualizarTabla(ArrayList<T> lista, String[] columnas, JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        
        //PARA REEMPLAZAR
        for(String columna : columnas){
            modelo.addColumn(columna);
        }

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        for (T elemento : lista) {
            Object datos[]  = obtenerDatos(elemento);
            modelo.addRow(datos);
        }

        tabla.setModel(modelo);

    }

    private Object[] obtenerDatos(T elemento) {
        
        if (elemento instanceof Alumno) {
            Usuario usuario = (Alumno) elemento;
            return new Object[]{usuario.getId_usuario(), usuario.getNombre(), usuario.getEdad(), usuario.getTelefono(),((Alumno)usuario).getNivel_Academico()};
        }
        
        if(elemento instanceof Profesor) {
            Usuario usuario = (Profesor) elemento;
            System.out.println("Hola");
            return new Object[]{usuario.getId_usuario(), usuario.getNombre(), usuario.getEdad(), usuario.getTelefono(),((Profesor)usuario).getEspecialidad()};
        }
        
        if(elemento instanceof Curso) {
            Curso curso = (Curso) elemento;
            return new Object[]{curso.getId_curso(), curso.getNombreCurso(), curso.getPeriodo(), curso.getCategoriaCurso()};
        }
        
        if(elemento instanceof ReporteMatricula){
            ReporteMatricula rm = (ReporteMatricula) elemento;
            return new Object[]{rm.getIdMatricula(),rm.getNombreA(),rm.getNombreP(),rm.getNombreS(),rm.getHorario(),rm.getFecha()};
        }
        return new Object[0];
    }

    public void buscar(ArrayList<T> lista, String palabraClave, String[] columnas, JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();

        for (String columna : columnas) {
            modelo.addColumn(columna);
        }

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        for (T elemento : lista) {
            Object[] datos = obtenerDatos(elemento);

            // Verificar si alguno de los datos contiene la palabra clave
            for (Object dato : datos) {
                if (dato.toString().contains(palabraClave)) {
                    modelo.addRow(datos);
                    break; // Evitar agregar el mismo elemento varias veces
                }
            }
        }

        tabla.setModel(modelo);
    }
}
