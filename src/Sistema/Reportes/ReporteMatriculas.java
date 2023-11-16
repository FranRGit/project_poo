/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema.Reportes;

import Sistema.Clases.Alumno;
import Sistema.Clases.Curso;
import Sistema.Clases.Matricula;
import Sistema.Clases.Profesor;
import Sistema.Clases.ReporteMatricula;
import Sistema.Clases.Seccion;
import Sistema.Clases.daoCurso;
import Sistema.Clases.daoMatrícula;
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
    daoMatrícula daoM = new daoMatrícula();
    
    ArrayList<Profesor> listaProfesor = new ArrayList<>();
    ArrayList<Alumno> listaAlumno = new ArrayList<>();
    ArrayList<Seccion> listaSeccion = new ArrayList<>();
    ArrayList<Matricula> listaMatri = new ArrayList<>();
    ArrayList<ReporteMatricula> listareporteMatri = new ArrayList<>();
    Matricula matricula = new Matricula();
    
    
     public ArrayList filtrarDatos(){
         
         
         listaAlumno = daoU.obtenerListaAlumno();
         listaProfesor =daoU.obtenerListaProfesor();
         listaSeccion = daoS.obtenerLista();
         listaMatri= daoM.obtenerLista();
         for (Matricula matricula : listaMatri) {
             ReporteMatricula reporteM = new ReporteMatricula(); // Crear un nuevo objeto para cada iteración

             reporteM.setIdMatricula(matricula.getId_matricula());
             reporteM.setFecha(matricula.getFechaMatricula());

             Alumno alumno = obtenerNombreAlumno();
             if (alumno != null) {
                 reporteM.setNombreA(alumno.getNombre());
             }

             Seccion seccion = obtenerNombreSeccion();
             if (seccion != null) {
                 reporteM.setNombreS(seccion.getNombreSeccion());
                 reporteM.setHorario(seccion.getHorario());
                 Profesor profesor = obtenerProfesor(seccion.getId_profesor());
                 if (profesor != null) {
                     reporteM.setNombreP(profesor.getNombre());
                 }

                 
             }

             listareporteMatri.add(reporteM);
         }

          
        return listareporteMatri; 
        
     }       
            
     public Alumno obtenerNombreAlumno(){
         for(Alumno alumno : listaAlumno){
             if(alumno.getId_alumno()==matricula.getId_estudiante()){
                return alumno;
            }
         }
        return null;
    }
     
     public Seccion obtenerNombreSeccion() {
        for(Seccion seccion : listaSeccion){
            if(seccion.getId_seccion()==matricula.getId_seccion()) {
                return seccion;
            }
        }
        return null;
    }

    public Profesor obtenerProfesor(int IDseccion){
        for(Profesor profesor : listaProfesor){
            if(profesor.getId_profesor() == IDseccion) {
                return profesor;
            }
        }
        return null;
    }
    
    }

            
            
            
            
            
    
    
    
