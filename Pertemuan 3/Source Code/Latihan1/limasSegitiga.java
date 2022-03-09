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
public class limasSegitiga {
    double alas, tinggi, sisiTegak;

public double hitungLuasPermukaan(){
    return alas*tinggi/2 + 3*sisiTegak;
}
public double hitungVolume(){
    return (0.5*(0.5*alas*tinggi)*tinggi);
}
}
