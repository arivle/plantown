/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    public c_play(play view) {
        this.view = view;
        view.playjagung(new playjagung());
        view.playtebu(new playtebu());
        view.playtembakau(new playtembakau());
        view.setVisible(true);
    }

    private class playjagung implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            controler.c_playjagung d = new controler.c_playjagung(new view.playjagung());
        }
    }

    public void showview() {
        this.view.setVisible(true);
    }

    private class playtebu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           controler.c_playtebu c = new controler.c_playtebu(new view.playtebu());
            view.setVisible(false);
        }
    }

    private class playtembakau implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            controler.c_playtembakau b = new controler.c_playtembakau(new view.playtembakau());
            view.setVisible(false);
        }
    }
}
