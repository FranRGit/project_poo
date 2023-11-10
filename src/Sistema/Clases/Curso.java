/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Sistema.Clases;

import Sistema.Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Curso {

    private int id_curso;
    private String nombreCurso;
    private String periodo;
    private String categoriaCurso;
    

    public Curso(){

    }

    public Curso(int id_curso, String nombreCurso, String periodo, String categoriaCurso) {
        this.id_curso = id_curso;
        this.nombreCurso = nombreCurso;
        this.periodo = periodo;
        this.categoriaCurso = categoriaCurso;
    }
  
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
