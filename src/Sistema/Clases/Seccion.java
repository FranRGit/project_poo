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
    private String codigoCurso;
    private String nombreCurso;
    private String descripcion;
    private ArrayList<Modulo> modulos;
    private String horario;
    
    //CRUD DE MODULOS - Modulos
    public Seccion() {
    }

    public Seccion(String codigoCurso, String nombreCurso, String descripcion, ArrayList<Modulo> modulos, String horario) {
        this.codigoCurso = codigoCurso;
        this.nombreCurso = nombreCurso;
        this.descripcion = descripcion;
        this.modulos = modulos;
        this.horario = horario;
    }
    public void agregarModulo(Modulo modulo) {
        modulos.add(modulo);
    }

    public ArrayList<Modulo> obtenerModulos() {
        return modulos;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getDescripcion() {
        return descripcion;
    }

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




  

