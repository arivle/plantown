/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import view.playjagung;
import java.util.TimerTask;

/**
 *
 * @author acer
 */
public class c_playjagung {
    
    String siram = "/gambar/siram.gif";
    String tanaman1 = "/gambar/jagung1.gif";
    String tanaman2 = "/gambar/jagung2.gif";
    String tanaman3 = "/gambar/jagungsiappanen.gif";
    String obat1 = "/gambar/semprot.gif";
    String pupuk = "/gambar/pupuk1.gif";
    String kosong = "/gambar/emptybox.png";
    String tangan = "/gambar/glove.gif";
    playjagung view;
    c_play map;
    int detik;
    int getdetik = -1;
    int umurjagung = 0;
    int hpjagung = 100;
    boolean needsiram = false;
    boolean needpanen = false;
    boolean needgunting = false;
    boolean needobat1 = false;
    boolean needobat2 = false;
    boolean needpupuk = false;
    boolean loop = false;
    Timer mytimer = new Timer();
    
    public c_playjagung(playjagung view) {
        System.out.println("masuk jagung");
        this.view = view;
        view.map(new klikmap());
        view.kliksiram(new kliksiram());
        view.klikspupuk(new klikpupuk());
        view.klikobat1(new klikobat1());
        view.kliktangan(new kliktangan());
//        start();
//        view.setVisible(true);
playgame();
    }

    public void playgame() {
        view.setVisible(true);
    }

    public void closegame() {
        view.setVisible(false);
    }
    
    public void start() {
        //sehari = 5 detik,perawatan = 15 detik
        mytimer.schedule(task, 1000, 5000);
        mytimer.schedule(cek, 1000, 1000);
    }
    
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            view.setboxumur(umurjagung + " hari");
            umurjagung++;
            if (umurjagung % 4 ==0) {
                System.out.println("butuh siram");
            }
            if (umurjagung% 6 == 0) {
                System.out.println("butuh perawatan");
            }
            
        }
    };
    TimerTask cek = new TimerTask() {
        @Override
        public void run() {
            detik++;
            System.out.println("cek " + detik);
            
            if (loop) {
                loop = false;
                getdetik = detik + 2;
                System.out.println("get detik " + getdetik);
            }
            if (getdetik == detik) {
                System.out.println("cek kondisi " + getdetik);
                setbox(kosong);
            }
            //cek health
            if (umurjagung == 85) {
                view.settanaman(tanaman3);
            }
            if (umurjagung == 50) {
                view.settanaman(tanaman2);
            }
            if (umurjagung == 25) {
                view.settanaman(tanaman1);
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
            loop = true;
            setbox(pupuk);
        }
    }
    
    private class klikobat1 implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            loop = true;
            setbox(obat1);
        }
        
    }

    private class kliktangan implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            loop = true;
            setbox(tangan);
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
