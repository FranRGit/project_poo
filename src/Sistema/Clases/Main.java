package Sistema.Clases;

import Sistema.Conexion.Conexion;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        
        conexion.conectar(); 
        conexion.desconectar();
    }
}
    