/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu12.Tugas1;
import java.util.Scanner;
/**
 *
 * @author EgaRam
 */
public class doublelinkedlistMain {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);
        doublelinkedlist dll = new doublelinkedlist();
        int menu = 0;
        
        do{
            System.out.println("==============================");
            System.out.println("Pengantri Vaksin Extravaganzaa");
            System.out.println("==============================");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("==============================");
            System.out.print("Masukkan Pilihan Menu (1-4): ");
            menu = sc.nextInt();
            System.out.println("==============================");
            if (menu < 1 || menu > 5) {
            System.out.println("Masukkan Pilihan Menu Yang Benar!");
            }
                switch(menu){
                    case 1:
                        System.out.println("+++++++++++++++++++++++++++++");
                        System.out.println("Masukkan Data Penerima Vaksin");
                        System.out.println("+++++++++++++++++++++++++++++");
                        System.out.print("Nomor Antrian : ");
                        int no = sc.nextInt();
                        System.out.print("Nama Penerima : ");
                        String nama = ss.nextLine();
                        dll.Enqueue(no, nama);
                        System.out.println("++++++++++++++++++++++");
                        dll.print();
                        break;
                        
                    case 2:
                        dll.Dequeue();
                        dll.print();
                        break;
                     
                    case 3:
                        dll.print();
                        break;
                        
                    case 4:
                        System.out.println("Anda Telah Keluar");
                        break;
            }
            System.out.println();
        }while (menu > 0 && menu < 5);
    }
}
