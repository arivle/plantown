/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author acer
 */
public class waktu {
    public int getdetik (){
        DateFormat waktu = new SimpleDateFormat("ss");
        Date date = new Date();
        
        return date.getSeconds();

}
}
