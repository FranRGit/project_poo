// Definición de la clase Leccion
package Sistema.Clases;

import java.util.Scanner;

/**
 * Clase que representa una lección dentro de un módulo en un sistema educativo.
 * Puede contener información como el título, descripción y material asociado a la lección.
 */
public class Leccion {
    
    // Atributos de la clase Leccion
    protected int id_modulo;
    protected int id_leccion;
    protected String título;
    protected String descripcion;
    protected String material;

    // Constructor vacío
    public Leccion() {
        
    }

    // Constructor con parámetros
    public Leccion(int id_modulo, int id_leccion, String título, String descripcion, String material) {
        this.id_modulo = id_modulo;
        this.id_leccion = id_leccion;
        this.título = título;
        this.descripcion = descripcion;
        this.material = material;
    }

    // Métodos getter y setter para acceder y modificar los atributos de la clase Leccion
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