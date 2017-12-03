/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.sql.SQLException;
import model.modeltoko;
import view.highscore;

/**
 *
 * @author acer
 */
public class c_highscore {

    highscore view;
    modeltoko model;

    public c_highscore(highscore view, modeltoko model) throws SQLException {
        this.view = view;
        this.model = model;
        view.setVisible(true);
        view.setTableModel(model.gethighscore());
    }
}
