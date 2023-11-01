    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema.Clases;

/**
 *
 * @author USUARIO
 */
public abstract class Usuario {
    protected String codeUser;
    protected String nombre;
    protected int edad;
    protected String sexo;
    protected String email;
    protected String nacionalidad;
    protected String contrasenia;

    public Usuario(String codeUser, String nombre, int edad, String sexo, String email, String nacionalidad, String contrasenia) {
        this.codeUser = codeUser;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.email = email;
        this.nacionalidad = nacionalidad;
        this.contrasenia = contrasenia;
    }

    public String getCodeUser() {
        return codeUser;
    }

    public void setCodeUser(String codeUser) {
        this.codeUser = codeUser;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
  
    
    
    
}
