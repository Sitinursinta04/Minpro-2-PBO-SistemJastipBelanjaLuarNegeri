/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lenovo
 */
public class Pelanggan {

    private String idPelanggan;
    private String namaPelanggan;
    private String nomorTelepon;

    // Constructor
    public Pelanggan(
            String idPelanggan,
            String namaPelanggan,
            String nomorTelepon) {

        this.idPelanggan = idPelanggan;
        this.namaPelanggan = namaPelanggan;
        this.nomorTelepon = nomorTelepon;
    }

    // Getter
    public String getIdPelanggan() {
        return idPelanggan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    // Setter
    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }
}