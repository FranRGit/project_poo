/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema.Clases;

import java.util.ArrayList;

/**
 *
 * @author PC HP
 */
public class ReporteMatricula {
    private int idMatricula;
    private String nombreA;
    private String nombreP;
    private String nombreS;
    private String horario;
    private String fecha;    

    public ReporteMatricula() {
    }

    public ReporteMatricula(int idMatricula, String nombreA, String nombreP, String nombreS, String horario, String fecha) {
        this.idMatricula = idMatricula;
        this.nombreA = nombreA;
        this.nombreP = nombreP;
        this.nombreS = nombreS;
        this.horario = horario;
        this.fecha = fecha;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getNombreS() {
        return nombreS;
    }

    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
   

    
    
}
