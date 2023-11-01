/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Sistema.Clases;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Modulo {
    String titulo;
    String autor;
    String nivel;
    

    //Arreglo de lecciones - Modificar
    ArrayList<Leccion> lecciones;
    
    public Modulo(String titulo, String autor, String nivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.nivel = nivel;
        this.lecciones = new ArrayList<>();
    }
    
    
    //CRUD De lecciones
    public void agregarLeccion(){

    }
    
    public void mostrarLeccion(){

    }
    
    public void eliminarLeccion(){
        
    }
    
    public void modificarLeccion(){
        
    }
}
