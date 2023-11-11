/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
// Definición de la clase Curso
package Sistema.Clases;

import Sistema.Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Curso {

    // Atributos de la clase Curso
    private int id_curso;
    private String nombreCurso;
    private String periodo;
    private String categoriaCurso;

    // Constructor vacío
    public Curso(){

    }

    // Constructor con parámetros
    public Curso(int id_curso, String nombreCurso, String periodo, String categoriaCurso) {
        this.id_curso = id_curso;
        this.nombreCurso = nombreCurso;
        this.periodo = periodo;
        this.categoriaCurso = categoriaCurso;
    }

    // Métodos getter y setter para acceder y modificar los atributos de la clase Curso
    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getCategoriaCurso() {
        return categoriaCurso;
    }

    public void setCategoriaCurso(String categoriaCurso) {
        this.categoriaCurso = categoriaCurso;
    }

}