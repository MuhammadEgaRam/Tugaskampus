/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu16.prak3;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author EgaRam
 */
public class ListMahasiswa {
    List<Mahasiswa> mahasiswas = new ArrayList<>();
    
    public void tambah(Mahasiswa... mahasiswa){
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }
    public void hapus(int index){
        mahasiswas.remove(index);
    }
    public void update(int index, Mahasiswa mhs){
        mahasiswas.set(index, mhs);
    }
    public void tampil(){
        mahasiswas.stream().forEach(mhs ->{
            System.out.println("" +mhs.toString());
        });
    }
    int linearSearch(String nim){
        for(int i = 0; i < mahasiswas.size(); i++){
        if(nim.equals(mahasiswas.get(i).nim)){
                return i;
            }
        }
        return -1;
    }
    int binarySearch(String nim){
        return Collections.binarySearch(mahasiswas, new Mahasiswa (nim, null, null), new Comparator<Mahasiswa>(){
            @Override
            public int compare(Mahasiswa o1, Mahasiswa o2){
                return o1.nim.compareTo(o2.nim);
            }
        });
    }
    void ascSort(){
        Collections.sort(mahasiswas, new Comparator<Mahasiswa>(){
            @Override
            public int compare(Mahasiswa o1, Mahasiswa o2){
                return o1.nim.compareTo(o2.nim);
            }
        });
    }
    void dscSort(){
        Collections.reverse(mahasiswas);
    }
        
    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        System.out.println("Data Awal");
        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");
        //menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);
        //menampilkan list mahasiswa
        lm.tampil();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("....................Menggunakan Linear Search.......................");
        System.out.println("--------------------------------------------------------------------");
        //update mahasiswa
        lm.update(lm.linearSearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
        
        System.out.println("--------------------------------------------------------------------");
        System.out.println("....................Menggunakan Binary Search.......................");
        System.out.println("--------------------------------------------------------------------");
        lm.update(lm.binarySearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
        
        //asc
        System.out.println("--------------------------------------------------------------------");
        System.out.println("\n..........Data Diurutkan Secara Ascending Collections...........\n");
        System.out.println("--------------------------------------------------------------------");
        lm.ascSort();
        lm.tampil();
        
        //dsc
        System.out.println("--------------------------------------------------------------------");
        System.out.println("\n.........Data Diurutkan Secara Descending Collections...........\n");
        System.out.println("--------------------------------------------------------------------");
        lm.dscSort();
        lm.tampil();
    }
}
