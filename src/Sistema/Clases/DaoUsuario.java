// Definición de la clase daoUsuario, encargada de realizar operaciones CRUD en la base de datos para la entidad Usuario
package Sistema.Clases;

import Sistema.Clases.Interfaces.CRUD;
import Sistema.Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class daoUsuario implements CRUD{
    // Objeto para gestionar la conexión a la base de datos
    Conexion cx;
    Usuario usuario = new Usuario() {};
    
    public daoUsuario(){
        cx = new Conexion();
    }
    
    // Constructor que inicializa la conexión
    public daoUsuario(Usuario usuario) {
       this.usuario = usuario;
       cx = new Conexion();
    }
    
    // Métodos para realizar las operaciones CRUD restantes (eliminar, mostrar, editar) pueden ser implementados en el futuro
    
    // Método para agregar un nuevo usuario a la base de datos, incluyendo la inserción en las tablas Alumno o Profesor si es aplicable
    @Override
    public boolean agregar() {
         try {
            PreparedStatement ps = null;
            ResultSet rs = null;

            // INSERTAR USUARIO EN LA TABLA
            ps = cx.conectar().prepareStatement("INSERT INTO Usuario VALUES (null,?,?,?,?,?,?,?,?)");
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getNacionalidad());
            ps.setString(4, usuario.getContrasenia());
            ps.setInt(5, usuario.getEdad());
            ps.setString(6, usuario.getTelefono());
            ps.setString(7, usuario.getSexo());
            if(usuario instanceof Alumno){
                ps.setString(8, "Alumno");
            } else {
                ps.setString(8, "Profesor");
            }
            
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
    public boolean agregarAlumno(Usuario usuario) {
        PreparedStatement ps3 = null;

        try {
            if (usuario instanceof Alumno) {
                ResultSet rs = null;

                ps3 = cx.conectar().prepareStatement("INSERT INTO Alumno VALUES (null,?,?)");
                ps3.setInt(1, usuario.getId_usuario());
                ps3.setString(2, ((Alumno) usuario).nivel_Academico);
                ps3.executeUpdate();
                rs = ps3.getGeneratedKeys();
                //obtener ID alumno
                if (rs.next()) {
                    ((Alumno) usuario).setId_alumno(rs.getInt(1));
                }
                rs.close();
                ps3.close();

                cx.desconectar();
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();

        }

        return false;
    }


    // Método para agregar un nuevo profesor a la base de datos
    public boolean agregarProfesor(Usuario usuario) {
        PreparedStatement ps3 = null;

        try {
            if (usuario instanceof Profesor) {
                ResultSet rs = null;
                ps3 = cx.conectar().prepareStatement("INSERT INTO Profesor VALUES (?,null,?)");
                ps3.setString(1, ((Profesor) usuario).especialidad);
                ps3.setInt(2, usuario.getId_usuario());
                ps3.executeUpdate();
                //obtener ID alumno
                if (rs.next()) {
                    ((Profesor) usuario).setId_profesor(rs.getInt(1));
                }
                rs.close();
                ps3.close();
                cx.desconectar();
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        try {
            PreparedStatement ps = null;

            // ELIMINAR LA SECCIÓN DE LA TABLA
            ps = cx.conectar().prepareStatement("DELETE FROM Usuario WHERE id_usuario = ?");
            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();
            cx.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }
    
     public boolean eliminarxTipoUsuario(int id,String tabla, String condicion) {
        try {
            PreparedStatement ps = null;
            
            String consulta = "DELETE FROM "+tabla+" WHERE "+condicion+" = ?";
            // ELIMINAR LA SECCIÓN DE LA TABLA
            ps = cx.conectar().prepareStatement(consulta);
            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();
            cx.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Object mostrar(int id) {
        return true; 
    }

    @Override
    public boolean modificar() {
        try {
            PreparedStatement ps = null;

            // ACTUALIZAR LA INFORMACIÓN DE LA SECCIÓN EN LA TABLA
            ps = cx.conectar().prepareStatement("UPDATE Usuario SET nombre= ?, email= ?, nacionalidad= ?, edad= ?, telefono= ?, sexo= ? WHERE id_usuario= ?");
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getNacionalidad());
            ps.setInt(4, usuario.getEdad());
            ps.setString(5, usuario.getTelefono());
            ps.setString(6, usuario.getSexo());
            ps.setInt(7, usuario.getId_usuario());
                      
            ps.executeUpdate();
            ps.close();
            cx.desconectar();
            
            // MODIFICAR ALUMNO EN LA TABLA
            if(modifcarAlumno(usuario)){
                System.out.println("Se modificó alumno");
            }
            
            // INSERTAR PROFESOR EN LA TABLA
            if(modificarProfesor(usuario)){
                System.out.println("Se modificó profesor");
            }
            
            
            return true;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }
        
        return false;
    }
    
        // Método para agregar un nuevo alumno a la base de datos
    public boolean modifcarAlumno(Usuario usuario) {
        

        try {
            if (usuario instanceof Alumno) {
                PreparedStatement ps3 = null;

                ps3 = cx.conectar().prepareStatement("UPDATE Alumno SET nivel_academico= ? WHERE id_alumno= ?");
                ps3.setString(1, ((Alumno) usuario).nivel_Academico);
                ps3.setInt(2, ((Alumno) usuario).getId_alumno());
                
                ps3.executeUpdate();
                ps3.close();
                cx.desconectar();
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();

        }

        return false;
    }


    // Método para agregar un nuevo profesor a la base de datos
    public boolean modificarProfesor(Usuario usuario) {
        PreparedStatement ps3 = null;

        try {
            if (usuario instanceof Profesor) {
                ResultSet rs = null;
                ps3 = cx.conectar().prepareStatement("UPDATE Profesor SET especialidad= ? WHERE id_profesor= ?");
                ps3.setString(1, ((Profesor) usuario).especialidad);
                ps3.setInt(2, ((Profesor) usuario).getId_profesor());
                
                ps3.executeUpdate();
                ps3.close();
                cx.desconectar();
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return false;
    }


     // Método para obtener una lista de todos los usuarios de la base de datos
    @Override
    public ArrayList obtenerLista() {
         ArrayList<Usuario> usuarios = new ArrayList<>();
         
         
         try {
            PreparedStatement ps = cx.conectar().prepareStatement("SELECT * FROM Usuario");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                
                Usuario temp;
                
                if (rs.getString("tipo_usuario").equals("Alumno")) {
                    temp = new Alumno();
                } else if (rs.getString("tipo_usuario").equals("Profesor")) {
                    temp = new Profesor();
                } else {
                    return null;
                }
                
                temp.setId_usuario(rs.getInt("id_usuario"));
                temp.setNombre(rs.getString("nombre"));
                temp.setEmail(rs.getString("email"));
                temp.setNacionalidad(rs.getString("nacionalidad"));
                temp.setEdad(rs.getInt("edad"));
                temp.setTelefono(rs.getString("telefono"));
                temp.setSexo(rs.getString("sexo"));
                temp.setTipo_usuario(rs.getString("tipo_usuario"));

                usuarios.add(temp);
            }
            
            rs.close();
            ps.close();
            cx.desconectar();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
         return usuarios;
    }
    
    public ArrayList obtenerListaAlumno(){
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        
        try {
            ArrayList<Usuario> listaUsuario = obtenerLista();
            
            PreparedStatement ps = cx.conectar().prepareStatement("SELECT * FROM Alumno");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                for(Usuario temp : listaUsuario ){
                    if(temp instanceof Alumno && temp.getId_usuario() == rs.getInt("id_usuario")){
                        ((Alumno) temp).setId_alumno(rs.getInt("id_alumno"));
                        ((Alumno) temp).setNivel_Academico(rs.getString("nivel_academico"));
                        listaAlumnos.add((Alumno) temp);
                    }
                }
            }

            rs.close();
            ps.close();
            cx.desconectar();
            
        } catch (SQLException e) {
            e.printStackTrace();
            //Panel error
        }
        return listaAlumnos;
    }

     
     
    public ArrayList obtenerListaProfesor(){
        ArrayList<Profesor> listaProfesor = new ArrayList<>();
        
        try {
            ArrayList<Usuario> listaUsuario = obtenerLista();
            PreparedStatement ps = cx.conectar().prepareStatement("SELECT * FROM Profesor");
            ResultSet rs = ps.executeQuery();
             while(rs.next()){
                for(Usuario temp : listaUsuario ){
                    if(temp instanceof Profesor && temp.getId_usuario() == rs.getInt("id_usuario")){
                        ((Profesor) temp).setId_profesor(rs.getInt("id_profesor"));
                        ((Profesor) temp).setEspecialidad(rs.getString("especialidad"));
                        listaProfesor.add((Profesor) temp);
                    }
                }
            }     
        } catch (SQLException e) {
            e.printStackTrace();
            //Panel error
        }
        return listaProfesor;
    }
}
