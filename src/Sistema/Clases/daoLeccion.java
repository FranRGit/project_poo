/*
 * Clase daoLeccion encargada de realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en la tabla Leccion de la base de datos.
 * Utiliza la clase Conexion para establecer la conexión con la base de datos.
 */
package Sistema.Clases;

import Sistema.Clases.Interfaces.CRUD;
import Sistema.Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Clase encargada de realizar operaciones relacionadas con las lecciones en la base de datos.
 * Author: User
 */
public class daoLeccion implements CRUD {
    Conexion cx;
    Leccion leccion = new Leccion();
    
    public daoLeccion(){
        cx = new Conexion();
    }
    
    // Constructor que inicializa la conexión a la base de datos
    public daoLeccion(Leccion leccion) {
        cx = new Conexion();
        this.leccion = leccion;
    }

    // Método para agregar una nueva lección a la base de datos
    
    @Override
    public boolean agregar() {
        try {
            PreparedStatement ps = null;
            ps = cx.conectar().prepareStatement("INSERT INTO Leccion VALUES (null,?,?,?,?)");
            ps.setInt(1, leccion.getId_modulo()); // SE ASIGNA A QUÉ MÓDULO PERTENECE LA LECCIÓN
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

    // Método para eliminar una lección de la base de datos
    @Override
    public boolean eliminar(int id) {
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

    // Método para mostrar una lección específica de la base de datos
    @Override
    public Object mostrar(int id) {
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
                if(id == leccion.getId_leccion()){    
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

    @Override
    public boolean modificar() {
        try {
            PreparedStatement ps = null;

            // Actualizar la lección en la tabla
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
                return false; // No se encontró ninguna lección con el ID proporcionado
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public ArrayList obtenerLista() {
        ArrayList<Leccion> lecciones = new ArrayList<>();

        
         try {
            PreparedStatement ps = cx.conectar().prepareStatement("SELECT * FROM Curso");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Leccion temp = new Leccion();
                temp.setId_leccion(rs.getInt("id_leccion"));
                temp.setId_modulo(rs.getInt("id_modulo"));
                temp.setTítulo(rs.getString("titulo"));
                temp.setDescripcion(rs.getString("descripcion"));
                temp.setMaterial(rs.getString("material"));
                
                lecciones.add(temp);
            }
            rs.close();
            ps.close();
            cx.desconectar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
         return lecciones;
    }
}
