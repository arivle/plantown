/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;

/**
 *
 * @author acer
 */
public class play extends javax.swing.JFrame {

    playtembakau playtembakau = new playtembakau();
    playjagung playjagung = new playjagung();
    playtebu playtebu = new playtebu();

    public play() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tmbtebu = new javax.swing.JButton();
        tmbjagung = new javax.swing.JButton();
        tmbtembakau = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tmbtebu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/maptebu.png"))); // NOI18N
        tmbtebu.setBorderPainted(false);
        tmbtebu.setContentAreaFilled(false);
        tmbtebu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tmbtebu.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        tmbtebu.setEnabled(false);
        getContentPane().add(tmbtebu, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        tmbjagung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mapjagung.png"))); // NOI18N
        tmbjagung.setBorder(null);
        tmbjagung.setBorderPainted(false);
        tmbjagung.setContentAreaFilled(false);
        tmbjagung.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tmbjagung.setEnabled(false);
        getContentPane().add(tmbjagung, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 90, 80));

        tmbtembakau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/maptembakau.png"))); // NOI18N
        tmbtembakau.setBorderPainted(false);
        tmbtembakau.setContentAreaFilled(false);
        tmbtembakau.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tmbtembakau.setEnabled(false);
        getContentPane().add(tmbtembakau, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/map.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void playtebu(ActionListener action) {
        tmbtebu.addActionListener(action);
    }

    public void playjagung(ActionListener action) {
        tmbjagung.addActionListener(action);
    }

    public void playtembakau(ActionListener action) {
        tmbtembakau.addActionListener(action);
    }

    public void setdisable(String set,boolean bool) {
        if (set.equals("jagung")) {
            tmbjagung.setEnabled(bool);
        }
        if (set.equals("tembakau")) {
            tmbtembakau.setEnabled(bool);
        }
        if (set.equals("tebu")) {
            tmbtebu.setEnabled(bool);
        }
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
            java.util.logging.Logger.getLogger(play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new play().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton tmbjagung;
    private javax.swing.JButton tmbtebu;
    private javax.swing.JButton tmbtembakau;
    // End of variables declaration//GEN-END:variables
}
