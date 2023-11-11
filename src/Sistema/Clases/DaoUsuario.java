// Definición de la clase daoUsuario, encargada de realizar operaciones CRUD en la base de datos para la entidad Usuario
package Sistema.Clases;

import Sistema.Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class daoUsuario {
    // Objeto para gestionar la conexión a la base de datos
    Conexion cx;

    // Constructor que inicializa la conexión
    public daoUsuario() {
       cx = new Conexion();
    }
    
    // Método para agregar un nuevo usuario a la base de datos, incluyendo la inserción en las tablas Alumno o Profesor si es aplicable
    public boolean agregarUsuario(Usuario usuario) {
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;

            // INSERTAR USUARIO EN LA TABLA
            ps = cx.conectar().prepareStatement("INSERT INTO Usuario VALUES (null,?,?,?,?,?,?,?)");
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getNacionalidad());
            ps.setString(4, usuario.getContrasenia());
            ps.setInt(5, usuario.getEdad());
            ps.setString(6, usuario.getTelefono());
            ps.setString(7, usuario.getSexo());
            ps.executeUpdate();

            // OBTENER ULTIMO ID
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                usuario.setId_usuario(rs.getInt(1));
            }
            rs.close();
            ps.close();
            cx.desconectar();
            
            // INSERTAR ALUMNO EN LA TABLA
            if(agregarAlumno(usuario)){
                System.out.println("Se agregó alumno");
            }
            
            // INSERTAR PROFESOR EN LA TABLA
            if(agregarProfesor(usuario)){
                System.out.println("Se agregó profesor");
            }
           
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    // Método para agregar un nuevo alumno a la base de datos
    public boolean agregarAlumno(Usuario usuario){
        PreparedStatement ps3 = null;
        
        try {
            if(usuario instanceof Alumno){
                ps3 = cx.conectar().prepareStatement("INSERT INTO Alumno VALUES (null,?,?)");
                ps3.setInt(1, usuario.getId_usuario());
                ps3.setString(2, ((Alumno) usuario).nivel_Academico);
                ps3.executeUpdate();
                
                cx.desconectar();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }

        return true;
    }
    
    // Método para agregar un nuevo profesor a la base de datos
    public boolean agregarProfesor(Usuario usuario){
       PreparedStatement ps3 = null;
        
        try {
            if( usuario instanceof Profesor){
                ps3 = cx.conectar().prepareStatement("INSERT INTO Profesor VALUES (?,null,?)");
                ps3.setString(1, ((Profesor) usuario).especialidad);
                ps3.setInt(2, usuario.getId_usuario());
                ps3.executeUpdate();
                cx.desconectar();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return true;
    }
    
    // Métodos para realizar las operaciones CRUD restantes (eliminar, mostrar, editar) pueden ser implementados en el futuro
    public void eliminarUsuario(Usuario usuario) {
       // Lógica para eliminar un usuario de la base de datos
    }

    public void mostrarUsuarios() {
        // Lógica para mostrar todos los usuarios almacenados en la base de datos
    }
    
    public void editarUsuario(){
        // Lógica para editar la información de un usuario en la base de datos
    }
}
