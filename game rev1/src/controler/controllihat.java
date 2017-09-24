/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author acer
 */
public class controllihat {

    public void isinama() {
        controler.c_isinama a = new controler.c_isinama(new view.isinama());
    }

    public void mainmenu() {
        controler.c_mainmenu a = new controler.c_mainmenu(new view.mainmenu());
    }
}
