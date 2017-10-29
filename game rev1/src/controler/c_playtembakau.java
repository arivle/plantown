/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import view.play;
import view.playtembakau;

/**
 *
 * @author acer
 */
public class c_playtembakau {
    
    String siram = "/gambar/siram.gif";
    String tanaman1 = "/gambar/jagung1.gif";
    String tanaman2 = "/gambar/jagung2.png";
    String obat1 = "/gambar/semprot.gif";
    String pupuk = "/gambar/pupuk1.gif";
    String kosong = "/gambar/emptybox.png";
    playtembakau view;
    c_play map;
    int detik;
    int umurtembakau = 0;
    int hptembakau = 100;
    boolean needsiram = false;
    boolean needpanen = false;
    boolean needgunting = false;
    boolean needobat1 = false;
    boolean needobat2 = false;
    boolean needpupuk = false;
    boolean loop = false;
    Timer mytimer = new Timer();
    
    public c_playtembakau(playtembakau view) {
        System.out.println("masuk tembakau");
        this.view = view;
        view.map(new klikmap());
        view.kliksiram(new kliksiram());
        view.klikspupuk(new klikpupuk());
        view.klikobat1(new klikobat1());
        view.stop(new stop());
//        start();
        view.setVisible(true);

    }

    public void playgame() {
        this.view.setVisible(true);
    }

    public void start() {
        //sehari = 5 detik,perawatan = 15 detik
        mytimer.schedule(task, 1000, 5000);
        mytimer.schedule(cek, 1000, 1000);
    }
    
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            view.setboxumur(umurtembakau + " hari");
            umurtembakau++;
            if (umurtembakau % 1 == 0) {
                hptembakau--;
//                view.setboxhp("" + hpjagung);
            }
            
        }
    };
    TimerTask cek = new TimerTask() {
        @Override
        public void run() {
            detik++;
            System.out.println("cek " + detik);

            //cek health
            if (umurtembakau == 30) {
                view.settanaman(tanaman2);
            }
            if (umurtembakau == 75) {
                view.setboxhp("/gambar/health1.png");
            }
            if (umurtembakau == 50) {
                view.setboxhp("/gambar/health2.png");
            }
            if (umurtembakau == 25) {
                view.setboxhp("/gambar/health3.png");
            }
            if (umurtembakau == 0) {
                view.setboxhp(kosong);
            }
        }
    };
    
    public void setbox(String set) {
        view.setboxgerak(set);
    }
    
    private class kliksiram implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            loop = true;
            setbox(siram);
        }
    }
    
    private class klikpupuk implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            setbox(pupuk);
        }
    }
    
    private class klikobat1 implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            setbox(obat1);
        }
    }
    
    public void showview() {
        view.setVisible(true);
    }
    
    private class stop implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            view.setboxgerak(kosong);
        }
    }
    
    private class klikmap implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            controler.c_play a = new controler.c_play(new view.play());
        }
    }
}
