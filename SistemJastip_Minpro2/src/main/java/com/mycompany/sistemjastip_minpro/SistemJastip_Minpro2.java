/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemjastip_minpro;

import java.util.Scanner;
import Model.PesananJastip;
import Model.JastipFashion;
import Model.JastipSkincare;
import Model.Pelanggan;
import Model.Barang;
import Model.Pembayaran;
import Logic.KelolaPesanan;
import Helper.ValidasiInput;

/**
 *
 * @author Lenovo
 */
public class SistemJastip_Minpro2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        KelolaPesanan kelola = new KelolaPesanan();
        ValidasiInput input = new ValidasiInput(scanner);

        int pilihan;

        do {

            System.out.println("\n========================================");
            System.out.println("       SISTEM JASA TITIP LUAR NEGERI");
            System.out.println("==========================================");
            System.out.println("1. Tambah Pesanan");
            System.out.println("2. Lihat Pesanan");
            System.out.println("3. Ubah Pesanan");
            System.out.println("4. Hapus Pesanan");
            System.out.println("5. Lihat Struk");
            System.out.println("6. Ubah Status");
            System.out.println("7. Ringkasan Pesanan");
            System.out.println("8. Keluar");
            System.out.println("==========================================");

            pilihan = input.inputInteger(
                    "Pilih menu: ",
                    1,
                    8
            );

            scanner.nextLine();

            switch (pilihan) {

                
                // 1. TAMBAH PESANAN
                case 1:

                    System.out.println(
                            "\n========== TAMBAH PESANAN =========="
                    );

                    System.out.println("1. Jastip Fashion");
                    System.out.println("2. Jastip Skincare");

                    int jenis = input.inputInteger(
                            "Pilih jenis jastip: ",
                            1,
                            2
                    );

                    scanner.nextLine();

                    String id;

                    if (jenis == 1) {
                        id = kelola.generateIdFashion();
                    } else {
                        id = kelola.generateIdSkincare();
                    }

                    System.out.println(
                            "\nID Pesanan : " + id
                    );

                    // Data pelanggan
                    String namaPelanggan =
                            input.inputString(
                                    "Nama Pelanggan : ",
                                    2,
                                    30
                            );

                    String nomorTelepon =
                            input.inputString(
                                    "No. Telepon    : ",
                                    10,
                                    15
                            );

                    Pelanggan pelanggan =
                            new Pelanggan(
                                    "PLG-"
                                    + System.currentTimeMillis(),
                                    namaPelanggan,
                                    nomorTelepon
                            );

                    // Data barang
                    String namaBarang =
                            input.inputString(
                                    "Nama Barang    : ",
                                    2,
                                    50
                            );

                    String negaraAsal =
                            input.inputString(
                                    "Negara Asal    : ",
                                    2,
                                    30
                            );

                    double harga =
                            input.inputDouble(
                                    "Harga Barang   : Rp",
                                    1000,
                                    100000000
                            );

                    double berat =
                            input.inputDouble(
                                    "Berat Barang   : ",
                                    0.1,
                                    100
                            );

                    int jumlah =
                            input.inputInteger(
                                    "Jumlah         : ",
                                    1,
                                    100
                            );

                    scanner.nextLine();

                    Barang barang =
                            new Barang(
                                    namaBarang,
                                    negaraAsal,
                                    harga,
                                    berat
                            );

                    // Menghitung biaya jastip
                    double biayaJastip =
                            berat * jumlah * 50000;

                    System.out.println(
                            "\nBiaya Jastip : Rp"
                            + biayaJastip
                    );

                    // Metode pembayaran
                    System.out.println(
                            "\nMetode Pembayaran"
                    );
                    System.out.println(
                            "1. Transfer Bank"
                    );
                    System.out.println(
                            "2. E-Wallet"
                    );

                    int metode =
                            input.inputInteger(
                                    "Pilih metode: ",
                                    1,
                                    2
                            );

                    scanner.nextLine();

                    String metodePembayaran;

                    if (metode == 1) {
                        metodePembayaran =
                                "Transfer Bank";
                    } else {
                        metodePembayaran =
                                "E-Wallet";
                    }

                    double totalPembayaran =
                            (harga * jumlah)
                            + biayaJastip;

                    Pembayaran pembayaran =
                            new Pembayaran(
                                    metodePembayaran,
                                    biayaJastip,
                                    totalPembayaran
                            );

                    // Status awal
                    String statusPesanan =
                            "Menunggu Pembayaran";

                    PesananJastip pesanan;

                    // JASTIP FASHION
                    if (jenis == 1) {

                        String ukuran =
                                input.inputString(
                                        "Ukuran         : ",
                                        1,
                                        10
                                );

                        String warna =
                                input.inputString(
                                        "Warna          : ",
                                        2,
                                        20
                                );

                        pesanan =
                                new JastipFashion(
                                        id,
                                        pelanggan,
                                        barang,
                                        jumlah,
                                        pembayaran,
                                        statusPesanan,
                                        ukuran,
                                        warna
                                );

                    // JASTIP SKINCARE
                    } else {

                        String jenisKulit =
                                input.inputString(
                                        "Jenis Kulit    : ",
                                        2,
                                        20
                                );

                        int ukuranProduk =
                                input.inputInteger(
                                        "Ukuran Produk (ml): ",
                                        1,
                                        5000
                                );

                        scanner.nextLine();

                        pesanan =
                                new JastipSkincare(
                                        id,
                                        pelanggan,
                                        barang,
                                        jumlah,
                                        pembayaran,
                                        statusPesanan,
                                        jenisKulit,
                                        ukuranProduk
                                );
                    }

                    kelola.tambahPesanan(pesanan);

                    System.out.println(
                            "\nPesanan berhasil dibuat."
                    );

                    break;

                // 2. LIHAT PESANAN
                case 2:

                    System.out.println(
                            "\n========== DATA PESANAN =========="
                    );

                    kelola.tampilkanPesanan();

                    break;

                // 3. UBAH PESANAN
                case 3:

                    System.out.println(
                            "\n========== UBAH PESANAN =========="
                    );

                    String idUbah =
                            input.inputString(
                                    "ID Pesanan     : ",
                                    7,
                                    7
                            );

                    PesananJastip dataLama =
                            kelola.cariPesanan(idUbah);

                    if (dataLama == null) {

                        System.out.println(
                                "Pesanan tidak ditemukan."
                        );

                        break;
                    }

                    String namaBaru =
                            input.inputString(
                                    "Nama Pelanggan : ",
                                    2,
                                    30
                            );

                    String teleponBaru =
                            input.inputString(
                                    "No. Telepon    : ",
                                    10,
                                    15
                            );

                    Pelanggan pelangganBaru =
                            new Pelanggan(
                                    dataLama
                                            .getPelanggan()
                                            .getIdPelanggan(),
                                    namaBaru,
                                    teleponBaru
                            );

                    String barangBaru =
                            input.inputString(
                                    "Nama Barang    : ",
                                    2,
                                    50
                            );

                    String negaraBaru =
                            input.inputString(
                                    "Negara Asal    : ",
                                    2,
                                    30
                            );

                    double hargaBaru =
                            input.inputDouble(
                                    "Harga Barang   : Rp",
                                    1000,
                                    100000000
                            );

                    double beratBaru =
                            input.inputDouble(
                                    "Berat Barang   : ",
                                    0.1,
                                    100
                            );

                    int jumlahBaru =
                            input.inputInteger(
                                    "Jumlah         : ",
                                    1,
                                    100
                            );

                    scanner.nextLine();

                    Barang objekBarangBaru =
                            new Barang(
                                    barangBaru,
                                    negaraBaru,
                                    hargaBaru,
                                    beratBaru
                            );

                    double biayaBaru =
                            beratBaru
                            * jumlahBaru
                            * 50000;

                    String metodeLama =
                            dataLama
                                    .getPembayaran()
                                    .getMetodePembayaran();

                    double totalBaru =
                            (hargaBaru * jumlahBaru)
                            + biayaBaru;

                    Pembayaran pembayaranBaru =
                            new Pembayaran(
                                    metodeLama,
                                    biayaBaru,
                                    totalBaru
                            );

                    kelola.ubahPesanan(
                            idUbah,
                            pelangganBaru,
                            objekBarangBaru,
                            jumlahBaru,
                            pembayaranBaru
                    );

                    break;

                // 4. HAPUS PESANAN
                case 4:

                    System.out.println(
                            "\n========== HAPUS PESANAN =========="
                    );

                    String idHapus =
                            input.inputString(
                                    "ID Pesanan: ",
                                    7,
                                    7
                            );

                    kelola.hapusPesanan(idHapus);

                    break;

                // 5. LIHAT STRUK
                case 5:

                    System.out.println(
                            "\n========== STRUK PESANAN =========="
                    );

                    String idStruk =
                            input.inputString(
                                    "ID Pesanan: ",
                                    7,
                                    7
                            );

                    kelola.tampilkanStruk(idStruk);

                    break;

                // 6. UBAH STATUS
                case 6:

                    System.out.println(
                            "\n========== UBAH STATUS =========="
                    );

                    String idStatus =
                            input.inputString(
                                    "ID Pesanan: ",
                                    7,
                                    7
                            );

                    System.out.println(
                            "\nPilihan Status:"
                    );
                    System.out.println(
                            "1. Menunggu Pembayaran"
                    );
                    System.out.println(
                            "2. Pembayaran Berhasil"
                    );
                    System.out.println(
                            "3. Sedang Dibeli"
                    );
                    System.out.println(
                            "4. Dalam Pengiriman"
                    );
                    System.out.println(
                            "5. Pesanan Selesai"
                    );

                    int pilihanStatus =
                            input.inputInteger(
                                    "Pilih status: ",
                                    1,
                                    5
                            );

                    scanner.nextLine();

                    String statusBaru;

                    switch (pilihanStatus) {

                        case 1:
                            statusBaru =
                                    "Menunggu Pembayaran";
                            break;

                        case 2:
                            statusBaru =
                                    "Pembayaran Berhasil";
                            break;

                        case 3:
                            statusBaru =
                                    "Sedang Dibeli";
                            break;

                        case 4:
                            statusBaru =
                                    "Dalam Pengiriman";
                            break;

                        default:
                            statusBaru =
                                    "Pesanan Selesai";
                    }

                    kelola.ubahStatusPesanan(
                            idStatus,
                            statusBaru
                    );

                    break;

                // 7. RINGKASAN
                case 7:

                    kelola.tampilkanRingkasan();

                    break;

                // 8. KELUAR
                case 8:

                    System.out.println(
                            "\n================================="
                    );
                    System.out.println(
                            " Program selesai. Terima kasih!"
                    );
                    System.out.println(
                            "=================================="
                    );

                    break;
            }

        } while (pilihan != 8);

        scanner.close();
    }
}