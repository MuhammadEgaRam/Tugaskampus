/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lathian_Praktikum;

public class barangDiskonMain {
    public static void main(String[] args) {
barangDiskon ds = new barangDiskon();
            ds.nama = "Xiaomi";
            ds.hargaSatuan = 2000000;
            ds.jumlah = 2;
            int hargaTotal = ds.hitungHargaTotal(ds.jumlah);
            ds.hitungDiskon();
            ds.hitungHargaBayar();
            ds.tampilBarang();
    } 
}
