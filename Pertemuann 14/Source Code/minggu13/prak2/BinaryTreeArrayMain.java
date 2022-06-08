/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu13.prak2;

/**
 *
 * @author EgaRam
 */
public class BinaryTreeArrayMain {
    public static void main(String[] args) {
    BinaryTreeArray bta = new BinaryTreeArray();
    int[] data = {6,4,8,3,5,7,9,0,0,0};
    int idxLast = 6;
    bta.populateData(data, idxLast);
    bta.traverseInOrder(0);
    
        System.out.println("--------------------------------");
        System.out.println("       Hasil Run 5              ");
        System.out.println("--------------------------------");
        bta.add(45);
        bta.add(25);
        System.out.println("Method Traverse Pre Order");
        bta.traversePreOrder(0);
        System.out.println();
        System.out.println("Method Traverse Post Order");
        bta.traversePostOrder(0);
        System.out.println();
    }
}
