/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;
import java.util.Scanner;
public class latihan3Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner st = new Scanner(System.in);
        Scanner sb = new Scanner(System.in);
        latihan3 [] l3 = new latihan3[3];
    
    for(int i = 0; i<3 ; i++){
        l3[i] = new latihan3();
            System.out.println("Masukkan data mahasiswa ke- " +(i+1));
            System.out.print("Masukkan nama : ");
            l3[i].nama = sc.nextLine();
            System.out.print("Masukkan nim : ");
            l3[i].nim = st.nextInt();
            System.out.print("Masukkan jenis kelamin : ");
            l3[i].jk = sc.nextLine();
            System.out.print("Masukkan IPK : ");
            l3[i].ipk = sb.nextDouble();
            System.out.println();
    }
    for(int i = 0; i<3; i++){
        System.out.println("Data mahasiswa ke-" +(i+1));
        System.out.println("nama : " + l3[i].nama);
        System.out.println("nim : " + l3[i].nim);
        System.out.println("Jenis Kelamin : " + l3[i].jk);
        System.out.println("Nilai IPK : " + l3[i].ipk);
        System.out.println();
    }
    }
}
