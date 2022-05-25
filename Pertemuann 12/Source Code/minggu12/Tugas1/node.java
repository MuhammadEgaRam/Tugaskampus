/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu12.Tugas1;

/**
 *
 * @author EgaRam
 */
public class node {

    int nomor;
    String nama;
    node prev, next;
    
    node(node prev, int nomor, String nama, node next){
        this.prev = prev;
        this.nomor = nomor;
        this.nama = nama;
        this.next = next;
    }
}
