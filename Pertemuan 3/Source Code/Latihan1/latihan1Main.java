/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

import java.util.Scanner;
public class latihan1Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int bla, lim, prim;
    System.out.print("Masukkan jumlah Bola : ");
    bla = sc.nextInt();
    bola [] bl = new bola[bla];
    
    for(int i = 0; i<bl.length; i++){
            bl[i] = new bola();
            System.out.println("Bola ke- " +(i+1));
            System.out.print("Jari-jari : ");
            bl[i].jariJari = sc.nextDouble();
            System.out.println();
    }
    for(int i = 0; i<bl.length; i++){
        System.out.println("Luas Permukaan Bola ke- " +(i+1) + ": " + bl[i].hitungLuasPermukaanB());
        System.out.println("Volume Bola ke- " +(i+1) + ": " + bl[i].hitungVolumeB());
        System.out.println();
    }
    
    System.out.print("Masukkan jumlah Limas : ");
    lim = sc.nextInt();
    limasSegitiga [] lm = new limasSegitiga[lim];
    
    for(int i = 0; i<lm.length; i++){
            lm[i] = new limasSegitiga();
            System.out.println("Limas Segitiga ke- " +(i+1));
            System.out.print("Alas : ");
            lm[i].alas = sc.nextDouble();
            System.out.print("Tinggi : ");
            lm[i].tinggi = sc.nextDouble();
            System.out.print("Sisi Tegak : ");
            lm[i].sisiTegak = sc.nextDouble();
            System.out.println();
    }
    for(int i = 0; i<lm.length; i++){
        System.out.println("Luas Permukaan Limas Segitiga ke- " +(i+1) + ": " + lm[i].hitungLuasPermukaan());
        System.out.println("Volume Limas Segitiga ke- " +(i+1) + ": " + lm[i].hitungVolume());
        System.out.println();
    }
    
    System.out.print("Masukkan jumlah Prisma : ");
    prim = sc.nextInt();
    prismaSegitiga [] pr = new prismaSegitiga[prim];
    
    for(int i = 0; i<pr.length; i++){
            pr[i] = new prismaSegitiga();
            System.out.println("Prisma Segitiga ke- " +(i+1));
            System.out.print("Alas : ");
            pr[i].alasP = sc.nextDouble();
            System.out.print("Tinggi : ");
            pr[i].tinggiP = sc.nextDouble();
            System.out.print("Sisi Tegak : ");
            pr[i].sisiTegakP = sc.nextDouble();
            System.out.println();
    }
    for(int i = 0; i<pr.length; i++){
        System.out.println("Luas Permukaan Prisma Segitiga ke- " +(i+1) + ": " + pr[i].hitungLuasPermukaanP());
        System.out.println("Volume Prisma Segitiga ke- " +(i+1) + ": " + pr[i].hitungVolumeP());
        System.out.println();
    }
    }
}
