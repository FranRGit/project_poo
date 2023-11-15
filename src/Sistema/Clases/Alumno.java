/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Sistema.Clases;

// Definición de la clase Alumno que hereda de la clase Usuario
public class Alumno extends Usuario {

    // Atributo adicional específico para la clase Alumno
    protected String nivel_Academico;

    public Alumno(){
        
    }
    // Constructor de la clase Alumno que utiliza el constructor de la clase base (Usuario)
    public Alumno(String nivel_Academico, int id_usuario, String nombre, int edad, String sexo, String telefono, String email, String nacionalidad, String contrasenia) {
        // Llamada al constructor de la clase base (Usuario) mediante 'super'
        super(id_usuario, nombre, edad, sexo, telefono, email, nacionalidad, contrasenia);
        // Inicialización del atributo específico para Alumno
        this.nivel_Academico = nivel_Academico;
    }

    // Métodos getter y setter para el atributo nivel_Academico
    public String getNivel_Academico() {
        return nivel_Academico;
    }

    public void setNivel_Academico(String nivel_Academico) {
        this.nivel_Academico = nivel_Academico;
    }


}
