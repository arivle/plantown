/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.modeltoko;
import view.play;

/**
 *
 * @author acer
 */
public class c_play {

    play view;
    c_playjagung jagung;
    c_playtebu tebu;
    c_playtembakau tembakau;
    String username;
    String score;

    public c_play(play view, String username, String score) {
        this.view = view;
        this.username = username;
        this.score = score;
        view.playjagung(new playjagung());
        view.playtebu(new playtebu());
        view.playtembakau(new playtembakau());
        view.setVisible(true);
    }

    public void enablemap(String set, boolean bool) {
        view.setdisable(set, bool);
    }

    private class playjagung implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                controler.c_playjagung d = new controler.c_playjagung(new view.playjagung(), new model.modeltoko(), username, score);
                view.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_play.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class playtebu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                controler.c_playtebu c = new controler.c_playtebu(new view.playtebu(), new model.modeltoko(), username, score);
                view.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_play.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class playtembakau implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                controler.c_playtembakau b = new controler.c_playtembakau(new view.playtembakau(), new model.modeltoko(), username, score);
                view.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_play.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
