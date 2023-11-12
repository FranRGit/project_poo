/*
 * Definición de la clase Profesor, que hereda de la clase Usuario.
 * Representa a un profesor en un sistema educativo.
 * Contiene un atributo adicional llamado "especialidad".
 * Se proporciona un constructor que inicializa los atributos mediante el constructor de la clase base (Usuario).
 * Se incluyen los métodos getter y setter para acceder y modificar la especialidad.
 */
package Sistema.Clases;

public class Profesor extends Usuario {
    // Atributo adicional específico para la clase Profesor
    protected String especialidad;

    public Profesor() {
    }

    
    // Constructor que utiliza el constructor de la clase base (Usuario) y asigna la especialidad
    public Profesor(String especialidad, int id_usuario, String nombre, int edad, String sexo, String telefono, String email, String nacionalidad, String contrasenia) {
        super(id_usuario, nombre, edad, sexo, telefono, email, nacionalidad, contrasenia);
        this.especialidad = especialidad;
    }

    // Métodos getter y setter para acceder y modificar la especialidad
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
