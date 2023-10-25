/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Sistema.Clases;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author AULA F.DE ING.DE SIS
 */
public class Alumno extends Usuario{
    protected String nivelAcademico;
    private List<String> materiasInscritas;

    public Alumno(String nivelAcademico, List<String> materiasInscritas, String codeUser, String nombre, String email, String nacionalidad, String contrasenia) {
        super(codeUser, nombre, email, nacionalidad, contrasenia);
        this.nivelAcademico = nivelAcademico;
        this.materiasInscritas = materiasInscritas;
    }


    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }
    
    public void inscribirseAMateria() {
        try {
            String materia = JOptionPane.showInputDialog("Ingrese el nombre de la materia a la que desea inscribirse:");

            // Verifica si el alumno ya está inscrito en la materia
            if (materiasInscritas.contains(materia)) {
                JOptionPane.showMessageDialog(null, "Ya está inscrito en la materia: " + materia);
            } else {
                // Agrega la materia a la lista de materias inscritas
                materiasInscritas.add(materia);
                JOptionPane.showMessageDialog(null, "Inscripción exitosa a la materia: " + materia);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al inscribirse en la materia: " + e.getMessage());
        }
    }      

}
