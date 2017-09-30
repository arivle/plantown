/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.concurrent.Task;
import javafx.util.Duration;
import java.util.Timer;
import model.user;
import view.playjagung;
import java.util.TimerTask;

/**
 *
 * @author acer
 */
public class c_playjagung {

    String siram = "/gambar/siram.png";
    String tanaman1 = "/gambar/1.png";
    String tanaman2 = "/gambar/2.png";
    String kosong = "/gambar/emptybox.png";
    playjagung view;
    int detik;
    int umurjagung = 0;
    int hpjagung = 100;
    boolean needsiram = false;
    boolean needpanen = false;
    boolean needgunting = false;
    boolean needobat1 = false;
    boolean needobat2 = false;
    boolean needpupuk = false;
    Timer mytimer = new Timer();

    public c_playjagung(playjagung view) {
        this.view = view;
        view.map(new klikmap());
        view.kliksiram(new kliksiram());
        start();
        view.setVisible(true);

    }

    public void start() {
        //sehari = 5 detik,perawatan = 15 detik
        mytimer.schedule(task, 1000,5000);
        mytimer.schedule(cek, 1000, 1000);
    }

    TimerTask task = new TimerTask() {
        @Override
        public void run() {
           view.setboxumur(umurjagung +" hari");
           umurjagung++;
            if (umurjagung % 5 ==0) {
                hpjagung--;
                view.setboxhp(""+hpjagung);
            }
        }
    };
TimerTask cek = new TimerTask() {
        @Override
        public void run() {
            detik++;
            System.out.println("cek "+detik);
        }
    };
    public void setbox(String set) {
        view.setboxgerak(set);
    }

    private class kliksiram implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                setbox(siram);
                Thread.sleep(1000);
                view.settanaman(tanaman2);
                Thread.sleep(1000);
                setbox(kosong);

            } catch (InterruptedException ex) {
                Logger.getLogger(c_playjagung.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    private class klikmap implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            controler.c_play a = new controler.c_play(new view.play());
            view.setVisible(false);
        }
    }

}
