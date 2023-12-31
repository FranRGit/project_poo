/*
 * Definición de la clase Modulo.
 * Representa un módulo asociado a un curso en un sistema educativo.
 * Contiene atributos como el ID de curso, ID de módulo y título del módulo.
 * Se proporciona un constructor que recibe una instancia de la clase Conexion.
 */
package Sistema.Clases;

import Sistema.Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Modulo {

    // Atributos de la clase Modulo
    protected int id_curso;
    protected int id_modulo;
    protected String titulo;

    // Constructor que recibe una instancia de la clase Conexion
    public Modulo() {
    }

    public Modulo(int id_curso, int id_modulo, String titulo) {
        this.id_curso = id_curso;
        this.id_modulo = id_modulo;
        this.titulo = titulo;
    }
    
    
    // SETTERS Y GETTERS 

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public int getId_modulo() {
        return id_modulo;
    }

    public void setId_modulo(int id_modulo) {
        this.id_modulo = id_modulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
