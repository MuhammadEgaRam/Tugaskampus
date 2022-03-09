/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;
import java.util.Scanner;
public class latihan2Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tanah;
    System.out.print("Jumlah tanah : ");
    tanah = sc.nextInt();
    latihan2 [] l2 = new latihan2[tanah];
    
    for(int i = 0; i<l2.length; i++){
            l2[i] = new latihan2();
            System.out.println("Tanah " +(i+1));
            System.out.print("Panjang : ");
            l2[i].panjang = sc.nextInt();
            System.out.print("Lebar : ");
            l2[i].lebar = sc.nextInt();
            System.out.println();
    }
    for(int i = 0; i<l2.length; i++){
        System.out.println("Luas tanah ke- " +(i+1) + ": " + l2[i].hitungLuas());
    }
    }
}
