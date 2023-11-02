/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Sistema.Frames;

import java.awt.BorderLayout;
import java.awt.Color;

/**
 *
 * @author USUARIO
 */
public class JPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JPrincipal
     */
    public JPrincipal() {
        initComponents();
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoPanel = new javax.swing.JPanel();
        OpcionesPanel = new javax.swing.JPanel();
        UsuarioPanel = new javax.swing.JPanel();
        UsuarioIcono = new javax.swing.JLabel();
        UsuarioTexto = new javax.swing.JLabel();
        PerfilPanel = new javax.swing.JPanel();
        IncioPanel = new javax.swing.JPanel();
        InicioIcono = new javax.swing.JLabel();
        InicioTexto = new javax.swing.JLabel();
        MateriasPanel = new javax.swing.JPanel();
        InicioIcono1 = new javax.swing.JLabel();
        InicioTexto1 = new javax.swing.JLabel();
        ProfesoresPanel = new javax.swing.JPanel();
        InicioIcono2 = new javax.swing.JLabel();
        InicioTexto2 = new javax.swing.JLabel();
        CerrarSesionPanel = new javax.swing.JPanel();
        InicioIcono3 = new javax.swing.JLabel();
        InicioTexto3 = new javax.swing.JLabel();
        InformacionPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoPanel.setBackground(new java.awt.Color(255, 255, 255));
        FondoPanel.setPreferredSize(new java.awt.Dimension(990, 580));

        OpcionesPanel.setBackground(new java.awt.Color(96, 131, 165));
        OpcionesPanel.setPreferredSize(new java.awt.Dimension(320, 580));

        UsuarioPanel.setBackground(new java.awt.Color(96, 131, 165));
        UsuarioPanel.setPreferredSize(new java.awt.Dimension(320, 90));

        UsuarioIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/Imagenes/NombreUsuario.png"))); // NOI18N

        UsuarioTexto.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        UsuarioTexto.setForeground(new java.awt.Color(255, 255, 255));
        UsuarioTexto.setText("BIENVENIDO XD");
        UsuarioTexto.setPreferredSize(new java.awt.Dimension(193, 20));

        javax.swing.GroupLayout UsuarioPanelLayout = new javax.swing.GroupLayout(UsuarioPanel);
        UsuarioPanel.setLayout(UsuarioPanelLayout);
        UsuarioPanelLayout.setHorizontalGroup(
            UsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsuarioPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(UsuarioIcono)
                .addGap(28, 28, 28)
                .addComponent(UsuarioTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UsuarioPanelLayout.setVerticalGroup(
            UsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UsuarioPanelLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(UsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(UsuarioTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UsuarioIcono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        PerfilPanel.setBackground(new java.awt.Color(96, 131, 165));
        PerfilPanel.setPreferredSize(new java.awt.Dimension(320, 210));

        javax.swing.GroupLayout PerfilPanelLayout = new javax.swing.GroupLayout(PerfilPanel);
        PerfilPanel.setLayout(PerfilPanelLayout);
        PerfilPanelLayout.setHorizontalGroup(
            PerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        PerfilPanelLayout.setVerticalGroup(
            PerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        IncioPanel.setBackground(new java.awt.Color(96, 131, 165));
        IncioPanel.setPreferredSize(new java.awt.Dimension(320, 60));
        IncioPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IncioPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IncioPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IncioPanelMouseExited(evt);
            }
        });

        InicioIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/Imagenes/InicioIcono.png"))); // NOI18N

        InicioTexto.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        InicioTexto.setForeground(new java.awt.Color(255, 255, 255));
        InicioTexto.setText("INICIO");
        InicioTexto.setPreferredSize(new java.awt.Dimension(90, 20));

        javax.swing.GroupLayout IncioPanelLayout = new javax.swing.GroupLayout(IncioPanel);
        IncioPanel.setLayout(IncioPanelLayout);
        IncioPanelLayout.setHorizontalGroup(
            IncioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IncioPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(InicioIcono)
                .addGap(18, 18, 18)
                .addComponent(InicioTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        IncioPanelLayout.setVerticalGroup(
            IncioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IncioPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(IncioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(InicioIcono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(InicioTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        MateriasPanel.setBackground(new java.awt.Color(96, 131, 165));
        MateriasPanel.setPreferredSize(new java.awt.Dimension(320, 60));
        MateriasPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MateriasPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MateriasPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MateriasPanelMouseExited(evt);
            }
        });

        InicioIcono1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/Imagenes/MateriasIcono.png"))); // NOI18N

        InicioTexto1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        InicioTexto1.setForeground(new java.awt.Color(255, 255, 255));
        InicioTexto1.setText("MENU PRINCIPAL");
        InicioTexto1.setPreferredSize(new java.awt.Dimension(90, 20));

        javax.swing.GroupLayout MateriasPanelLayout = new javax.swing.GroupLayout(MateriasPanel);
        MateriasPanel.setLayout(MateriasPanelLayout);
        MateriasPanelLayout.setHorizontalGroup(
            MateriasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MateriasPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(InicioIcono1)
                .addGap(18, 18, 18)
                .addComponent(InicioTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MateriasPanelLayout.setVerticalGroup(
            MateriasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MateriasPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(MateriasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(InicioIcono1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(InicioTexto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        ProfesoresPanel.setBackground(new java.awt.Color(96, 131, 165));
        ProfesoresPanel.setPreferredSize(new java.awt.Dimension(320, 60));
        ProfesoresPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfesoresPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProfesoresPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProfesoresPanelMouseExited(evt);
            }
        });

        InicioIcono2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/Imagenes/ProfesoresIcono.png"))); // NOI18N

        InicioTexto2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        InicioTexto2.setForeground(new java.awt.Color(255, 255, 255));
        InicioTexto2.setText("REPORTES");
        InicioTexto2.setPreferredSize(new java.awt.Dimension(90, 20));

        javax.swing.GroupLayout ProfesoresPanelLayout = new javax.swing.GroupLayout(ProfesoresPanel);
        ProfesoresPanel.setLayout(ProfesoresPanelLayout);
        ProfesoresPanelLayout.setHorizontalGroup(
            ProfesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfesoresPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(InicioIcono2)
                .addGap(18, 18, 18)
                .addComponent(InicioTexto2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        ProfesoresPanelLayout.setVerticalGroup(
            ProfesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfesoresPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(ProfesoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(InicioIcono2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(InicioTexto2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        CerrarSesionPanel.setBackground(new java.awt.Color(96, 131, 165));
        CerrarSesionPanel.setPreferredSize(new java.awt.Dimension(320, 60));
        CerrarSesionPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CerrarSesionPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CerrarSesionPanelMouseExited(evt);
            }
        });

        InicioIcono3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/Imagenes/SignOutIcono.png"))); // NOI18N

        InicioTexto3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        InicioTexto3.setForeground(new java.awt.Color(255, 255, 255));
        InicioTexto3.setText("CERRAR SESION");
        InicioTexto3.setPreferredSize(new java.awt.Dimension(90, 20));

        javax.swing.GroupLayout CerrarSesionPanelLayout = new javax.swing.GroupLayout(CerrarSesionPanel);
        CerrarSesionPanel.setLayout(CerrarSesionPanelLayout);
        CerrarSesionPanelLayout.setHorizontalGroup(
            CerrarSesionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CerrarSesionPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(InicioIcono3)
                .addGap(18, 18, 18)
                .addComponent(InicioTexto3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CerrarSesionPanelLayout.setVerticalGroup(
            CerrarSesionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CerrarSesionPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(CerrarSesionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(InicioIcono3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(InicioTexto3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout OpcionesPanelLayout = new javax.swing.GroupLayout(OpcionesPanel);
        OpcionesPanel.setLayout(OpcionesPanelLayout);
        OpcionesPanelLayout.setHorizontalGroup(
            OpcionesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UsuarioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PerfilPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(IncioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MateriasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ProfesoresPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CerrarSesionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        OpcionesPanelLayout.setVerticalGroup(
            OpcionesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OpcionesPanelLayout.createSequentialGroup()
                .addComponent(UsuarioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PerfilPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IncioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MateriasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProfesoresPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CerrarSesionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        InformacionPanel.setBackground(new java.awt.Color(255, 255, 255));
        InformacionPanel.setPreferredSize(new java.awt.Dimension(670, 580));
        InformacionPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout FondoPanelLayout = new javax.swing.GroupLayout(FondoPanel);
        FondoPanel.setLayout(FondoPanelLayout);
        FondoPanelLayout.setHorizontalGroup(
            FondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoPanelLayout.createSequentialGroup()
                .addComponent(OpcionesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InformacionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE))
        );
        FondoPanelLayout.setVerticalGroup(
            FondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoPanelLayout.createSequentialGroup()
                .addGroup(FondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(OpcionesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(InformacionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(FondoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IncioPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IncioPanelMouseEntered
        IncioPanel.setBackground(new Color(75,99,132));
    }//GEN-LAST:event_IncioPanelMouseEntered

    private void IncioPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IncioPanelMouseExited
        IncioPanel.setBackground(new Color(96,131,165));
    }//GEN-LAST:event_IncioPanelMouseExited

    private void MateriasPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MateriasPanelMouseEntered
        MateriasPanel.setBackground(new Color(75,99,132));
    }//GEN-LAST:event_MateriasPanelMouseEntered

    private void MateriasPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MateriasPanelMouseExited
        MateriasPanel.setBackground(new Color(96,131,165));
    }//GEN-LAST:event_MateriasPanelMouseExited

    private void ProfesoresPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfesoresPanelMouseEntered
       ProfesoresPanel.setBackground(new Color(75,99,132));
    }//GEN-LAST:event_ProfesoresPanelMouseEntered

    private void ProfesoresPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfesoresPanelMouseExited
        ProfesoresPanel.setBackground(new Color(96,131,165));
    }//GEN-LAST:event_ProfesoresPanelMouseExited

    private void CerrarSesionPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionPanelMouseEntered
        CerrarSesionPanel.setBackground(new Color(75,99,132));
    }//GEN-LAST:event_CerrarSesionPanelMouseEntered

    private void CerrarSesionPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionPanelMouseExited
        CerrarSesionPanel.setBackground(new Color(96,131,165));
    }//GEN-LAST:event_CerrarSesionPanelMouseExited

    private void IncioPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IncioPanelMouseClicked
        InicioPanel ip1 = new InicioPanel();
        ip1.setSize(670, 580);
        ip1.setLocation(0, 0);
        InformacionPanel.removeAll();
        InformacionPanel.add(ip1, BorderLayout.CENTER);
        InformacionPanel.revalidate();
        InformacionPanel.repaint();
    }//GEN-LAST:event_IncioPanelMouseClicked
    
    private void MateriasPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MateriasPanelMouseClicked
        MenuPrincipal mp = new MenuPrincipal();
        mp.setSize(670, 580);
        mp.setLocation(0, 0);
        InformacionPanel.removeAll();
        InformacionPanel.add(mp, BorderLayout.CENTER);
        InformacionPanel.revalidate();
        InformacionPanel.repaint();
    }//GEN-LAST:event_MateriasPanelMouseClicked

    private void ProfesoresPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfesoresPanelMouseClicked
        ReportePanel rp = new ReportePanel();
        rp.setSize(670, 500);
        rp.setLocation(0, 0);
        InformacionPanel.removeAll();
        InformacionPanel.add(rp,BorderLayout.CENTER);
        InformacionPanel.revalidate();
        InformacionPanel.repaint();
    }//GEN-LAST:event_ProfesoresPanelMouseClicked

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
            java.util.logging.Logger.getLogger(JPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CerrarSesionPanel;
    private javax.swing.JPanel FondoPanel;
    private javax.swing.JPanel IncioPanel;
    private javax.swing.JPanel InformacionPanel;
    private javax.swing.JLabel InicioIcono;
    private javax.swing.JLabel InicioIcono1;
    private javax.swing.JLabel InicioIcono2;
    private javax.swing.JLabel InicioIcono3;
    private javax.swing.JLabel InicioTexto;
    private javax.swing.JLabel InicioTexto1;
    private javax.swing.JLabel InicioTexto2;
    private javax.swing.JLabel InicioTexto3;
    private javax.swing.JPanel MateriasPanel;
    private javax.swing.JPanel OpcionesPanel;
    private javax.swing.JPanel PerfilPanel;
    private javax.swing.JPanel ProfesoresPanel;
    private javax.swing.JLabel UsuarioIcono;
    private javax.swing.JPanel UsuarioPanel;
    private javax.swing.JLabel UsuarioTexto;
    // End of variables declaration//GEN-END:variables
}
