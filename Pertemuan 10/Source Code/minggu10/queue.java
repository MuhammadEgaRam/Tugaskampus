/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu10;

/**
 *
 * @author EgaRam
 */
public class queue {
    int max, size, front, rear;
    int[] data;
    
    public queue(int n){
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }
    public boolean IsEmpty(){
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }
    public boolean IsFull(){
        if(size == max){
            return true;
        }else{
            return false;
        }
    }
    public void peek(){
        if(!IsEmpty()){
            System.out.println("Elemen terdepan : " + data[front]);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    public void print(){
        if(IsEmpty())
            System.out.println("Queue masih kosong");
        else{
            int i = front;
            while(i != rear){
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " "); //ceatk rear
            System.out.println("Jumlah elemen = " + size);
        }
    }
    public void clear(){
        if(!IsEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    public void Enqueue(int dt){
        int posisi = - 1;
        if(IsFull()){
            System.out.println("Queue sudah penuh"); //Queue overflow : kondisi yang dihasilkan dari mencoba menambahkan elemen ke queue yang sudah penuh
            System.exit(0);
        }else{
            if(IsEmpty()){
                front = rear = 0;
            }else{
                if(rear == max - 1){
                    rear = 0;
                }else{
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }
    public int Dequeue(){
        int dt = 0;
        if(IsEmpty()){
            System.out.println("Queue masih kosong"); //Queue underflow : kondisi yang dihasilkan dari mencoba menghapus elemen dariqueue yang masih kosong
            System.exit(0);
        }else{
            dt = data[front];
            size--;
            if(IsEmpty()){
                front = rear = -1;
            }else{
                if(front == max - 1){
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return dt;
    }
    public void peekPosition(int data){
        int i = front;
        boolean j = true;
        while(j){
            if(data == this.data[i]){
                System.out.println("Data : " + data + " Terdapat pada index ke-" + i);
                j = false;
            }
            i++;
        }
    }
    public void peekAt(int position){
    int e = front;
    boolean w = true;
        while(w){
            if(position == e){
                System.out.println("Data pada Index ke-" + e + " adalah : " + this.data[e]);
                w = false;
            }
            e++;
        }
    }
}

