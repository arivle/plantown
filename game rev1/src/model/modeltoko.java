/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLException;

/**
 *
 * @author acer
 */
public class modeltoko extends koneksi {

    public modeltoko() throws SQLException {
        super();
    }

    public String getair(String username) throws SQLException {
        String query = "SELECT `air` FROM `user` WHERE `nama` = '" + username + "' ";
        return getdata(query);
    }

    public String getpupuk(String username) throws SQLException {
        String query = "SELECT `pupuk` FROM `user` WHERE `nama` = '" + username + "' ";
        return getdata(query);
    }

    public String getobat1(String username) throws SQLException {
        String query = "SELECT `obat1` FROM `user` WHERE `nama` = '" + username + "' ";
        return getdata(query);
    }

    public String getobat2(String username) throws SQLException {
        String query = "SELECT `obat2` FROM `user` WHERE `nama` = '" + username + "' ";
        return getdata(query);
    }

    public String getuang(String username) throws SQLException {
        String query = "SELECT `uang` FROM `user` WHERE `nama` = '" + username + "' ";
        return getdata(query);
    }

    public boolean setuang(String username, String kurang) {
        String query = "UPDATE `user` SET `uang`= uang "+ kurang + " WHERE `nama` = '" + username + "'";
        return execute(query);
    }
    public boolean setpupuk(String username, String update) {
        String query = "UPDATE `user` SET `pupuk`= pupuk "+ update + " WHERE `nama` = '" + username + "'";
        return execute(query);
    }
    public boolean setobat1(String username, String update) {
        String query = "UPDATE `user` SET `obat1`= obat1 " + update + " WHERE `nama` = '" + username + "'";
        return execute(query);
    }
    public boolean setobat2(String username, String update) {
        String query = "UPDATE `user` SET `obat2`= obat2 "+update + " WHERE `nama` = '" + username + "'";
        return execute(query);
    }
    public boolean setair(String username, String update) {
        String query = "UPDATE `user` SET `air`= air "+ update + " WHERE `nama` = '" + username + "'";
        return execute(query);
    }
    public String getsisabarang (String username,String data) throws SQLException{
    String query= "select "+data+" from user where nama = '"+username+"'";
        return getdata(query);
    }
}
