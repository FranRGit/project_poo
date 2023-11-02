/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Sistema.Clases;

import Sistema.Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Curso {

    private int id_curso;
    private String nombreCurso;
    private String periodo;
    private String categoriaCurso;
    Conexion cs;
    
    public Curso(){
        cs= new Conexion();
    }
   

    
    
    //Metodos de CRUD para secciones
    
    public boolean agregarSeccion(Seccion seccion){
        try {
            PreparedStatement ps = null;
            PreparedStatement ps2 = null;
            
            ResultSet rs = null;
            
            //INSERTAR SECCION EN LA TABLA
            ps = cs.conectar().prepareStatement("INSERT INTO Seccion VALUES (null,?,?,?,?,?)");
            ps.setInt(1, seccion.getId_seccion());
            ps.setString(2, seccion.getNombreSeccion());
            ps.setInt(3, seccion.getId_curso());
            ps.setInt(4, seccion.getId_profesor());
            ps.setString(5, seccion.getHorario());
            ps.executeUpdate();
            
            
            //OBTENER ULTIMO ID
            rs = ps.getGeneratedKeys();
            if(rs.next()) {
                seccion.setId_seccion(rs.getInt(1));
            }
            rs.close();
            ps.close();
            cs.desconectar();

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }
    
    public void eliminarSeccion(Seccion seccion) {
        try {
            PreparedStatement ps = null;

            // ELIMINAR EL MÓDULO DE LA TABLA
            ps = cs.conectar().prepareStatement("DELETE FROM Seccion WHERE id_seccion = ?");
            ps.setInt(1, seccion.getId_seccion());
            ps.executeUpdate();

            ps.close();
            cs.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void mostrarSeccion() {
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;

            // Consulta para obtener todos los módulos
            ps = cs.conectar().prepareStatement("SELECT * FROM Seccion");
            rs = ps.executeQuery();

            // Iterar a través de los resultados y mostrar la información de cada módulo
            while (rs.next()) {
                int id_seccion = rs.getInt("id_seccion");
                String nombreSeccion = rs.getString("nombreSeccion");
                int id_curso = rs.getInt("id_curso");
                int id_profesor = rs.getInt("id_profesor");
                String horario = rs.getString("horario");
                

                //imprimir información de cada sección
                System.out.println("ID de Seccion: " + id_seccion);
                System.out.println("Nombre de la Seccion: " + nombreSeccion);
                System.out.println("ID de Curso: " + id_curso);
                System.out.println("ID de Profesor: " + id_profesor);
                System.out.println("Horario: " + horario);
                System.out.println("-------------");
            }

            rs.close();
            ps.close();
            cs.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public boolean editarSeccion(Seccion seccion) {
        try {
            PreparedStatement ps = null;

            // ACTUALIZAR LA INFORMACIÓN DE LA SECCIÓN EN LA TABLA
            ps = cs.conectar().prepareStatement("UPDATE Seccion SET nombreSeccion=?, id_curso=?, id_profesor=?, horario=? WHERE id_seccion=?");
            ps.setString(1, seccion.getNombreSeccion());
            ps.setInt(2, seccion.getId_curso());
            ps.setInt(3, seccion.getId_profesor());
            ps.setString(4, seccion.getHorario());
            ps.setInt(5, seccion.getId_seccion());

            int rowsAffected = ps.executeUpdate();

            ps.close();
            cs.desconectar();

            return rowsAffected > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }


    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getCategoriaCurso() {
        return categoriaCurso;
    }

    public void setCategoriaCurso(String categoriaCurso) {
        this.categoriaCurso = categoriaCurso;
    }

    
   
   
    
}
