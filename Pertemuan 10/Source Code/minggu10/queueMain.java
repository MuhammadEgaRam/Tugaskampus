/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu10;
import java.util.Scanner;
/**
 *
 * @author EgaRam
 */
public class queueMain {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        System.out.print("Masukkan kapasitas queue : ");
        int n = sc.nextInt();
        queue q = new queue(n);
        int pilih;
        
        do{
            menu();
            pilih = sc.nextInt();
            switch(pilih){
                case 1 :
                    System.out.print("Masukkan data baru : ");
                    int dataMasuk = sc.nextInt();
                    q.Enqueue(dataMasuk);
                    break;
                
                case 2 :
                    int dataKeluar = q.Dequeue();
                    if(dataKeluar != 0){
                        System.out.println("Data yang dikeluarkan : " + dataKeluar);
                        break;
                    }
                    
                case 3 :
                    q.print();
                    break;
                    
                case 4 :
                    q.peek();
                    break;
                    
                case 5 :
                    q.clear();
                    break;
                    
                case 6 :
                    System.out.print("Masukkan data yang akan dicari : ");
                    int cari = sc.nextInt();
                    q.peekPosition(cari);
                    break;
                    
                case 7 :
                    System.out.print("Masukkan index yang ingin dicari : ");
                    int in = sc.nextInt();
                    q.peekAt(in);
                    break;
            }
        }while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
    public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("6. Pencarian Index");
        System.out.println("7. Mencari Data Pada Index");
        System.out.println("------------------");
    }
}
