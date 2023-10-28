/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema.Clases;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ArregloUsuario {

    private ArrayList<Usuario> listaUsuarios;

    public ArregloUsuario() {
        listaUsuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public void eliminarUsuario(Usuario usuario) {
        listaUsuarios.remove(usuario);
    }

    public Usuario buscarUsuarioPorCodigo(String codigo) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getCodeUser().equals(codigo)) {
                return usuario;
            }
        }
        return null; // If not found
    }

    public void mostrarUsuarios() {
        if (!listaUsuarios.isEmpty()) {
            System.out.println("Lista de Usuarios...");
            for (Usuario usuario : listaUsuarios) {
                System.out.println(usuario.getCodeUser() + " " + usuario.getNombre() + " " + usuario.getNacionalidad());
            }
        } else {
            System.out.println("Error, no existen usuarios para mostrar.");
        }
    }

    public int validarCodigoUsuario(String codigo) {
        int i, posicion = -1;
        for (i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getCodeUser().equals(codigo)) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    public Usuario getUsuario(int posicion) {
        return listaUsuarios.get(posicion);
    }
}
