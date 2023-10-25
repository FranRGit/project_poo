/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema.Clases;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Leccion {
    private String título;
    private String asignatura;
    private ArrayList <Leccion> leccionT;
    private ArrayList <Leccion> leccionA;

    //AGREGAR FUNCIONES DE ASIGNAR, MODIFICAR, MOSTRAR
    public Leccion() {
        título = "";
        asignatura = "";
        this.leccionT = new ArrayList<>();
        this.leccionA = new ArrayList<>();
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    
    public void agregarLección(){ 
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese el titulo");
        String título = dato.nextLine();
        System.out.println(título);
        System.out.println("Ingrese la asignatura");
        String asignatura = dato.nextLine();
        System.out.println(asignatura);;
    }
    
    public void mostrarLección(){
        System.out.println("HOLA");
        System.out.println(getTítulo());
        System.out.println(getAsignatura());
    }
}
