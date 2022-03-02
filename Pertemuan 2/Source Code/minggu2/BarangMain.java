/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu2;

/**
 *
 * @author EgaRam
 */
public class BarangMain {
        public static void main (String[] args){
            Barang b1 = new Barang();
            b1.namaBarang = "Xiaomi";
            b1.jenisBarang = "Smartphone";
            b1.hargaSatuan = 1750000;
            b1.stok = 0;
            //b1.tambahStok(1);
            //b1.kurangStok(3);
            b1.tampilBarang();
            int hargaTotal = b1.hitungHargaTotal(4);
            System.out.println("Harga 4 buah barang ini adalah " + hargaTotal);
            Barang b2 = new Barang("Logitech", "Wireless Mouse", 25, 150000);
            b2.tampilBarang();
            Barang b3 = new Barang("Asus ROG", "Tablet", 10, 4000000);
            b3.tampilBarang();
        }
    }
   
