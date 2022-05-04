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
public class sLLMain {
   public static void main(String[] args) {
    singleLinkedlist singLL = new singleLinkedlist();
    
    singLL.addFirst("Bahasa");
    singLL.pre();
    singLL.print();
    singLL.addFirst("Android");
    singLL.pre();
    singLL.print();
    singLL.addFirst("Komputer");
    singLL.pre();
    singLL.print();
    singLL.addFirst("Basis Data");
    singLL.pre();
    singLL.print();
    singLL.addFirst("Matematika");
    singLL.pre();
    singLL.print();
    singLL.addFirst("Algoritma");
    singLL.pre();
    singLL.print();
    singLL.addFirst("Statistika");
    singLL.pre();
    singLL.print();
    singLL.addFirst("Multimedia");
    singLL.pre();
    singLL.print();
    
    System.out.println("=======================");
    System.out.println("||Hasil Linked List :||");
    System.out.println("=======================");
    System.out.println(" ");
    singLL.print();
    
    System.out.println("====================================================");
    System.out.println("Data pada indeks ke-1 = " +singLL.getData(1));
    System.out.println("Data " +singLL.getData(4) + " tersebut berada pada indeks ke-" +singLL.indexOf("Basis Data"));
    System.out.println("====================================================");
    System.out.println(" ");
    
    System.out.println("========================");
    System.out.println("||Remove Linked List :||");
    System.out.println("========================");
    System.out.println(" ");
    
    singLL.removeAt(0);
    singLL.print();
    singLL.removeFirst();
    singLL.print();
    singLL.removeLast();
    singLL.print();
    }
}
