/*
 * Definición de la clase abstracta Usuario.
 * Representa un usuario genérico en un sistema, con atributos como ID de usuario, nombre, edad, sexo, teléfono, correo electrónico, nacionalidad y contraseña.
 * Se proporciona un constructor con parámetros para inicializar los atributos.
 * También se incluyen métodos getter y setter para acceder y modificar los atributos.
 * Esta clase es abstracta, lo que significa que no se puede instanciar directamente y debe ser extendida por clases concretas.
 */
package Sistema.Clases;

public abstract class Usuario {
    // Atributos de la clase Usuario
    protected int id_usuario;
    protected String nombre;
    protected int edad;
    protected String sexo;
    protected String telefono;
    protected String email;
    protected String nacionalidad;
    protected String contrasenia;
    private String tipo_usuario;

    public Usuario() {
    }

    
    // Constructor con parámetros para inicializar los atributos
    public Usuario(int id_usuario, String nombre, int edad, String sexo, String telefono, String email, String nacionalidad, String contrasenia) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.telefono = telefono;
        this.email = email;
        this.nacionalidad = nacionalidad;
        this.contrasenia = contrasenia;
    }

    // Métodos getter y setter para acceder y modificar los atributos
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
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

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }
    
    
}
