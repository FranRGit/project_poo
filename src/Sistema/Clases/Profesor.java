package Sistema.Clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Profesor extends Usuario{
    protected String especialidad;

    public Profesor(String especialidad, String codeUser, String nombre, String email, String nacionalidad, String contrasenia) {
        super(codeUser, nombre, email, nacionalidad, contrasenia);
        this.especialidad = especialidad;
    }
    
    
}
