package Sistema.Clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Alumno extends Usuario{
    private String codigoUsuarioAlumno;

    public Alumno(String codigo, String nombre, String email, String genero, String nacionalidad, String contrasena) {
        super(codigo, nombre, email, genero, nacionalidad, contrasena);
    }
    
}
