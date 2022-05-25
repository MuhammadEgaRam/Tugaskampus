/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu12;

/**
 *
 * @author EgaRam
 */
public class node {
    int data;
    node prev, next;
    
    node(node prev, int data, node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
