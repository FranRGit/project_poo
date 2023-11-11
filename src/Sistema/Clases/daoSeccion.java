/*
 * Clase daoSeccion encargada de realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en la tabla Seccion de la base de datos.
 * Utiliza la clase Conexion para establecer la conexión con la base de datos.
 */
package Sistema.Clases;

import Sistema.Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Clase encargada de realizar operaciones relacionadas con las secciones en la base de datos.
 * Author: User
 */
public class daoSeccion {
    Conexion cs;

    // Constructor que inicializa la conexión a la base de datos
    public daoSeccion() {
        cs = new Conexion();
    }

    // Método para agregar una nueva sección a la base de datos
    public boolean agregarSeccion(Seccion seccion){
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

    // Método para eliminar una sección de la base de datos
    public void eliminarSeccion(Seccion seccion) {
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
        }
    }

    // Método para mostrar todas las secciones en la base de datos
    public void mostrarSeccion() {
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;

            // Consulta para obtener todas las secciones
            ps = cs.conectar().prepareStatement("SELECT * FROM Seccion");
            rs = ps.executeQuery();

            // Iterar a través de los resultados y mostrar la información de cada sección
            while (rs.next()) {
                int id_seccion = rs.getInt("id_seccion");
                String nombreSeccion = rs.getString("nombreSeccion");
                int id_curso = rs.getInt("id_curso");
                int id_profesor = rs.getInt("id_profesor");
                String horario = rs.getString("horario");

                // Imprimir información de cada sección
                System.out.println("ID de Sección: " + id_seccion);
                System.out.println("Nombre de la Sección: " + nombreSeccion);
                System.out.println("ID de Curso: " + id_curso);
                System.out.println("ID de Profesor: " + id_profesor);
                System.out.println("Horario: " + horario);
                System.out.println("-------------");
            }

            rs.close();
            ps.close();
            cs.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Método para editar la información de una sección existente en la base de datos
    public boolean editarSeccion(Seccion seccion) {
        try {
            PreparedStatement ps = null;

            // ACTUALIZAR LA INFORMACIÓN DE LA SECCIÓN EN LA TABLA
            ps = cs.conectar().prepareStatement("UPDATE Seccion SET nombreSeccion=?, id_curso=?, id_profesor=?, horario=? WHERE id_seccion=?");
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
}
