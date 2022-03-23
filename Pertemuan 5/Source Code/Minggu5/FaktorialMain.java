/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu5;
import java.util.Scanner;
/**
 *
 * @author EgaRam
 */
public class FaktorialMain {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long startTime= System.currentTimeMillis();
    System.out.println("Start time: "+ String.valueOf(startTime)+" milidetik");
        System.out.println("============");
        System.out.println("Input nilai yang di faktorialkan: ");
        int elemen = sc.nextInt();
        
        Faktorial[] fk = new Faktorial[elemen];
        for(int i = 0; i < elemen; i++){
            fk[i] = new Faktorial();
            System.out.println("Data ke-"+(i+1)+": ");
            fk[i].nilai = sc.nextInt();
        }
        System.out.println("++++++++++++");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for(int i = 0; i < elemen; i++){
            System.out.println("Hasil faktorial dari nilai " + fk[i].nilai + " adalah " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("++++++++++++");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for(int i = 0; i < elemen; i++){
            System.out.println("Hasil faktorial dari nilai " + fk[i].nilai + " adalah " + fk[i].faktorialBF(fk[i].nilai));
        }
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        
        System.out.println("End time: "+ String.valueOf(endTime)+" milidetik");
        System.out.println("Execution time: "+ String.valueOf(elapsedTime)+" milidetik");
    }
}
    

