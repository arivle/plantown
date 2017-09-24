/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.playjagung;

/**
 *
 * @author acer
 */
public class c_playjagung {

    playjagung view;

    public c_playjagung(playjagung view) {
        this.view = view;
        view.map(new klikmap());
        view.setVisible(true);
    }

    private class klikmap implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            controler.c_play a = new controler.c_play(new view.play());
            view.setVisible(false);
        }
    }
}
