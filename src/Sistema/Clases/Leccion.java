/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema.Clases;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Leccion {
    
    protected int id_modulo;
    protected int id_leccion;
    protected String título;
    protected String descripcion;
    protected String material;

    public Leccion() {
        
    }
    public Leccion(int id_modulo, int id_leccion, String título, String descripcion, String material) {
        this.id_modulo = id_modulo;
        this.id_leccion = id_leccion;
        this.título = título;
        this.descripcion = descripcion;
        this.material = material;
    }

    public int getId_modulo() {
        return id_modulo;
    }

    public void setId_modulo(int id_modulo) {
        this.id_modulo = id_modulo;
    }

    public int getId_leccion() {
        return id_leccion;
    }

    public void setId_leccion(int id_leccion) {
        this.id_leccion = id_leccion;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    

   

}
