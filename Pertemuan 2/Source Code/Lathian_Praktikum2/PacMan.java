/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lathian_Praktikum2;

/**
 *
 * @author EgaRam
 */
public class PacMan {
    int x,y,width,height;
    
    PacMan(){
    }
    PacMan(int xh, int yv, int w, int h){
        x = xh;
        y = yv;
        width = w;
        height = h;
    }
           
    void moveLeft(){
        if(x > 1)x--;
        printPosition();
    }
    void moveRight(){
        if(x < width)x++;
        printPosition();
    }
    void moveUp(){
        if(y > 1)y--;
        printPosition();
    }
    void moveDown(){  
        if(y < height)y++;
        printPosition();
    } 
    void printPosition(){ 
        for(int e = 0; e <= height; e++){
            for(int g = 0; g <= width; g++){
                if(e == 0 || e == height || g == 0 || g == width){
                    System.out.print("_  ");
                }else if(e == y && g == x){
                    System.out.print("@  ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    
    }
}
