/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class playtebu extends javax.swing.JFrame {

    public playtebu() {
        initComponents();
        next.setVisible(false);
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

        boxpoupemot = new javax.swing.JLabel();
        sisaair = new javax.swing.JLabel();
        sisaobat2 = new javax.swing.JLabel();
        tmbtangan = new javax.swing.JButton();
        boxpopup = new javax.swing.JLabel();
        tmbtoko = new javax.swing.JButton();
        setuang = new javax.swing.JLabel();
        sisapupuk = new javax.swing.JLabel();
        sisaobat1 = new javax.swing.JLabel();
        tmbsiram = new javax.swing.JButton();
        boxtanaman = new javax.swing.JLabel();
        panen = new javax.swing.JLabel();
        boxgerak = new javax.swing.JLabel();
        boxhp = new javax.swing.JLabel();
        tmbobat1 = new javax.swing.JButton();
        tmbobat2 = new javax.swing.JButton();
        tmbpupuk = new javax.swing.JButton();
        tmbgunting = new javax.swing.JButton();
        tmbpanen = new javax.swing.JButton();
        boxumur = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        percakapan = new javax.swing.JTextArea();
        boxgambarpercakapan = new javax.swing.JLabel();
        map = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(boxpoupemot, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 200, 250));

        sisaair.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 12)); // NOI18N
        sisaair.setText("a");
        getContentPane().add(sisaair, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        sisaobat2.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 12)); // NOI18N
        sisaobat2.setForeground(new java.awt.Color(255, 255, 255));
        sisaobat2.setText("a");
        getContentPane().add(sisaobat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        tmbtangan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/tangan.png"))); // NOI18N
        tmbtangan.setText("jButton4");
        tmbtangan.setBorderPainted(false);
        tmbtangan.setContentAreaFilled(false);
        getContentPane().add(tmbtangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 80, 80));
        getContentPane().add(boxpopup, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 200, 260));

        tmbtoko.setText("TOKO");
        getContentPane().add(tmbtoko, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        setuang.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        getContentPane().add(setuang, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 70, 40));

        sisapupuk.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 12)); // NOI18N
        sisapupuk.setForeground(new java.awt.Color(255, 255, 255));
        sisapupuk.setText("a");
        getContentPane().add(sisapupuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        sisaobat1.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 12)); // NOI18N
        sisaobat1.setText("a");
        getContentPane().add(sisaobat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        tmbsiram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/water can.png"))); // NOI18N
        tmbsiram.setText("jButton1");
        tmbsiram.setBorderPainted(false);
        tmbsiram.setContentAreaFilled(false);
        getContentPane().add(tmbsiram, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, 80));

        boxtanaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/tunasTebu.gif"))); // NOI18N
        getContentPane().add(boxtanaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 300, 400));

        panen.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(panen, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 330, 110));

        boxgerak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/emptybox.png"))); // NOI18N
        boxgerak.setText("boxgerak");
        getContentPane().add(boxgerak, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 250, 200));

        boxhp.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 18)); // NOI18N
        boxhp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/health4.png"))); // NOI18N
        boxhp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(boxhp, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 120, 40));

        tmbobat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/obat1.png"))); // NOI18N
        tmbobat1.setText("jButton1");
        tmbobat1.setBorderPainted(false);
        tmbobat1.setContentAreaFilled(false);
        getContentPane().add(tmbobat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 80, 80));

        tmbobat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/obat2.png"))); // NOI18N
        tmbobat2.setText("jButton2");
        tmbobat2.setBorderPainted(false);
        tmbobat2.setContentAreaFilled(false);
        getContentPane().add(tmbobat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 80, 80));

        tmbpupuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pupuk1.png"))); // NOI18N
        tmbpupuk.setText("jButton3");
        tmbpupuk.setBorderPainted(false);
        tmbpupuk.setContentAreaFilled(false);
        getContentPane().add(tmbpupuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 80, 80));

        tmbgunting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/tangan.png"))); // NOI18N
        tmbgunting.setText("jButton4");
        tmbgunting.setBorderPainted(false);
        tmbgunting.setContentAreaFilled(false);
        getContentPane().add(tmbgunting, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 80, 80));

        tmbpanen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/cluritPKI.png"))); // NOI18N
        tmbpanen.setText("jButton5");
        tmbpanen.setBorderPainted(false);
        tmbpanen.setContentAreaFilled(false);
        getContentPane().add(tmbpanen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 80, 80));

        boxumur.setFont(new java.awt.Font("Humnst777 Blk BT", 0, 18)); // NOI18N
        getContentPane().add(boxumur, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 10, 80, 40));

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/next.png"))); // NOI18N
        next.setBorder(null);
        next.setContentAreaFilled(false);
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, 80, 70));

        percakapan.setColumns(20);
        percakapan.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        percakapan.setForeground(new java.awt.Color(255, 255, 255));
        percakapan.setLineWrap(true);
        percakapan.setRows(5);
        percakapan.setWrapStyleWord(true);
        percakapan.setOpaque(false);
        getContentPane().add(percakapan, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 510, 100));

        boxgambarpercakapan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/emptybox.png"))); // NOI18N
        boxgambarpercakapan.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(boxgambarpercakapan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 730, 290));

        map.setText("map");
        getContentPane().add(map, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

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
    
    public void kliktangan(ActionListener action) {
        tmbtangan.addActionListener(action);
    }
    
    public void klikpanen(ActionListener action) {
        tmbpanen.addActionListener(action);
    }
    
    public void kliktoko(ActionListener action) {
        tmbtoko.addActionListener(action);
    }
    
    public void settanaman(String tanaman) {
        boxtanaman.setIcon(new javax.swing.ImageIcon(getClass().getResource(tanaman)));
    }
    
    public void setboxgerak(String nama) {
        boxgerak.setIcon(new javax.swing.ImageIcon(getClass().getResource(nama)));
    }
    
    public void setboxpopup(String nama) {
        boxpopup.setIcon(new javax.swing.ImageIcon(getClass().getResource(nama)));
    }
    
    public void setboxpopupemot(String nama) {
        System.out.println("emot" + nama);
        boxpoupemot.setIcon(new javax.swing.ImageIcon(getClass().getResource(nama)));
    }
    
    public void setvisibleboxgerak(boolean bool) {
        boxgerak.setVisible(bool);
    }
    
    public void setboxumur(String nama) {
        boxumur.setText(nama);
    }
    
    public void setscore(String nama) {
        setuang.setText(nama);
    }
    
    public void setboxhp(String nama) {
        boxhp.setIcon(new javax.swing.ImageIcon(getClass().getResource(nama)));
    }
    
    public void setsisaair(String set) {
        sisaair.setText(set);
    }
    
    public void setsisapupuk(String set) {
        sisapupuk.setText(set);
    }
    
    public void setsisaobat1(String set) {
        sisaobat1.setText(set);
    }
    
    public void setsisaobat2(String set) {
        sisaobat2.setText(set);
    }
    
    public void message(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
    
    public void setboxpanen(String nama) {
        panen.setIcon(new javax.swing.ImageIcon(getClass().getResource(nama)));
    }
    
    public void setboxgambarpercakapan(String set) {
        if (set.equals("boy")) {
            boxgambarpercakapan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/boy.png")));
            next.setVisible(true);
        }
        if (set.equals("girl")) {
            boxgambarpercakapan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/boy.png")));
            next.setVisible(true);
        }
        if (set.equals("boygirl")) {
            boxgambarpercakapan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/boygirl.png")));
            next.setVisible(true);
        }
        if (set.equals("")) {
            boxgambarpercakapan.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
            next.setVisible(false);
        }
    }

    public void setpercakapan(String set) {
        percakapan.setText(set);
    }

    public void kliknext(ActionListener action) {
        next.addActionListener(action);
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
            java.util.logging.Logger.getLogger(playtebu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(playtebu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(playtebu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(playtebu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new playtebu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel boxgambarpercakapan;
    private javax.swing.JLabel boxgerak;
    private javax.swing.JLabel boxhp;
    private javax.swing.JLabel boxpopup;
    private javax.swing.JLabel boxpoupemot;
    private javax.swing.JLabel boxtanaman;
    private javax.swing.JLabel boxumur;
    private javax.swing.JButton map;
    private javax.swing.JButton next;
    private javax.swing.JLabel panen;
    private javax.swing.JTextArea percakapan;
    private javax.swing.JLabel setuang;
    private javax.swing.JLabel sisaair;
    private javax.swing.JLabel sisaobat1;
    private javax.swing.JLabel sisaobat2;
    private javax.swing.JLabel sisapupuk;
    private javax.swing.JButton tmbgunting;
    private javax.swing.JButton tmbobat1;
    private javax.swing.JButton tmbobat2;
    private javax.swing.JButton tmbpanen;
    private javax.swing.JButton tmbpupuk;
    private javax.swing.JButton tmbsiram;
    private javax.swing.JButton tmbtangan;
    private javax.swing.JButton tmbtoko;
    // End of variables declaration//GEN-END:variables
}
