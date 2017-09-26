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
public class playjagung extends javax.swing.JFrame {
    
    public playjagung() {
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

        map = new javax.swing.JToggleButton();
        tmbsiram = new javax.swing.JButton();
        boxtanaman = new javax.swing.JLabel();
        boxgerak = new javax.swing.JLabel();
        tmbobat1 = new javax.swing.JButton();
        tmbobat2 = new javax.swing.JButton();
        tmbpupuk = new javax.swing.JButton();
        tmbgunting = new javax.swing.JButton();
        tmbpanen = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        map.setText("map");
        map.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(map, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 81, -1));

        tmbsiram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/water can.png"))); // NOI18N
        tmbsiram.setText("jButton1");
        tmbsiram.setBorderPainted(false);
        tmbsiram.setContentAreaFilled(false);
        getContentPane().add(tmbsiram, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, 80));

        boxtanaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/1.png"))); // NOI18N
        boxtanaman.setText("tanaman");
        getContentPane().add(boxtanaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 300, 400));

        boxgerak.setText("boxgerak");
        getContentPane().add(boxgerak, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 250, 200));

        tmbobat1.setText("jButton1");
        getContentPane().add(tmbobat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 80, 80));

        tmbobat2.setText("jButton2");
        getContentPane().add(tmbobat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 80, 80));

        tmbpupuk.setText("jButton3");
        getContentPane().add(tmbpupuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 80, 80));

        tmbgunting.setText("jButton4");
        getContentPane().add(tmbgunting, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 80, 80));

        tmbpanen.setText("jButton5");
        getContentPane().add(tmbpanen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 80, 80));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/background jagung.png"))); // NOI18N
        background.setText("jLabel1");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void map(ActionListener action) {
        map.addActionListener(action);
    }
    
    public void kliksiram(ActionListener action) {
        tmbsiram.addActionListener(action);
    }
    
    public void klikobat1(ActionListener action) {
        tmbobat1.addActionListener(action);
    }
    
    public void klikobat2(ActionListener action) {
        tmbobat2.addActionListener(action);
    }
    
    public void klikspupuk(ActionListener action) {
        tmbpupuk.addActionListener(action);
    }
    
    public void klikgunting(ActionListener action) {
        tmbsiram.addActionListener(action);
    }
    
    public void klikpanen(ActionListener action) {
        tmbpanen.addActionListener(action);
    }

    public void settanaman(String tanaman) {
        boxtanaman.setIcon(new javax.swing.ImageIcon(getClass().getResource(tanaman)));
    }

    public void setboxgerak(String nama) {
        boxgerak.setIcon(new javax.swing.ImageIcon(getClass().getResource(nama)));
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
            java.util.logging.Logger.getLogger(playjagung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(playjagung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(playjagung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(playjagung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new playjagung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel boxgerak;
    private javax.swing.JLabel boxtanaman;
    private javax.swing.JToggleButton map;
    private javax.swing.JButton tmbgunting;
    private javax.swing.JButton tmbobat1;
    private javax.swing.JButton tmbobat2;
    private javax.swing.JButton tmbpanen;
    private javax.swing.JButton tmbpupuk;
    private javax.swing.JButton tmbsiram;
    // End of variables declaration//GEN-END:variables
}
