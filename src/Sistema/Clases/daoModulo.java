/*
 * Clase daoModulo encargada de realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en la tabla Modulo de la base de datos.
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
 * Clase encargada de realizar operaciones relacionadas con los módulos en la base de datos.
 * Author: User
 */
public class daoModulo implements CRUD {
    
    Conexion cm;
    Modulo modulo = new Modulo();

    public daoModulo() {
        cm = new Conexion();
    }
    
    
    // Constructor que inicializa la conexión a la base de datos
    public daoModulo(Modulo modulo) {
        this.modulo = modulo;
        cm = new Conexion();
    }

    // Método para agregar un nuevo módulo a la base de datos
   
    @Override
    public boolean agregar() {
        try{
            PreparedStatement ps = null;
            PreparedStatement ps2 = null;
            ResultSet rs = null;

            // INSERTAR MÓDULO EN LA TABLA
            ps = cm.conectar().prepareStatement("INSERT INTO Modulo VALUES (null,?,?)");
            ps.setString(1, modulo.getTitulo());
            ps.setInt(2, modulo.getId_curso());
            ps.executeUpdate();

            // OBTENER ÚLTIMO ID
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                modulo.setId_modulo(rs.getInt(1));
            }
            rs.close();
            ps.close();
            cm.desconectar();

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    // Método para eliminar un módulo de la base de datos
 
    @Override
    public boolean eliminar(int id) {
        try {
            PreparedStatement ps = null;

            // ELIMINAR EL MÓDULO DE LA TABLA
            ps = cm.conectar().prepareStatement("DELETE FROM Modulo WHERE id_modulo = ?");
            ps.setInt(1, modulo.getId_modulo());
            ps.executeUpdate();

            ps.close();
            cm.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    // Método para mostrar todos los módulos en la base de datos

    @Override
    public Object mostrar(int id) {
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;

            // Consulta para obtener todos los módulos
            ps = cm.conectar().prepareStatement("SELECT * FROM Modulo");
            rs = ps.executeQuery();

            // Iterar a través de los resultados y mostrar la información de cada módulo
            while (rs.next()) {
                modulo.setId_modulo(rs.getInt("id_modulo"));
                modulo.setId_curso(rs.getInt("id_curso"));
                modulo.setTitulo(rs.getString("titulo"));
                if(id == modulo.getId_curso()){
                    rs.close();
                    ps.close();
                    cm.desconectar();
                    return modulo;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return null;
    }

    // Método para editar un módulo existente en la base de datos
    
    @Override
    public boolean modificar() {
        try {
            PreparedStatement ps = null;

            // Actualizar el módulo en la tabla
            ps = cm.conectar().prepareStatement("UPDATE Modulo SET titulo = ?, id_curso = ? WHERE id_modulo = ?");
            ps.setString(1, modulo.getTitulo());
            ps.setInt(2, modulo.getId_curso());
            ps.setInt(3, modulo.getId_modulo());
            int filasActualizadas = ps.executeUpdate();

            ps.close();
            cm.desconectar();

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

    @Override
    public ArrayList obtenerLista() {
        ArrayList<Modulo> modulos = new ArrayList<>();

        
         try {
            PreparedStatement ps = cm.conectar().prepareStatement("SELECT * FROM Modulo");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Modulo temp = new Modulo();
                temp.setId_modulo(rs.getInt("id_modulo"));
                temp.setId_curso(rs.getInt("id_curso"));
                temp.setTitulo(rs.getString("titulo"));
                
                modulos.add(temp);
            }
            rs.close();
            ps.close();
            cm.desconectar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
         return modulos;
    }
    
}
