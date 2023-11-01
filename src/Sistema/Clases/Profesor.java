package Sistema.Clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Profesor extends Usuario{
    protected String especialidad;

    public Profesor(String especialidad, String codeUser, String nombre, int edad, String sexo, String email, String nacionalidad, String contrasenia) {
        super(codeUser, nombre, edad, sexo, email, nacionalidad, contrasenia);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    
    
}
