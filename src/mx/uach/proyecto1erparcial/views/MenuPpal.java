/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.uach.proyecto1erparcial.views;

/**
 *
 * @author dSantillanes
 */
public class MenuPpal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPpal
     */
    public MenuPpal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCrearOrden = new javax.swing.JButton();
        btnVerOrden = new javax.swing.JButton();
        btnEditarOrden = new javax.swing.JButton();
        btnEliminarOrden = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCrearOrden.setText("Crear Orden");
        btnCrearOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearOrdenMouseClicked(evt);
            }
        });

        btnVerOrden.setText("Ver Orden");
        btnVerOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerOrdenMouseClicked(evt);
            }
        });

        btnEditarOrden.setText("Editar Orden");
        btnEditarOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarOrdenMouseClicked(evt);
            }
        });
        btnEditarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarOrdenActionPerformed(evt);
            }
        });

        btnEliminarOrden.setText("Eliminar Orden");
        btnEliminarOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarOrdenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminarOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCrearOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnCrearOrden)
                .addGap(18, 18, 18)
                .addComponent(btnVerOrden)
                .addGap(18, 18, 18)
                .addComponent(btnEditarOrden)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarOrden)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarOrdenActionPerformed

    private void btnCrearOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearOrdenMouseClicked
        CrearOrden crearOrden = new CrearOrden();
        crearOrden.setVisible(true);
    }//GEN-LAST:event_btnCrearOrdenMouseClicked

    private void btnVerOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerOrdenMouseClicked
        VerOrden verOrden = new VerOrden();
        verOrden.setVisible(true);
    }//GEN-LAST:event_btnVerOrdenMouseClicked

    private void btnEditarOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarOrdenMouseClicked
        EditarOrden editarOrden = new EditarOrden();
        editarOrden.setVisible(true);
    }//GEN-LAST:event_btnEditarOrdenMouseClicked

    private void btnEliminarOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarOrdenMouseClicked
        EliminarOrden eliminarOrden = new EliminarOrden();
        eliminarOrden.setVisible(true);
    }//GEN-LAST:event_btnEliminarOrdenMouseClicked

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
            java.util.logging.Logger.getLogger(MenuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPpal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearOrden;
    private javax.swing.JButton btnEditarOrden;
    private javax.swing.JButton btnEliminarOrden;
    private javax.swing.JButton btnVerOrden;
    // End of variables declaration//GEN-END:variables
}