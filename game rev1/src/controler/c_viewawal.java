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
import view.viewawal;

public class c_viewawal {

    viewawal view;

    public c_viewawal(viewawal view) {
        this.view = view;
        this.view.klikplay(new play());
        this.view.setVisible(true);
    }

    private class play implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                controler.c_isinama a = new controler.c_isinama(new view.isinama(),new model.modeluser());
            } catch (SQLException ex) {
                Logger.getLogger(c_viewawal.class.getName()).log(Level.SEVERE, null, ex);
            }
            view.dispose();
        }

    }
}
