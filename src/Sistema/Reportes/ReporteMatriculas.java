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
    
    ArrayList<Profesor> listaProfesor = daoU.obtenerListaProfesor();
    ArrayList<Alumno> listaAlumno = daoU.obtenerListaAlumno();
    ArrayList<Seccion> listaSeccion = daoS.obtenerLista();
    ArrayList<Matricula> listaMatri = daoM.obtenerLista();
    ArrayList<ReporteMatricula> listareporteMatri = new ArrayList<>();

    
     public ArrayList filtrarDatos(){

         for (Matricula matricula : listaMatri) {
             ReporteMatricula reporteM = new ReporteMatricula(); // Crear un nuevo objeto para cada iteración

             reporteM.setIdMatricula(matricula.getId_matricula());
             reporteM.setFecha(matricula.getFechaMatricula());

             Alumno alumno = obtenerNombreAlumno(matricula);
             if (alumno != null) {
                 reporteM.setNombreA(alumno.getNombre());
             }

             Seccion seccion = obtenerNombreSeccion(matricula);
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
            
     public Alumno obtenerNombreAlumno(Matricula matricula){
         for(Alumno alumno : listaAlumno){
             if(alumno.getId_alumno()==matricula.getId_estudiante()){
                return alumno;
            }
         }
        return null;
    }
     
     public Seccion obtenerNombreSeccion(Matricula matricula) {
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

            
            
            
            
            
    
    
    
