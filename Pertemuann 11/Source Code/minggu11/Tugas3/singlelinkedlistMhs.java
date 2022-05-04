/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu11.Tugas3;

/**
 *
 * @author EgaRam
 */
public class singlelinkedlistMhs {
    node head; //posisi awal linked list
    node tail; //posisi akhir linked list
    
    public boolean isEmpty(){
        return head == null;
    }
    public void print(){
    if(!isEmpty()){
        node tmp = head;
        while(tmp != null){
            System.out.println(tmp.nim + " | " + tmp.nama + " | " + tmp.absen + " | " + tmp.ipk);
            tmp = tmp.next;
        }
        System.out.println(" ");
    }else{
        System.out.println("Linked list kosong");
    }
    }
    public void addLast(String nim, String nama, int absen, double ipk){
        node ndInput = new node(nim, nama, absen, ipk, null);
        if(isEmpty()){
            head = ndInput; //head dan tail sama dengan node input
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void peek(){
        if(!isEmpty()){
            node tmp = head;
            System.out.println("Elemen terdepan : " + tmp.nim + " | " + tmp.nama + " | " + tmp.absen + " | " + tmp.ipk);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    public void peekRear(){
        if(!isEmpty()){
            node tmp = tail;
            System.out.println("Elemen terbelakang : " + tmp.nim + " | " + tmp.nama + " | " + tmp.absen + " | " + tmp.ipk);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    public void getData(int index){
        if(isEmpty()){
            System.out.println("Antrian masih koson!");
        }else{
        node tmp = head;
        for(int i = 0; i < index; i++){
            tmp = tmp.next;
        }
            System.out.println("Data pada index ke-" + index + " adalah " + tmp.nim + " | " + tmp.nama + " | " + tmp.absen + " | " + tmp.ipk);
        }
    }
    public void removeLast(){
        node tmp = tail;
        if(isEmpty()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
        }else if(head == tail){
            head = tail = null;
        }else{
            node temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
}