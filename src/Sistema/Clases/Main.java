package Sistema.Clases;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modulo modulo = new Modulo("Título del módulo", "Autor del módulo", "Nivel del módulo");

        while (true) {
            String opcion = JOptionPane.showInputDialog("Menú de opciones:\n"
                    + "1. Agregar Lección\n"
                    + "2. Mostrar Lecciones\n"
                    + "3. Salir\n"
                    + "Ingrese el número de la opción:");

            switch (opcion) {
                case "1":
                    modulo.agregarLeccion();
                    JOptionPane.showMessageDialog(null, "Lección agregada con éxito.");
                    break;
                case "2":
                    modulo.mostrarLeccion();
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, elija una opción válida.");
            }
        }
    }
}
    