/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu11.Tugas2;

/**
 *
 * @author EgaRam
 */
public class singleLinkedlist {
    node head; //posisi awal linked list
    node tail; //posisi akhir linked list
    
    public boolean isEmpty(){
        return head == null;
    }
    public void pre(){
    if(!isEmpty()){
        node tmp = head;
        System.out.println("Berhasil menambahkan data : " + tmp.data);
    }
    }
    public void print(){
    if(!isEmpty()){
        node tmp = head;
        while(tmp != null){
            System.out.println(tmp.data + "\t");
            tmp = tmp.next;
        }
        System.out.println(" ");
    }else{
        System.out.println("Linked list kosong");
    }
    }
    public void addFirst(String input){
        node ndInput = new node(input, null);
        if(isEmpty()){ //jika linked list kosong
            head = ndInput; //head dan tail sama dengan node input
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }
    public int indexOf(String key){
        node tmp = head;
        int index = 0;
        while(tmp != null && tmp.data != key){
            tmp = tmp.next;
            index++;
        }
        if(tmp == null){
            return -1;
        }else{
            return index;
        }
    }
    public String getData(int index){
        node tmp = head;
        for(int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public void removeFirst(){
        node tmp = head;
        if(isEmpty()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        }else if(head == tail){
            head = tail = null;
        }else{
            head = head.next;
        }
        System.out.println("Menghapus Data : " + tmp.data);
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
            System.out.println("Menghapus Data : " + tmp.data);
        }
    }
    public void remove(String key){
        if(isEmpty()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        }else{
            node temp = head;
            while(temp != null){
                if((temp.data == key) && (temp == head)){
                    this.removeFirst();
                    break;
                }else if(temp.next.data == key){
                    temp.next = temp.next.next;
                    if(temp.next == null){
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }
    public void removeAt(int index){
        if(index == 0){
            removeFirst();
        }else{
            node temp = head;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(temp.next == null){
                tail = temp;
            }
        }
    }
}