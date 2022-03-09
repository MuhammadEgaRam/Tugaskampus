/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;
import java.util.Scanner;
/**
 *
 * @author EgaRam
 */
public class ArrayObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah;
        System.out.print("Masukkan element array : ");
        jumlah = sc.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[jumlah];
        
        
        for(int i = 0; i<ppArray.length; i++){
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" +i);
            System.out.print("Masukkan panjang : ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar : ");
            ppArray[i].lebar = sc.nextInt();
        }
        for(int i = 0; i<ppArray.length; i++){
            System.out.println("Persegi Panjang ke-" +i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
    }
}
