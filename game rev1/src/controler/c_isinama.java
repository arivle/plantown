/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.user;
import view.isinama;
import view.mainmenu;

/**
 *
 * @author acer
 */
public class c_isinama {

    isinama view;
    mainmenu view2;
    user model;
    controllihat controler;

    public c_isinama(isinama view) {
        this.view = view;
        this.view.klikok(new klikmainmenu());
        this.view.setVisible(true);
        
    }

    private class klikmainmenu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {            
            controler.c_mainmenu a = new controler.c_mainmenu(new view.mainmenu());
            view.dispose();
        }
    }
    public String getusername (){
        return view.getnama();
    }
}
