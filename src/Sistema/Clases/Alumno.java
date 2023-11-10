/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Sistema.Clases;



/**
 *
 * @author AULA F.DE ING.DE SIS
 */
public class Alumno extends Usuario{
    protected String nivel_Academico;
    
     
    //METODO AÚN NO DISPONIBLE
    /*public void inscribirseAMateria() {
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
    */

    public Alumno(String nivel_Academico, int id_usuario, String nombre, int edad, String sexo, String telefono, String email, String nacionalidad, String contrasenia) {
        super(id_usuario, nombre, edad, sexo, telefono, email, nacionalidad, contrasenia);
        this.nivel_Academico = nivel_Academico;
    }

    public String getNivel_Academico() {
        return nivel_Academico;
    }

    public void setNivel_Academico(String nivel_Academico) {
        this.nivel_Academico = nivel_Academico;
    }
    
    
}
