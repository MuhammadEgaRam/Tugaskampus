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
        System.out.print("Tentukan jumlah pacman : ");
        jumlahP = sc.nextInt();
        Pacman[] pA = new Pacman[jumlahP];
        
        
        for(int i = 0; i<pA.length; i++){
        pA[i] = new Pacman();
        System.out.print("Tentukan jumlah pil untuk setiap pacman : ");
        pA[i].pil = sc.nextInt();
        System.out.println("Energi default sebesar : " + pA[i].hitungKekuatan2());
        System.out.println("Pacman ke- " + (i+1) + " sesuai dengan jumlah pil = " + pA[i].pil);
        }
        System.out.println("=======Kuman======");
        int jumlahK;
        System.out.print("Tentukan jumlah Kuman : ");
        jumlahK = sc.nextInt();
        Kuman[] pAK = new Kuman[jumlahK];
        
        for(int i = 0; i<pAK.length; i++){
        pAK[i] = new Kuman();
        System.out.println("Kuman ke-"+(i+1)+ " memiliki power sebesar " + pAK[i].hitungKekuatanK());
        System.out.println("Kuman ke-" + (i+1) + " harus makan banyak pacman");
        }
        System.out.println("\n\n======GAME PACMAN VS KUMAN=====");
        System.out.println("\nPilih Pacman yang kamu mainkan!");
        System.out.print("Pilih Pacman ke: ");
        int pilih = sc.nextInt();
        System.out.println("Kamu memilih pacman ke-" +pilih);
        
        System.out.print("\nTentukan jumlah pil yang dimakan oleh Pacman ke-"+(pilih)+"! ");
        int pil2 = sc.nextInt();
        int tPil =0;
        tPil = pil2*10;
        System.out.println("Energi yang diperoleh pacman : " + pA[pilih-1].hitungKekuatan(tPil));
        System.out.println("Kekuatan pacman ke-"+pilih+ " menjadi " + pA[pilih-1].hitungKekuatan(tPil));
        
        
        System.out.print("\nTentukan kuman yang kamu mainkan!");
        System.out.print("Pilih kuman ke: ");
        int km2 = sc.nextInt();
        System.out.println("kuman ke-"+km2+" menyerang pacman ke-"+(pilih)+" !");
        int tm = 10;
        System.out.println("Kekuatan kuman bertambah sebesar : " + pAK[km2-1].hitungKekuatanA(tm));
        System.out.println("Kekuatan Pacman ke-"+(pilih)+" berkurang menjadi : "+ (pA[pilih-1].hitungKekuatan(tPil)-5) );
    }
}
