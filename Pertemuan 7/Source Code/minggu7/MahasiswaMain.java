/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu7;
import java.util.Scanner;
/**
 *
 * @author EgaRam
 */
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        
        PencarianMhs data = new PencarianMhs();
        
        
        System.out.print("Masukkan jumlah data mahasiswa : ");
        int jumMhs = s.nextInt();
        Mahasiswa[] e = new Mahasiswa[jumMhs];
        data.listMhs = e;
        
        System.out.println("-----------------------------");
        System.out.println("Masukkan data mahasiswa secara Urut dari Nim Terkecil : ");
        for(int i = 0; i<jumMhs; i++){
            System.out.println("---------------------------");
            System.out.print("Nim\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = s1.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();
           
            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }
            System.out.println("------------------------------------");
            System.out.println("Data keseluruhan Mahasiswa");
            data.tampil();
            
            System.out.println("____________________________________");
            System.out.println("____________________________________");
            System.out.println("Pencarian data : ");
            System.out.println("Masukkan Nama Mahasiswa yang dicari : ");
            System.out.println("Nama : ");
            String cari = s1.nextLine();
            System.out.println("Menggunakan sequential Search");
            int posisi = data.FindSeqSearch(cari);
            data.Tampilposisi(cari, posisi);
            data.TampilData(cari, posisi);
            System.out.println();
    }
}
    
