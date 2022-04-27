/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu10.prak2;
import java.util.Scanner;
/**
 *
 * @author EgaRam
 */
public class QueMain {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Scanner sd = new Scanner(System.in);
    
    System.out.print("Masukkan kapasitas queue : ");
    int jumlah = sd.nextInt();
    Queue antri = new Queue(jumlah);
    int pilih;
    
    do{
            menu();
            pilih = sc.nextInt();
            switch(pilih){
                case 1 :
                    System.out.print("No. Rekening : ");
                    String norek = sc.next();
                    System.out.print("Nama : ");
                    String nama = sc.next();
                    System.out.print("Alamat : ");
                    String alamat = sc.next();
                    System.out.print("Umur : ");
                    int umur = sd.nextInt();
                    System.out.print("Saldo : ");
                    double saldo = sd.nextDouble();
                    Nasabah nb = new Nasabah(norek, nama, alamat, umur, saldo);
                    sc.nextLine();
                    antri.Enqueue(nb);
                    break;
                
                case 2 :
                    Nasabah data = antri.Dequeue();
                    if(!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0 && data.saldo != 0){
                        System.out.println("Antrian yang keluar : " + data.norek + " " + data.nama + " " + data.alamat + " " + data.umur + " " + data.saldo);
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
            }
        }while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
    public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian terbelakang");
        System.out.println("----------------------------");
    }
}

