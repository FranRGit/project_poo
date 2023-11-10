/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema.Clases;

import Sistema.Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class daoLeccion {
    Conexion cx;

    public daoLeccion() {
        
    }
    
     //CRUD De lecciones
    public boolean agregarLeccion(Leccion leccion){
        try {
            PreparedStatement ps = null;
            ps = cx.conectar().prepareStatement("INSERT INTO Leccion VALUES (null,?,?,?,?)");
            ps.setInt(1, leccion.getId_modulo()); //SE ASIGNA A QUÉ MODULO PERTENECE LA LECCION
            ps.setString(2, leccion.getTítulo());
            ps.setString(3, leccion.getDescripcion());
            ps.setString(4, leccion.getMaterial());
            ps.executeUpdate();
            cx.desconectar();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public Leccion mostrarLeccion(int id_leccion){
        Leccion leccion = new Leccion();
        
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = cx.conectar().prepareStatement("SELECT * FROM Alumno");
            rs = ps.executeQuery();
            while(rs.next()){
                leccion.setId_leccion(rs.getInt("id_leccion"));
                leccion.setId_modulo(rs.getInt("id_modulo"));
                leccion.setTítulo(rs.getString("titulo"));
                leccion.setDescripcion(rs.getString("descripcion"));
                leccion.setMaterial(rs.getString("material"));
                if(id_leccion == leccion.getId_leccion()){    
                    rs.close();
                    ps.close();
                    cx.desconectar();
                    return leccion;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
  
        return null;
    }
    
    public boolean eliminarLeccion(Leccion leccion){
        try {
            PreparedStatement ps = null;
            ps = cx.conectar().prepareStatement("DELETE FROM Leccion WHERE id = ?");
            ps.setInt(1, leccion.getId_leccion());
            ps.executeUpdate();
            cx.desconectar();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public boolean modificarLeccion(Leccion leccion){
         try {
            PreparedStatement ps = null;

            // Actualizar el módulo en la tabla
            ps = cx.conectar().prepareStatement("UPDATE Leccion SET id_modulo = ? ,titulo = ?, descripcion = ?,material = ? WHERE id_leccion = ?");
            ps.setInt(1, leccion.getId_modulo());
            ps.setString(2, leccion.getTítulo());
            ps.setString(3, leccion.getDescripcion());
            ps.setString(4, leccion.getMaterial());
            ps.setInt(5, leccion.getId_modulo());
            int filasActualizadas = ps.executeUpdate();

            ps.close();
            cx.desconectar();

            // Comprobar si se actualizó al menos una fila
            if(filasActualizadas > 0) {
                return true; // La actualización fue exitosa
            } else {
                return false; // No se encontró ningún módulo con el ID proporcionado
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    
}
