/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis;

/**
 *
 * @author EgaRam
 */
public class Pacman {
    int pil;
    
    
    public int hitungKekuatan(int n){
        return hitungKekuatan2()+n;
    }
    public int hitungKekuatan2(){
        return pil*10;
    }
}

