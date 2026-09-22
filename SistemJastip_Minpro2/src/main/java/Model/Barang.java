/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lenovo
 */
public class Barang {

    private String namaBarang;
    private String negaraAsal;
    private double harga;
    private double berat;

    // Constructor
    public Barang(
            String namaBarang,
            String negaraAsal,
            double harga,
            double berat) {

        this.namaBarang = namaBarang;
        this.negaraAsal = negaraAsal;
        this.harga = harga;
        this.berat = berat;
    }

    // Getter
    public String getNamaBarang() {
        return namaBarang;
    }

    public String getNegaraAsal() {
        return negaraAsal;
    }

    public double getHarga() {
        return harga;
    }

    public double getBerat() {
        return berat;
    }

    // Setter
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setNegaraAsal(String negaraAsal) {
        this.negaraAsal = negaraAsal;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }
}