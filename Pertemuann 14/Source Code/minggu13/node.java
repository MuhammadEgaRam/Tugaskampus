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
public class node {
    int data;
    node left;
    node right;
    
    public node(){
    }
    public node(int data){
        this.left = null;
        this.data = data;
        this.right = null;
    }
}
