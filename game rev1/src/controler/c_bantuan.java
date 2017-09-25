/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.bantuan;

/**
 *
 * @author acer
 */
public class c_bantuan {
    bantuan view;
    public c_bantuan (bantuan view) {
    this.view= view;
    view.mainmenu(new klikmainmenu());
    view.setVisible(true);
    }
    
    private class klikmainmenu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            controler.c_mainmenu a = new controler.c_mainmenu(new view.mainmenu());
            view.dispose();
        }
    
    }
}
