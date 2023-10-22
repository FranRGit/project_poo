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

    public Administrador(String area, String codigo, String nombre, String email, String genero, String nacionalidad, String contrasena) {
        super(codigo, nombre, email, genero, nacionalidad, contrasena);
        this.area = area;
    }

    

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
}
