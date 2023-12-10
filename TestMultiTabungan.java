/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belejaroop5;

/**
 *
 * @author agung
 */
public class TestMultiTabungan {
     public static void main(String[] args) {
        MultiTabungan tabungan = new MultiTabungan(1000000, 10000, 9000);
        System.out.println("Saldo awal: " + tabungan.getSaldo());
        tabungan.tambahUang(100, "AUD");
        System.out.println("Saldo setelah menambah 100 AUD: " + tabungan.getSaldo());
        tabungan.tambahUang(100, "USD");
        System.out.println("Saldo setelah menambah 100 USD: " + tabungan.getSaldo());
        tabungan.ambilUang(500000, "IDR");
        System.out.println("Saldo setelah mengambil 500000 IDR: " + tabungan.getSaldo());
        tabungan.ambilUang(100, "AUD");
        System.out.println("Saldo setelah mengambil 100 AUD: " + tabungan.getSaldo());
        tabungan.ambilUang(100, "USD");
        System.out.println("Saldo setelah mengambil 100 USD: " + tabungan.getSaldo());
    }
}
