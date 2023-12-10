/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belejaroop5;

/**
 *
 * @author agung
 */
public class Mahasiswa {
    private int nrp;
    private String nama;
    
    public Mahasiswa(){
        this.nrp = 0;
        this.nama = "";
    }
    
    public Mahasiswa(String nama){
        this.nrp = 0;
        this.nama = nama;
    }
    
    public Mahasiswa(int nrp, String nama){
        this.nrp = nrp;
        this.nama = nama;
    }
    
    public int getNrp(){
        return this.nrp;
    }
    
    public String getNama(){
        return this.nama;
    }
    
}
