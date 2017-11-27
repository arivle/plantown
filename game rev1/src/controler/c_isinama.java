/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.modeltoko;
import view.isinama;
import view.mainmenu;

/**
 *
 * @author acer
 */
public class c_isinama {

    isinama view;
    mainmenu view2;
    modeltoko model;

    public c_isinama(isinama view, modeltoko model) {
        this.view = view;
        this.model=model;
        view.klikok(new klikmainmenu());
        view.setVisible(true);

    }

    private class klikmainmenu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (model.playerbaru(getusername()) == true) {
                view.message("selamat datang " + getusername());
                controler.c_mainmenu a = new controler.c_mainmenu(new view.mainmenu(), view.getusername());
                view.dispose();
            } else {
                view.message("username yang anda masukan sudah ada silahkan masukan username baru");
            }

        }
    }

    public String getusername() {
        System.out.println(view.getusername());
        return view.getusername();
    }
}
