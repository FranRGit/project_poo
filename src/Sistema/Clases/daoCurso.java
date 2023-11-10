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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC HP
 */
public class daoCurso {
    Conexion cx;

    public daoCurso() {
        cx= new Conexion();
    }
    
    public boolean agregarCurso(Curso curso){
        PreparedStatement ps = null;
        
        try {
            ps = cx.conectar().prepareStatement("INSERT INTO Curso VALUES (null,?,?,?)");
            ps.setString(1, curso.getNombreCurso());
            ps.setString(2, curso.getPeriodo());
            ps.setString(3, curso.getCategoriaCurso());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }
    public boolean eliminarCurso(Curso curso){
         try {
            PreparedStatement ps = null;
            ps = cx.conectar().prepareStatement("DELETE FROM Curso WHERE id_curso = ?");
            ps.setInt(1, curso.getId_curso());
            ps.executeUpdate();
            cx.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }
    public Curso mostrarCurso(int id){
        Curso curso = new Curso();
        
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = cx.conectar().prepareStatement("SELECT * FROM Curso");
            rs = ps.executeQuery();
            while(rs.next()){
                curso.setId_curso(rs.getInt("id_curso"));
                curso.setNombreCurso(rs.getString("nombre"));
                curso.setPeriodo(rs.getString("periodo"));
                curso.setCategoriaCurso(rs.getString("categoria"));
                if(id == curso.getId_curso()){    
                    rs.close();
                    ps.close();
                    cx.desconectar();
                    return curso;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return null;
    
    }
    public boolean editarCurso(Curso curso) {
    PreparedStatement ps = null;

    try {
        ps = cx.conectar().prepareStatement("UPDATE Curso SET nombre = ?, periodo = ?, categoria = ? WHERE id_curso = ?");
        ps.setString(1, curso.getNombreCurso());
        ps.setString(2, curso.getPeriodo());
        ps.setString(3, curso.getCategoriaCurso());
        ps.setInt(4, curso.getId_curso());
        ps.executeUpdate();
        cx.desconectar();
    } catch (SQLException ex) {
        ex.printStackTrace();
        return false;
    }
    return true;
    }
    
    //RETORNAR LISTA DE CURSOS :
    public ArrayList<Curso> obtenercrusos(){
        ArrayList<Curso> cursos = new ArrayList<>();
        String consulta = "SELECT FROM * cursos";
        
         try {
            PreparedStatement ps = cx.conectar().prepareStatement("SELECT * FROM Curso");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                int id_curso = rs.getInt("id_curso");
                String nombre = rs.getString("nombre");
                String periodo = rs.getString("periodo");
                String categoria = rs.getString("Categoria");
                
                Curso aux = new Curso(id_curso, nombre, periodo, categoria);
                cursos.add(aux);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
         return cursos;
    }
}
