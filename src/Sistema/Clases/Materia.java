/*
 * Definición de la clase Materia.
 * Representa una entidad que tiene un atributo "nombre".
 * Esta clase sirve para modelar conceptos relacionados con materias en un sistema educativo.
 */
package Sistema.Clases;

class Materia {
    // Atributo que almacena el nombre de la materia
    String nombre;

    // Constructor que permite inicializar el nombre al crear una instancia de la clase
    public Materia(String nombre) {
        this.nombre = nombre;
    }
}