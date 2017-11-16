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
import view.tentang;

/**
 *
 * @author acer
 */
public class c_tentang {

    tentang view;
    String username;

    public c_tentang(tentang view,String username) {
        this.view = view;
        this.username=username;
        view.mainmenu(new klikmainmenu());
        view.setVisible(true);
    }

    private class klikmainmenu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            controler.c_mainmenu a = new controler.c_mainmenu(new view.mainmenu(),username);
            view.dispose();
        }
    }
}
