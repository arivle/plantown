/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.viewawal;

public class c_viewawal {

    viewawal view;
    controllihat controler;

    public c_viewawal(viewawal view, controllihat control) {
        this.view = view;
        this.controler = control;
        this.view.klikplay(new play());
        this.view.setVisible(true);
    }

    private class play implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            controler.isinama();
            view.dispose();
        }

    }
}
