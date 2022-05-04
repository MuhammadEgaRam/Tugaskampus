/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu11.Tugas3;

/**
 *
 * @author EgaRam
 */
public class node {
    node next;
    String nim, nama;
    int absen;
    double ipk;
    
    public node(String nim, String nama, int absen, double ipk, node berikutnya){
        this.nim = nim;
        this.nama = nama;
        this.absen = absen;
        this.ipk = ipk;
        this.next = berikutnya;
    }
}