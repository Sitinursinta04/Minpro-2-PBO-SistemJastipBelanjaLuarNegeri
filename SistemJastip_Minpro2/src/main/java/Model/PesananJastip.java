/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lenovo
 */
public class PesananJastip {

    private String idPesanan;
    private Pelanggan pelanggan;
    private Barang barang;
    private int jumlah;
    private Pembayaran pembayaran;
    private String statusPesanan;

    // Constructor
    public PesananJastip(
            String idPesanan,
            Pelanggan pelanggan,
            Barang barang,
            int jumlah,
            Pembayaran pembayaran,
            String statusPesanan) {

        this.idPesanan = idPesanan;
        this.pelanggan = pelanggan;
        this.barang = barang;
        this.jumlah = jumlah;
        this.pembayaran = pembayaran;
        this.statusPesanan = statusPesanan;
    }

    // Getter
    public String getIdPesanan() {
        return idPesanan;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public Barang getBarang() {
        return barang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public Pembayaran getPembayaran() {
        return pembayaran;
    }

    public String getStatusPesanan() {
        return statusPesanan;
    }

    // Setter
    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setPembayaran(Pembayaran pembayaran) {
        this.pembayaran = pembayaran;
    }

    public void setStatusPesanan(String statusPesanan) {
        this.statusPesanan = statusPesanan;
    }

    // Menghitung subtotal harga barang
    public double hitungTotal() {
        return barang.getHarga() * jumlah;
    }

    // Method Overloading
    // Menghitung total pembayaran dengan biaya jastip
    public double hitungTotal(double biayaJastip) {
        return hitungTotal() + biayaJastip;
    }

    // Menampilkan data pesanan
    public void tampilkanData() {

        System.out.println("ID Pesanan   : " + idPesanan);

        System.out.println(
                "Nama Pelanggan   : "
                + pelanggan.getNamaPelanggan()
        );

        System.out.println(
                "No. Telepon      : "
                + pelanggan.getNomorTelepon()
        );

        System.out.println(
                "Nama Barang      : "
                + barang.getNamaBarang()
        );

        System.out.println(
                "Negara Asal      : "
                + barang.getNegaraAsal()
        );

        System.out.println(
                "Harga Barang     : Rp"
                + barang.getHarga()
        );

        System.out.println(
                "Berat Barang     : "
                + barang.getBerat()
                + " kg"
        );

        System.out.println(
                "Jumlah           : "
                + jumlah
        );

        System.out.println(
                "Biaya Jastip     : Rp"
                + pembayaran.getBiayaJastip()
        );

        System.out.println(
                "Total Pembayaran : Rp"
                + pembayaran.getTotalPembayaran()
        );

        System.out.println(
                "Status Pesanan   : "
                + statusPesanan
        );
    }

    // Menampilkan struk pesanan
    public void tampilkanStruk() {

        System.out.println("\n====================================");
        System.out.println("             STRUK JASTIP");
        System.out.println("======================================");

        System.out.println(
                "ID Pesanan       : " + idPesanan
        );

        System.out.println(
                "Pelanggan        : "
                + pelanggan.getNamaPelanggan()
        );

        System.out.println(
                "Barang           : "
                + barang.getNamaBarang()
        );

        System.out.println(
                "Negara Asal      : "
                + barang.getNegaraAsal()
        );

        System.out.println(
                "Harga Barang     : Rp"
                + barang.getHarga()
        );

        System.out.println(
                "Berat            : "
                + barang.getBerat()
                + " kg"
        );

        System.out.println(
                "Jumlah           : "
                + jumlah
        );

        System.out.println(
                "Biaya Jastip     : Rp"
                + pembayaran.getBiayaJastip()
        );

        System.out.println(
                "Metode Pembayaran: "
                + pembayaran.getMetodePembayaran()
        );

        System.out.println(
                "--------------------------------------"
        );

        System.out.println(
                "Total Pembayaran : Rp"
                + pembayaran.getTotalPembayaran()
        );

        System.out.println(
                "Status           : "
                + statusPesanan
        );

        System.out.println("==================================");
    }
}