/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;


/**
 *
 * @author acer
 */
public class GameRev1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        controler.c_viewawal a = new controler.c_viewawal(new view.viewawal());
//controler.c_toko a = new controler.c_toko(new view.toko(), new model.modeltoko());
//controler.c_score a = new controler.c_score(new view.scorepemain(), new model.modeluser());
    }
    
}
