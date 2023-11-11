// Definición de la clase Main, que contiene el método principal (main) para ejecutar el programa
package Sistema.Clases;

import Sistema.Conexion.Conexion;

/**
 * Clase principal que contiene el método main para ejecutar el programa.
 */
public class Main {
    public static void main(String[] args) {
        // Creación de una instancia de la clase Conexion
        Conexion conexion = new Conexion();
        
        // Llamada al método conectar para establecer la conexión a la base de datos
        conexion.conectar(); 
        
        // Llamada al método desconectar para cerrar la conexión a la base de datos
        conexion.desconectar();
    }
}