/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu6.LatihanPrak;

/**
 *
 * @author EgaRam
 */
public class TiketService {
    Tiket[] ticket = new Tiket[5];
    int idx;

    void tambah(Tiket t) {
        if (idx < ticket.length) {
            ticket[idx] = t;
            idx++;
        } else {
            System.out.println("Maaf data sudah penuh :(");
        }
    }

    void tampil() {
        for (Tiket t : ticket) {
            t.tampil();
            System.out.println("-----------------------------");
        }
    }

    void bubbleSort(){
        for(int i=0;i<ticket.length-1;i++){
            for(int j=1;j<ticket.length-i;j++){
                if(ticket[j].harga>ticket[j-1].harga){
                    Tiket tmp = ticket[j];
                    ticket[j] = ticket[j-1];
                    ticket[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for(int i=0;i<ticket.length-1;i++){
            int idxMin = i;
            for(int j=i+1;j<ticket.length;j++){
                if(ticket[j].harga<ticket[idxMin].harga){
                    idxMin = j;
                }
            }Tiket tmp = ticket[idxMin];
            ticket[idxMin] = ticket[i];
            ticket[i] = tmp;
        }
    }
}
