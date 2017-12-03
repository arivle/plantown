/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import view.scorepemain;

/**
 *
 * @author acer
 */
public class c_scorepemain {

    String username;
    scorepemain view;

    public c_scorepemain(scorepemain view, String score, String username) throws SQLException {
        this.view = view;
        this.username = username;
        view.setnama(this.username);
        view.setscore(score);
        view.klikback(new klikback());
        view.klikhighscore(new klikhighscore());
        view.setVisible(true);
    }
    
    private class klikback implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            controler.c_mainmenu a = new controler.c_mainmenu(new view.mainmenu(), username);
        }
        
    }

    private class klikhighscore implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                controler.c_highscore a = new controler.c_highscore(new view.highscore(), new model.modeltoko());
            } catch (SQLException ex) {
            }
        }
        
    }
}
