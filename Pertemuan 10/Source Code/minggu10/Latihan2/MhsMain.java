/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu10.Latihan2;
import java.util.Scanner;
/**
 *
 * @author EgaRam
 */
public class MhsMain {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Scanner sd = new Scanner(System.in);
    
    System.out.print("Masukkan kapasitas queue : ");
    int jumlah = sd.nextInt();
    queue antri = new queue(jumlah);
    int pilih;
    
    do{
            menu();
            pilih = sc.nextInt();
            switch(pilih){
                case 1 :
                    System.out.print("NIM : ");
                    String nim = sc.next();
                    System.out.print("Nama : ");
                    String nama = sc.next();
                    System.out.print("Absen : ");
                    int absen = sc.nextInt();
                    System.out.print("IPK : ");
                    double ipk = sd.nextDouble();
                    Mahasiswa nb = new Mahasiswa(nim, nama, absen, ipk);
                    sc.nextLine();
                    antri.Enqueue(nb);
                    break;
                
                case 2 :
                    Mahasiswa data = antri.Dequeue();
                    if(!"".equals(data.nim) && !"".equals(data.nama) && data.absen != 0 && data.ipk != 0){
                        System.out.println("Antrian yang keluar : " + data.nim + " " + data.nama + " " + data.absen + " " + data.ipk);
                        break;
                    }
                    
                case 3 :
                    antri.peek();
                    break;
                    
                case 4 :
                    antri.print();
                    break;
                    
                case 5 :
                    antri.peekRear();
                    break;
                    
                case 6 :
                    System.out.println("Mencari NIM : ");
                    String cr = sc.next();
                    antri.peekPosition(cr);
                    break;
                    
                case 7 :
                    System.out.println("Masukkan index antrian : ");
                    int in = sc.nextInt();
                    antri.printMahasiswa(in);
                    break;
            }
        }while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
    public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian terbelakang");
        System.out.println("6. Mencari NIM Mahasiswa");
        System.out.println("7. Mencari Nama Mahasiswa");
        System.out.println("----------------------------");
    }
}
