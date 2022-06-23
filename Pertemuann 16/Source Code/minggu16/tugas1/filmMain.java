/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu16.tugas1;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author EgaRam
 */


public class filmMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        Scanner rt = new Scanner(System.in);
        
        
        Stack<film> data = new Stack<>();
        
        char pilih;
        int menu;
        do {
            System.out.println("====================================");
            System.out.println("Data Film Layar Lebar Sepanjang Masa");
            System.out.println("====================================");
            System.out.println("1. Input Judul Film");
            System.out.println("2. Hapus Data Film Teratas");
            System.out.println("3. Cek Judul Film Teratas");
            System.out.println("4. Info semua Judul Film");
            System.out.println("5. Keluar");
            System.out.println("====================================\n");
            System.out.print("Masukkan Pilihan Menu (1-5): ");
            menu = in.nextInt();
            System.out.println("");
            if (menu < 1 || menu > 5) {
                System.out.println("Masukkan Pilihan Menu Yang Benar!");
            }
            
            switch(menu){
                case 1 : {
                    do{
                    System.out.println("=======================================");
                    System.out.print("ID Film\t\t: ");
                    String id = sc.nextLine();
                    System.out.print("Judul Film\t: ");
                    String judul = sc.nextLine();
                    System.out.print("Tahun Tayang\t: ");
                    String tahun = sc.nextLine();
                    System.out.print("Director\t\t: ");
                    String director = sc.nextLine();
                    film put = new film(id, judul, tahun, director);
                    data.push(put);
                    System.out.print("Apakah anda ingin menambah data baru?(y/n) : ");
                    pilih = rt.next().charAt(0);
                    System.out.println("");
                }while (pilih == 'y' || pilih == 'Y');
            }break;
            
                case 2 : {
                    System.out.println("==========================================");
                    System.out.println("    Hasil Menghapus Data Film Terartas    ");
                    System.out.println("==========================================");
                    System.out.println(data.pop());
                    System.out.println("");
                }break;
                
                case 3 : {
                    System.out.println("==========================================");
                    System.out.println("            Judul Film Teratas            ");
                    System.out.println("==========================================");
                    System.out.println(data.peek());
                    System.out.println("");
                }break;
                
                case 4 : {
                    System.out.println("==========================================");
                    System.out.println("          Info Semua Judul Film           ");
                    System.out.println("==========================================");
                    for(int i = 0; i<data.size(); i++){
                        System.out.println(data.get(i));
                    }
                    System.out.println("");
                }break;
                
                case 5 : {
                    System.out.print("Terimakasih");
                    System.exit(0);
                }break;
        }
    }while(true);
}
}
