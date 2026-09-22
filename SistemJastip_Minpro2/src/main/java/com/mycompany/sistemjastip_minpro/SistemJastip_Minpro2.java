/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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

        KelolaPesanan kelola =
                new KelolaPesanan();

        ValidasiInput input =
                new ValidasiInput(scanner);

        int pilihan;

        do {

            System.out.println(
                    "\n========================================"
            );
            System.out.println(
                    "       SISTEM JASA TITIP LUAR NEGERI"
            );
            System.out.println(
                    "=========================================="
            );
            System.out.println(
                    "1. Tambah Pesanan"
            );
            System.out.println(
                    "2. Lihat Pesanan"
            );
            System.out.println(
                    "3. Ubah Pesanan"
            );
            System.out.println(
                    "4. Hapus Pesanan"
            );
            System.out.println(
                    "5. Lihat Struk"
            );
            System.out.println(
                    "6. Ubah Status"
            );
            System.out.println(
                    "7. Ringkasan Pesanan"
            );
            System.out.println(
                    "8. Keluar"
            );
            System.out.println(
                    "=========================================="
            );

            pilihan =
                    input.inputInteger(
                            "Pilih menu: ",
                            1,
                            8
                    );

            scanner.nextLine();

            switch (pilihan) {

                // ==================================================
                // 1. TAMBAH PESANAN
                // ==================================================
                case 1:

                    System.out.println(
                            "\n========== TAMBAH PESANAN =========="
                    );

                    System.out.println(
                            "1. Jastip Fashion"
                    );

                    System.out.println(
                            "2. Jastip Skincare"
                    );

                    int jenis =
                            input.inputInteger(
                                    "Pilih jenis jastip: ",
                                    1,
                                    2
                            );

                    scanner.nextLine();

                    String id;

                    if (jenis == 1) {

                        id =
                                kelola.generateIdFashion();

                    } else {

                        id =
                                kelola.generateIdSkincare();
                    }

                    System.out.println(
                            "\nID Pesanan : " + id
                    );

                    // ==================================================
                    // DATA PELANGGAN
                    // ==================================================

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

                    // ==================================================
                    // DATA BARANG
                    // ==================================================

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

                    // ==================================================
                    // MENGHITUNG BIAYA JASTIP
                    // ==================================================

                    double biayaJastip =
                            berat
                            * jumlah
                            * 50000;

                    System.out.println(
                            "\nBiaya Jastip : Rp"
                            + biayaJastip
                    );

                    // ==================================================
                    // METODE PEMBAYARAN
                    // ==================================================

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

                    // ==================================================
                    // STATUS AWAL
                    // ==================================================

                    String statusPesanan =
                            "Menunggu Pembayaran";

                    PesananJastip pesanan;

                    // ==================================================
                    // JASTIP FASHION
                    // ==================================================

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
                                        null,
                                        statusPesanan,
                                        ukuran,
                                        warna
                                );

                    // ==================================================
                    // JASTIP SKINCARE
                    // ==================================================

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
                                        null,
                                        statusPesanan,
                                        jenisKulit,
                                        ukuranProduk
                                );
                    }

                    // ==================================================
                    // METHOD OVERLOADING
                    // ==================================================

                    double subtotal =
                            pesanan.hitungTotal();

                    double totalPembayaran =
                            pesanan.hitungTotal(
                                    biayaJastip
                            );

                    // Menampilkan hasil perhitungan
                    System.out.println(
                            "\n========== HASIL PERHITUNGAN =========="
                    );

                    System.out.println(
                            "Subtotal Barang : Rp"
                            + subtotal
                    );

                    System.out.println(
                            "Biaya Jastip    : Rp"
                            + biayaJastip
                    );

                    System.out.println(
                            "Total Pembayaran: Rp"
                            + totalPembayaran
                    );

                    // ==================================================
                    // MEMBUAT DATA PEMBAYARAN
                    // ==================================================

                    Pembayaran pembayaran =
                            new Pembayaran(
                                    metodePembayaran,
                                    biayaJastip,
                                    totalPembayaran
                            );

                    pesanan.setPembayaran(
                            pembayaran
                    );

                    kelola.tambahPesanan(
                            pesanan
                    );

                    System.out.println(
                            "\nPesanan berhasil dibuat."
                    );

                    break;

                // ==================================================
                // 2. LIHAT PESANAN
                // ==================================================
                case 2:

                    System.out.println(
                            "\n========== DATA PESANAN =========="
                    );

                    kelola.tampilkanPesanan();

                    break;

                // ==================================================
                // 3. UBAH PESANAN
                // ==================================================
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
                            kelola.cariPesanan(
                                    idUbah
                            );

                    if (dataLama == null) {

                        System.out.println(
                                "Pesanan tidak ditemukan."
                        );

                        break;
                    }

                    // ==================================================
                    // DATA PELANGGAN BARU
                    // ==================================================

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

                    // ==================================================
                    // DATA BARANG BARU
                    // ==================================================

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

                    // ==================================================
                    // MENGHITUNG ULANG BIAYA JASTIP
                    // ==================================================

                    double biayaBaru =
                            beratBaru
                            * jumlahBaru
                            * 50000;

                    String metodeLama =
                            dataLama
                                    .getPembayaran()
                                    .getMetodePembayaran();

                    // Memperbarui data barang dan jumlah
                    dataLama.setBarang(
                            objekBarangBaru
                    );

                    dataLama.setJumlah(
                            jumlahBaru
                    );

                    // ==================================================
                    // METHOD OVERLOADING PADA UPDATE
                    // ==================================================

                    double subtotalBaru =
                            dataLama.hitungTotal();

                    double totalBaru =
                            dataLama.hitungTotal(
                                    biayaBaru
                            );

                    Pembayaran pembayaranBaru =
                            new Pembayaran(
                                    metodeLama,
                                    biayaBaru,
                                    totalBaru
                            );

                    // ==================================================
                    // DATA KHUSUS FASHION
                    // ==================================================

                    String ukuranBaru = "";
                    String warnaBaru = "";

                    // ==================================================
                    // DATA KHUSUS SKINCARE
                    // ==================================================

                    String jenisKulitBaru = "";
                    int ukuranProdukBaru = 0;

                    // Jika pesanan Fashion
                    if (dataLama
                            instanceof JastipFashion) {

                        System.out.println(
                                "\n--- DATA KHUSUS FASHION ---"
                        );

                        ukuranBaru =
                                input.inputString(
                                        "Ukuran Baju    : ",
                                        1,
                                        10
                                );

                        warnaBaru =
                                input.inputString(
                                        "Warna          : ",
                                        2,
                                        20
                                );

                    // Jika pesanan Skincare
                    } else if (dataLama
                            instanceof JastipSkincare) {

                        System.out.println(
                                "\n--- DATA KHUSUS SKINCARE ---"
                        );

                        jenisKulitBaru =
                                input.inputString(
                                        "Jenis Kulit    : ",
                                        2,
                                        20
                                );

                        ukuranProdukBaru =
                                input.inputInteger(
                                        "Ukuran Produk (ml): ",
                                        1,
                                        5000
                                );

                        scanner.nextLine();
                    }

                    // ==================================================
                    // HASIL PERHITUNGAN UPDATE
                    // ==================================================

                    System.out.println(
                            "\n========== HASIL PERHITUNGAN =========="
                    );

                    System.out.println(
                            "Subtotal Barang : Rp"
                            + subtotalBaru
                    );

                    System.out.println(
                            "Biaya Jastip    : Rp"
                            + biayaBaru
                    );

                    System.out.println(
                            "Total Pembayaran: Rp"
                            + totalBaru
                    );

                    // ==================================================
                    // MENYIMPAN PERUBAHAN
                    // ==================================================

                    kelola.ubahPesanan(
                            idUbah,
                            pelangganBaru,
                            objekBarangBaru,
                            jumlahBaru,
                            pembayaranBaru,
                            ukuranBaru,
                            warnaBaru,
                            jenisKulitBaru,
                            ukuranProdukBaru
                    );

                    break;

                // ==================================================
                // 4. HAPUS PESANAN
                // ==================================================
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

                    kelola.hapusPesanan(
                            idHapus
                    );

                    break;

                // ==================================================
                // 5. LIHAT STRUK
                // ==================================================
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

                    kelola.tampilkanStruk(
                            idStruk
                    );

                    break;

                // ==================================================
                // 6. UBAH STATUS
                // ==================================================
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

                // ==================================================
                // 7. RINGKASAN
                // ==================================================
                case 7:

                    kelola.tampilkanRingkasan();

                    break;

                // ==================================================
                // 8. KELUAR
                // ==================================================
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