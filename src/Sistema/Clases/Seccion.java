/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Sistema.Clases;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Seccion {

    String codigoCurso;
    String nombreCurso;
    String descripcion;
    String tipoMateria;
    
    //EDITAR A Curso nombreCurso;
    ArrayList<Curso> materias;

    public Seccion(String codigoCurso, String nombreCurso, String descripcion, String tipoMateria) {
        this.codigoCurso = codigoCurso;
        this.nombreCurso = nombreCurso;
        this.descripcion = descripcion;
        this.tipoMateria = tipoMateria;
        this.materias = new ArrayList<>();
    }

    public void agregarMateria() {
        String tipo;
        String nombreMateria;
        nombreMateria = JOptionPane.showInputDialog("Ingrese el nombre de la materia que desea agregar: ");
        tipo = JOptionPane.showInputDialog("Ingrese el tipo de materia que desea agregar (Matematica o física): ");
        Curso nuevaMateria = null;
        switch (tipo.toLowerCase()) {
            case "matematica":
                nuevaMateria = new Matematica();
//                Matematica mate = new Matematica();
                break;
            case "fisica":
                nuevaMateria = new Fisica();
//                Fisica fisica = new Fisica();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Tipo de materia no válido.");
        }

        if (nuevaMateria != null) {
            materias.add(nuevaMateria);
            JOptionPane.showMessageDialog(null, "Materia agregada: " + nuevaMateria.getNombreCurso());
        }
    }

    public void eliminarMateria() {

        if (materias.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay materias para eliminar.");
        } else {
            String nombreMateria = JOptionPane.showInputDialog("Ingrese el nombre de la materia que desea eliminar: ");
            boolean eliminada = false;

            for (Curso materia : materias) {
                if (materia.getNombreCurso().equalsIgnoreCase(nombreMateria)) {
                    materias.remove(materia);
                    eliminada = true;
                    JOptionPane.showMessageDialog(null, "Materia eliminada: " + materia.getNombreCurso());
                    break; // Salir del bucle una vez que se elimine la materia
                }
            }

            if (!eliminada) {
                JOptionPane.showMessageDialog(null, "La materia no se encontró en la lista.");
            }
        }
        //        String tipo;
        //        tipo = JOptionPane.showInputDialog("Ingrese el tipo de materia que desea agregar (Matematica o física): ");
        //        //Recorrer ArrayList para hacer un .push del curso
        //        switch(tipo){
        //            case "matematica":
        ////                Matematica mate = new Matematica();
        //                break;
        //            case "fisica":
        ////                Fisica fisica = new Fisica();
        //                break;
        //        }
    }
}
