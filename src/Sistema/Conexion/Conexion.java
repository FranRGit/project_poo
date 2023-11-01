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
    Connection cx = null;
    
    public Connection conectar() {
        
        try {
            Class.forName("org.sqlite.JDBC");
            cx = DriverManager.getConnection("jdbc:sqlite:fisi.db");
            System.out.println("Conexion a base datos");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } 
        
        return cx;
    }
    
    public void desconectar(){
        try {
            cx.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
