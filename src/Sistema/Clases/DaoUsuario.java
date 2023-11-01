/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema.Clases;

import Sistema.Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Usuario
 */
public class daoUsuario {
    Conexion cx;


    public daoUsuario() {
       cx = new Conexion();
    }
    
    //CRUD USUARIO

    public boolean agregarUsuario(Usuario usuario) {
        try {
            PreparedStatement ps = null;
            PreparedStatement ps2 = null;
            
            ResultSet rs = null;
            
            //INSERTAR USUARIO EN LA TABLA
            ps = cx.conectar().prepareStatement("INSERT INTO Usuario VALUES (null,?,?,?,?,?,?,?)");
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getNacionalidad());
            ps.setString(4, usuario.getContrasenia());
            ps.setInt(5, usuario.getEdad());
            ps.setString(6, usuario.getTelefono());
            ps.setString(7, usuario.getSexo());
            ps.executeUpdate();

            
            //OBTENER ULTIMO ID
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                usuario.setId_usuario(rs.getInt(1));
            }
            rs.close();
            ps.close();
            cx.desconectar();
            
            //INSERTAR ALUMNO EN LA TABLA
            if(agregarAlumno(usuario)){
                System.out.println("Se agregó alumno");
            }
            
            //INSERTAR PROFESOR EN LA TABLA
  
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    
    public boolean agregarAlumno(Usuario usuario){
        PreparedStatement ps3 = null;
        
        try {
            if(usuario instanceof Alumno){
                ps3 = cx.conectar().prepareStatement("INSERT INTO Alumno VALUES (null,?,?)");
                ps3.setInt(1, usuario.getId_usuario());
                ps3.setString(2, ((Alumno) usuario).nivel_Academico);
                ps3.executeUpdate();
                cx.desconectar();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }

        return true;
    }
    
    public boolean agregarProfesor(){
        return true;
    }
    
    
    public void eliminarUsuario(Usuario usuario) {
       
    }
    

    public void mostrarUsuarios() {
        
    }
    
    public void editarUsuario(){
        
    }

   
}
