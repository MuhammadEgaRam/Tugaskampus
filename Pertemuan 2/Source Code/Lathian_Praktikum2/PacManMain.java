/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lathian_Praktikum2;
import java.util.Scanner;
public class PacManMain {
    public static void main(String[] args) {
        PacMan runner = new PacMan(1, 1, 5, 5);
        Scanner sc = new Scanner(System.in);
        
        runner.printPosition();
        loop : while(true){
            switch(sc.nextLine()){
                case "a" :
                    runner.moveLeft();
                    break;
                case "d" :
                    runner.moveRight();
                    break;
                case "w" :
                    runner.moveUp();
                    break;
                case "s" :
                    runner.moveDown();
                    break;
                case "keluar" :
                    System.out.println("Game Selesai");
                    break loop;
            }
        }
    }
    
}
