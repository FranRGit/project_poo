/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistemas.Reportes;

import Sistema.Clases.Alumno;
import Sistema.Clases.Curso;
import Sistema.Clases.Profesor;
import Sistema.Clases.Seccion;
import Sistema.Clases.daoCurso;
import Sistema.Clases.daoSeccion;
import Sistema.Clases.daoUsuario;
import java.util.ArrayList;

/**
 *
 * @author PC HP
 */
public class ReporteMatriculas {
    
    private daoUsuario daoU = new daoUsuario();
    daoSeccion daoS = new daoSeccion();
    daoCurso daoC = new daoCurso();
    
    ArrayList<Profesor> listaProfesor = new ArrayList<>();
    ArrayList<Alumno> listaAlumno = new ArrayList<>();
    ArrayList<Curso> listaCurso = new ArrayList<>();
    ArrayList<Seccion> listaSeccion = new ArrayList<>();
    
    
     public void filtrarDatos(){
         listaAlumno = daoU.obtenerListaAlumno();
         listaProfesor =daoU.obtenerListaProfesor();
         listaCurso = daoS.obtenerLista();
         listaSeccion = daoC.obtenerLista();
         
                 
         
        
     }       
            
            
            
            
            
            
            
    
    
    
}
