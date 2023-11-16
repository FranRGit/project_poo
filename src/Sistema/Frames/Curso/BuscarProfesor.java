/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Sistema.Frames.Curso;


import Sistema.Frames.Alumno.*;
import Sistema.Clases.Alumno;
import Sistema.Clases.daoUsuario;
import Sistema.Frames.ErrorDialog;
import Sistema.Frames.Principal.JPrincipal;
import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;


/**
 *
 * @author USUARIO
 */
public class BuscarProfesor extends javax.swing.JDialog {

    /**
     * Creates new form RegistrarAlumno2
     */
    public BuscarProfesor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        setBackground(new Color(0, 0, 0, 80)); // Configura el fondo transparente
        
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlUpAlumno5 = new javax.swing.JPanel();
        exitPanel = new javax.swing.JPanel();
        exittxt = new javax.swing.JLabel();
        Titulotxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        idtxt = new javax.swing.JTextField();
        Buscarbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1190, 750));
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pnlUpAlumno5.setBackground(new java.awt.Color(255, 255, 255));
        pnlUpAlumno5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitPanel.setBackground(new java.awt.Color(255, 255, 255));
        exitPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitPanelMouseClicked(evt);
            }
        });

        exittxt.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        exittxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exittxt.setText("X");

        javax.swing.GroupLayout exitPanelLayout = new javax.swing.GroupLayout(exitPanel);
        exitPanel.setLayout(exitPanelLayout);
        exitPanelLayout.setHorizontalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exittxt, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );
        exitPanelLayout.setVerticalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exittxt, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlUpAlumno5.add(exitPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, -1));

        Titulotxt.setFont(new java.awt.Font("Consolas", 0, 30)); // NOI18N
        Titulotxt.setForeground(new java.awt.Color(72, 99, 124));
        Titulotxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulotxt.setText("MODIFICAR ALUMNO");
        Titulotxt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlUpAlumno5.add(Titulotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 320, 51));

        jLabel1.setText("ID de alumno");
        pnlUpAlumno5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idtxt.setBackground(new java.awt.Color(255, 255, 255));
        idtxt.setText("Digite el id del usuario");
        idtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtxtActionPerformed(evt);
            }
        });
        jPanel1.add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 40));

        pnlUpAlumno5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 420, 60));

        Buscarbtn.setText("Buscar");
        Buscarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarbtnMouseClicked(evt);
            }
        });
        pnlUpAlumno5.add(Buscarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(240, 390, 310, 320);
        getContentPane().add(pnlUpAlumno5, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPanelMouseClicked
        dispose();
    }//GEN-LAST:event_exitPanelMouseClicked

    private void idtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtxtActionPerformed

    private void BuscarbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarbtnMouseClicked
        try {
            int idBuscado = Integer.parseInt(idtxt.getText());
            if(buscarIDAlumno(idBuscado) != null) {
                JPrincipal jp = new JPrincipal();
                Point aux = this.getLocationOnScreen();
                ModificarAlumno mpa = new ModificarAlumno(jp, true);
                mpa.enviarAlumno( buscarIDAlumno(idBuscado));
                mpa.setLocation(aux.x, aux.y);
                mpa.setVisible(true);
                dispose();
            } else {
                throw new Exception("Error");
            }
        } catch (Exception e) {
            mostrarErrorDialog("No se pudo encontrar al alumno");
        }

    }//GEN-LAST:event_BuscarbtnMouseClicked

    private Alumno buscarIDAlumno(int idBuscado){
        
        daoUsuario dao = new daoUsuario();
        ArrayList<Alumno> listaAlumno =  dao.obtenerListaAlumno();
        for(Alumno alumno : listaAlumno) {
            if(idBuscado == alumno.getId_alumno()){
                return alumno;
            }
        }
        return null;
    }

    private void mostrarErrorDialog(String errorMessage) {
        ErrorDialog errorDialog = new ErrorDialog(errorMessage);
        errorDialog.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BuscarProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscarProfesor dialog = new BuscarProfesor(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscarbtn;
    private javax.swing.JLabel Titulotxt;
    private javax.swing.JPanel exitPanel;
    private javax.swing.JLabel exittxt;
    private javax.swing.JTextField idtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlUpAlumno5;
    // End of variables declaration//GEN-END:variables
}
