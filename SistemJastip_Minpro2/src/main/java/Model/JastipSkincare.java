/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lenovo
 */
public class JastipSkincare extends PesananJastip {

    private String jenisKulit;
    private int ukuranProduk;

    // Constructor
    public JastipSkincare(
            String idPesanan,
            Pelanggan pelanggan,
            Barang barang,
            int jumlah,
            Pembayaran pembayaran,
            String statusPesanan,
            String jenisKulit,
            int ukuranProduk) {

        super(
                idPesanan,
                pelanggan,
                barang,
                jumlah,
                pembayaran,
                statusPesanan
        );

        this.jenisKulit = jenisKulit;
        this.ukuranProduk = ukuranProduk;
    }

    // Getter
    public String getJenisKulit() {
        return jenisKulit;
    }

    public int getUkuranProduk() {
        return ukuranProduk;
    }

    // Setter
    public void setJenisKulit(String jenisKulit) {
        this.jenisKulit = jenisKulit;
    }

    public void setUkuranProduk(int ukuranProduk) {
        this.ukuranProduk = ukuranProduk;
    }

    // Polymorphism
    @Override
    public void tampilkanData() {

        super.tampilkanData();

        System.out.println(
                "Jenis Kulit     : " + jenisKulit
        );
        System.out.println(
                "Ukuran Produk   : "
                + ukuranProduk
                + " ml"
        );
    }
}