/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema.Clases;

import Sistema.Conexion.Conexion;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class daoMatrícula {
    
    
    public boolean realizarMatricula(Matricula matricula){
         Conexion cx = new Conexion();
        try {
                PreparedStatement ps = null;
                ResultSet rs = null;
                
                // INSERTAR USUARIO EN LA TABLA
                ps = cx.conectar().prepareStatement("INSERT INTO Matricula VALUES (null,?,?,?,?)");
                ps.setInt(1, matricula.getId_estudiante());
                ps.setInt(2, matricula.getId_seccion());
                ps.setString(3, matricula.getFechaMatricula());
                ps.setString(4, matricula.getEstado());
                ps.executeUpdate();

                // OBTENER ULTIMO ID
                rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    matricula.setId_matricula(rs.getInt(1));
                }
                rs.close();
                ps.close();
                cx.desconectar(); //esto en daomatricula
                
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
            return true;
    }
    
    
    public ArrayList obtenerLista() {
         ArrayList<Matricula> matriculas = new ArrayList<>();
         Conexion cx = new Conexion();
         
         try {
            PreparedStatement ps = cx.conectar().prepareStatement("SELECT * FROM Matricula");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                
                Matricula temp = new Matricula();
                
                temp.setId_matricula(rs.getInt("id_matricula"));
                temp.setId_estudiante(rs.getInt("id_alumno"));
                temp.setId_seccion(rs.getInt("id_seccion"));
                temp.setFechaMatricula(rs.getString("fecha_matricula"));
                temp.setEstado(rs.getString("estado"));
              

                matriculas.add(temp);
            }
            
            rs.close();
            ps.close();
            cx.desconectar();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
         return matriculas;
    }
}
