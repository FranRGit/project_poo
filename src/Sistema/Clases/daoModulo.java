/*
 * Clase daoModulo encargada de realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en la tabla Modulo de la base de datos.
 * Utiliza la clase Conexion para establecer la conexión con la base de datos.
 */
package Sistema.Clases;

import Sistema.Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Clase encargada de realizar operaciones relacionadas con los módulos en la base de datos.
 * Author: User
 */
public class daoModulo {
    Conexion cm;

    // Constructor que inicializa la conexión a la base de datos
    public daoModulo() {
        cm = new Conexion();
    }

    // Método para agregar un nuevo módulo a la base de datos
    public boolean agregarModulo(Modulo modulo) {
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
    public void eliminarModulo(Modulo modulo) {
        try{
            PreparedStatement ps = null;

            // ELIMINAR EL MÓDULO DE LA TABLA
            ps = cm.conectar().prepareStatement("DELETE FROM Modulo WHERE id_modulo = ?");
            ps.setInt(1, modulo.getId_modulo());
            ps.executeUpdate();

            ps.close();
            cm.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Puedes manejar la excepción de otra manera, como lanzar una excepción personalizada.
        }
    }

    // Método para mostrar todos los módulos en la base de datos
    public void mostrarModulo() {
        try{
            PreparedStatement ps = null;
            ResultSet rs = null;

            // Consulta para obtener todos los módulos
            ps = cm.conectar().prepareStatement("SELECT * FROM Modulo");
            rs = ps.executeQuery();

            // Iterar a través de los resultados y mostrar la información de cada módulo
            while (rs.next()) {
                int id_modulo = rs.getInt("id_modulo");
                String titulo = rs.getString("titulo");
                int id_curso = rs.getInt("id_curso");

                // Puedes imprimir o mostrar la información de cada módulo como desees
                System.out.println("ID de Módulo: " + id_modulo);
                System.out.println("Título: " + titulo);
                System.out.println("ID de Curso: " + id_curso);
                System.out.println("-------------");
            }

            rs.close();
            ps.close();
            cm.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Puedes manejar la excepción de otra manera, como lanzar una excepción personalizada.
        }
    }

    // Método para editar un módulo existente en la base de datos
    public boolean editarModulo(Modulo modulo) {
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
}
