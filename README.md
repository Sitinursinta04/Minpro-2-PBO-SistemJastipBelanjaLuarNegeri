# 🛍️ SISTEM JASA TITIP BELANJA LUAR NEGERI

## 📖 DESKRIPSI SINGKAT PROGRAM

**Sistem Jasa Titip Belanja Luar Negeri** merupakan program berbasis Java yang digunakan untuk membantu mengelola data pesanan jasa titip dari luar negeri.

Program ini memungkinkan pengguna untuk mengelola:

- Data pelanggan
- Data barang
- Negara asal barang
- Harga barang
- Jumlah barang
- Berat barang
- Informasi pembayaran
- Status pesanan

Sistem juga membedakan jenis pesanan menjadi **Jastip Fashion** dan **Jastip Skincare** dengan menerapkan konsep **Inheritance**.

Program menyediakan beberapa menu utama:

1. Tambah Pesanan
2. Lihat Pesanan
3. Ubah Pesanan
4. Hapus Pesanan
5. Lihat Struk
6. Ubah Status
7. Ringkasan Pesanan
8. Keluar

Selain menerapkan konsep yang diwajibkan pada Mini Project 2, program juga dikembangkan dengan beberapa fitur tambahan agar proses pengelolaan pesanan menjadi lebih terstruktur dan informatif.

---

## 🎯 TUJUAN PROGRAM

Program ini dibuat sebagai penerapan konsep **Pemrograman Berorientasi Objek (PBO)** dalam studi kasus jasa titip belanja luar negeri.

Tujuan program adalah:

1. Mengelola data pesanan jasa titip secara terstruktur.
2. Menerapkan konsep **Encapsulation** pada atribut objek.
3. Menerapkan **Inheritance** melalui pembagian jenis pesanan.
4. Menerapkan operasi **CRUD** pada data pesanan.
5. Menggunakan `ArrayList` untuk menyimpan kumpulan data pesanan.
6. Menerapkan validasi terhadap input pengguna.
7. Menerapkan nilai tambah berupa **pendekatan MVC sederhana** dan **Polymorphism**.
8. Menambahkan beberapa fitur kreatif yang mendukung proses pengelolaan pesanan.

---

## 🧩 STRUKTUR PROGRAM

Program dibagi menjadi beberapa package agar setiap class memiliki fungsi dan tanggung jawab yang lebih terorganisir.

![alt text](?raw=true)
```

### Penjelasan Struktur

| Package/Class | Fungsi |
|---|---|
| `Model` | Berisi class yang merepresentasikan data dan objek dalam sistem. |
| `PesananJastip` | Superclass yang menyimpan data umum sebuah pesanan. |
| `JastipFashion` | Subclass untuk pesanan kategori fashion. |
| `JastipSkincare` | Subclass untuk pesanan kategori skincare. |
| `Pelanggan` | Menyimpan data pelanggan. |
| `Barang` | Menyimpan data barang yang dijastipkan. |
| `Pembayaran` | Menyimpan informasi pembayaran dan total pembayaran. |
| `Logic` | Berisi proses pengelolaan data pesanan. |
| `KelolaPesanan` | Menangani proses tambah, tampil, cari, ubah, hapus, dan pengelolaan pesanan lainnya. |
| `Helper` | Berisi class pendukung program. |
| `ValidasiInput` | Menangani validasi input pengguna. |
| `SistemJastip_Minpro2` | Menjalankan program, menampilkan menu, menerima input, dan mengatur alur program. |

---

## 📉 ALUR PROGRAM

Program dijalankan melalui class `SistemJastip_Minpro2`.

Pada saat program dimulai, sistem membuat beberapa objek yang diperlukan, yaitu:

- `Scanner` untuk menerima input dari pengguna.
- `KelolaPesanan` untuk mengelola data pesanan.
- `ValidasiInput` untuk melakukan validasi terhadap input.

Ketika objek `KelolaPesanan` dibuat, sistem juga memasukkan **dummy data** ke dalam `ArrayList`. Dengan adanya data awal tersebut, pengguna dapat langsung mencoba menu yang berhubungan dengan data pesanan.

Setelah proses awal selesai, sistem menampilkan menu utama.

Program menggunakan perulangan `do-while`, sehingga menu akan terus ditampilkan selama pengguna belum memilih menu **Keluar**.

### Alur Utama Program

Program berjalan melalui beberapa tahapan utama berikut:

- **Program dimulai** dengan menjalankan class `SistemJastip_Minpro2` sebagai bagian utama yang mengatur jalannya sistem.

- Sistem kemudian membuat objek `KelolaPesanan` untuk mengelola data pesanan dan `ValidasiInput` untuk membantu memastikan input pengguna sesuai dengan ketentuan.

- Pada tahap awal, sistem secara otomatis menyediakan **dummy data** ke dalam `ArrayList`, sehingga pengguna dapat langsung mencoba fitur yang tersedia.

- Setelah proses awal selesai, sistem menampilkan **menu utama** yang terdiri dari:
  - Tambah Pesanan
  - Lihat Pesanan
  - Ubah Pesanan
  - Hapus Pesanan
  - Lihat Struk
  - Ubah Status
  - Ringkasan Pesanan
  - Keluar

- Pengguna memilih menu sesuai dengan kebutuhan, kemudian sistem menjalankan proses berdasarkan pilihan tersebut.

- Setelah proses selesai, sistem kembali menampilkan **menu utama** sehingga pengguna dapat melanjutkan pengelolaan pesanan.

- Proses tersebut berlangsung secara berulang menggunakan perulangan `do-while` hingga pengguna memilih menu **Keluar**.

- Ketika menu **Keluar** dipilih, perulangan dihentikan, `Scanner` ditutup, dan program berakhir.

Dengan alur tersebut, pengguna dapat mengelola pesanan secara berkelanjutan mulai dari menambahkan, melihat, mengubah, menghapus data, melihat struk, memperbarui status, hingga melihat ringkasan pesanan.

---

## 📋 ALUR SETIAP MENU

### 1. Tambah Pesanan

Menu **Tambah Pesanan** digunakan untuk menambahkan data pesanan baru ke dalam sistem.

### Alur

1. Pengguna memilih menu **Tambah Pesanan**.
2. Sistem meminta pengguna memilih jenis jastip.
3. Pilihan jenis jastip terdiri dari:
   - Jastip Fashion
   - Jastip Skincare
4. Sistem membuat ID pesanan secara otomatis berdasarkan jenis jastip.
5. Pengguna memasukkan data pelanggan.
6. Pengguna memasukkan data barang.
7. Pengguna memasukkan negara asal barang.
8. Pengguna memasukkan harga barang.
9. Pengguna memasukkan berat barang.
10. Pengguna memasukkan jumlah barang.
11. Sistem menghitung biaya jastip berdasarkan berat dan jumlah barang.
12. Pengguna memilih metode pembayaran.
13. Sistem menghitung total pembayaran.
14. Jika memilih **Fashion**, pengguna memasukkan ukuran dan warna.
15. Jika memilih **Skincare**, pengguna memasukkan jenis kulit dan ukuran produk.
16. Sistem membuat objek sesuai jenis pesanan.
17. Objek pesanan dimasukkan ke dalam `ArrayList`.
18. Sistem menampilkan pesan bahwa pesanan berhasil dibuat.

Pemilihan jenis pesanan pada proses ini berkaitan dengan penerapan **Inheritance**, karena objek yang dibuat dapat berupa `JastipFashion` atau `JastipSkincare`.

---

### 2. Lihat Pesanan

Menu **Lihat Pesanan** digunakan untuk menampilkan seluruh data pesanan yang tersimpan.

### Alur

1. Pengguna memilih menu **Lihat Pesanan**.
2. Sistem memeriksa data dalam `ArrayList`.
3. Jika belum ada data, sistem menampilkan pesan bahwa belum ada pesanan.
4. Jika terdapat data, sistem melakukan perulangan untuk membaca setiap pesanan.
5. Sistem memanggil method `tampilkanData()`.
6. Data pesanan ditampilkan pada layar.

### Data yang Ditampilkan

- ID pesanan
- Nama pelanggan
- Nomor telepon
- Nama barang
- Negara asal
- Harga barang
- Berat barang
- Jumlah barang
- Biaya jastip
- Total pembayaran
- Status pesanan
- Data khusus sesuai jenis pesanan

---

### 3. Ubah Pesanan

Menu **Ubah Pesanan** digunakan untuk memperbarui data pesanan yang telah tersimpan.

### Alur

1. Pengguna memasukkan ID pesanan.
2. Sistem mencari pesanan menggunakan method `cariPesanan()`.
3. Jika ID tidak ditemukan, sistem menampilkan pesan **Pesanan tidak ditemukan**.
4. Jika ID ditemukan, sistem meminta data baru.
5. Data pelanggan diperbarui.
6. Data barang diperbarui.
7. Berat dan jumlah barang diperbarui.
8. Sistem menghitung kembali biaya jastip.
9. Sistem menghitung kembali total pembayaran.
10. Data pesanan diperbarui melalui method `ubahPesanan()`.

Dengan demikian, perubahan harga, berat, maupun jumlah barang akan memengaruhi perhitungan pembayaran.

> **Catatan:** Data khusus subclass seperti ukuran/warna Fashion atau jenis kulit/ukuran produk Skincare tidak diubah pada menu ini karena method `ubahPesanan()` saat ini hanya memperbarui data umum pesanan.

---

### 4. Hapus Pesanan

Menu **Hapus Pesanan** digunakan untuk menghapus data pesanan yang tersimpan.

### Alur

1. Pengguna memasukkan ID pesanan.
2. Sistem mencari pesanan berdasarkan ID.
3. Jika data ditemukan, objek pesanan dihapus dari `ArrayList`.
4. Sistem menampilkan pesan bahwa pesanan berhasil dihapus.
5. Jika data tidak ditemukan, sistem menampilkan pesan bahwa pesanan tidak ditemukan.

---

### 5. Lihat Struk

Menu **Lihat Struk** digunakan untuk menampilkan informasi transaksi dalam bentuk struk.

### Alur

1. Pengguna memilih menu **Lihat Struk**.
2. Pengguna memasukkan ID pesanan.
3. Sistem mencari pesanan berdasarkan ID.
4. Jika data ditemukan, sistem memanggil method `tampilkanStruk()`.
5. Sistem menampilkan informasi transaksi.

### Informasi Struk

- ID pesanan
- Pelanggan
- Barang
- Negara asal
- Harga barang
- Berat
- Jumlah
- Biaya jastip
- Metode pembayaran
- Total pembayaran
- Status pesanan

---

### 6. Ubah Status

Menu **Ubah Status** digunakan untuk memperbarui perkembangan pesanan.

### Status yang Tersedia

1. Menunggu Pembayaran
2. Pembayaran Berhasil
3. Sedang Dibeli
4. Dalam Pengiriman
5. Pesanan Selesai

### Alur

1. Pengguna memasukkan ID pesanan.
2. Sistem mencari pesanan.
3. Pengguna memilih status baru.
4. Sistem mengubah status pesanan.
5. Status baru dapat dilihat kembali melalui menu **Lihat Pesanan** maupun **Lihat Struk**.

Fitur ini menggambarkan tahapan sederhana proses pesanan jasa titip dari awal hingga selesai.

---

### 7. Ringkasan Pesanan

Menu **Ringkasan Pesanan** digunakan untuk menampilkan informasi keseluruhan dari data pesanan yang tersimpan.

Sistem menghitung:

- Total seluruh pesanan.
- Jumlah pesanan Fashion.
- Jumlah pesanan Skincare.
- Total berat barang.
- Total pembayaran.

Perhitungan dilakukan dengan membaca seluruh objek pesanan yang tersimpan di dalam `ArrayList`.

Fitur ini memudahkan pengguna memperoleh gambaran keseluruhan data tanpa harus membaca setiap pesanan satu per satu.

---

### 8. Keluar

Menu **Keluar** digunakan untuk mengakhiri program.

### Alur

1. Pengguna memilih menu **Keluar**.
2. Sistem menampilkan pesan bahwa program selesai.
3. Perulangan menu berhenti.
4. `Scanner` ditutup.
5. Program berakhir.

---

## 🛠️ PENERAPAN KONSEP PBO

## 1. Encapsulation

**Encapsulation** diterapkan dengan membatasi akses langsung terhadap atribut yang dimiliki oleh suatu class.

Pada program ini, atribut pada class seperti `Pelanggan`, `Barang`, `Pembayaran`, dan `PesananJastip` menggunakan access modifier `private`.

Contoh:

```java
private String namaPelanggan;
private String nomorTelepon;
```

Atribut tersebut tidak dapat diakses secara langsung dari class lain. Untuk membaca nilai atribut digunakan **getter**, sedangkan untuk mengubah nilai atribut digunakan **setter**.

Contoh:

```java
public String getNamaPelanggan() {
    return namaPelanggan;
}

public void setNamaPelanggan(String namaPelanggan) {
    this.namaPelanggan = namaPelanggan;
}
```

Dengan cara tersebut, data dalam objek menjadi lebih terkontrol karena akses terhadap atribut dilakukan melalui method yang telah disediakan oleh class.

### Letak Penerapan Encapsulation

Encapsulation diterapkan pada:

- `Pelanggan.java`
- `Barang.java`
- `Pembayaran.java`
- `PesananJastip.java`
- `JastipFashion.java`
- `JastipSkincare.java`
- `ValidasiInput.java`
- `KelolaPesanan.java`

---

## 🌳 2. Inheritance

**Inheritance** digunakan agar sebuah class dapat mewarisi atribut dan method dari class lain.

Pada program ini:

- `PesananJastip` berperan sebagai **superclass**.
- `JastipFashion` berperan sebagai **subclass**.
- `JastipSkincare` berperan sebagai **subclass**.

### Struktur Inheritance

```text
                 PesananJastip
                  Superclass
                 /           \
                /             \
               ↓               ↓
       JastipFashion     JastipSkincare
          Subclass           Subclass
```

Superclass digunakan untuk menyimpan data yang bersifat umum dan dapat digunakan oleh berbagai jenis pesanan.

Sedangkan subclass digunakan untuk menambahkan karakteristik khusus sesuai dengan jenis pesanan.

### Superclass `PesananJastip`

```java
public class PesananJastip {
```

Class ini menyimpan data umum seperti:

- ID pesanan
- Pelanggan
- Barang
- Jumlah
- Pembayaran
- Status pesanan

### Subclass `JastipFashion`

```java
public class JastipFashion extends PesananJastip {
```

Subclass Fashion mewarisi data dari `PesananJastip` dan menambahkan atribut khusus:

```java
private String ukuran;
private String warna;
```

### Subclass `JastipSkincare`

```java
public class JastipSkincare extends PesananJastip {
```

Subclass Skincare mewarisi data dari `PesananJastip` dan menambahkan atribut:

```java
private String jenisKulit;
private int ukuranProduk;
```

Kata kunci `extends` menunjukkan hubungan inheritance antara subclass dan superclass.

Constructor subclass juga menggunakan `super()` untuk memanggil constructor superclass.

Contoh:

```java
super(
    idPesanan,
    pelanggan,
    barang,
    jumlah,
    pembayaran,
    statusPesanan
);
```

Dengan penerapan tersebut, program memiliki **1 superclass dan 2 subclass**.

---

## 🔁 3. Polymorphism

**Polymorphism** diterapkan melalui **method overriding**.

Pada superclass `PesananJastip`, terdapat method:

```java
public void tampilkanData() {
    ...
}
```

Method tersebut kemudian dioverride oleh `JastipFashion`:

```java
@Override
public void tampilkanData() {
    super.tampilkanData();
    System.out.println("Ukuran           : " + ukuran);
    System.out.println("Warna            : " + warna);
}
```

Method yang sama juga dioverride oleh `JastipSkincare`:

```java
@Override
public void tampilkanData() {
    super.tampilkanData();
    System.out.println("Jenis Kulit      : " + jenisKulit);
    System.out.println("Ukuran Produk    : " + ukuranProduk + " ml");
}

![alt text](?raw=true)

```

Pada class `KelolaPesanan`, seluruh objek disimpan dalam:

```java
private ArrayList<PesananJastip> daftarPesanan;
```

Kemudian sistem memanggil:

```java
pesanan.tampilkanData();
```

Walaupun variabel menggunakan tipe `PesananJastip`, method yang dijalankan dapat menyesuaikan dengan jenis objek sebenarnya.

Contohnya:

- Objek `JastipFashion` akan menjalankan `tampilkanData()` milik `JastipFashion`.
- Objek `JastipSkincare` akan menjalankan `tampilkanData()` milik `JastipSkincare`.

Dengan demikian, penerapan overriding pada program menunjukkan penggunaan **Polymorphism**.

---

## ⭐ NILAI TAMBAH

Nilai tambah pada project ini dibedakan dari fitur kreatif agar penerapannya sesuai dengan ketentuan tugas.

### 1. Pendekatan MVC Sederhana

Program menerapkan pemisahan struktur dengan menggunakan pendekatan **MVC sederhana**.

### Model

Package `Model` berisi class yang merepresentasikan data dan objek program:

- `PesananJastip`
- `JastipFashion`
- `JastipSkincare`
- `Pelanggan`
- `Barang`
- `Pembayaran`

Bagian ini berfokus pada representasi data yang digunakan dalam sistem.

### Logic

Package `Logic` berisi:

```text
KelolaPesanan.java
```

Class ini menangani proses pengelolaan data pesanan, seperti:

- Menambah pesanan
- Menampilkan pesanan
- Mencari pesanan
- Mengubah pesanan
- Menghapus pesanan
- Mengubah status
- Menampilkan struk
- Menampilkan ringkasan

### Helper

Package `Helper` berisi:

```text
ValidasiInput.java
```

Class ini digunakan untuk membantu proses validasi input pengguna.

### Main

Class:

```text
SistemJastip_Minpro2.java
```

digunakan untuk:

- Menjalankan program
- Menampilkan menu
- Menerima input pengguna
- Mengatur alur interaksi program

Pembagian tersebut membuat setiap bagian program memiliki tanggung jawab yang lebih jelas.

> **Catatan:** Penerapan MVC pada project ini merupakan **pendekatan MVC sederhana**, karena class `Main` masih menangani menu dan alur interaksi program.

---

### 2. Polymorphism

Polymorphism menjadi salah satu nilai tambah karena program menerapkan **method overriding**.

Method `tampilkanData()` pada superclass dioverride oleh:

- `JastipFashion`
- `JastipSkincare`

Hal tersebut memungkinkan pemanggilan method yang sama menghasilkan tampilan tambahan yang berbeda sesuai dengan jenis objek pesanan.

---

## ✨ FITUR PENGEMBANGAN PROGRAM

Selain ketentuan utama dan nilai tambah, program juga memiliki beberapa fitur kreatif yang dikembangkan untuk mendukung fungsi sistem.

> **Catatan:** Fitur pada bagian ini merupakan pengembangan program dan **dibedakan dari nilai tambah** seperti MVC dan Polymorphism.

### 1. Status Pesanan

Program menyediakan beberapa status untuk menggambarkan perkembangan pesanan:

- Menunggu Pembayaran
- Pembayaran Berhasil
- Sedang Dibeli
- Dalam Pengiriman
- Pesanan Selesai

Fitur ini membuat sistem dapat mencatat perkembangan pesanan, bukan hanya menyimpan data transaksi.

---

### 2. Struk Pesanan

Program menyediakan menu **Lihat Struk** yang menampilkan informasi transaksi dalam format yang lebih ringkas.

Informasi yang ditampilkan meliputi:

- Pelanggan
- Barang
- Harga
- Berat
- Jumlah
- Biaya jastip
- Metode pembayaran
- Total pembayaran
- Status pesanan

Fitur ini mempermudah pengguna melihat informasi penting dari satu transaksi.

---

### 3. Ringkasan Pesanan

Program menyediakan menu **Ringkasan Pesanan** untuk menampilkan hasil perhitungan keseluruhan data.

Ringkasan berisi:

- Total pesanan
- Jumlah Fashion
- Jumlah Skincare
- Total berat
- Total pembayaran

Fitur ini membantu pengguna melihat kondisi keseluruhan data secara lebih cepat.

---

### 4. ID Pesanan Otomatis

Program membuat ID pesanan secara otomatis berdasarkan jenis jastip.

Contoh:

```text
FSH-001
FSH-002
SKN-001
SKN-002
```

Keterangan:

- `FSH` digunakan untuk kategori Fashion.
- `SKN` digunakan untuk kategori Skincare.
- Nomor dibuat secara berurutan dan diperiksa agar tidak menggunakan ID yang sudah tersedia.

Dengan fitur ini, pengguna tidak perlu memasukkan ID pesanan secara manual.

---

### 5. Perhitungan Biaya Jastip Berdasarkan Berat

Berat barang tidak hanya disimpan sebagai atribut, tetapi digunakan dalam proses perhitungan biaya jastip.

Rumus yang digunakan:

```text
Biaya Jastip = Berat × Jumlah × Rp50.000
```

Total pembayaran dihitung dengan:

```text
Total Pembayaran = Harga Barang × Jumlah + Biaya Jastip
```

Dengan demikian, atribut **berat barang memiliki fungsi nyata dalam sistem**, karena perubahan berat dan jumlah akan memengaruhi biaya jastip dan total pembayaran.

---

## 📝 CRUD

CRUD merupakan operasi dasar untuk mengelola data.

Pada program ini penerapan CRUD adalah:

| Operasi | Menu | Implementasi |
|---|---|---|
| **Create** | Menu 1 - Tambah Pesanan | Membuat dan menambahkan objek pesanan ke dalam `ArrayList`. |
| **Read** | Menu 2 - Lihat Pesanan | Membaca dan menampilkan data pesanan dari `ArrayList`. |
| **Update** | Menu 3 - Ubah Pesanan | Mengubah data pelanggan, barang, berat, jumlah, biaya jastip, dan total pembayaran. |
| **Delete** | Menu 4 - Hapus Pesanan | Menghapus objek pesanan dari `ArrayList`. |

CRUD diterapkan melalui class `KelolaPesanan` dan dikendalikan melalui menu utama.

---

## 📦 ARRAYLIST

Program menggunakan `ArrayList` untuk menyimpan kumpulan objek pesanan.

Implementasinya terdapat pada class `KelolaPesanan`:

```java
private ArrayList<PesananJastip> daftarPesanan;
```

`ArrayList` digunakan karena jumlah pesanan dapat bertambah maupun berkurang selama program berjalan.

### Menambahkan Data

```java
daftarPesanan.add(pesanan);
```

### Menghapus Data

```java
daftarPesanan.remove(pesanan);
```

### Menampilkan Data

```java
for (PesananJastip pesanan : daftarPesanan) {
    pesanan.tampilkanData();
}
```

Dengan menggunakan `ArrayList`, sistem dapat menyimpan beberapa objek pesanan dalam satu kumpulan data.

---

## ☑️ VALIDASI INPUT

Program memiliki class `ValidasiInput` yang digunakan untuk memastikan input pengguna sesuai dengan batas yang telah ditentukan.

### Validasi String

Digunakan untuk memastikan:

- Input tidak kosong.
- Panjang input tidak kurang dari batas minimum.
- Panjang input tidak melebihi batas maksimum.

### Validasi Integer

Digunakan untuk memastikan:

- Input berupa angka.
- Nilai berada dalam rentang yang ditentukan.

### Validasi Double

Digunakan untuk memastikan:

- Input berupa angka.
- Nilai berada dalam rentang yang ditentukan.

Contoh:

```java
input.inputInteger("Jumlah : ", 1, 100);
```

Artinya jumlah barang harus berada antara **1 sampai 100**.

Validasi tersebut membantu mengurangi kemungkinan pengguna memasukkan data yang tidak sesuai dengan kebutuhan program.

---

## 💾 DUMMY DATA

Program menyediakan dummy data yang langsung dimasukkan ke dalam `ArrayList` ketika `KelolaPesanan` dibuat.

Data awal terdiri dari:

- Satu pesanan **Jastip Fashion**
- Satu pesanan **Jastip Skincare**

Contoh ID:

```text
FSH-001
SKN-001
```

Dummy data digunakan agar ketika program pertama kali dijalankan, menu **Lihat Pesanan** sudah memiliki data yang dapat ditampilkan.

Dengan adanya dummy data, pengguna dapat langsung mencoba beberapa fitur tanpa harus menambahkan pesanan terlebih dahulu, seperti:

- Read
- Lihat Struk
- Ubah Pesanan
- Ubah Status
- Ringkasan
- Hapus Pesanan

---

## 🔐 ACCESS MODIFIER

Program menerapkan access modifier `private` pada atribut class.

Contoh pada class `Barang`:

```java
private String namaBarang;
private String negaraAsal;
private double harga;
private double berat;
```

Penggunaan `private` membatasi akses langsung terhadap atribut dari luar class.

Untuk mengakses data, program menggunakan method getter dan setter.

Contoh:

```java
public double getHarga() {
    return harga;
}
```

Penerapan access modifier ini juga mendukung konsep **Encapsulation**.

---

## 🏗️ CONSTRUCTOR

Constructor digunakan untuk memberikan nilai awal ketika sebuah objek dibuat.

Contoh pada class `Barang`:

```java
public Barang(String namaBarang, String negaraAsal, double harga, double berat) {
    this.namaBarang = namaBarang;
    this.negaraAsal = negaraAsal;
    this.harga = harga;
    this.berat = berat;
}
```

Constructor juga diterapkan pada class:

- `Pelanggan`
- `Barang`
- `Pembayaran`
- `PesananJastip`
- `JastipFashion`
- `JastipSkincare`
- `ValidasiInput`
- `KelolaPesanan`

Dengan constructor, objek dapat langsung dibuat dengan data awal yang diperlukan.

---

## 📸 DOKUMENTASI PROGRAM

Dokumentasi berikut digunakan untuk menunjukkan hasil implementasi dan pengujian program.

> **Catatan:** Ganti bagian `[Masukkan Screenshot]` dengan screenshot asli dari program sebelum README dikumpulkan.

### 1. Tampilan Menu Utama

![alt text](?raw=true)

**Gambar 1. Tampilan Menu Utama Sistem Jasa Titip**

Screenshot menunjukkan menu utama yang menyediakan seluruh pilihan proses dalam sistem, mulai dari menambahkan pesanan hingga mengakhiri program.

---

### 2. Tambah Pesanan

![alt text](?raw=true)

**Gambar 2. Proses Penambahan Pesanan**

Screenshot menunjukkan proses pengguna memilih jenis jastip dan memasukkan data pelanggan, barang, berat, jumlah, serta informasi pembayaran.

---

### 3. Lihat Pesanan

![alt text](?raw=true)

**Gambar 3. Tampilan Data Pesanan**

Screenshot menunjukkan data pesanan yang telah tersimpan dalam `ArrayList` dan ditampilkan oleh sistem.

---

### 4. Ubah Pesanan

![alt text](?raw=true)

**Gambar 4. Proses Perubahan Data Pesanan**

Screenshot menunjukkan proses pencarian pesanan berdasarkan ID dan perubahan data pesanan yang telah tersimpan.

---

### 5. Hapus Pesanan

![alt text](?raw=true)

**Gambar 5. Proses Penghapusan Data Pesanan**

Screenshot menunjukkan proses penghapusan pesanan berdasarkan ID yang dimasukkan pengguna.

---

### 6. Lihat Struk

![alt text](?raw=true)

**Gambar 6. Tampilan Struk Pesanan**

Screenshot menunjukkan informasi transaksi dalam bentuk struk, meliputi data pelanggan, barang, biaya jastip, metode pembayaran, total pembayaran, dan status pesanan.

---

### 7. Ubah Status

![alt text](?raw=true)

**Gambar 7. Proses Perubahan Status Pesanan**

Screenshot menunjukkan pilihan status yang tersedia untuk memperbarui perkembangan pesanan.

---

### 8. Ringkasan Pesanan

![alt text](?raw=true)

**Gambar 8. Tampilan Ringkasan Pesanan**

Screenshot menunjukkan hasil perhitungan keseluruhan data pesanan, seperti total pesanan, jumlah kategori, total berat, dan total pembayaran.

---

## 📚 RANGKUMAN PENERAPAN KONSEP

| Konsep | Penerapan dalam Program |
|---|---|
| **Class & Object** | Data dan proses program direpresentasikan menggunakan class dan object. |
| **Constructor** | Digunakan untuk menginisialisasi object ketika dibuat. |
| **Access Modifier** | Atribut menggunakan `private` untuk membatasi akses langsung. |
| **Encapsulation** | Getter dan setter digunakan untuk mengakses serta mengubah atribut. |
| **Inheritance** | `JastipFashion` dan `JastipSkincare` mewarisi `PesananJastip`. |
| **Superclass** | `PesananJastip` menjadi class induk. |
| **Subclass** | `JastipFashion` dan `JastipSkincare` menjadi class turunan. |
| **`extends`** | Digunakan untuk menerapkan hubungan inheritance. |
| **`super()`** | Digunakan untuk memanggil constructor superclass. |
| **`@Override`** | Digunakan pada method `tampilkanData()` di subclass. |
| **Polymorphism** | Pemanggilan `tampilkanData()` dapat menjalankan versi sesuai objek subclass. |
| **ArrayList** | Digunakan untuk menyimpan kumpulan pesanan. |
| **CRUD** | Digunakan untuk menambah, melihat, mengubah, dan menghapus data. |
| **Validasi Input** | Digunakan untuk memastikan input sesuai tipe dan batas yang ditentukan. |
| **Dummy Data** | Dua data awal disediakan agar program dapat langsung diuji. |
| **MVC Sederhana** | Program dipisahkan menjadi Model, Logic, Helper, dan Main berdasarkan tanggung jawab. |

---

## PENUTUP

Program **Sistem Jasa Titip Belanja Luar Negeri** merupakan penerapan konsep **Object-Oriented Programming (OOP)** dalam studi kasus pengelolaan jasa titip.

Program menerapkan konsep utama seperti **Encapsulation, Inheritance, Constructor, ArrayList, Access Modifier, CRUD, Input Validation, dan Dummy Data**.

Selain konsep utama tersebut, program menerapkan **nilai tambah berupa pendekatan MVC sederhana dan Polymorphism**.

Program juga dikembangkan dengan beberapa fitur kreatif seperti **Status Pesanan, Struk Pesanan, Ringkasan Pesanan, ID Pesanan Otomatis, serta Perhitungan Biaya Jastip Berdasarkan Berat Barang**.

Dengan adanya pembagian tersebut, program tidak hanya menerapkan konsep OOP yang dibutuhkan dalam Mini Project 2, tetapi juga memiliki pengembangan fitur yang mendukung proses pengelolaan data jasa titip secara lebih terstruktur.
