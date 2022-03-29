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
public class TiketMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TiketService data = new TiketService();
        Tiket t1 = new Tiket("Singapore Airlines", 1830000, "Bali", "Singapore");
        Tiket t2 = new Tiket("Scoot", 411400, "Jakarta", "Singapore");
        Tiket t3 = new Tiket("Tiger", 170000, "Jakarta", "Semarang");
        Tiket t4 = new Tiket("Batik Air", 3811000, "Banyuwangi", "Jakarta");
        Tiket t5 = new Tiket("Lion", 522900, "Surabaya", "Bali");

        data.tambah(t1);
        data.tambah(t2);
        data.tambah(t3);
        data.tambah(t4);
        data.tambah(t5);

        System.out.println("Daftar Harga ticket sebelum di sorting = ");
        data.tampil();
        System.out.println("==================================");

        System.out.println("Data ticket setelah di sorting berdasarkan :");
        System.out.println("Sorting dengan metode Bubble sort :");
        data.bubbleSort();
        data.tampil();
        System.out.println();
        System.out.println("==================================");
        System.out.println("Sorting dengan metode Selection sort :");
        data.selectionSort();
        data.tampil();
        System.out.println("==================================");
    }
}
