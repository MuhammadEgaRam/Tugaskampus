/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu9.Prak2;
import java.util.Scanner;
/**
 *
 * @author EgaRam
 */
public class postfixMain {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String P, Q;
        System.out.println("Masukkan ekspresi matematika (infix) : ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")"; //digunakan untuk memastikan semua simbol/karakter yang masih berada di stack setelah semua persamaan terbaca, akan dikeluarkan dan dipindahkan ke postfix.
    
    int total = Q.length();
    postfix post = new postfix(total);
    P = post.konversi(Q);
        System.out.println("Posftix : " + P);
    }
}
