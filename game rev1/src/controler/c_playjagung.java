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
import javafx.util.Duration;
import javax.swing.Timer;
import view.playjagung;

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
    Timer timer;

    public c_playjagung(playjagung view) {
        this.view = view;
        view.map(new klikmap());
        view.kliksiram(new kliksiram());
        view.setVisible(true);
    }

    private class kliksiram implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setboxgerak(siram);
            System.out.println(siram);
            view.settanaman(tanaman2);
            try {

                TimeUnit.SECONDS.sleep(1);
                System.out.println(kosong);
                view.setboxgerak(kosong);
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
