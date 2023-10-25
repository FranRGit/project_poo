/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema.Clases;
import Sistema.Clases.Modulo;
import java.util.ArrayList;

public class Fisica extends Curso {
    ArrayList<Modulo> modulos = new ArrayList<>();

    public Fisica() {
    }

    
    
    public void agregarModulo(String titulo, String autor, String nivel) {
        Modulo modulo = new Modulo(titulo, autor, nivel);
        modulos.add(modulo);
    }
}