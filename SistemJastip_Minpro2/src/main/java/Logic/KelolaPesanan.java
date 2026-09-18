/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.util.ArrayList;
import Model.PesananJastip;
import Model.JastipFashion;
import Model.JastipSkincare;
import Model.Pelanggan;
import Model.Barang;
import Model.Pembayaran;

/**
 *
 * @author Lenovo
 */
public class KelolaPesanan {

    private ArrayList<PesananJastip> daftarPesanan;

    // Constructor
    public KelolaPesanan() {

        daftarPesanan = new ArrayList<>();

        // DUMMY DATA FASHION
        Pelanggan pelanggan1 = new Pelanggan(
                "PLG001",
                "Sinta",
                "081234567890"
        );

        Barang barang1 = new Barang(
                "Nike Air Force 1 '07",
                "Amerika Serikat",
                2500000,
                1.5
        );

        Pembayaran pembayaran1 = new Pembayaran(
                "Transfer Bank",
                75000,
                2575000
        );

        daftarPesanan.add(
                new JastipFashion(
                        "FSH-001",
                        pelanggan1,
                        barang1,
                        1,
                        pembayaran1,
                        "Menunggu Pembayaran",
                        "39",
                        "Putih"
                )
        );

        // DUMMY DATA SKINCARE
        Pelanggan pelanggan2 = new Pelanggan(
                "PLG002",
                "Aisyah",
                "081298765432"
        );

        Barang barang2 = new Barang(
                "Laneige Water Sleeping Mask",
                "Korea Selatan",
                450000,
                0.5
        );

        Pembayaran pembayaran2 = new Pembayaran(
                "E-Wallet",
                25000,
                475000
        );

        daftarPesanan.add(
                new JastipSkincare(
                        "SKN-001",
                        pelanggan2,
                        barang2,
                        1,
                        pembayaran2,
                        "Pembayaran Berhasil",
                        "Normal",
                        70
                )
        );
    }

    // GENERATE ID FASHION
    public String generateIdFashion() {

        int nomor = 1;
        String id;

        do {

            id = String.format(
                    "FSH-%03d",
                    nomor
            );

            nomor++;

        } while (cariPesanan(id) != null);

        return id;
    }

    // GENERATE ID SKINCARE
    public String generateIdSkincare() {

        int nomor = 1;
        String id;

        do {

            id = String.format(
                    "SKN-%03d",
                    nomor
            );

            nomor++;

        } while (cariPesanan(id) != null);

        return id;
    }

    // CREATE
    public void tambahPesanan(
            PesananJastip pesanan) {

        daftarPesanan.add(pesanan);

        System.out.println(
                "Pesanan berhasil ditambahkan."
        );
    }

    // READ
    public void tampilkanPesanan() {

        if (daftarPesanan.isEmpty()) {

            System.out.println(
                    "Belum ada pesanan."
            );

        } else {

            System.out.println(
                    "\n======== DAFTAR PESANAN ========"
            );

            for (PesananJastip pesanan
                    : daftarPesanan) {

                System.out.println(
                        "-------------------------------"
                );

                pesanan.tampilkanData();
            }
        }
    }

    // CARI PESANAN
    public PesananJastip cariPesanan(
            String id) {

        for (PesananJastip pesanan
                : daftarPesanan) {

            if (pesanan.getIdPesanan()
                    .equalsIgnoreCase(id)) {

                return pesanan;
            }
        }

        return null;
    }

    // UPDATE
    public void ubahPesanan(
            String id,
            Pelanggan pelanggan,
            Barang barang,
            int jumlah,
            Pembayaran pembayaran) {

        PesananJastip pesanan =
                cariPesanan(id);

        if (pesanan != null) {

            pesanan.setPelanggan(
                    pelanggan
            );

            pesanan.setBarang(
                    barang
            );

            pesanan.setJumlah(
                    jumlah
            );

            pesanan.setPembayaran(
                    pembayaran
            );

            System.out.println(
                    "Pesanan berhasil diubah."
            );

        } else {

            System.out.println(
                    "Pesanan tidak ditemukan."
            );
        }
    }

    // UPDATE STATUS
    public void ubahStatusPesanan(
            String id,
            String statusBaru) {

        PesananJastip pesanan =
                cariPesanan(id);

        if (pesanan != null) {

            pesanan.setStatusPesanan(
                    statusBaru
            );

            System.out.println(
                    "Status pesanan berhasil diubah."
            );

        } else {

            System.out.println(
                    "Pesanan tidak ditemukan."
            );
        }
    }

    // DELETE
    public void hapusPesanan(
            String id) {

        PesananJastip pesanan =
                cariPesanan(id);

        if (pesanan != null) {

            daftarPesanan.remove(
                    pesanan
            );

            System.out.println(
                    "Pesanan berhasil dihapus."
            );

        } else {

            System.out.println(
                    "Pesanan tidak ditemukan."
            );
        }
    }

    // STRUK PESANAN
    public void tampilkanStruk(
            String id) {

        PesananJastip pesanan =
                cariPesanan(id);

        if (pesanan != null) {

            pesanan.tampilkanStruk();

        } else {

            System.out.println(
                    "Pesanan tidak ditemukan."
            );
        }
    }

    // RINGKASAN PESANAN
    public void tampilkanRingkasan() {

        int totalPesanan =
                daftarPesanan.size();

        int totalFashion = 0;
        int totalSkincare = 0;

        double totalBerat = 0;
        double totalPembayaran = 0;

        for (PesananJastip pesanan
                : daftarPesanan) {

            if (pesanan
                    instanceof JastipFashion) {

                totalFashion++;

            } else if (pesanan
                    instanceof JastipSkincare) {

                totalSkincare++;
            }

            totalBerat +=
                    pesanan.getBarang()
                            .getBerat()
                    * pesanan.getJumlah();

            totalPembayaran +=
                    pesanan.getPembayaran()
                            .getTotalPembayaran();
        }

        System.out.println(
                "\n====================================="
        );
        System.out.println(
                "          RINGKASAN PESANAN"
        );
        System.out.println(
                "======================================"
        );

        System.out.println(
                "Total Pesanan     : "
                + totalPesanan
        );

        System.out.println(
                "Total Fashion     : "
                + totalFashion
        );

        System.out.println(
                "Total Skincare    : "
                + totalSkincare
        );

        System.out.println(
                "Total Berat       : "
                + totalBerat
                + " kg"
        );

        System.out.println(
                "Total Pembayaran  : Rp"
                + totalPembayaran
        );

        System.out.println(
                "======================================"
        );
    }
}