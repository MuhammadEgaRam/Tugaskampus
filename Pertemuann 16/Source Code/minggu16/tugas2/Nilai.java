/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu16.tugas2;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
/**
 *
 * @author EgaRam
 */
public class Nilai {
    String kodeN;
    double nilai;
    Mahasiswa mhs;
    mataKuliah mk;
    
    public Nilai(String kodeN, double nilai, Mahasiswa mhs, mataKuliah mk){
        this.kodeN = kodeN;
        this.nilai = nilai;
        this.mhs = mhs;
        this.mk = mk;
    }
    List<Mahasiswa> mhsA = new ArrayList<>();
    List<mataKuliah> matkulE = new ArrayList<>();
    
    public void tambahMhs(Mahasiswa... mahasiswa){
        mhsA.addAll(Arrays.asList(mahasiswa));
    }
    public void tambahMatkul(mataKuliah... matkul){
        matkulE.addAll(Arrays.asList(matkul));
    }
    public void tampilMhs(){
        mhsA.stream().forEach(mhs ->{
            System.out.println("" + mhs.toString());
        });
    }
    public void tampilMatkul(){
        matkulE.stream().forEach(mk ->{
            System.out.println("" + mk.toString());
        });
    }
    int linearSearchMhs(String nim){
        for(int i = 0; i < mhsA.size(); i++){
            if(nim.equals(mhsA.get(i).nim)){
                return i;
            }
        }
        return -1;
    }
    int linearSearchMatkul(String matkul){
        for(int i = 0; i < matkulE.size(); i++){
            if(matkul.equals(matkulE.get(i).kode)){
                return i;
            }
        }
        return -1;
    }
    Mahasiswa cariMhs(String nim){
        for(int i = 0; i < mhsA.size(); i++){
            if(nim.equals(mhsA.get(i).nim)){
                return mhsA.get(i);
            }
        }
        return null;
    }
    mataKuliah cariMatkul(String matkul){
        for(int i = 0; i < matkulE.size(); i++){
            if(matkul.equals(matkulE.get(i).kode)){
                return matkulE.get(i);
            }
        }
        return null;
    }
    public String toString(int idx1, int idx2){
        return mhsA.get(idx1).nim + "\t" + mhsA.get(idx1).nama + "\t" + matkulE.get(idx2).namaMk + "\t" + matkulE.get(idx2).sks + "\t";
    }
    static Comparator<Nilai> compNilai = (n1, n2) ->{
        if(n1.nilai < n2.nilai){
            return -1;
        }else if(n1.nilai > (n2).nilai){
            return 1;
        }else{
            return 0;
        }
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner se = new Scanner(System.in);
        Scanner sb = new Scanner(System.in);
        
        List<Nilai> noll = new ArrayList<>();
        Nilai n = new Nilai("", 0, null, null);
        
        Mahasiswa m1 = new Mahasiswa("20001", "Natasha", "021xxx");
        Mahasiswa m2 = new Mahasiswa("20002", "Amanda", "021xxx");
        Mahasiswa m3 = new Mahasiswa("20003", "Iqbal", "021xxx");
        Mahasiswa m4 = new Mahasiswa("20004", "Anggara", "021xxx");
        Mahasiswa m5 = new Mahasiswa("20005", "Guanna", "021xxx");
        Mahasiswa m6 = new Mahasiswa("20006", "Natasha", "021xxx");
        
        n.tambahMhs(m1, m2, m3, m4, m5, m6);
        
        mataKuliah mk1 = new mataKuliah("0001", "Internet of Things", 3);
        mataKuliah mk2 = new mataKuliah("0002", "Algoritma dan Struktur Data", 2);
        mataKuliah mk3 = new mataKuliah("0003", "Algoritma dan Pemrograman", 2);
        mataKuliah mk4 = new mataKuliah("0004", "Praktikum Algoritma dan Struktur Data", 3);
        mataKuliah mk5 = new mataKuliah("0005", "Algoritma dan Struktur Data", 3);
        
        n.tambahMatkul(mk1, mk2, mk3, mk4, mk5);
        
        Nilai n1 = null;
        String nimMhs, mkMhs;
        
        int menu;
        do {
            System.out.println("===============================================");
            System.out.println("Sistem Pengolahan Data Nilai Mahasiswa Semester");
            System.out.println("===============================================");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Keluar");
            System.out.println("====================================\n");
            System.out.print("Masukkan Pilihan Menu (1-5): ");
            menu = se.nextInt();
            System.out.println("");

            switch(menu){
                case 1 :
                    System.out.println("=======================================");
                    System.out.print("Kode\t: ");
                    String kd = sc.nextLine();
                    System.out.print("Nilai\t: ");
                    double nilMhs = sb.nextDouble();                                     
                    System.out.println("");
                    
                        System.out.println("========================================");
                        System.out.println("             Daftar Mahasiswa           ");
                        System.out.println("========================================");
                        System.out.println("NIM\tNama\t\tTelf");
                        n.tampilMhs();
                        System.out.print("Pilih Mahasiswa by NIM : ");
                        nimMhs = sc.nextLine();
                        Mahasiswa mhaSiswas;
                        mhaSiswas = n.cariMhs(nimMhs);
                        
                        System.out.println("========================================");
                        System.out.println("            Daftar Mata Kuliah          ");
                        System.out.println("========================================");
                        System.out.println("Kode\tMata Kuliah\t\t\t\tSKS");
                        n.tampilMatkul();
                        System.out.print("Pilih Mata Kuliah by Kode : ");
                        mkMhs = sc.nextLine();
                        mataKuliah mtKuliah;
                        mtKuliah = n.cariMatkul(mkMhs);
                        
                        n1 = new Nilai(kd, nilMhs, mhaSiswas, mtKuliah);
                        
                        noll.add(n1);
                        System.out.println("");
                        break;
                                    
                case 2 : 
                    System.out.println("========================================");
                    System.out.println("             Daftar Mahasiswa           ");
                    System.out.println("========================================");
                    System.out.println("NIM\tNama\tMata Kuliah\t\tSKS\tNilai");
                    for(int i = 0; i < noll.size(); i++){
                        n.linearSearchMhs(noll.get(i).mk.kode);
                        System.out.println(n.toString(n.linearSearchMhs(noll.get(i).mhs.nim), n.linearSearchMatkul(noll.get(i).mk.kode))+ noll.get(i).nilai);
                        }
                    System.out.println("");
                    break;
                    
                    
                case 3:
                    System.out.println("========================================");
                    System.out.println("             Daftar Mahasiswa           ");
                    System.out.println("========================================");
                    System.out.println("NIM\tNama\tMata Kuliah\t\tSKS\tNilai");
                    int sks = 0;
                    for(int i=0; i<noll.size(); i++){
                        n.linearSearchMhs(noll.get(i).mhs.nim);
                        n.linearSearchMatkul(noll.get(i).mk.kode);
                        System.out.println(n.toString(n.linearSearchMhs(noll.get(i).mhs.nim), n.linearSearchMatkul(noll.get(i).mk.kode))+ noll.get(i).nilai);
                    }
                    System.out.print("Masukkan Data Mahasiswa NIM : ");
                    String input = sc.nextLine();
                    System.out.println("");
                    for (int i = 0; i < noll.size(); i++){
                        if(input.equalsIgnoreCase(noll.get(i).mhs.nim)){
                            sks += n.matkulE.get(i).sks;
                            n.linearSearchMhs(noll.get(i).mhs.nim);
                            n.linearSearchMatkul(noll.get(i).mk.kode);
                            System.out.println(n.toString(n.linearSearchMhs(noll.get(i).mhs.nim), n.linearSearchMatkul(noll.get(i).mk.kode)) + noll.get(i).nilai);    
                        }
                    }
                    System.out.println("Total SKS " + sks + " Telah Diambil");
                    System.out.println("");
                    break;
                    
                case 4:
                    System.out.println("========================================");
                    System.out.println("             Daftar Mahasiswa           ");
                    System.out.println("========================================");
                    System.out.println("NIM\tNama\tMata Kuliah\t\tSKS\tNilai");
                    noll.sort(compNilai);
                    for (int i = 0; i < noll.size(); i++){
                        n.linearSearchMhs(noll.get(i).mhs.nim);
                        n.linearSearchMatkul(noll.get(i).mk.kode);
                        System.out.println(n.toString(n.linearSearchMhs(noll.get(i).mhs.nim), n.linearSearchMatkul(noll.get(i).mk.kode)) + noll.get(i).nilai);
                    }
                    System.out.println("");
                    break;
                    
                case 5:
                    System.out.println("+=====================================+");
                    System.out.println("+             Terima Kasih            +");
                    System.out.println("+=====================================+");
                    break;
                
            } 
        }while (menu < 5 && menu > 0);
    }
}


