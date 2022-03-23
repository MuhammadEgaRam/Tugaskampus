/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu5;

/**
 *
 * @author EgaRam
 */
public class Faktorial {
    public int nilai;
    
    int faktorialBF(int n){
        int fakto = 1;
        int i=1;
        while(i <= n){
            fakto *= i;
            i++;
        }
        return fakto;
    }
    int faktorialDC(int n){
        if(n==1){
            return 1;
        }else{
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}
