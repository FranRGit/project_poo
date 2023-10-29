/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema.Clases;

/**
 *
 * @author Jorge
 */
public class Administrador extends Usuario{
    private String area;

    public Administrador(String area, String codeUser, String nombre, String email, String nacionalidad, String contrasenia) {
        super(codeUser, nombre, email, nacionalidad, contrasenia);
        this.area = area;
    } 
    
}
