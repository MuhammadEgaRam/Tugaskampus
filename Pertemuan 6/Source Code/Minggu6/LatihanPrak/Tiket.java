/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu6.LatihanPrak;

/**
 *
 * @author EgaRam
 */
public class Tiket {
    String maskapai,asal,tujuan;
    int harga;

    Tiket(String m, int h, String a, String t){
        maskapai = m;
        asal = a;
        harga = h;
        tujuan = t;
    }

    void tampil(){
        System.out.println("Maskapai penerbangan = "+maskapai);
        System.out.println("Asal penerbangan = "+asal);
        System.out.println("Tujuan penerbangan = "+tujuan);
        System.out.println("harga ticket = "+harga);
    }
}

