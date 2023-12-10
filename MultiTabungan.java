/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belejaroop5;

/**
 *
 * @author agung
 */
public class MultiTabungan {
    private int saldo;
    private double audExchangeRate;
    private double usdExchangeRate;
    
    public MultiTabungan(int saldo, double audExchangeRate, double usdExchangeRate) {
        this.saldo = saldo;
        this.audExchangeRate = audExchangeRate;
        this.usdExchangeRate = usdExchangeRate;
    }

    public int getSaldo() {
        return saldo;
    }
    
    public void tambahUang(int jumlah, String mataUang) {
        if (mataUang.equals("AUD")) {
            saldo += jumlah * audExchangeRate;
        } else if (mataUang.equals("USD")) {
            saldo += jumlah * usdExchangeRate;
        } else {
            saldo += jumlah;
        }
    }
    
    public boolean ambilUang(int jumlah, String mataUang) {
        if (mataUang.equals("AUD")) {
            jumlah *= audExchangeRate;
        } else if (mataUang.equals("USD")) {
            jumlah *= usdExchangeRate;
        }
        if (saldo >= jumlah) {
            saldo -= jumlah;
            return true;
        }
        return false;
    }
    
    
}
