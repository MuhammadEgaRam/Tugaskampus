/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu6;

/**
 *
 * @author EgaRam
 */
public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;
    
    void tambah(Mahasiswa m){
        if(idx<listMhs.length){
            listMhs[idx] = m; //selama id belum mencapai, maka object mhs dapat terus dimasukkan ke dalam array listMhs[]
            idx++;
        }else{
            System.out.println("Data sudah penuh!");
        }
    }
    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("------------------");
        }
    }
    void bubbleSort(){
        for(int i=0; i<listMhs.length-1; i++){
            for(int j=1; j<listMhs.length-i; j++){
                if(listMhs[j].ipk > listMhs[j-1].ipk){
                    //di bawah ini proses swap atau penukaran(BubbleSort)
                    Mahasiswa tmp = listMhs[j]; //dibuat agar tidak serta merta menukar
                    listMhs[j] = listMhs[j-1]; //yang kosong adalah listMhs[j-1]
                    listMhs[j-1] = tmp; 
                }
            }
        }
    }
    void selectionSort(){
        for(int i=0; i<listMhs.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j<listMhs.length; j++){
                if(listMhs[j].ipk < listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            //di bawah ini proses swap atau penukaran(SelectionSort)
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
    void insertionSort(boolean duo){
        for(int i=1; i < listMhs.length; i++){
            Mahasiswa temp = listMhs[i];
            int j = i;
            if(duo){
                while(j>0 && listMhs[j-1].ipk > temp.ipk){
                    listMhs[j] = listMhs[j-1];
                    j--;
                }
            }else{
                while(j>0 && listMhs[j-1].ipk < temp.ipk){
                    listMhs[j] = listMhs[j-1];
                    j--;
                }
            }
            listMhs[j] = temp;
        }
    }
}
