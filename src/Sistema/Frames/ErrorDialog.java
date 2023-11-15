/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema.Frames;

import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class ErrorDialog extends JDialog {

    public ErrorDialog(String errorMessage) {
        initComponents(errorMessage);
    }

    private void initComponents(String errorMessage) {
        JLabel label = new JLabel("ERROR : "+errorMessage);
        add(label);

        setTitle("Error");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setModal(true);
    }

}