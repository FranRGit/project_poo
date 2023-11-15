/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */


package Sistema.Frames;

import javax.swing.JDialog;
import javax.swing.JLabel;

public class RegistroExitosoDialog extends JDialog {

    public RegistroExitosoDialog() {
        initComponents();
    }

    private void initComponents() {
        JLabel label = new JLabel("Registro exitoso");
        add(label);

        setTitle("ERROR");
        setSize(200, 100);
        setLocationRelativeTo(null);
        setModal(true);
    }
}
