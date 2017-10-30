/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;
import view.playjagung;
import java.util.TimerTask;

/**
 *
 * @author acer
 */
public class c_playjagung extends stringgambar {
    
    playjagung view;
    c_play map;
    int detik;
    int getdetik = -1;
    int umurjagung = 0;
    int health = 4;
    String statuspopup = "";
    boolean needsiram = false;
    boolean needpanen = false;
    boolean needgunting = false;
    boolean needobat1 = false;
    boolean needobat2 = false;
    boolean needpupuk = false;
    boolean loop = false;
    Timer mytimer = new Timer();
    Random rand = new Random();
    
    public c_playjagung(playjagung view) {
        System.out.println("masuk jagung");
        this.view = view;
        view.map(new klikmap());
        view.kliksiram(new kliksiram());
        view.klikspupuk(new klikpupuk());
        view.klikobat1(new klikobat1());
        view.klikobat2(new klikobat2());
        view.kliktangan(new kliktangan());
        view.klikpanen(new klikpanen());
        start();
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
    
    public void rawat(int rawat) {
        if (rawat == 1) {
            view.setboxpopup(popupobat1);
            statuspopup = obat1;
        }
        if (rawat == 2) {
            view.setboxpopup(popupobat2);
            statuspopup = obat2;
        }
        if (rawat == 3) {
            view.setboxpopup(Popuppupuk);
            statuspopup = pupuk;
        }
        if (rawat == 4) {
            view.setboxpopup(popuprawat);
            statuspopup = tangan;
        }
    }

    public void popupemot(String emot) {
        view.setboxpopupemot(emot);
    }
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            view.setboxumur(umurjagung + " hari");
            umurjagung++;
            if (umurjagung % 4 == 0) {
                view.setboxpopup(popupsiram);
                statuspopup = siram;
            }
            if (umurjagung % 6 == 0) {
                int randomrawat = rand.nextInt(4);
                rawat(randomrawat + 1);
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
                popupemot("");
                setbox(kosong);
            }
            //cek health
            if (umurjagung == 85) {
                view.settanaman(jagung3);
            }
            if (umurjagung == 50) {
                view.settanaman(jagung2);
            }
            if (umurjagung == 25) {
                view.settanaman(jagung1);
            }
            
        }
    };
    
    public void setbox(String set) {
        view.setboxgerak(set);
    }
    
    public void health() {
        switch (health) {
            case 4:
                view.setboxhp("/gambar/health3.png");
                health--;
                popupemot(popupsakit);
                break;
            case 3:
                view.setboxhp("/gambar/health2.png");
                popupemot(popupsakit);
                health--;
                break;
            case 2:
                view.setboxhp("/gambar/health1.png");
                popupemot(popupsakit);
                health--;
                break;
            default:
                System.out.println("tanaman mati");
                popupemot(popupsakit);
                break;
        }
    }
    
    private class kliksiram implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            loop = true;
            setbox(siram);
            if (statuspopup.equals(siram)) {
                view.setboxpopup("");
            } else {
                health();
            }
        }
    }
    
    private class klikpupuk implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            loop = true;
            setbox(pupuk);
            if (statuspopup.equals(pupuk)) {
                view.setboxpopup("");
            } else {
                health();
            }
        }
    }
    
    private class klikobat1 implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            loop = true;
            setbox(obat1);
            if (statuspopup.equals(obat1)) {
                view.setboxpopup("");
            } else {
                health();
            }
        }
        
    }
    
    private class klikobat2 implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            loop = true;
            setbox(obat2);
            if (statuspopup.equals(obat2)) {
                view.setboxpopup("");
            } else {
                health();
            }
        }
        
    }
    
    private class kliktangan implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            loop = true;
            setbox(tangan);
            if (statuspopup.equals(tangan)) {
                view.setboxpopup("");
            } else {
                health();
            }
        }
    }
    
    private class klikpanen implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            loop = true;
            setbox(panen);
            if (statuspopup.equals(panen)) {
                view.setboxpopup("");
            } else {
                health();
            }
        }
        
    }
    
    public void showview() {
        view.setVisible(true);
    }
    
    private class klikmap implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            view.setVisible(false);
        }
    }
    
}
