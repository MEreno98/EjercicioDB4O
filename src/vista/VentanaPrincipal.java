/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import controlador.ejercicioDBO4;
import javax.swing.JOptionPane;
/**
 *
 * @author Mikel
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Ventana1
     */
    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jBAltaEve = new javax.swing.JButton();
        jBBajaEve = new javax.swing.JButton();
        jBModificacionEve = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jBAltaAsis = new javax.swing.JButton();
        jBListadoAsis = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMIAltaEvent = new javax.swing.JMenuItem();
        jMIBajaEvent = new javax.swing.JMenuItem();
        jMIModEvent = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMIListEvent = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMIAltaAsis = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMIListAsit = new javax.swing.JMenuItem();
        jMSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Principal");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabel1.setText("Que desea hacer:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)), "Eventos"));

        jBAltaEve.setText("Alta");
        jBAltaEve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAltaEveActionPerformed(evt);
            }
        });

        jBBajaEve.setText("Baja");
        jBBajaEve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBajaEveActionPerformed(evt);
            }
        });

        jBModificacionEve.setText("Modificacion");
        jBModificacionEve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificacionEveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBAltaEve)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBBajaEve)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jBModificacionEve)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAltaEve)
                    .addComponent(jBBajaEve)
                    .addComponent(jBModificacionEve))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)), "Asistentes"));

        jBAltaAsis.setText("Alta");
        jBAltaAsis.setEnabled(false);
        jBAltaAsis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAltaAsisActionPerformed(evt);
            }
        });

        jBListadoAsis.setText("Listado");
        jBListadoAsis.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jBAltaAsis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBListadoAsis)
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBListadoAsis)
                    .addComponent(jBAltaAsis))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jMenu.setText("Menu");

        jMenu1.setText("Eventos");

        jMIAltaEvent.setText("Alta");
        jMIAltaEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAltaEventActionPerformed(evt);
            }
        });
        jMenu1.add(jMIAltaEvent);

        jMIBajaEvent.setText("Baja");
        jMIBajaEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIBajaEventActionPerformed(evt);
            }
        });
        jMenu1.add(jMIBajaEvent);

        jMIModEvent.setText("Modificacion");
        jMIModEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIModEventActionPerformed(evt);
            }
        });
        jMenu1.add(jMIModEvent);
        jMenu1.add(jSeparator1);

        jMIListEvent.setText("Listado");
        jMIListEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIListEventActionPerformed(evt);
            }
        });
        jMenu1.add(jMIListEvent);

        jMenu.add(jMenu1);

        jMenu2.setText("Asistentes");
        jMenu2.setEnabled(false);

        jMIAltaAsis.setText("Alta");
        jMIAltaAsis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAltaAsisActionPerformed(evt);
            }
        });
        jMenu2.add(jMIAltaAsis);
        jMenu2.add(jSeparator2);

        jMIListAsit.setText("Listado");
        jMIListAsit.setEnabled(false);
        jMenu2.add(jMIListAsit);

        jMenu.add(jMenu2);

        jMenuBar1.add(jMenu);

        jMSalir.setText("Salir");
        jMSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAltaEveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAltaEveActionPerformed
        ejercicioDBO4.Sig_VAltaEVT();
    }//GEN-LAST:event_jBAltaEveActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        ejercicioDBO4.Salir();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBBajaEveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBajaEveActionPerformed
        ejercicioDBO4.BajaEvento();
    }//GEN-LAST:event_jBBajaEveActionPerformed

    private void jBModificacionEveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificacionEveActionPerformed
        ejercicioDBO4.Sig_VModEVT();
    }//GEN-LAST:event_jBModificacionEveActionPerformed

    private void jMSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMSalirMouseClicked
        jBSalir.doClick();
    }//GEN-LAST:event_jMSalirMouseClicked

    private void jMIAltaEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAltaEventActionPerformed
        jBAltaEve.doClick();
    }//GEN-LAST:event_jMIAltaEventActionPerformed

    private void jMIBajaEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIBajaEventActionPerformed
        jBBajaEve.doClick();
    }//GEN-LAST:event_jMIBajaEventActionPerformed

    private void jMIListEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIListEventActionPerformed
        boolean ListaB=true;
        try{
            ejercicioDBO4.GenerarListado(ListaB);
        }catch(Exception Ex){JOptionPane.showMessageDialog(this,"Error:\n"+Ex.getMessage());}
    }//GEN-LAST:event_jMIListEventActionPerformed

    private void jMIModEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIModEventActionPerformed
        jBModificacionEve.doClick();
    }//GEN-LAST:event_jMIModEventActionPerformed

    private void jBAltaAsisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAltaAsisActionPerformed
        ejercicioDBO4.Sig_VAltaASIS();
    }//GEN-LAST:event_jBAltaAsisActionPerformed

    private void jMIAltaAsisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAltaAsisActionPerformed
       jBAltaAsis.doClick();
    }//GEN-LAST:event_jMIAltaAsisActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAltaAsis;
    private javax.swing.JButton jBAltaEve;
    private javax.swing.JButton jBBajaEve;
    private javax.swing.JButton jBListadoAsis;
    private javax.swing.JButton jBModificacionEve;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMIAltaAsis;
    private javax.swing.JMenuItem jMIAltaEvent;
    private javax.swing.JMenuItem jMIBajaEvent;
    private javax.swing.JMenuItem jMIListAsit;
    private javax.swing.JMenuItem jMIListEvent;
    private javax.swing.JMenuItem jMIModEvent;
    private javax.swing.JMenu jMSalir;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
