/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu10.Latihan2;

/**
 *
 * @author EgaRam
 */
public class queue {
    Mahasiswa antrian[];
    int front, rear, size, max;
    
    public queue(int n){
    max = n;
    antrian = new Mahasiswa[max];
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
            System.out.println("Elemen terdepan : " + antrian[front].nim + " | " + antrian[front].nama + " | " + antrian[front].absen + " | " + antrian[front].ipk);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    public void print(){
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            int i = front;
            while(i != rear){
                System.out.println("Elemen terdepan : " + antrian[i].nim + " | " + antrian[i].nama + " | " + antrian[i].absen + " | " + antrian[i].ipk);
                i = (i + 1) % max;
            }
             System.out.println("Elemen terdepan : " + antrian[i].nim + " | " + antrian[i].nama + " | " + antrian[i].absen + " | " + antrian[i].ipk);
            System.out.println("Jumlah elemen = " + size);
        }
    }
    public void Enqueue(Mahasiswa dt){
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
            antrian[rear] = dt;
            size++;
        }
    }
    public Mahasiswa Dequeue(){
        Mahasiswa dt = new Mahasiswa();
        if(IsEmpty()){
            System.out.println("Queue masih kosong"); //Queue underflow : kondisi yang dihasilkan dari mencoba menghapus elemen dariqueue yang masih kosong
            System.exit(0);
        }else{
            dt = antrian[front];
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
    public void peekRear(){
        if(!IsEmpty()){
            System.out.println("Elemen terbelakang : " + antrian[rear].nim + " | " + antrian[rear].nama + " | " + antrian[rear].absen + " | " + antrian[rear].ipk);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    public void peekPosition(String nim){
        int i = front;
        boolean j = true;
        while(j){
            if(nim.equals(this.antrian[i].nim)){
                System.out.println("NIM Mahasiswa : " + antrian[i].nim + " Terdapat pada index ke-" + i);
                j = false;
            }
            i++;
        }
    }
    public void printMahasiswa(int posisi){
    int e = front;
    boolean w = true;
        while(w){
            if(posisi == e){
                System.out.println("Data pada Index ke-" + e + " adalah : " + this.antrian[e].nama);
                w = false;
            }
            e++;
        }
    }
}
