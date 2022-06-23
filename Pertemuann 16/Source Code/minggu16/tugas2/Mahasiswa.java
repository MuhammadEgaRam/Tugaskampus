/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu16.tugas2;

/**
 *
 * @author EgaRam
 */
public class Mahasiswa {
    String nim;
    String nama;
    String notelp;
    
    public Mahasiswa(String nim, String nama, String notelp){
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }
    public String toString(){
        return String.format("%s\t%-15s\t%s", nim, nama, notelp);
    }
}
