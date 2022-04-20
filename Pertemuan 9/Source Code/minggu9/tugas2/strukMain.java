/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu9.tugas2;
import java.util.Scanner;
/**
 *
 * @author EgaRam
 */
public class strukMain {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Scanner ss = new Scanner(System.in);
    
    System.out.println("====Arsip Struk Belanja====\n");
    System.out.print("Masukkan banyak Struk : ");
    int st = sc.nextInt();
    stok bn = new stok(st);
    int totalHarga = 0;
    int jumlah, harga;
    
        for (int i = 0; i < st; i++) {
            System.out.print("Masukkan Nomor Transaksi : ");
            int nomor = sc.nextInt();
            System.out.print("Masukkan Tanggal Pembelian : ");
            String tanggal = ss.nextLine();
            System.out.print("Masukkan Nama Barang : ");
            String namabrg = ss.nextLine();
            System.out.print("Jumlah Barang : ");
            jumlah = sc.nextInt();
            System.out.print("Harga Barang : ");
            harga = sc.nextInt();
            totalHarga = jumlah * harga;
            
            struk stk = new struk(nomor, tanggal, jumlah, namabrg, harga);
            sc.nextLine();
            bn.push(stk);
            System.out.println("Total Harga : " + totalHarga);
            System.out.println(" ");
        }
        char pilih;
        do{
            System.out.println("+==================================================================+");
            System.out.println("|\t\t\t\t Menu  \t\t\t\t   |");
            System.out.println("+==================================================================+\n");
            System.out.println("[1] Tampil 5 Struk\t\t");
            System.out.println("[2] Lihat Sisa Struk\t\t");
            System.out.println("[3] List Struk Terkecil\t\t");
            System.out.println("[4] Keluar Dari Program\t\t");
            System.out.print("Pilih Menu [1-4]: ");
            int pilihan = sc.nextInt();
            
        switch(pilihan){
            case 1 :
                bn.pop();
                bn.pop();
                bn.pop();
                bn.pop();
                bn.pop();
            break;
            
            case 2 :
                bn.print();
            break;
            
            case 3 :
                bn.getMin();
            break;
            
            case 4 :
                System.out.println("Terimakasih");
                System.exit(0);
                
            default :
                System.out.println("Input yang anda masukkan salah!");
                System.exit(0);
        }
    }while(true);
    }
}
        
