/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu16.tugas1;

/**
 *
 * @author EgaRam
 */
public class film {
    String judul;
    String id;
    String tahun;
    String director;
    
    public film(){
    }
    
    public film(String judul, String id, String tahun, String director){
        this.judul = judul;
        this.id = id;
        this.tahun = tahun;
        this.director = director;
    }
    
    @Override
    public String toString(){
        return "film{" + "id = " +id+ ", judul = " +judul+ ", tahun = " +tahun+ ", director = " +director+'}';
    }
}

