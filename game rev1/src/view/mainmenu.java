package view;

import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author acer
 */
public class mainmenu extends javax.swing.JFrame {

//    isinama viewawal = new isinama();
    play play = new play();

    public mainmenu() {
        System.out.println("tes");
        initComponents();
//        kotaknama.setText(viewawal.namauser);
        this.setLocationRelativeTo(this);
    }
public void setkotaknama (String nama){
kotaknama.setText(nama);
}
    public void klikmain(ActionListener action) {
        tmbmain.addActionListener(action);
    }

    public void klikbantuan(ActionListener action) {
        tmbbantuan.addActionListener(action);
    }

    public void kliktentang(ActionListener action) {
        tmbtentang.addActionListener(action);
    }

    public void klikexit(ActionListener action) {
        tmbexit.addActionListener(action);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kotaknama = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tmbmain = new javax.swing.JButton();
        tmbbantuan = new javax.swing.JButton();
        tmbtentang = new javax.swing.JButton();
        tmbexit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kotaknama.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        kotaknama.setForeground(new java.awt.Color(102, 255, 51));
        kotaknama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kotaknama.setText("jLabel2");
        getContentPane().add(kotaknama, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 140, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/box nama_burned.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 180, 90));

        tmbmain.setBorderPainted(false);
        tmbmain.setContentAreaFilled(false);
        getContentPane().add(tmbmain, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 310, 70));

        tmbbantuan.setBorderPainted(false);
        tmbbantuan.setContentAreaFilled(false);
        getContentPane().add(tmbbantuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 310, 60));

        tmbtentang.setBorderPainted(false);
        tmbtentang.setContentAreaFilled(false);
        getContentPane().add(tmbtentang, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 300, 70));

        tmbexit.setBorderPainted(false);
        tmbexit.setContentAreaFilled(false);
        getContentPane().add(tmbexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 300, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/viewMainMenu.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel kotaknama;
    private javax.swing.JButton tmbbantuan;
    private javax.swing.JButton tmbexit;
    private javax.swing.JButton tmbmain;
    private javax.swing.JButton tmbtentang;
    // End of variables declaration//GEN-END:variables
}
