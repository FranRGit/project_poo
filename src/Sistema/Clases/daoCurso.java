/*
 * Definición de la clase daoCurso.
 * Se encarga de realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en la tabla Curso de la base de datos.
 * Utiliza la clase Conexion para establecer la conexión con la base de datos.
 */
package Sistema.Clases;

import Sistema.Clases.Interfaces.CRUD;
import Sistema.Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * Clase encargada de realizar operaciones relacionadas con los cursos en la base de datos.
 *
 * @author PC HP
 */
public class daoCurso implements CRUD{
    Conexion cx;
    Curso curso = new Curso();

    // Constructor que solo inicializa la conexión a la base de datos
    public daoCurso() {
        cx = new Conexion();
    }

    
    // Constructor que pasa como parametro el objeto
    public daoCurso(Curso curso) {
        this.curso = curso;
        cx = new Conexion();
    }

    // Método para agregar un nuevo curso a la base de datos
    
    @Override
    public boolean agregar() {
        PreparedStatement ps = null;
        
        try {
            ps = cx.conectar().prepareStatement("INSERT INTO Curso VALUES (null,?,?,?)");
            ps.setString(1, curso.getNombreCurso());
            ps.setString(2, curso.getPeriodo());
            ps.setString(3, curso.getCategoriaCurso());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }
    
    // Método para eliminar un curso de la base de datos
    @Override
    public boolean eliminar(int id) {
        try {
            PreparedStatement ps = null;
            ps = cx.conectar().prepareStatement("DELETE FROM Curso WHERE id_curso = ?");
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

    // Método para mostrar un curso específico de la base de datos
    @Override
    public Object mostrar(int id) {
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            ps = cx.conectar().prepareStatement("SELECT * FROM Curso");
            rs = ps.executeQuery();
            while(rs.next()){
                curso.setId_curso(rs.getInt("id_curso"));
                curso.setNombreCurso(rs.getString("nombre"));
                curso.setPeriodo(rs.getString("periodo"));
                curso.setCategoriaCurso(rs.getString("categoria"));
                if(id == curso.getId_curso()){    
                    rs.close();
                    ps.close();
                    cx.desconectar();
                    return curso;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return null;

    }

    // Método para editar un curso existente en la base de datos
    @Override
    public boolean modificar() {
        PreparedStatement ps = null;

        try {
            ps = cx.conectar().prepareStatement("UPDATE Curso SET nombre = ?, periodo = ?, categoria = ? WHERE id_curso = ?");
            ps.setString(1, curso.getNombreCurso());
            ps.setString(2, curso.getPeriodo());
            ps.setString(3, curso.getCategoriaCurso());
            ps.setInt(4, curso.getId_curso());
            ps.executeUpdate();
            cx.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    // Método para obtener una lista de todos los cursos de la base de datos
    @Override
    public ArrayList obtenerLista() {
        ArrayList<Curso> cursos = new ArrayList<>();
        
         try {
            PreparedStatement ps = cx.conectar().prepareStatement("SELECT * FROM Curso");
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Curso aux = new Curso();
                
                aux.setId_curso(rs.getInt("id_curso"));
                aux.setNombreCurso(rs.getString("nombre"));
                aux.setPeriodo(rs.getString("periodo"));
                aux.setCategoriaCurso(rs.getString("categoria"));
                
                
                cursos.add(aux);
            }
            rs.close();
            ps.close();
            cx.desconectar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
         return cursos;
    }
}
