/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu5.pangkat;
import java.util.Scanner;
/**
 *
 * @author EgaRam
 */
public class PangkatMain {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char keluar;
        
        System.out.println("=================================");
        Pangkat[] png = new Pangkat[5];
        png[0] = new Pangkat(10,2);
        png[1] = new Pangkat(8,3);
        png[2] = new Pangkat(4,2);
        png[3] = new Pangkat(3,5);
        png[4] = new Pangkat(8,3);
        System.out.println("=================================");
        
        do{
            System.out.println("===================================================");
            System.out.println(" Hitung Pangkat BruteForce dan Divide Conquer");
            System.out.println("===================================================");
            
            System.out.println("Menu Hitung: ");
            System.out.println("1. Hitung BruteFoce"); 
            System.out.println("2. Hitung Divide Conquer");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu Ke-[1-3] : ");
            int menu=sc.nextInt();
            switch (menu){
                case 1 :
                    System.out.println("Hasil Pangkat dengan Brute Force");
                    for (int i=0; i<png.length; i++){
                        System.out.println("Nilai "+ png[i].nilai+ " pangkat "+ png[i].pangkat +" adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                    }
                    break;
                case 2 :
                    System.out.println("Hasil Pangkat dengan Divide and Conquer");
                    for (int i=0; i<png.length; i++){
                        System.out.println("Nilai "+ png[i].nilai+ " pangkat "+ png[i].pangkat +" adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                    }
                    break;
                case 3 :
                    System.out.println("------Terima Kasih!------");
                    break;
                default :
                    System.out.println("Mohon maaf, Menu yang anda masukkan TIDAK ADA !");
                    break;
            } if (menu == 3) {keluar = 'T';} 
            else {
                System.out.print("\nKembali ke Menu Utama ? [Y/T] : ");
                keluar = sc.next().charAt(0);
            }
        } while (keluar == 'Y' || keluar == 'y');
        System.out.println("===================================================");
    }
}
