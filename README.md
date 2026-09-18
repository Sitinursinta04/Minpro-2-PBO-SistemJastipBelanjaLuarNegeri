# 🛍️ Sistem Jasa Titip Luar Negeri

> **Mini Project 2 — Pemrograman Berorientasi Objek**

---

## 📖 Deskripsi Singkat Program

**Sistem Jasa Titip Luar Negeri** merupakan program berbasis Java yang digunakan untuk mengelola pesanan jasa titip barang dari luar negeri.

Program ini memungkinkan pengguna untuk melakukan proses **Create, Read, Update, dan Delete (CRUD)** pada data pesanan. Program juga menyediakan beberapa fitur tambahan seperti **ID pesanan otomatis, validasi input, perhitungan biaya jastip berdasarkan berat barang, status pesanan, struk pesanan, dan ringkasan pesanan**.

Program dibuat dengan menerapkan konsep **Pemrograman Berorientasi Objek (PBO)** seperti:

- Constructor
- Access Modifier
- Encapsulation
- Inheritance
- Polymorphism
- ArrayList

Program juga menggunakan pemisahan package berdasarkan fungsi agar struktur program lebih terorganisir.

---

## 🎯 Tujuan Program

Program ini dibuat untuk:

1. Menerapkan konsep Pemrograman Berorientasi Objek dalam sebuah program Java.
2. Mengelola data pesanan jasa titip menggunakan `ArrayList`.
3. Menerapkan proses CRUD pada data pesanan.
4. Menerapkan konsep encapsulation menggunakan access modifier, getter, dan setter.
5. Menerapkan inheritance menggunakan superclass dan subclass.
6. Menerapkan polymorphism melalui method overriding.
7. Menerapkan validasi input untuk memastikan data yang dimasukkan sesuai dengan ketentuan.
8. Membuat program yang lebih terstruktur melalui pemisahan package.

---

## 🔄 Alur Program

Alur penggunaan program adalah sebagai berikut:

1. Program dijalankan dan menampilkan **Menu Utama**.
2. Pengguna memilih menu yang tersedia.
3. Jika memilih **Tambah Pesanan**, pengguna memilih jenis jastip:
   - Jastip Fashion
   - Jastip Skincare
4. Program membuat ID pesanan secara otomatis sesuai jenis jastip.
5. Pengguna memasukkan data pelanggan.
6. Pengguna memasukkan data barang seperti:
   - Nama barang
   - Negara asal
   - Harga barang
   - Berat barang
   - Jumlah barang
7. Program menghitung biaya jastip berdasarkan berat dan jumlah barang.
8. Pengguna memilih metode pembayaran.
9. Program membuat objek pesanan sesuai dengan jenis jastip yang dipilih.
10. Data pesanan disimpan ke dalam `ArrayList`.
11. Pengguna dapat melihat seluruh data melalui menu **Lihat Pesanan**.
12. Pengguna dapat mengubah data melalui menu **Ubah Pesanan**.
13. Pengguna dapat menghapus data melalui menu **Hapus Pesanan**.
14. Pengguna dapat melihat struk berdasarkan ID pesanan.
15. Pengguna dapat mengubah status pesanan.
16. Pengguna dapat melihat ringkasan seluruh pesanan.
17. Program akan terus berjalan selama pengguna belum memilih menu **Keluar**.

---

## 📋 Menu Program

| No. | Menu | Fungsi |
|:---:|---|---|
| 1 | Tambah Pesanan | Menambahkan pesanan baru |
| 2 | Lihat Pesanan | Menampilkan seluruh data pesanan |
| 3 | Ubah Pesanan | Mengubah data pesanan |
| 4 | Hapus Pesanan | Menghapus data pesanan |
| 5 | Lihat Struk | Menampilkan struk pesanan berdasarkan ID |
| 6 | Ubah Status | Mengubah status pesanan |
| 7 | Ringkasan Pesanan | Menampilkan ringkasan seluruh pesanan |
| 8 | Keluar | Mengakhiri program |

---

## 📦 Data Awal / Dummy Data

Program menyediakan data awal atau **dummy data** pada `ArrayList`.

Dummy data yang tersedia terdiri dari:

- 1 pesanan Jastip Fashion
- 1 pesanan Jastip Skincare

Dengan adanya dummy data, pengguna dapat langsung menggunakan menu **Lihat Pesanan** ketika program pertama kali dijalankan tanpa harus memasukkan data terlebih dahulu.

Dummy data dibuat pada constructor class `KelolaPesanan.java`.

---
# 🧩 Penerapan Konsep PBO

## 1. Encapsulation

Encapsulation diterapkan dengan menggunakan access modifier `private` pada atribut setiap class.

Contohnya pada class `PesananJastip`:

```java
private String idPesanan;
private Pelanggan pelanggan;
private Barang barang;
private int jumlah;
private Pembayaran pembayaran;
private String statusPesanan;
```

Atribut tersebut tidak dapat diakses secara langsung dari luar class. Untuk mengakses dan mengubah data digunakan method **getter** dan **setter**.

Contoh getter:

```java
public String getIdPesanan() {
    return idPesanan;
}
```

Contoh setter:

```java
public void setStatusPesanan(String statusPesanan) {
    this.statusPesanan = statusPesanan;
}
```

Encapsulation juga diterapkan pada class:

- `Pelanggan`
- `Barang`
- `Pembayaran`
- `JastipFashion`
- `JastipSkincare`

Penerapan ini membuat data pada class lebih terkontrol karena akses terhadap atribut dilakukan melalui method yang telah disediakan.

---

## 2. Inheritance

Inheritance diterapkan menggunakan **1 superclass dan 2 subclass**.

Struktur inheritance pada program:

```text
PesananJastip
├── JastipFashion
└── JastipSkincare
```

Class `PesananJastip` berperan sebagai **superclass**, sedangkan:

- `JastipFashion` sebagai subclass
- `JastipSkincare` sebagai subclass

Inheritance diterapkan menggunakan keyword `extends`.

Contoh pada `JastipFashion`:

```java
public class JastipFashion extends PesananJastip
```

Contoh pada `JastipSkincare`:

```java
public class JastipSkincare extends PesananJastip
```

Kedua subclass dapat menggunakan data dan method yang diwariskan dari `PesananJastip`.

Masing-masing subclass juga memiliki atribut tambahan sesuai dengan jenis pesanan.

### 👕 Jastip Fashion

```java
private String ukuran;
private String warna;
```

### 🧴 Jastip Skincare

```java
private String jenisKulit;
private int ukuranProduk;
```

---

## 3. Constructor

Constructor digunakan untuk memberikan nilai awal ketika sebuah objek dibuat.

Contohnya pada class `PesananJastip`:

```java
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
```

Constructor juga digunakan pada class:

- `Pelanggan`
- `Barang`
- `Pembayaran`
- `JastipFashion`
- `JastipSkincare`
- `KelolaPesanan`
- `ValidasiInput`

---

## 4. Access Modifier

Program menggunakan access modifier `private` untuk membatasi akses langsung terhadap atribut.

Contoh:

```java
private String namaBarang;
```

Atribut tersebut kemudian dapat diakses melalui getter:

```java
public String getNamaBarang() {
    return namaBarang;
}
```

Penggunaan access modifier mendukung penerapan konsep **encapsulation** pada program.

---

# 🔀 Polymorphism

Polymorphism diterapkan melalui **method overriding**.

Method `tampilkanData()` yang terdapat pada superclass `PesananJastip` dioverride pada subclass `JastipFashion` dan `JastipSkincare`.

Contoh pada `JastipFashion`:

```java
@Override
public void tampilkanData() {

    super.tampilkanData();

    System.out.println(
            "Ukuran           : " + ukuran
    );

    System.out.println(
            "Warna            : " + warna
    );
}
```

Pada `JastipSkincare`, method `tampilkanData()` juga dioverride untuk menambahkan informasi khusus seperti jenis kulit dan ukuran produk.

Dengan demikian, method yang sama dapat menampilkan informasi tambahan sesuai dengan jenis objek subclass yang digunakan.

---

# 🏗️ Struktur Project

Struktur project dibagi ke dalam beberapa package berdasarkan fungsi masing-masing.

```text
SistemJastip_Minpro2
│
├── Model
│   ├── PesananJastip.java
│   ├── JastipFashion.java
│   ├── JastipSkincare.java
│   ├── Pelanggan.java
│   ├── Barang.java
│   └── Pembayaran.java
│
├── Logic
│   └── KelolaPesanan.java
│
├── Helper
│   └── ValidasiInput.java
│
└── com.mycompany.sistemjastip_minpro2
    └── SistemJastip_Minpro2.java
```

### 📦 Model

Package `Model` berisi class yang digunakan untuk menyimpan data dan objek dalam program.

Class yang terdapat pada package ini:

- `PesananJastip`
- `JastipFashion`
- `JastipSkincare`
- `Pelanggan`
- `Barang`
- `Pembayaran`

### ⚙️ Logic

Package `Logic` berisi proses pengelolaan data pesanan.

Class `KelolaPesanan.java` digunakan untuk menangani:

- Create
- Read
- Update
- Delete
- Pencarian pesanan
- Perubahan status
- Struk pesanan
- Ringkasan pesanan

### 🔧 Helper

Package `Helper` berisi class pendukung.

Class `ValidasiInput.java` digunakan untuk menangani validasi data yang dimasukkan oleh pengguna.

### ▶️ Main

Package `com.mycompany.sistemjastip_minpro2` berisi class utama program.

Class `SistemJastip_Minpro2.java` digunakan untuk menjalankan program dan menyediakan menu yang dapat dipilih oleh pengguna.

---

# 🧱 Penerapan MVC

Program menggunakan **pendekatan MVC sederhana yang disesuaikan dengan struktur project** melalui pemisahan fungsi setiap package.

| Bagian | Package / Class | Fungsi |
|---|---|---|
| **Model** | `Model` | Menyimpan data dan objek program |
| **Logic** | `Logic/KelolaPesanan` | Mengelola proses dan pengolahan data |
| **Helper** | `Helper/ValidasiInput` | Membantu proses validasi input |
| **Main** | `SistemJastip_Minpro2` | Menjalankan program dan mengatur interaksi menu |

Pemisahan ini membuat fungsi setiap bagian program menjadi lebih jelas dan terorganisir.

---
# 💡 Nilai Tambah Program

Selain ketentuan utama pada Mini Project 2, program juga menerapkan beberapa nilai tambah.

---

## 1. Validasi Input

Validasi input diterapkan pada class `ValidasiInput.java`.

Validasi digunakan untuk:

- Mencegah input kosong.
- Memastikan input Integer berupa angka.
- Memastikan input Double berupa angka.
- Menentukan batas minimal dan maksimal input.

Contohnya, pada input harga barang terdapat batas nilai tertentu sehingga pengguna tidak dapat memasukkan angka yang tidak sesuai.

---

## 2. ID Pesanan Otomatis

Program menyediakan pembuatan ID pesanan secara otomatis berdasarkan jenis jastip.

Untuk Jastip Fashion digunakan format:

```text
FSH-001
FSH-002
FSH-003
```

Sedangkan untuk Jastip Skincare digunakan format:

```text
SKN-001
SKN-002
SKN-003
```

Fitur ini terdapat pada class `KelolaPesanan.java`.

Dengan fitur ini, pengguna tidak perlu menentukan ID pesanan secara manual.

---

## 3. Perhitungan Biaya Jastip Berdasarkan Berat

Program menghitung biaya jastip berdasarkan berat dan jumlah barang.

Rumus yang digunakan:

```text
Biaya Jastip = Berat Barang × Jumlah × Rp50.000
```

Contohnya, jika berat barang adalah 1,5 kg dan jumlah barang 1, maka:

```text
1,5 × 1 × Rp50.000 = Rp75.000
```

Perhitungan ini digunakan ketika pengguna menambahkan maupun mengubah pesanan.

---

## 4. Data Berat Barang

Data berat barang ditambahkan ke dalam class `Barang.java`.

Atribut yang digunakan:

```java
private double berat;
```

Data berat barang tidak hanya ditampilkan sebagai informasi, tetapi juga digunakan untuk menghitung biaya jastip dan total berat pada ringkasan pesanan.

---

## 5. Status Pesanan

Program menyediakan fitur untuk mengubah status pesanan.

Pilihan status yang tersedia:

- Menunggu Pembayaran
- Pembayaran Berhasil
- Sedang Dibeli
- Dalam Pengiriman
- Pesanan Selesai

Fitur ini dapat digunakan melalui menu **Ubah Status**.

Status disimpan pada class `PesananJastip.java`, sedangkan proses perubahan status ditangani oleh `KelolaPesanan.java`.

---

## 6. Struk Pesanan

Program menyediakan fitur **Lihat Struk** berdasarkan ID pesanan.

Struk menampilkan informasi:

- ID pesanan
- Nama pelanggan
- Nama barang
- Negara asal
- Harga barang
- Berat barang
- Jumlah barang
- Biaya jastip
- Metode pembayaran
- Total pembayaran
- Status pesanan

Fitur ini terdapat pada method `tampilkanStruk()` di class `PesananJastip.java`.

---

## 7. Ringkasan Pesanan

Program memiliki fitur **Ringkasan Pesanan** yang menampilkan informasi keseluruhan data.

Informasi yang ditampilkan meliputi:

- Total pesanan
- Total pesanan Fashion
- Total pesanan Skincare
- Total berat barang
- Total pembayaran

Fitur ini terdapat pada method `tampilkanRingkasan()` di class `KelolaPesanan.java`.

---

## 8. Dummy Data pada ArrayList

Program menyediakan data awal pada `ArrayList` melalui constructor `KelolaPesanan.java`.

Data awal terdiri dari:

- Pesanan Fashion
- Pesanan Skincare

Dengan adanya dummy data, menu **Lihat Pesanan** dapat langsung menampilkan data meskipun pengguna belum menambahkan pesanan baru.

---

# 📝 Penerapan CRUD

Program menerapkan operasi CRUD sebagai berikut:

| Operasi | Menu | Method |
|:---:|---|---|
| **Create** | Tambah Pesanan | `tambahPesanan()` |
| **Read** | Lihat Pesanan | `tampilkanPesanan()` |
| **Update** | Ubah Pesanan | `ubahPesanan()` |
| **Delete** | Hapus Pesanan | `hapusPesanan()` |

### Create

Digunakan untuk menambahkan data pesanan baru ke dalam `ArrayList`.

### Read

Digunakan untuk menampilkan seluruh data pesanan yang tersimpan.

### Update

Digunakan untuk mengubah data pesanan berdasarkan ID pesanan.

### Delete

Digunakan untuk menghapus data pesanan berdasarkan ID pesanan.

---

# ✨ Fitur Tambahan

Selain CRUD, program memiliki beberapa menu tambahan:

| Fitur | Fungsi |
|---|---|
| **Lihat Struk** | Menampilkan detail pembayaran suatu pesanan |
| **Ubah Status** | Mengubah status proses pesanan |
| **Ringkasan Pesanan** | Menampilkan rekap data seluruh pesanan |
| **ID Otomatis** | Membuat ID berdasarkan kategori pesanan |
| **Biaya Jastip** | Menghitung biaya berdasarkan berat dan jumlah barang |
| **Validasi Input** | Membatasi input agar sesuai ketentuan |

---
# 🖥️ Dokumentasi Hasil Program

Dokumentasi berikut menunjukkan hasil program ketika dijalankan menggunakan NetBeans.

> **Catatan:** Screenshot dapat ditempel pada bagian yang telah disediakan di bawah ini.

---

## 1. Tampilan Menu Utama

### 📸 Screenshot

**Tempel screenshot menu utama di sini**

**Gambar 1. Tampilan Menu Utama**

**Penjelasan:**  
Menu utama merupakan tampilan awal program yang digunakan untuk memilih proses yang tersedia. Pengguna dapat memilih menu dengan memasukkan nomor sesuai dengan proses yang ingin dilakukan.

---

## 2. Tambah Pesanan

### 📸 Screenshot

**Tempel screenshot proses Tambah Pesanan di sini**

**Gambar 2. Proses Menambahkan Pesanan**

**Penjelasan:**  
Menu Tambah Pesanan digunakan untuk membuat pesanan baru. Pengguna dapat memilih jenis jastip Fashion atau Skincare, kemudian memasukkan data pelanggan, barang, berat, jumlah, dan metode pembayaran.

Program kemudian membuat ID pesanan secara otomatis dan menghitung biaya jastip berdasarkan berat serta jumlah barang.

---

## 3. Lihat Pesanan

### 📸 Screenshot

**Tempel screenshot hasil Lihat Pesanan di sini**

**Gambar 3. Tampilan Data Pesanan**

**Penjelasan:**  
Menu Lihat Pesanan digunakan untuk menampilkan seluruh data pesanan yang tersimpan di dalam `ArrayList`.

Dummy data yang telah disediakan juga dapat langsung ditampilkan ketika program pertama kali dijalankan.

---

## 4. Ubah Pesanan

### 📸 Screenshot

**Tempel screenshot proses Ubah Pesanan di sini**

**Gambar 4. Proses Mengubah Data Pesanan**

**Penjelasan:**  
Menu Ubah Pesanan digunakan untuk memperbarui data pesanan berdasarkan ID pesanan. Data pelanggan, barang, harga, berat, dan jumlah barang dapat diperbarui melalui menu ini.

---

## 5. Hapus Pesanan

### 📸 Screenshot

**Tempel screenshot proses Hapus Pesanan di sini**

**Gambar 5. Proses Menghapus Data Pesanan**

**Penjelasan:**  
Menu Hapus Pesanan digunakan untuk menghapus data pesanan berdasarkan ID. Jika ID ditemukan, data pesanan akan dihapus dari `ArrayList`.

---

## 6. Lihat Struk

### 📸 Screenshot

**Tempel screenshot hasil Lihat Struk di sini**

**Gambar 6. Tampilan Struk Pesanan**

**Penjelasan:**  
Menu Lihat Struk digunakan untuk menampilkan informasi lengkap dari suatu pesanan berdasarkan ID. Informasi yang ditampilkan meliputi data pelanggan, barang, berat, jumlah, biaya jastip, metode pembayaran, total pembayaran, dan status pesanan.

---

## 7. Ubah Status

### 📸 Screenshot

**Tempel screenshot proses Ubah Status di sini**

**Gambar 7. Proses Mengubah Status Pesanan**

**Penjelasan:**  
Menu Ubah Status digunakan untuk memperbarui status pesanan. Pengguna dapat memilih status sesuai dengan kondisi pesanan yang tersedia pada program.

---

## 8. Ringkasan Pesanan

### 📸 Screenshot

**Tempel screenshot hasil Ringkasan Pesanan di sini**

**Gambar 8. Tampilan Ringkasan Pesanan**

**Penjelasan:**  
Menu Ringkasan Pesanan digunakan untuk menampilkan informasi keseluruhan data pesanan. Informasi yang ditampilkan meliputi total pesanan, jumlah berdasarkan kategori, total berat barang, dan total pembayaran.

---

## 9. Validasi Input

### 📸 Screenshot

**Tempel screenshot ketika memasukkan input yang tidak sesuai di sini**

**Gambar 9. Validasi Input Program**

**Penjelasan:**  
Validasi input digunakan untuk memastikan data yang dimasukkan pengguna sesuai dengan ketentuan. Jika pengguna memasukkan data yang tidak sesuai, program akan menampilkan pesan kesalahan dan meminta pengguna memasukkan data kembali.

---

# 📚 Daftar Class

| Class | Package | Fungsi |
|---|---|---|
| `PesananJastip` | `Model` | Superclass yang menyimpan data dasar pesanan |
| `JastipFashion` | `Model` | Subclass untuk pesanan Fashion |
| `JastipSkincare` | `Model` | Subclass untuk pesanan Skincare |
| `Pelanggan` | `Model` | Menyimpan data pelanggan |
| `Barang` | `Model` | Menyimpan data barang, negara asal, harga, dan berat |
| `Pembayaran` | `Model` | Menyimpan data pembayaran |
| `KelolaPesanan` | `Logic` | Mengelola data dan proses pesanan |
| `ValidasiInput` | `Helper` | Melakukan validasi input |
| `SistemJastip_Minpro2` | `Main` | Menjalankan program dan menu utama |

---

## ✨ Penutup

Program **Sistem Jasa Titip Luar Negeri** dibuat sebagai implementasi konsep Pemrograman Berorientasi Objek dalam bentuk sistem pengelolaan pesanan.

Program telah menerapkan konsep utama seperti **encapsulation, inheritance, polymorphism, constructor, access modifier, ArrayList, dan CRUD**, serta beberapa fitur tambahan seperti **validasi input, ID otomatis, perhitungan biaya jastip berdasarkan berat, status pesanan, struk, ringkasan pesanan, dan dummy data**.
