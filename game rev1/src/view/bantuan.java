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
public class bantuan extends javax.swing.JFrame {

    /**
     * Creates new form batuan
     */
    public bantuan() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    public void mainmenu(ActionListener action) {
        tmbmainmenu.addActionListener(action);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tmbmainmenu = new javax.swing.JButton();
        tex = new javax.swing.JTextArea();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tmbmainmenu.setText("main menu");
        getContentPane().add(tmbmainmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 566, -1, -1));

        tex.setEditable(false);
        tex.setColumns(20);
        tex.setLineWrap(true);
        tex.setRows(5);
        tex.setText("Game Plantoon ini terdiri dari 3 level :\n1. Jagung\n2. Tebu\n3. Tembakau\nRawatlah ke tiga tanaman dengan memberi air, pupuk, obat 1 & 2, perawatan,\nhingga nanti tanaman bisa di panen. Kumpulkan coin sebanyak-banyaknya dengan\nmemenuhi request secepat mungkin dan menjaga tanaman agar tetap hidup");
        getContentPane().add(tex, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 620, -1));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(bantuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bantuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bantuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bantuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bantuan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JTextArea tex;
    private javax.swing.JButton tmbmainmenu;
    // End of variables declaration//GEN-END:variables
}
