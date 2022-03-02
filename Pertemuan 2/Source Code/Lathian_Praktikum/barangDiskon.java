/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lathian_Praktikum;

/**
 *
 * @author EgaRam
 */
public class barangDiskon {
    String nama;
    int hargaSatuan, jumlah;
    int hargaTot;
    float diskon;
    float harga;
    

    void tampilBarang(){
            System.out.println("Nama Barang : " +nama);
            System.out.println("Jumlah : " + jumlah);
            System.out.println("Harga Satuan : " + hargaSatuan);
            System.out.println("Harga total : " + hargaTot);
            System.out.println("Harga Diskon : " + diskon);
            System.out.println("Harga Bayar : " + harga);
    }
    int hitungHargaTotal(int jumlah){
        hargaTot = hargaSatuan*jumlah;
        return hargaSatuan;
    }
    void hitungDiskon(){
        if(hargaTot > 100000){
            diskon = (float)(hargaTot*0.1);
        }else if(hargaTot >=50000 && hargaTot <=100000){
            diskon = (float)(hargaTot*0.05);
        }
    }
    void hitungHargaBayar(){
        harga = (float)(hargaTot - diskon);
    } 
}
