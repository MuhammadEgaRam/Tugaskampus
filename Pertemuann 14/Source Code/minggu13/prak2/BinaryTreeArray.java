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
public class BinaryTreeArray {
    int[] data;
    int idxLast;
    
    public BinaryTreeArray(){
        data = new int[10];
    }
    void populateData(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }
    void traverseInOrder(int idxStart){
        if(idxStart <= idxLast){
            traverseInOrder(2*idxStart+1);
            System.out.println(data[idxStart] + " ");
            traverseInOrder(2*idxStart+2);
        }
    }
    //Soal No 5
    void add(int data){
        if(idxLast == this.data.length - 1){
            System.out.println("Tree Array sudah penuh");
        }else{
            this.data[++idxLast] = data;
        }
    }
    void traversePreOrder(int idxStart){
        if(idxStart <= idxLast){
            System.out.print(" " + data[idxStart]);
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
    void traversePostOrder(int idxStart){
        if(idxStart <= idxLast){
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(" " + data[idxStart]);
        }
    }
}
