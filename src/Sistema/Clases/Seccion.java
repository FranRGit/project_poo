/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema.Clases;
import Sistema.Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author USUARIO
 */
public class Seccion {
    private int id_seccion;
    private String nombreSeccion;
    private int id_curso;
    private int id_profesor;
    private String horario;

    
    public Seccion() {
        
    }
    
    public Seccion(int id_seccion, String nombreSeccion, int id_curso, int id_profesor, String horario) {
        this.id_seccion = id_seccion;
        this.nombreSeccion = nombreSeccion;
        this.id_curso = id_curso;
        this.id_profesor = id_profesor;
        this.horario = horario;

    }
    
    //SETTERS Y GETTERS

    public int getId_seccion() {
        return id_seccion;
    }

    public void setId_seccion(int id_seccion) {
        this.id_seccion = id_seccion;
    }

    public String getNombreSeccion() {
        return nombreSeccion;
    }

    public void setNombreSeccion(String nombreSeccion) {
        this.nombreSeccion = nombreSeccion;
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
}




  

