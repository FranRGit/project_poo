/*
 * Clase daoSeccion encargada de realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en la tabla Seccion de la base de datos.
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
 * Clase encargada de realizar operaciones relacionadas con las secciones en la base de datos.
 * Author: User
 */
public class daoSeccion implements CRUD{
    Conexion cs;
    Seccion seccion = new Seccion();

    public daoSeccion() {
        cs = new Conexion();
    }
    
    // Constructor que inicializa la conexión a la base de datos
    public daoSeccion(Seccion seccion) {
        cs = new Conexion();
        this.seccion = seccion;
    }
    
    // Método para agregar una nueva sección a la base de datos
    @Override
    public boolean agregar() {
        try {
            PreparedStatement ps = null;

            // INSERTAR SECCIÓN EN LA TABLA
            ps = cs.conectar().prepareStatement("INSERT INTO Seccion VALUES (null,?,?,?,?)");
            ps.setString(1, seccion.getNombreSeccion());
            ps.setString(2, seccion.getHorario());
            ps.setInt(3, seccion.getId_curso());
            ps.setInt(4, seccion.getId_profesor());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean eliminar(int id) {
        try {
            PreparedStatement ps = null;

            // ELIMINAR LA SECCIÓN DE LA TABLA
            ps = cs.conectar().prepareStatement("DELETE FROM Seccion WHERE id_seccion = ?");
            ps.setInt(1, seccion.getId_seccion());
            ps.executeUpdate();

            ps.close();
            cs.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        
        return true;
    }

    @Override
    public Object mostrar(int id) {
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;

            // Consulta para obtener todas las secciones
            ps = cs.conectar().prepareStatement("SELECT * FROM Seccion");
            rs = ps.executeQuery();

            // Iterar a través de los resultados y mostrar la información de cada sección
            while (rs.next()) {
                
                seccion.setId_seccion(rs.getInt("id_seccion"));
                seccion.setNombreSeccion(rs.getString("nombre"));
                seccion.setId_curso(rs.getInt("id_curso"));
                seccion.setId_profesor(rs.getInt("id_profesor"));
                seccion.setHorario(rs.getString("horario"));

                if(id == seccion.getId_seccion()){    
                    rs.close();
                    ps.close();
                    cs.desconectar();
                    return seccion;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    // Método para editar la información de una sección existente en la base de datos
    @Override
    public boolean modificar() {
        try {
            PreparedStatement ps = null;

            // ACTUALIZAR LA INFORMACIÓN DE LA SECCIÓN EN LA TABLA
            ps = cs.conectar().prepareStatement("UPDATE Seccion SET nombre=?, id_curso=?, id_profesor=?, horario=? WHERE id_seccion=?");
            ps.setString(1, seccion.getNombreSeccion());
            ps.setInt(2, seccion.getId_curso());
            ps.setInt(3, seccion.getId_profesor());
            ps.setString(4, seccion.getHorario());
            ps.setInt(5, seccion.getId_seccion());

            int rowsAffected = ps.executeUpdate();

            ps.close();
            cs.desconectar();

            return rowsAffected > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public ArrayList obtenerLista() {
        ArrayList<Seccion> secciones = new ArrayList<>();
        
         try {
            PreparedStatement ps = cs.conectar().prepareStatement("SELECT * FROM Seccion");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Seccion temp = new Seccion();
                temp.setId_seccion(rs.getInt("id_seccion"));
                temp.setNombreSeccion(rs.getString("nombre"));
                temp.setId_curso(rs.getInt("id_curso"));
                temp.setId_profesor(rs.getInt("id_profesor"));
                temp.setHorario(rs.getString("horario"));
                
                secciones.add(temp);
            }
            rs.close();
            ps.close();
            cs.desconectar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return secciones;
    }
}
