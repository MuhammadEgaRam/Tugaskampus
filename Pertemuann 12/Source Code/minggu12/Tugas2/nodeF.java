/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu12.Tugas2;

/**
 *
 * @author EgaRam
 */
public class nodeF {
    int id;
    double rating;
    String judul;
    nodeF prev, next;
    
    nodeF(nodeF prev, int id, String judul, double rating, nodeF next){
        this.prev = prev;
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = next;
    }
}