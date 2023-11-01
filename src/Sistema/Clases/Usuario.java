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
    protected String email;
    protected String nacionalidad;
    protected String contrasenia;

    public Usuario(String codeUser, String nombre, String email, String nacionalidad, String contrasenia) {
        this.codeUser = codeUser;
        this.nombre = nombre;
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
