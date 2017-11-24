/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.sql.SQLException;
import model.modeluser;
import view.highscore;
import view.scorepemain;

/**
 *
 * @author acer
 */
public class c_score {

    highscore view;
    modeluser model;
scorepemain viewscore;
    public c_score(highscore view,scorepemain viewscore , modeluser model) throws SQLException {
        this.view = view;
        this.model = model;
        this.
        view.setVisible(true);
        view.setTableModel(model.gethighscore());
    }
}
