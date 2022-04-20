/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu9.tugas2;

/**
 *
 * @author EgaRam
 */
public class stok {

    int size;
    int top;
    struk data[];
    
    public stok(int size){
        this.size = size;
        data = new struk[size];
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
    public void push(struk stk){
        if(!IsFull()){
            top++;
            data[top] = stk;
        }else{
            System.out.println("Isi stack penuh!");
        }
    }
    public void pop(){
        if(!IsEmpty()){
            struk x = data[top];
            top--;
            System.out.println("Data yang keluar : " + x.nomor + " " + x.tanggal + " " + x.namabrg + " " + x.jumlah + " " + x.totharga);
        }else{
            System.out.println("Stack masih kosong");
        }
    }
    public void peek(){
        System.out.println("Elemen teratas : " + data[top].nomor + " " + data[top].tanggal + " " + data[top].namabrg + " " + data[top].jumlah + " " + data[top].totharga);
    }
    public void print(){
        System.out.println("Isi stack : ");
        for(int i = top; i >= 0; i--){
            System.out.println(data[i].nomor + " " + data[i].tanggal + " " + data[i].namabrg + " " + data[i].jumlah + " " + data[i].totharga);
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
        double hrgMin = data[0].totharga;
        int idn = 0;
        for (int i = 0; i <= top; i++) {
            if (hrgMin > data[i].totharga) {
                idn = i;
                hrgMin = data[i].totharga;
            }
        }
        System.out.println("Harga pakaian terendah adalah : " + data[idn].totharga);
        System.out.println("Nama Barang : " + data[idn].namabrg);
        System.out.println("Dengan Nomor : " + data[idn].nomor);
    }
}
