/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author acer
 */
public class user {

    String nama;
    int score;
    int statusjagung;
    int statustebu;
    int statustembakau;

    public user(String nama) {
        this.nama = nama;
        this.score = 0;
        this.statusjagung = 0;
        this.statustebu = 0;
        this.statustembakau = 0;
    }

    public String getnama() {
        return nama;
    }

    public int getscorea() {
        return score;
    }

    public int getstatusjagung() {
        return statusjagung;
    }

    public int gettebu() {
        return statustebu;
    }

    public int gettembakau() {
        return statustembakau;
    }

    public void setscore(int set) {
        score = set;
    }

    public void setstatustebu(int set) {
        statustebu = set;
    }

    public void settembakau(int set) {
        statustembakau = set;
    }

    public void setjagung(int set) {
        statusjagung = set;
    }
}
