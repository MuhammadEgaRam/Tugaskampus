/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu12.Tugas2;
import java.util.Scanner;
/**
 *
 * @author EgaRam
 */
public class filmMain {
    public static void main(String[] args) throws Exception {
    dlFilm dbl = new dlFilm();
    Scanner sc = new Scanner(System.in);
    Scanner in = new Scanner(System.in);
        
    char pilih;
    int menu;
    do {
        System.out.println("Pilihan Menu");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urut Data Rating Film-DESC");
        System.out.println("10. Keluar");
        System.out.print("Masukkan Pilihan Menu (1-10): ");
        menu = sc.nextInt();
        System.out.println("");
        if (menu < 1 || menu > 10) {
            System.out.println("Masukkan Pilihan Menu Yang Benar!");
        }

        switch (menu) {
            case 1: {
                do {
                    System.out.print("Masukkan ID       : ");
                    int id = sc.nextInt();
                    System.out.print("Masukkan Judul    : ");
                    String judul = in.nextLine();
                    System.out.print("Masukkan Rating   : ");
                    double rating = sc.nextDouble();
                    System.out.print("Apakah anda ingin menambah data baru?(y/n) : ");
                    pilih = sc.next().charAt(0);
                    dbl.addFirst(id, judul, rating);
                    System.out.println("");
                } while (pilih == 'y' || pilih == 'Y');
            }
            break;
            case 2: {
                do {
                System.out.print("Masukkan ID      : ");
                    int id = sc.nextInt();
                    System.out.print("Masukkan Judul   : ");
                    String judul = in.nextLine();
                    System.out.print("Masukkan Rating  : ");
                    double rating = sc.nextDouble();
                    System.out.print("Apakah anda ingin menambah data baru?(y/n) : ");
                    pilih = sc.next().charAt(0);
                    dbl.addLast(id, judul, rating);
                    System.out.println("");
                } while (pilih == 'y' || pilih == 'Y');
            }
            break;
            case 3: {
                do{
                System.out.print("Masukkan ID         : ");
                int id = sc.nextInt();
                System.out.print("Masukkan Judul      : ");
                String judul = in.nextLine();
                System.out.print("Masukkan Rating     : ");
                double rating = sc.nextDouble();
                System.out.print("Masukkan index yang ingin dipilih : ");
                int index = sc.nextInt();
                System.out.print("Apakah anda ingin menambah data baru?(y/n) : ");
                pilih = sc.next().charAt(0);
                dbl.add(id, judul, rating, index);
                System.out.println("");
                } while (pilih == 'y' || pilih == 'Y');
            }
            break;
            case 4: {
                dbl.removeFirst();
                System.out.println("");
            }
            break;
            case 5: {
                dbl.removeLast();
                System.out.println("");
            }
            break;
            case 6: {
                System.out.print("Masukkan index yang ingin dihapus : ");
                int index = sc.nextInt();
                dbl.remove(index);
                System.out.println("");
                break;
            }
            case 7: {
                dbl.print();
                System.out.println("");
                break;
            }
            case 8: {
                System.out.println("Masukkan ID yang dicari : ");
                System.out.print("ID : ");
                int cari = sc.nextInt();
                int posisi = dbl.FindSeqSearch(cari);
                dbl.Tampilposisi(cari, posisi);
                break;
            }
            case 9: {
                dbl.bubbleSort();
                break;
            }
            case 10: {
                System.out.println("Anda Telah Keluar");
                System.exit(0);
            }
        }
    } while (menu > 0 && menu < 11);
    }
}