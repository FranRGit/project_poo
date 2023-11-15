/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Sistema.Clases;

// Definición de la clase Alumno que hereda de la clase Usuario
public class Alumno extends Usuario {

    // Atributo adicional específico para la clase Alumno
    protected String nivel_Academico;
    protected int id_alumno;

    public Alumno(){
        
    }
    
    // Constructor de la clase Alumno que utiliza el constructor de la clase base (Usuario)
    public Alumno(String nivel_Academico, int id_alumno, int id_usuario, String nombre, int edad, String sexo, String telefono, String email, String nacionalidad, String contrasenia) {
        super(id_usuario, nombre, edad, sexo, telefono, email, nacionalidad, contrasenia);
        this.nivel_Academico = nivel_Academico;
        this.id_alumno = id_alumno;
    }
    

    // Métodos getter y setter para el atributo nivel_Academico
    public String getNivel_Academico() {
        return nivel_Academico;
    }

    public void setNivel_Academico(String nivel_Academico) {
        this.nivel_Academico = nivel_Academico;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }
    
    

}
