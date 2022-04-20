/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu9;
import java.util.Scanner;
/**
 *
 * @author EgaRam
 */
public class StackMain {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    stack stk = new stack(5);
    
    char pilih;
    do{
        System.out.println("+==================================================================+");
        System.out.println("|\t\t\t\t Menu  \t\t\t\t   |");
        System.out.println("+==================================================================+\n");
        System.out.println("[1] Push Barang\t\t");
        System.out.println("[2] Pop Barang\t\t");
        System.out.println("[3] Peek Barang\t\t");
        System.out.println("[4] Print Barang\t\t");
        System.out.println("[5] List Harga Terkecil\t\t");
        System.out.println("[6] Keluar Dari Program\t\t");
        System.out.print("Pilih Menu : ");
        int pilihan = sc.nextInt();
        
        switch(pilihan){
            case 1 :
                 do{
                    System.out.print("Jenis : ");
                    String jenis = sc.next();
                    System.out.print("Warna : ");
                    String warna = sc.next();
                    System.out.print("Merk : ");
                    String merk = sc.next();
                    System.out.print("Ukuran : ");
                    String ukuran = sc.next();
                    System.out.print("Harga : ");
                    double harga = sc.nextDouble();
        
                    pakaian p = new pakaian(jenis, warna, merk, ukuran, harga);
                    System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
                    pilih = sc.next().charAt(0);
                    sc.nextLine(); //mengabaikan karakter new line
                    stk.push(p);
                }while(pilih == 'y'); 
                break;
            
            case 2 :
                stk.pop();
                break;
            
            case 3 :
                stk.peek();
                break;
                
            case 4 :
                stk.print();
                break;   
            
            default :
                System.out.print("Yang Anda inputkan salah!");
                System.exit(0);
                
            case 5 :
                stk.getMin();
                break;
            
            case 6 :
                System.out.print("Terimakasih");
                System.exit(0);
        }
    }while(true);   
}
}

