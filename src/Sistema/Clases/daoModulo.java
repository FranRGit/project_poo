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
public class daoModulo {
    Conexion cm;

    public daoModulo() {
        cm = new Conexion();
    }
    
       
    //CRUD DE MODULOS 
   public boolean agregarModulo(Modulo modulo) {
        try{
            PreparedStatement ps = null;
            PreparedStatement ps2 = null;

            ResultSet rs = null;

            //INSERTAR MODULO EN LA TABLA
            ps = cm.conectar().prepareStatement("INSERT INTO Modulo VALUES (null,?,?)");
            ps.setString(1, modulo.getTitulo());
            ps.setInt(2, modulo.getId_curso());
            ps.executeUpdate();

            //OBTENER ULTIMO ID
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
