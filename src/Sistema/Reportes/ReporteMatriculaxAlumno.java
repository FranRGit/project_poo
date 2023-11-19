/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema.Reportes;

import Sistema.Clases.Alumno;
import Sistema.Clases.Curso;
import Sistema.Clases.Matricula;
import Sistema.Clases.Profesor;
import Sistema.Clases.ReporteMatriculaÚnica;
import Sistema.Clases.Seccion;
import Sistema.Clases.daoCurso;
import Sistema.Clases.daoMatrícula;
import Sistema.Clases.daoSeccion;
import Sistema.Clases.daoUsuario;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class ReporteMatriculaxAlumno {
    
    private daoUsuario daoU = new daoUsuario();
    daoSeccion daoS = new daoSeccion();
    daoCurso daoC = new daoCurso();
    daoMatrícula daoM = new daoMatrícula();
    
    ArrayList<Profesor> listaProfesor = daoU.obtenerListaProfesor();
    ArrayList<Alumno> listaAlumno = daoU.obtenerListaAlumno();
    ArrayList<Curso> listaCurso = daoC.obtenerLista();
    ArrayList<Seccion> listaSeccion = daoS.obtenerLista();
    ArrayList<Matricula> listaMatri = daoM.obtenerLista();


    
    public ArrayList<ReporteMatriculaÚnica> filtrarDatosPorAlumno(String nombreAlumno) {
        ArrayList<ReporteMatriculaÚnica> datosFiltrados = new ArrayList<>();

        for (Alumno alumno : listaAlumno) {
            if (alumno.getNombre().equals(nombreAlumno)) {
                for (Matricula matricula : listaMatri) {
                    if (matricula.getId_estudiante() == alumno.getId_alumno()) {
                        Seccion seccion = obtenerNombreSeccion(matricula);
                        Curso curso = obtenerCurso(seccion);
                        Profesor profesor = obtenerProfesor(seccion.getId_profesor());

                        ReporteMatriculaÚnica rmu = new ReporteMatriculaÚnica();
                        rmu.setFecha(matricula.getFechaMatricula());
                        rmu.setNombreS(seccion.getNombreSeccion());
                        rmu.setCurso(curso.getNombreCurso());
                        rmu.setPeriodo(curso.getPeriodo());
                        rmu.setNombreP(profesor.getNombre());

                        datosFiltrados.add(rmu);
                    }
                }
            }
        }

        return datosFiltrados;
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
    
    public Curso obtenerCurso(Seccion seccion){
        for(Curso curso : listaCurso){
            if(curso.getId_curso() == seccion.getId_curso())
                return curso;
        }
        return null;
    }
    
}
