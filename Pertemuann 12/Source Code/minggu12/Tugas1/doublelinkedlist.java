/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu12.Tugas1;

/**
 *
 * @author EgaRam
 */
public class doublelinkedlist {
    node head, tail;
    int size;
    
    public doublelinkedlist(){
        head = null;
        tail = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void Enqueue(int nomor, String nama){
        node newnode = new node(null, nomor, nama, null);
        if(isEmpty()){
            head = newnode;
            tail = newnode;
        }else{
           tail.next = newnode;
           tail = newnode;
        }
        size++;
    }
    public void Dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked list masih kosong,  tidak dapat dihapus");
        }else if(size == 1){
            removeLast();
        }else{
            System.out.println(head.nama + " telah selesai divaksin");
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void print(){
        if(!isEmpty()){
            node tmp = head;
            System.out.println("=======================");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("=======================");
            System.out.println("|Nomor\t|Nama\t|");
            while(tmp != null){
                System.out.println("|" + tmp.nomor + "\t|" + tmp.nama + "\t|");
                tmp = tmp.next;
            }
            System.out.print("Sisa Antrian : " + size);
            System.out.println("");
        }else{
            System.out.println("Linked List Kosong");
        }
    }
    public void removeLast() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        }else if(head.next == null){
            head = null; //proses penghapusan head
            size--;
            return;
        }
        node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
}
