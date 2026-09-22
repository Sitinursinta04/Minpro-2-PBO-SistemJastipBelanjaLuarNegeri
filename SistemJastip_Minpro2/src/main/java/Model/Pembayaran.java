/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lenovo
 */
public class Pembayaran {

    private String metodePembayaran;
    private double biayaJastip;
    private double totalPembayaran;

    // Constructor
    public Pembayaran(
            String metodePembayaran,
            double biayaJastip,
            double totalPembayaran) {

        this.metodePembayaran = metodePembayaran;
        this.biayaJastip = biayaJastip;
        this.totalPembayaran = totalPembayaran;
    }

    // Getter
    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public double getBiayaJastip() {
        return biayaJastip;
    }

    public double getTotalPembayaran() {
        return totalPembayaran;
    }

    // Setter
    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    public void setBiayaJastip(double biayaJastip) {
        this.biayaJastip = biayaJastip;
    }

    public void setTotalPembayaran(double totalPembayaran) {
        this.totalPembayaran = totalPembayaran;
    }
}