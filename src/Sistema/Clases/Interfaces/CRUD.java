/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Sistema.Clases.Interfaces;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public interface CRUD {
    
    public boolean agregar();
    public boolean eliminar();
    public Object mostrar(int id);
    public boolean modificar();
    public ArrayList obtenerLista();
}
