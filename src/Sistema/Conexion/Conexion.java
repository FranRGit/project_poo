/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema.Conexion;

import java.sql.*;

/**
 *
 * @author USUARIO
 */
public class Conexion {
    // Objeto que representa la conexión a la base de datos
    Connection cx = null;
    
    // Método para establecer la conexión a la base de datos
    public Connection conectar() {
        try {
            // Carga dinámica del controlador JDBC para SQLite
            Class.forName("org.sqlite.JDBC");
            
            // Establece la conexión a la base de datos "fisi.db"
            cx = DriverManager.getConnection("jdbc:sqlite:fisi.db");
            
            // Mensaje indicando que la conexión a la base de datos fue exitosa
            System.out.println("Conexion a base datos");
        } catch (ClassNotFoundException | SQLException e) {
            // Captura excepciones y muestra la traza de la pila en caso de error
            e.printStackTrace();
        } 
        
        // Retorna el objeto Connection para su uso en otras partes del código
        return cx;
    }
    
    // Método para cerrar la conexión a la base de datos
    public void desconectar(){
        try {
            // Cierra la conexión
            cx.close();
        } catch (SQLException ex) {
            // Captura excepciones y muestra la traza de la pila en caso de error al cerrar la conexión
            ex.printStackTrace();
        }
    }
}

