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
    
    public void agregarLeccion(){
        Leccion nuevaLeccion = new Leccion();
        nuevaLeccion.agregarLección();
        lecciones.add(nuevaLeccion);
    }
    
    public void mostrarLeccion(){
        for(Leccion nuevaLeccion : lecciones){
            nuevaLeccion.mostrarLección();
        }
    }
    
 
    
    /*
    public void agregarModulo(){
        String tipo;
        String titulo;
        String autor;
        String nivel;
        tipo = JOptionPane.showInputDialog("Ingrese el tipo de materia que desea agregar un modulo(Matematica o física): ");
        switch(tipo.toLowerCase()){
            case "matematica":
                Matematica matematica = new Matematica();
                titulo = JOptionPane.showInputDialog("Nombre del módulo: ");
                autor = JOptionPane.showInputDialog("Autor del módulo: ");
                nivel = JOptionPane.showInputDialog("Nivel del modulo (facil, intermedio, dificil): ");
                matematica.agregarModulo(titulo, autor, nivel);
                break;
            case "fisica":
                Ciencia fisica = new Ciencia();
                titulo = JOptionPane.showInputDialog("Nombre del módulo: ");
                autor = JOptionPane.showInputDialog("Autor del módulo: ");
                nivel = JOptionPane.showInputDialog("Nivel del modulo (facil, intermedio, dificil): ");
                fisica.agregarModulo(titulo, autor, nivel);
                break;
        }
    }
    
    public void eliminarModulo(){
        Modulo moduloEliminar = null;
        for (Modulo modulo : modulos) {
            if (modulo.titulo.equalsIgnoreCase(titulo)) {
                moduloEliminar = modulo;
                break;
            }
        }

        if (moduloEliminar != null) {
            modulos.remove(moduloEliminar);
            JOptionPane.showMessageDialog(null, "Módulo eliminado: " + moduloEliminar.titulo);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el módulo con el título especificado.");
        }
    }
*/
}
