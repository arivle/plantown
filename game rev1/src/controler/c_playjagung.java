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
public class c_playjagung {
    
    String siram = "/gambar/siram.gif";
    String tanaman1 = "/gambar/jagung1.gif";
    String tanaman2 = "/gambar/jagung2.gif";
    String tanaman3 = "/gambar/jagungsiappanen.gif";
    String obat1 = "/gambar/semprot.gif";
    String pupuk = "/gambar/pupuk1.gif";
    String kosong = "/gambar/emptybox.png";
    String tangan = "/gambar/glove.gif";
    String panen = "/gambar/panen.gif";
    String popupsiram = "/gambar/popupMintaAir.gif";
    String Popuppupuk = "/gambar/popupMintaPupuk.gif";
    String popupobat1 = "/gambar/popupMintaObatCair.gif";
    String popuprawat ="/gambar/popupMintarawat.gif";
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
    Random rand=new Random();
    
    public c_playjagung(playjagung view) {
        System.out.println("masuk jagung");
        this.view = view;
        view.map(new klikmap());
        view.kliksiram(new kliksiram());
        view.klikspupuk(new klikpupuk());
        view.klikobat1(new klikobat1());
        view.kliktangan(new kliktangan());
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
    public void rawat (int rawat){
        if (rawat==1) {
            view.setboxpopup(popupobat1);
                statuspopup = obat1;
        }
        if (rawat==2) {
            System.out.println("butuh obat2");
        }
        if (rawat==3) {
            view.setboxpopup(Popuppupuk);
                statuspopup = pupuk;
        }
        if (rawat==4) {
            view.setboxpopup(popuprawat);
                statuspopup = tangan;
        }
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
                rawat(randomrawat+1);
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
    public void health (){
        switch (health) {
            case 4:
                view.setboxhp("/gambar/health3.png");
                health--;
                break;
            case 3:
                view.setboxhp("/gambar/health2.png");
                health--;
                break;
            case 2:
                view.setboxhp("/gambar/health1.png");
                health--;
                break;
            default:
                System.out.println("tanaman mati");
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
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    public void showview() {
        view.setVisible(true);
    }
    
    
    private class klikmap implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            controler.c_play a = new controler.c_play(new view.play());
        }
    }
    
}
