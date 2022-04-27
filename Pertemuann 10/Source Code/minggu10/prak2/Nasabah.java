/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu10.prak2;

/**
 *
 * @author EgaRam
 */
public class Nasabah {
    String norek, nama, alamat;
    int umur;
    double saldo;
    
    Nasabah(String norek, String nama, String alamat, int umur, double saldo){
        this.norek = norek;
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.saldo = saldo;
    }
    Nasabah(){
        
    }
}
