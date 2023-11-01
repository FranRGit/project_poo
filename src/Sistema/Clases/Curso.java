/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Sistema.Clases;

import java.util.ArrayList;

public class Curso {

    private String codigoCurso;
    private String nombreCurso;
    private String descripcion;
    private String categoriaCurso;
    
  
    ArrayList<Seccion> secciones;

    public Curso(String codigoCurso, String nombreCurso, String descripcion, String categoriaCurso, ArrayList<Seccion> secciones) {
        this.codigoCurso = codigoCurso;
        this.nombreCurso = nombreCurso;
        this.descripcion = descripcion;
        this.categoriaCurso = categoriaCurso;
        this.secciones = new ArrayList<>();
    }
    
    
    //Metodos de CRUD para secciones
    
    public void agregarSeccion(){
        
    }
    
    public void eliminarSeccion(){
        
    }
    
    public void mostrarSeccion(){
        
    }

    public void buscarSeccion() {
        
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

    public String getCategoriaCurso() {
        return categoriaCurso;
    }

    public void setCategoriaCurso(String categoriaCurso) {
        this.categoriaCurso = categoriaCurso;
    }

    public ArrayList<Seccion> getSecciones() {
        return secciones;
    }

    public void setSecciones(ArrayList<Seccion> secciones) {
        this.secciones = secciones;
    }
  
    
   
    
}
