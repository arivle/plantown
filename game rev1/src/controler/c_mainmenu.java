/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.user;
import view.mainmenu;

/**
 *
 * @author acer
 */
public class c_mainmenu {

    mainmenu view;
c_isinama controler;
    user model;
    
    public c_mainmenu(mainmenu view) {
//        user user= new user(controler.getusername());
        this.view = view;
//       view.setkotaknama(controler.getusername());
        this.view.klikmain(new klikplay());
        this.view.klikbantuan(new klikbantuan());
        this.view.kliktentang(new kliktentang());
        this.view.klikexit(new klikexit());
        this.view.setVisible(true);
    }

    private class klikplay implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            controler.c_play a = new controler.c_play(new view.play());
            view.dispose();
        }

    }

    private class klikbantuan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

    private class kliktentang implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

    private class klikexit implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
//    public String getnama() {
//        return user.getnama();
//    }
//
//    public int getscorea() {
//        return user.getscorea();
//    }
//
//    public int getstatusjagung() {
//        return user.getstatusjagung();
//    }
//
//    public int gettebu() {
//        return user.gettebu();
//    }
//
//    public int gettembakau() {
//        return user.gettembakau();
//    }
//
//    public void setscore(int set) {
//        user.setscore(set);
//    }
//
//    public void setstatustebu(int set) {
//        user.setstatustebu(set);
//    }
//
//    public void settembakau(int set) {
//        user.settembakau(set);
//    }
//
//    public void setjagung(int set) {
//        user.setjagung(set);
//    }
}
