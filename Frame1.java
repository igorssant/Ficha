package Taestar;

import Taestar.Abre1;

import java.awt.*;
import javax.swing.*;

public class Frame1 extends javax.swing.JFrame {

    public Frame1 () {
            
        initComponents ();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel1 = new javax.swing.JScrollPane();
        Limage = new javax.swing.JLabel();

        setResizable(false);

        Painel1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        Painel1.setWheelScrollingEnabled(false);
        Painel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Painel1MouseDragged(evt);
            }
        });

        Limage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Taestar/Gaiya.png"))); // NOI18N
        Painel1.setViewportView(Limage);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Painel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Painel1MouseDragged
      
        JViewport viewPort = Painel1.getViewport();
        Point scrollPosition = viewPort.getViewPosition();
        
        int dx = evt.getX();
        int dy = evt.getY();

        scrollPosition.x += dx;
        scrollPosition.y += dy;

        viewPort.setViewPosition (scrollPosition);
        
    }//GEN-LAST:event_Painel1MouseDragged

    public static void main (String args[]) {
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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater (new Runnable () {
            
            public void run () {
                
                new Frame1 ().setVisible (true);
            
            }
        
        });
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Limage;
    private javax.swing.JScrollPane Painel1;
    // End of variables declaration//GEN-END:variables
}