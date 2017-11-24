/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Random;
import java.util.Timer;
import view.playjagung;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.modeluser;
import view.play;
import view.playtembakau;

/**
 *
 * @author acer
 */
public class c_playtembakau extends datagame {

    playtembakau view;
    c_play map;
    modeluser model;
    String username = "";
    int detik;
    int getdetik = -1;
    int umurtembakau = 0;
    int health = 4;
    int scoretembakau = 0;
    String statuspopup = "";
    boolean loop = false;
    Timer mytimer = new Timer();
    Random rand = new Random();

    public c_playtembakau(playtembakau view, modeluser model,String username) throws SQLException {
        System.out.println("masuk jagung");
        this.model = model;
        this.view = view;
        this.username=username;
        view.map(new klikmap());
        view.kliksiram(new kliksiram());
        view.klikspupuk(new klikpupuk());
        view.klikobat1(new klikobat1());
        view.klikobat2(new klikobat2());
        view.kliktangan(new kliktangan());
        view.klikpanen(new klikpanen());
        view.kliktoko(new kliktoko());
        start();
        setsisa();
        view.setVisible(true);

    }

    public void start() {
        //sehari = 5 detik,perawatan = 15 detik
        mytimer.schedule(task, 1000, 1000);
        mytimer.schedule(cek, 1000, 1000);
    }

    public void stoptimer(boolean set) throws InterruptedException {
        if (set) {
            task.wait();
            cek.wait();
        }
        if (!set) {
            task.run();
            cek.run();
        }
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
            view.setboxumur(umurtembakau + " hari");
            umurtembakau++;
            if (umurtembakau % 10 == 0) {
                view.setboxpopup(popupsiram);
                statuspopup = siram;
            }
            if (umurtembakau % 15 == 0) {
                int randomrawat = rand.nextInt(4);
                rawat(randomrawat + 1);
            }

        }
    };
    TimerTask cek = new TimerTask() {
        @Override
        public void run() {
            view.setscore("" + scoretembakau);
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
            if (umurtembakau == 85) {
                view.settanaman(jagung3);
            }
            if (umurtembakau == 50) {
                view.settanaman(jagung2);
            }
            if (umurtembakau == 25) {
                view.settanaman(jagung1);
            }

        }
    };

    public void setbox(String set) {
        view.setboxgerak(set);
    }

    public void setsisa() throws SQLException {
        view.setsisaair(model.getsisabarang(username, "air"));
        view.setsisapupuk(model.getsisabarang(username, "pupuk"));
        view.setsisaobat1(model.getsisabarang(username, "obat1"));
        view.setsisaobat2(model.getsisabarang(username, "obat2"));

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
            model.setair(username, " - 1 ");
            try {
                setsisa();
            } catch (SQLException ex) {
                Logger.getLogger(c_playjagung.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (statuspopup.equals(siram)) {
                view.setboxpopup("");
                scoretembakau += 2;
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
            model.setpupuk(username, " - 1 ");
            try {
                setsisa();
            } catch (SQLException ex) {
                Logger.getLogger(c_playjagung.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (statuspopup.equals(pupuk)) {

                view.setboxpopup("");
                scoretembakau += 2;

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
            model.setobat1(username, " - 1 ");
            try {
                setsisa();
            } catch (SQLException ex) {
                Logger.getLogger(c_playjagung.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (statuspopup.equals(obat1)) {

                view.setboxpopup("");
                scoretembakau += 2;

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
            model.setobat2(username, " - 1 ");
            try {
                setsisa();
            } catch (SQLException ex) {
                Logger.getLogger(c_playjagung.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (statuspopup.equals(obat2)) {

                view.setboxpopup("");
                scoretembakau += 2;
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
                scoretembakau += 2;
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
                scoretembakau += 2;
            } else {
                health();
            }
        }

    }

    private class kliktoko implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                controler.c_toko a = new controler.c_toko(new view.toko(), new model.modeluser(),username);
            } catch (SQLException ex) {
                Logger.getLogger(c_playjagung.class.getName()).log(Level.SEVERE, null, ex);
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
            cek.cancel();
            task.cancel();
            controler.c_play a = new controler.c_play(new play(),username);
            a.enablemap("jagung");
        }
    }

}
