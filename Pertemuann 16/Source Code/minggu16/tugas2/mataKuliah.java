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
public class mataKuliah {
    String kode, namaMk;
    int sks;
    
    public mataKuliah(String kode, String namaMk, int sks){
        this.kode = kode;
        this.namaMk = namaMk;
        this.sks = sks;
    }
    public String toString(){
        return String.format("%s\t%-45s%s", kode, namaMk, sks);
    }       
}
