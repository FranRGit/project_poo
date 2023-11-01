/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema.Clases;
import java.util.ArrayList;
/**
 *
 * @author USUARIO
 */
public class Seccion {
    private String codigoSeccion;
    private String nombreSeccion;
    private String descripcion;
    private ArrayList<Modulo> modulos;
    private String horario;
    
    
    public Seccion() {
    }

    public Seccion(String codigoSeccion, String nombreSeccion, String descripcion, ArrayList<Modulo> modulos, String horario) {
        this.codigoSeccion = codigoSeccion;
        this.nombreSeccion = nombreSeccion;
        this.descripcion = descripcion;
        this.modulos = modulos;
        this.horario = horario;
    }

    
    
    //CRUD DE MODULOS 
    
    public void agregarModulo() {
        
    }

    public void modificarModulo(){
        
    }
    
    public void eliminarModulo(){
        
    }
    
    public void mostraModulo(){
        
    }
    //SETTERS Y GETTERS
    
   

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(ArrayList<Modulo> modulos) {
        this.modulos = modulos;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
}




  

