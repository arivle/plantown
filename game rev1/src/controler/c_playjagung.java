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

/**
 *
 * @author acer
 */
public class c_playjagung extends datagame {

    playjagung view;
    c_play map;
    modeluser model;
    String username = "";
    int detik;
    int getdetik = -1;
    int umurjagung = 0;
    int health = 4;
    int scorejagung = 0;
    String statuspopup = "";
    boolean loop = false;
    Timer mytimer = new Timer();
    Random rand = new Random();
    boolean stopgame = false;

    public c_playjagung(playjagung view, modeluser model, String username) throws SQLException {
        System.out.println("masuk jagung");
        this.model = model;
        this.view = view;
        this.username = username;
        System.out.println("username=" + username);
        view.map(new klikmap());
        start();
        setsisa();
        view.kliksiram(new kliksiram());
        view.klikspupuk(new klikpupuk());
        view.klikobat1(new klikobat1());
        view.klikobat2(new klikobat2());
        view.kliktangan(new kliktangan());
        view.klikpanen(new klikpanen());
        view.kliktoko(new kliktoko());
        view.kliknext(new kliknext());
        stoptimer(true);
        view.setboxgambarpercakapan("boygirl");
        view.setpercakapan(awalmain);
        view.setVisible(true);
    }

    public void start() {
//        mainMusik(musikmain);
        //sehari = 5 detik,perawatan = 15 detik
        mytimer.schedule(task, 1000, 500);
        mytimer.schedule(cek, 1000, 500);
    }

    public void stoptimer(boolean set) {
        stopgame = set;
        view.setboxgambarpercakapan("");
        view.setpercakapan("");
    }

    public void rawat(int rawat) {
        if (rawat == 1) {
            view.setboxpopup(popupobat1);
            statuspopup = obat1;
            if (sudahobat1) {
                sudahobat1 = false;
                stoptimer(true);
                view.setboxgambarpercakapan("boy");
                view.setpercakapan(requestobat1);
            }
        }
        if (rawat == 2) {
            view.setboxpopup(popupobat2);
            statuspopup = obat2;
            if (sudahobat2) {
                sudahobat2 = false;
                stoptimer(true);
                view.setboxgambarpercakapan("boy");
                view.setpercakapan(requestobat2);
            }
        }
        if (rawat == 3) {
            view.setboxpopup(Popuppupuk);
            statuspopup = pupuk;
            if (sudahpupuk) {
                sudahpupuk = false;
                stoptimer(true);
                view.setboxgambarpercakapan("boy");
                view.setpercakapan(requestpupuk);
            }
        }
        if (rawat == 4) {
            view.setboxpopup(popuprawat);
            statuspopup = tangan;
            if (sudahtangan) {
                sudahtangan = false;
                stoptimer(true);
                view.setboxgambarpercakapan("boy");
                view.setpercakapan(requesttangan);
            }
        }
    }

    public void popupemot(String emot) {
        view.setboxpopupemot(emot);
    }
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            if (!stopgame) {
                view.setboxumur(umurjagung + " hari");
                umurjagung++;
                if (umurjagung % 10 == 0 && umurjagung < 79) {
                    view.setboxpopup(popupsiram);
                    statuspopup = siram;
                    if (sudahsiram) {
                        sudahsiram = false;
                        stoptimer(true);
                        view.setboxgambarpercakapan("boy");
                        view.setpercakapan(requestair);

                    }
                }
                if (umurjagung % 15 == 0 && umurjagung < 79) {
                    int randomrawat = rand.nextInt(4);
                    rawat(randomrawat + 1);
                }
            }

        }
    };
    TimerTask cek = new TimerTask() {
        @Override
        public void run() {
            if (!stopgame) {
                view.setscore("" + scorejagung);
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
                    view.setboxpanen("");
                    setbox(kosong);
                }
                if (umurjagung == 25) {
                    view.settanaman(jagung1);
                }
                if (umurjagung == 40) {
                    view.settanaman(jagung2);
                }
                if (umurjagung == 60) {
                    view.settanaman(jagung3);
                }
                if (umurjagung == 75) {
                    view.setboxpopup(popuppanen);
                    statuspopup = panen;
                }
                if (umurjagung > 80) {
                    if (panenjagung == false) {
                        view.setboxgambarpercakapan("boy");
                        view.setpercakapan(requestpanen);
                        view.message("tanamaan jagung siap panen");
                        panenjagung = true;
                    }
                }
                if (umurjagung > 100) {
                    if (jagunghidup == true) {
                        view.message("tanaman mati karena tidak dipanen");
                        health = 0;
                        health();
                    }
                }
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
                view.setboxhp("/gambar/health4.png");
                popupemot(popupsakit);
                break;
            case 3:
                view.setboxhp("/gambar/health3.png");
                popupemot(popupsakit);
                break;
            case 2:
                view.setboxhp("/gambar/health2.png");
                popupemot(popupsakit);
                break;
            case 1:
                view.setboxhp("/gambar/health1.png");
                popupemot(popupsakit);
                break;
            case 0:
                view.setboxhp("");
                System.out.println("tanaman mati");
                popupemot(popupsakit);
                view.message("tanaman jagung mati");
                cek.cancel();
                task.cancel();
                view.setboxgerak("");
                break;
        }
    }

    private class kliksiram implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                System.out.println("sisa = " + model.getsisabarang(username, "air"));
                if (model.getsisabarang(username, "air").equalsIgnoreCase("0")) {
                    view.message("air anda habis silahkan beli air di toko");
                } else {
                    stoptimer(false);
                    loop = true;
                    setbox(siram);
                    model.setair(username, " - 1 ");
                    setsisa();
                    if (statuspopup.equals(siram)) {
                        view.setboxpopup("");
                        scorejagung += 2;
                    } else {
                        health--;
                        health();
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(c_playjagung.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class klikpupuk implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (model.getsisabarang(username, "pupuk").equalsIgnoreCase("0")) {
                    view.message("pupuk anda habis silahkan beli ke toko");
                } else {
                    stoptimer(false);
                    loop = true;
                    setbox(pupuk);
                    model.setpupuk(username, " - 1 ");
                    setsisa();
                    if (statuspopup.equals(pupuk)) {
                        view.setboxpopup("");
                        scorejagung += 2;
                    } else {
                        health--;
                        health();
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(c_playjagung.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class klikobat1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (model.getsisabarang(username, "obat1").equalsIgnoreCase("0")) {
                    view.message("obat biru anda habis silahkan beli ke toko");
                } else {
                    stoptimer(false);
                    loop = true;
                    setbox(obat1);
                    model.setobat1(username, " - 1 ");
                    setsisa();
                    if (statuspopup.equals(obat1)) {
                        view.setboxpopup("");
                        scorejagung += 2;
                    } else {
                        health--;
                        health();
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(c_playjagung.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class klikobat2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                System.out.println("obay kuning = " + model.getobat2(username));
                if (model.getsisabarang(username, "obat2").equalsIgnoreCase("0")) {
                    view.message("obat kuning anda habis silahkan beli ke toko");
                } else {
                    stoptimer(false);
                    loop = true;
                    setbox(obat2);
                    model.setobat2(username, " - 1 ");
                    setsisa();
                    if (statuspopup.equals(obat2)) {
                        view.setboxpopup("");
                        scorejagung += 2;
                    } else {
                        health--;
                        health();
                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(c_playjagung.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    private class kliktangan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stoptimer(false);
            loop = true;
            setbox(tangan);
            if (statuspopup.equals(tangan)) {
                view.setboxpopup("");
                scorejagung += 2;
            } else {
                health--;
                health();
            }
        }
    }

    private class klikpanen implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stoptimer(false);
            loop = true;
            view.setboxpanen(panen);
            if (statuspopup.equals(panen)) {
                view.setboxpopup("");
                jagunghidup = false;
                scorejagung += 2;
                stoptimer(true);
            } else {
                health = 0;
                health();
                view.message("tanaman di panen sebelum waktunya");
            }
        }
    }

    private class kliktoko implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                controler.c_toko a = new controler.c_toko(new view.toko(), new model.modeluser(), username);
            } catch (SQLException ex) {
                Logger.getLogger(c_playjagung.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void showview() {
        view.setVisible(true);
    }

    private class kliknext implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            stoptimer(false);
        }

    }

    private class klikmap implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setVisible(false);
            cek.cancel();
            task.cancel();
            controler.c_play a = new controler.c_play(new play(), username);
            System.out.println("user "+username);
            System.out.println("score "+scorejagung);
            model.setscorejagung(username, ""+scorejagung);
            try {
                model.setscorejagung(username, "" + scorejagung);
                if (!model.getscorejagung(username).equals("0")) {
                    a.enablemap("jagung");
                }
                if (!model.getscoretebu(username).equals("0")) {
                    a.enablemap("jagung");
                }
                if (!model.getscoretembakau(username).equals("0")) {
                    a.enablemap("tebu");
                }
            } catch (SQLException ex) {
                Logger.getLogger(c_playjagung.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
