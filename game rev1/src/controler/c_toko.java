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
import model.modeluser;
import view.toko;

/**
 *
 * @author acer
 */
public class c_toko {

    toko view;
    modeluser model;
    String uang;
    String pupuk;
    String obat1;
    String obat2;
    String air;
    String username = "";

    public c_toko(toko view, modeluser model,String Username) throws SQLException {
        this.view = view;
        this.model = model;
        this.username=Username;
        System.out.println("username toko = "+this.username);
        view.klikbeliair(new klikbeliair());
        view.klikbelipupuk(new klikbelipupuk());
        view.klikbeliobat1(new klikbeliobat1());
        view.klikbeliobat2(new klikbeliobat2());
        view.klikkembali(new klikkembali());
        getdatatoko();
        view.setVisible(true);
    }

    public void getdatatoko() throws SQLException {
        air = model.getair(username);
        System.out.println("air = " + air);
        pupuk = model.getpupuk(username);
        System.out.println("pupuk = " + pupuk);
        obat1 = model.getobat1(username);
        System.out.println("obat1 = " + obat1);
        obat2 = model.getobat2(username);
        System.out.println("obat2 = " + obat2);
        uang = model.getuang(username);
        System.out.println("uang = " + uang);
        setdatatoko();
    }

    public void setdatatoko() {
        view.setair(air);
        view.setpupuk(pupuk);
        view.setobat2(obat2);
        view.setobat1(obat1);
        view.setuang(uang);
    }

    public class klikbeliair implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (Integer.parseInt(uang) >= 1) {
                    model.setair(username,  "+ 2");
                    model.setuang(username,  "- 1");
                    getdatatoko();
                } else {
                    view.message("uang anda tidak cukup untuk membeli air");
                }
            } catch (SQLException ex) {
                Logger.getLogger(c_toko.class.getName()).log(Level.SEVERE, null, ex);

            }
        }

    }

    public class klikbelipupuk implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (Integer.parseInt(uang) >= 2) {
                    model.setpupuk(username, "+ 2");
                    model.setuang(username,  "- 2");
                    getdatatoko();
                } else {
                    view.message("uang anda tidak cukup untuk membeli pupuk");
                }
            } catch (SQLException ex) {
                Logger.getLogger(c_toko.class.getName()).log(Level.SEVERE, null, ex);

            }
        }

    }

    public class klikbeliobat1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (Integer.parseInt(uang) >= 2) {
                    model.setobat1(username, "+ 2");
                    model.setuang(username, " - 2");
                    getdatatoko();
                } else {
                    view.message("uang anda tidak cukup untuk membeli obat biru");
                }
            } catch (SQLException ex) {
                Logger.getLogger(c_toko.class.getName()).log(Level.SEVERE, null, ex);

            }
        }

    }

    public class klikbeliobat2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (Integer.parseInt(uang) > 2) {
                    model.setobat2(username, "+ 2");
                    model.setuang(username, "- 2");
                    getdatatoko();
                } else {
                    view.message("uang anda tidak cukup untuk membeli obat kuning");
                }
            } catch (SQLException ex) {
                Logger.getLogger(c_toko.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
    }
    private class klikkembali implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.setVisible(false);
        }
    
    }
}
