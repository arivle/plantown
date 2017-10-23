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
    String tanaman2 = "/gambar/jagung2.png";
    String obat1 = "/gambar/semprot.gif";
    String pupuk = "/gambar/pupuk1.gif";
    String kosong = "/gambar/emptybox.png";
    String jagungsiappanen = "/gambar/jagungsiappanen.gif";
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
        this.view = view;
        view.map(new klikmap());
        view.kliksiram(new kliksiram());
        view.klikspupuk(new klikpupuk());
        view.klikobat1(new klikobat1());
        view.kliktangan(new kliktangan());
        view.stop(new stop());
        start();
        view.setVisible(true);

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
            if (umurjagung % 1 == 0) {
                hpjagung--;
//                view.setboxhp("" + hpjagung);
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
                view.settanaman(jagungsiappanen);
            }
            if (umurjagung == 50) {
                view.setboxhp(tanaman2);
            }
            if (umurjagung == 25) {
                view.setboxhp("/gambar/health3.png");
            }
            if (umurjagung == 0) {
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
private class kliktangan implements ActionListener{

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
            map.showview();
        }
    }

}
