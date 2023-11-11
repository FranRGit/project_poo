/*
 * Definición de la clase Matricula.
 * Representa la matrícula de un estudiante en una sección de un curso.
 * Contiene atributos como el ID de matrícula, ID de sección, ID de estudiante, fecha de matrícula y estado.
 * La fecha de matrícula se mantiene como cadena por ahora, hasta que se trabaje con fechas de manera más específica.
 */
package Sistema.Clases;

public class Matricula {
    // Atributos de la clase Matricula
    private int id_matricula;
    private int id_seccion;
    private int id_estudiante;
    private String fechaMatricula; // POR AHORA CON CADENA, HASTA QUE TRABAJEMOS CON FECHAS
    private String estado;

    // Constructor vacío
    public Matricula(){
        
    }
    
    // Constructor con parámetros
    public Matricula(int id_matricula, int id_seccion, int id_estudiante, String fechaMatricula, String estado) {
        this.id_matricula = id_matricula;
        this.id_seccion = id_seccion;
        this.id_estudiante = id_estudiante;
        this.fechaMatricula = fechaMatricula;
        this.estado = estado;
    }

    // Métodos getter y setter para acceder y modificar los atributos de la clase Matricula
    public int getId_matricula() {
        return id_matricula;
    }

    public void setId_matricula(int id_matricula) {
        this.id_matricula = id_matricula;
    }

    public int getId_seccion() {
        return id_seccion;
    }

    public void setId_seccion(int id_seccion) {
        this.id_seccion = id_seccion;
    }

    public int getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(int id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public String getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(String fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}