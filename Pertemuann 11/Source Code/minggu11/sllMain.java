/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu11;

/**
 *
 * @author EgaRam
 */
public class sllMain {
    public static void main(String[] args) {
    singlelinkedlist singLL = new singlelinkedlist();
    
    singLL.print();
    singLL.addFirst("A");
    singLL.print();
    singLL.addLast("E");
    singLL.print();
    singLL.insertAfter("A", "B");
    singLL.print();
    singLL.insertAt(2, "C");
    singLL.print();
    singLL.insertBefore("E", "D");
    singLL.print();
    
    System.out.println("Data pada indeks ke-1 = " +singLL.getData(1));
    System.out.println("Data 3 berada pada indeks ke-" +singLL.indexOf("A"));
    
    singLL.removeAt(0);
    singLL.print();
    singLL.removeFirst();
    singLL.print();
    singLL.removeLast();
    singLL.print();
    }
}
