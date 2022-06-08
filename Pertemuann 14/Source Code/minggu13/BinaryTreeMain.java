/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu13;

/**
 *
 * @author EgaRam
 */
public class BinaryTreeMain {
    public static void main(String[] args) {
    BinaryTree bt = new BinaryTree();
    
    bt.add(6);
    bt.add(4);
    bt.add(8);
    bt.add(3);
    bt.add(5);
    bt.add(7);
    bt.add(9);
    bt.add(10);
    bt.add(15);
    bt.recursion(72);
    
    bt.traversePreOrder(bt.root);
        System.out.println("");
    bt.traverseInOrder(bt.root);
        System.out.println("");
    bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find " + bt.find(5));
    bt.delete(8);
    bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.println("--------------------------");
        System.out.println("Data Terbesar : ");
    bt.max();
        System.out.println("--------------------------");
        System.out.println("Data Terkecil : ");
    bt.min();
        System.out.println("--------------------------");
        System.out.println("Data yang ada di left : ");
    bt.printleft(bt.root);
        System.out.println();
        System.out.println("Jumlah data yang ada di left : " + bt.jumlahleft());
    }
}
