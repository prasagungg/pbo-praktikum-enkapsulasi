/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belejaroop5;

/**
 *
 * @author agung
 */
public class Truk {
    private double muatan;
    private double muatanmaks;
    
    public Truk(double beratmaks){
        this.muatanmaks = kiloToNewts(beratmaks);
    }
    
    public double getMuatan() {
        return newtsToKilo(this.muatan);
    }
    
    public double getMuatanMaks() {
        return newtsToKilo(this.muatanmaks);
    }
    
     public boolean tambahMuatan(double berat) {
         
         double totalMuatan = this.getMuatan() + berat;
         
         if(totalMuatan <= this.getMuatanMaks()){
             this.muatan = kiloToNewts(totalMuatan);
             return true;
         }
         
         return false;
    }
    
    public double newtsToKilo(double berat){
        return berat / 9.8;
    }
    
    public double kiloToNewts(double berat){
        return berat * 9.8;
    }
    
}
