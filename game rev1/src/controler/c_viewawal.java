/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import view.viewawal;

public class c_viewawal {

    AudioInputStream audioIn;
    Clip clip;
    viewawal view;

    public c_viewawal(viewawal view) {
        this.view = view;
        this.view.klikplay(new play());
        this.view.setVisible(true);
        Musik_Play();
    }

    public void Musik_Play() {
        try {
            audioIn = AudioSystem.getAudioInputStream(new File("mainmenu.wav"));
            clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
    }


    private class play implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                controler.c_isinama a = new controler.c_isinama(new view.isinama(), new model.modeltoko());
            } catch (SQLException ex) {
                Logger.getLogger(c_viewawal.class.getName()).log(Level.SEVERE, null, ex);
            }
            view.dispose();
        }

    }
}
