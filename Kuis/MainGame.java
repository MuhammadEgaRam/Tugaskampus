/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis;

import java.util.Scanner;

public class MainGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahP;
        int jKekuatan;
        System.out.print("Tentukan jumlah pacman : ");
        jumlahP = sc.nextInt();
        Pacman[] pA = new Pacman[jumlahP];
        
        System.out.print("Tentukan jumlah pil untuk setiap pacman : ");
        int pil = sc.nextInt();
        for(int i = 0; i<pA.length; i++){
        pA[i] = new Pacman();
        System.out.println("Energi default sebesar : " + pA[i].hitungKekuatan());
        System.out.println("Pacman ke- " + (i+1) + " sesuai dengan jumlah pil = " +pil);
        }
        System.out.println("=======Kuman======");
        int jumlahK;
        System.out.print("Tentukan jumlah Kuman : ");
        jumlahK = sc.nextInt();
        Kuman[] pAK = new Kuman[jumlahK];
        
        for(int i = 0; i<pAK.length; i++){
        pAK[i] = new Kuman();
        System.out.println("Kuman ke-"+(i+1)+ " memiliki power sebesar" + pAK[i].kekuatanM);
        System.out.println("Kuman ke-" + (i+1) + " harus makan banyak pacman");
        }
    }
}
