/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.modeltoko;
import model.user;
import view.isinama;
import view.mainmenu;

/**
 *
 * @author acer
 */
public class c_mainmenu {

    mainmenu view;
    c_isinama controler;
    String username;

    public c_mainmenu(mainmenu view,String username) {
        this.view = view;
        this.username = username;
        this.view.klikmain(new klikplay());
        this.view.klikbantuan(new klikbantuan());
        this.view.kliktentang(new kliktentang());
        this.view.klikexit(new klikexit());
        view.setkotaknama(this.username);
        this.view.setVisible(true);
    }

    private class klikplay implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            controler.c_play a = new controler.c_play(new view.play(), username);
            view.dispose();
        }
    }

    private class klikbantuan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            controler.c_bantuan a = new controler.c_bantuan(new view.bantuan(), username);
            view.dispose();
        }
    }

    private class kliktentang implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            controler.c_tentang a = new controler.c_tentang(new view.tentang(), username);
            view.dispose();
        }
    }

    private class klikexit implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }

    }
}
