/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu9;

/**
 *
 * @author EgaRam
 */
public class stack {
    int size;
    int top;
    pakaian data[];
    
    public stack(int size){
        this.size = size;
        data = new pakaian[size];
        top = -1; //menandakan stacknya masih kosong jika -1
    }
    public boolean IsEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }
    public boolean IsFull(){
        if(top == size - 1){
            return true;
        }else{
            return false;
        }
    }
    public void push(pakaian pkn){
        if(!IsFull()){
            top++;
            data[top] = pkn;
        }else{
            System.out.println("Isi stack penuh!");
        }
    }
    public void pop(){
        if(!IsEmpty()){
            pakaian x = data[top];
            top--;
            System.out.println("Data yang keluar : " + x.jenis + " " + x.warna + " " + x.merk + " " + x.ukuran + " " + x.harga);
        }else{
            System.out.println("Stack masih kosong");
        }
    }
    public void peek(){
        System.out.println("Elemen teratas : " + data[top].jenis + " " + data[top].warna + " " + data[top].merk + " " + data[top].ukuran + " " + data[top].harga);
    }
    public void print(){
        System.out.println("Isi stack : ");
        for(int i = top; i >= 0; i--){
            System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " " + data[i].harga);
        }
        System.out.println("");
    }
    public void clear(){
        if(!IsEmpty()){
            for(int i = top; i >= 0; i--){
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        }else{
            System.out.println("Stack masih kosong");
        }
    }
    
    public void getMin() {
        double hrgMin = data[0].harga;
        int idn = 0;
        for (int i = 0; i <= top; i++) {
            if (hrgMin > data[i].harga) {
                idn = i;
                hrgMin = data[i].harga;
            }
        }
        System.out.println("Harga pakaian terendah adalah : " + data[idn].harga);
        System.out.println("Dengan jenis : " + data[idn].jenis);
        System.out.println("Bermerk : " + data[idn].merk);
    }
}
