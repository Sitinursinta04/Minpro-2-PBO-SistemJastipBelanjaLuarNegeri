/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lenovo
 */
public class JastipFashion extends PesananJastip {

    private String ukuran;
    private String warna;

    // Constructor
    public JastipFashion(
            String idPesanan,
            Pelanggan pelanggan,
            Barang barang,
            int jumlah,
            Pembayaran pembayaran,
            String statusPesanan,
            String ukuran,
            String warna) {

        super(
                idPesanan,
                pelanggan,
                barang,
                jumlah,
                pembayaran,
                statusPesanan
        );

        this.ukuran = ukuran;
        this.warna = warna;
    }

    // Getter
    public String getUkuran() {
        return ukuran;
    }

    public String getWarna() {
        return warna;
    }

    // Setter
    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Polymorphism
    @Override
    public void tampilkanData() {

        super.tampilkanData();

        System.out.println(
                "Ukuran          : " + ukuran
        );
        System.out.println(
                "Warna           : " + warna
        );
    }
}