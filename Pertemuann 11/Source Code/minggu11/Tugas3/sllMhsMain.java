/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu11.Tugas3;
import java.util.Scanner;
/**
 *
 * @author EgaRam
 */
public class sllMhsMain {
    public static void main(String[] args) {
    singlelinkedlistMhs singLL = new singlelinkedlistMhs();
    Scanner sc = new Scanner(System.in);
    Scanner in = new Scanner(System.in);
        
    char pilih;
    int menu;
    do {
        System.out.println("Pilihan Menu");
        System.out.println("1. Tambah Data");
        System.out.println("2. Hapus Data Terakhir");
        System.out.println("3. Lihat Elemen Paling Depan");
        System.out.println("4. Lihat Elemen Paling Belakang");
        System.out.println("5. Mencari Data Mahasiswa Melalui Index");
        System.out.println("6. Tampilkan Data");
        System.out.println("7. EXIT");
        System.out.print("Masukkan Pilihan Menu (1-7): ");
        menu = sc.nextInt();
        System.out.println("");
        if (menu < 1 || menu > 8) {
            System.out.println("Masukkan Pilihan Menu Yang Benar!");
        }

        switch (menu) {
            case 1: {
                do {
                    System.out.print("Masukkan NIM              : ");
                    String nim = in.nextLine();
                    System.out.print("Masukkan Nama             : ");
                    String nama = in.nextLine();
                    System.out.print("Masukkan No.Absen         : ");
                    int absen = sc.nextInt();
                    System.out.print("Masukkan IPK Mahasiswa    : ");
                    double ipk = sc.nextDouble();
                    System.out.print("Apakah anda ingin menambah data baru?(y/n) : ");
                    pilih = sc.next().charAt(0);
                    singLL.addLast(nim, nama, absen, ipk);
                    System.out.println("");
                } while (pilih == 'y' || pilih == 'Y');
            }
            break;
            case 2: {
                singLL.removeLast();
                System.out.println("");
            }
            break;
            case 3: {
                singLL.peek();
                System.out.println("");
            }
            break;
            case 4: {
                singLL.peekRear();
                System.out.println("");
            }
            break;
            case 5: {
                System.out.print("Masukkan Index Pada Data Yang Dicari : ");
                int idx = sc.nextInt();
                singLL.getData(idx);
                System.out.println("");
            }
            break;
            case 6: {
                singLL.print();
                System.out.println("");
            }
        }
    } while (menu > 0 && menu < 7);
        System.out.println("TERIMA KASIH :D");
    }
}
