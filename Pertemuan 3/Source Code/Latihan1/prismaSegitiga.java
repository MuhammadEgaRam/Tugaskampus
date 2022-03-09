/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author EgaRam
 */
public class prismaSegitiga {
    double alasP, tinggiP, sisiTegakP;
    
public double hitungLuasPermukaanP(){
    return ((alasP*3) * tinggiP + 2 * 1/(float)2 * alasP * tinggiP);
}
public double hitungVolumeP(){
    return ((1/(float)2 * alasP * tinggiP) * tinggiP);
}
}
