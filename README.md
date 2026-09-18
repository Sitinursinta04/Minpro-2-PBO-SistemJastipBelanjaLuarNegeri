# 🛍️ SISTEM JASA TITIP LUAR NEGERI

## 📌 Deskripsi Singkat Program

**Sistem Jasa Titip Luar Negeri** merupakan program berbasis Java yang dibuat untuk membantu proses pengelolaan pesanan jasa titip barang dari luar negeri.

Program ini memungkinkan pengguna untuk mengelola data pelanggan, barang, pembayaran, dan status pesanan melalui menu yang tersedia. Program juga membedakan jenis pesanan menjadi **Jastip Fashion** dan **Jastip Skincare** dengan menerapkan konsep **Inheritance** dan **Polymorphism**.

Program dibuat sebagai penerapan materi **Pemrograman Berorientasi Objek (PBO)** yang telah dipelajari. Beberapa konsep yang diterapkan dalam program antara lain:

- Encapsulation
- Inheritance
- Constructor
- Access Modifier
- ArrayList
- CRUD
- Input Validation
- Polymorphism

Selain menerapkan ketentuan utama tersebut, program juga dikembangkan dengan beberapa fitur tambahan yang disesuaikan dengan proses jasa titip, seperti **ID pesanan otomatis, status pesanan, perhitungan biaya berdasarkan berat barang, struk pesanan, dan ringkasan pesanan**.

---

# 🎯 Tujuan Program

Program **Sistem Jasa Titip Luar Negeri** dibuat dengan tujuan:

1. Membuat sistem sederhana untuk mengelola pesanan jasa titip barang dari luar negeri.
2. Menerapkan konsep dasar Pemrograman Berorientasi Objek menggunakan bahasa Java.
3. Menerapkan konsep encapsulation untuk menjaga dan mengatur akses terhadap data.
4. Menerapkan inheritance untuk membedakan jenis pesanan Fashion dan Skincare.
5. Menerapkan CRUD untuk mengelola data pesanan.
6. Menerapkan validasi input agar data yang dimasukkan pengguna sesuai dengan ketentuan.
7. Membuat program yang memiliki alur penggunaan yang lebih mendekati proses jasa titip pada kondisi nyata.

---

# 🔄 Alur Program

Program dimulai dengan membuat objek `KelolaPesanan` dan `ValidasiInput`. Pada saat program dijalankan, sistem juga menyediakan beberapa **data dummy** yang langsung dimasukkan ke dalam `ArrayList`.

Setelah itu, sistem menampilkan menu utama. Pengguna dapat memilih menu sesuai kebutuhan.

### Alur umum program:

1. Program dijalankan.
2. Sistem menyiapkan daftar pesanan.
3. Sistem memasukkan data dummy ke dalam `ArrayList`.
4. Sistem membuat objek `ValidasiInput`.
5. Menu utama ditampilkan.
6. Pengguna memilih menu.
7. Sistem menjalankan proses sesuai pilihan.
8. Setelah proses selesai, sistem kembali ke menu utama.
9. Proses berulang sampai pengguna memilih menu **Keluar**.

Program menggunakan perulangan `do-while`, sehingga menu akan terus muncul selama pengguna belum memilih pilihan nomor 8.

---

# 📋 Menu Program

| No. | Menu | Fungsi |
|---|---|---|
| 1 | Tambah Pesanan | Menambahkan pesanan baru |
| 2 | Lihat Pesanan | Menampilkan seluruh pesanan |
| 3 | Ubah Pesanan | Mengubah data pesanan |
| 4 | Hapus Pesanan | Menghapus pesanan berdasarkan ID |
| 5 | Lihat Struk | Menampilkan struk pesanan |
| 6 | Ubah Status | Mengubah status pesanan |
| 7 | Ringkasan Pesanan | Menampilkan ringkasan keseluruhan pesanan |
| 8 | Keluar | Mengakhiri program |

---

# 🧭 Penjelasan Alur Setiap Menu

## 1. Tambah Pesanan

Menu **Tambah Pesanan** digunakan untuk memasukkan pesanan baru ke dalam sistem.

Pertama, pengguna memilih jenis jastip:

1. Jastip Fashion
2. Jastip Skincare

Setelah jenis dipilih, sistem akan membuat ID pesanan secara otomatis.

Untuk pesanan Fashion, ID menggunakan format:

`FSH-001`

Sedangkan untuk pesanan Skincare menggunakan format:

`SKN-001`

Selanjutnya pengguna memasukkan data pelanggan, yaitu:

- Nama pelanggan
- Nomor telepon

Setelah itu pengguna memasukkan data barang:

- Nama barang
- Negara asal
- Harga barang
- Berat barang
- Jumlah barang

Berat barang digunakan dalam perhitungan biaya jastip sehingga data berat tidak hanya menjadi informasi tambahan, tetapi memiliki fungsi dalam proses perhitungan.

Setelah data barang dimasukkan, pengguna memilih metode pembayaran:

- Transfer Bank
- E-Wallet

Sistem kemudian menghitung biaya jastip dan total pembayaran.

Jika pengguna memilih **Jastip Fashion**, sistem meminta data tambahan:

- Ukuran
- Warna

Jika pengguna memilih **Jastip Skincare**, sistem meminta:

- Jenis kulit
- Ukuran produk

Setelah semua data lengkap, objek pesanan dibuat sesuai dengan jenis jastip yang dipilih dan dimasukkan ke dalam `ArrayList`.

Status awal untuk setiap pesanan baru adalah:

`Menunggu Pembayaran`

---

## 2. Lihat Pesanan

Menu **Lihat Pesanan** digunakan untuk menampilkan seluruh data pesanan yang tersimpan.

Data yang ditampilkan meliputi:

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

Data tambahan juga ditampilkan sesuai dengan jenis pesanan.

### Jastip Fashion

Data tambahan yang ditampilkan:

- Ukuran
- Warna

### Jastip Skincare

Data tambahan yang ditampilkan:

- Jenis kulit
- Ukuran produk

Data tersebut diambil dari objek yang tersimpan dalam `ArrayList`.

---

## 3. Ubah Pesanan

Menu **Ubah Pesanan** digunakan untuk mengubah data pesanan yang sudah tersimpan.

Pengguna terlebih dahulu memasukkan ID pesanan yang ingin diubah.

Sistem kemudian mencari pesanan tersebut menggunakan method:

```java
cariPesanan()
```

Jika ID ditemukan, pengguna dapat mengubah:

- Nama pelanggan
- Nomor telepon
- Nama barang
- Negara asal
- Harga barang
- Berat barang
- Jumlah barang

Setelah data baru dimasukkan, sistem menghitung kembali biaya jastip dan total pembayaran berdasarkan data terbaru.

Jika ID tidak ditemukan, sistem akan menampilkan pesan:

```text
Pesanan tidak ditemukan.
```

---

## 4. Hapus Pesanan

Menu **Hapus Pesanan** digunakan untuk menghapus data pesanan.

Pengguna memasukkan ID pesanan yang ingin dihapus.

Sistem mencari pesanan tersebut terlebih dahulu. Jika ditemukan, data akan dihapus dari `ArrayList`.

Proses penghapusan menggunakan:

```java
daftarPesanan.remove(pesanan);
```

Jika ID tidak ditemukan, sistem akan menampilkan pesan bahwa pesanan tidak ditemukan.

---

## 5. Lihat Struk

Menu **Lihat Struk** digunakan untuk menampilkan informasi pesanan dalam bentuk struk sederhana.

Struk menampilkan:

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

Fitur ini dibuat agar informasi transaksi dapat dilihat secara lebih ringkas dan menyerupai struk pada transaksi jasa titip.

---

## 6. Ubah Status

Menu **Ubah Status** digunakan untuk memperbarui perkembangan pesanan.

Program menyediakan lima pilihan status:

1. Menunggu Pembayaran
2. Pembayaran Berhasil
3. Sedang Dibeli
4. Dalam Pengiriman
5. Pesanan Selesai

Pengguna memilih status sesuai dengan kondisi pesanan.

Status tersebut kemudian disimpan pada objek pesanan sehingga perkembangan setiap pesanan dapat diperbarui.

---

## 7. Ringkasan Pesanan

Menu **Ringkasan Pesanan** digunakan untuk menampilkan gambaran keseluruhan data pesanan.

Informasi yang ditampilkan adalah:

- Total pesanan
- Total pesanan Fashion
- Total pesanan Skincare
- Total berat barang
- Total pembayaran

Sistem menghitung informasi tersebut berdasarkan seluruh data pesanan yang terdapat dalam `ArrayList`.

---

## 8. Keluar

Menu **Keluar** digunakan untuk menghentikan program.

Ketika pengguna memilih pilihan nomor 8, perulangan program berhenti dan sistem menampilkan pesan bahwa program telah selesai.

---

# 📦 Data Dummy

Program menyediakan data dummy yang dimasukkan ke dalam `ArrayList` pada saat objek `KelolaPesanan` dibuat.

Data dummy digunakan agar ketika program pertama kali dijalankan, menu **Lihat Pesanan** sudah memiliki data yang dapat ditampilkan.

Dengan adanya data dummy, pengguna dapat langsung melihat hasil penerapan program tanpa harus menambahkan data terlebih dahulu.

## Data Dummy 1 - Jastip Fashion

| Data | Nilai |
|---|---|
| ID Pesanan | FSH-001 |
| ID Pelanggan | PLG001 |
| Nama Pelanggan | Sinta |
| Nomor Telepon | 081234567890 |
| Nama Barang | Nike Air Force 1 '07 |
| Negara Asal | Amerika Serikat |
| Harga Barang | Rp2.500.000 |
| Berat | 1,5 kg |
| Jumlah | 1 |
| Biaya Jastip | Rp75.000 |
| Total Pembayaran | Rp2.575.000 |
| Metode Pembayaran | Transfer Bank |
| Status | Menunggu Pembayaran |
| Ukuran | 39 |
| Warna | Putih |

## Data Dummy 2 - Jastip Skincare

| Data | Nilai |
|---|---|
| ID Pesanan | SKN-001 |
| ID Pelanggan | PLG002 |
| Nama Pelanggan | Aisyah |
| Nomor Telepon | 081298765432 |
| Nama Barang | Laneige Water Sleeping Mask |
| Negara Asal | Korea Selatan |
| Harga Barang | Rp450.000 |
| Berat | 0,5 kg |
| Jumlah | 1 |
| Biaya Jastip | Rp25.000 |
| Total Pembayaran | Rp475.000 |
| Metode Pembayaran | E-Wallet |
| Status | Pembayaran Berhasil |
| Jenis Kulit | Normal |
| Ukuran Produk | 70 ml |

---

# 🧑‍💻 Penerapan Konsep PBO

## 1. Encapsulation

Encapsulation diterapkan dengan membatasi akses langsung terhadap atribut pada class.

Atribut pada program menggunakan access modifier `private`.

Contohnya pada class `Pelanggan`:

```java
private String idPelanggan;
private String namaPelanggan;
private String nomorTelepon;
```

Karena menggunakan `private`, atribut tersebut tidak dapat diakses secara langsung dari class lain.

Untuk mengakses data tersebut digunakan method `getter` dan `setter`.

Contoh:

```java
public String getNamaPelanggan() {
    return namaPelanggan;
}

public void setNamaPelanggan(String namaPelanggan) {
    this.namaPelanggan = namaPelanggan;
}
```

Getter digunakan untuk mengambil nilai atribut, sedangkan setter digunakan untuk mengubah nilai atribut.

Encapsulation diterapkan pada beberapa class seperti:

- `Pelanggan`
- `Barang`
- `Pembayaran`
- `PesananJastip`
- `JastipFashion`
- `JastipSkincare`
- `KelolaPesanan`
- `ValidasiInput`

---

## 2. Access Modifier

Access modifier digunakan untuk menentukan tingkat akses terhadap atribut dan method.

Pada program ini, atribut utama menggunakan:

```java
private
```

Sedangkan constructor dan method yang perlu digunakan oleh class lain menggunakan:

```java
public
```

Contoh:

```java
private double harga;
private double berat;
```

dan constructor:

```java
public Barang(String namaBarang, String negaraAsal, double harga, double berat) {
    this.namaBarang = namaBarang;
    this.negaraAsal = negaraAsal;
    this.harga = harga;
    this.berat = berat;
}
```

Penggunaan `private` dan `public` juga mendukung penerapan encapsulation pada program.

---

## 3. Constructor

Constructor digunakan untuk memberikan nilai awal ketika sebuah objek dibuat.

Contohnya pada class `Barang`:

```java
public Barang(String namaBarang, String negaraAsal, double harga, double berat) {
    this.namaBarang = namaBarang;
    this.negaraAsal = negaraAsal;
    this.harga = harga;
    this.berat = berat;
}
```

Constructor tersebut menerima data barang ketika objek dibuat.

Contoh penggunaan:

```java
Barang barang = new Barang(
    namaBarang,
    negaraAsal,
    harga,
    berat
);
```

Dengan constructor, objek dapat langsung memiliki data ketika pertama kali dibuat.

Constructor juga diterapkan pada class:

- `Pelanggan`
- `Barang`
- `Pembayaran`
- `PesananJastip`
- `JastipFashion`
- `JastipSkincare`
- `KelolaPesanan`
- `ValidasiInput`

---

# 🌳 Inheritance

Inheritance merupakan konsep pewarisan sifat dari superclass kepada subclass.

Pada program ini terdapat satu superclass:

**Superclass:**

`PesananJastip`

dan dua subclass:

- `JastipFashion`
- `JastipSkincare`

Hubungan tersebut digunakan karena kedua jenis jastip memiliki data dasar pesanan yang sama, tetapi masing-masing memiliki informasi tambahan yang berbeda.

Inheritance diterapkan menggunakan keyword `extends`.

Contoh pada `JastipFashion`:

```java
public class JastipFashion extends PesananJastip {
```

Contoh pada `JastipSkincare`:

```java
public class JastipSkincare extends PesananJastip {
```

Kedua subclass tersebut dapat menggunakan data dan method yang berasal dari `PesananJastip`.

Selain `extends`, program juga menggunakan `super()` pada constructor subclass untuk memanggil constructor dari superclass.

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

Dengan inheritance, data umum pesanan cukup didefinisikan pada superclass, sedangkan data yang bersifat khusus diletakkan pada masing-masing subclass.

---

# 👕 JastipFashion sebagai Subclass

`JastipFashion` merupakan subclass dari `PesananJastip`.

Class ini mewarisi data umum dari `PesananJastip`, kemudian memiliki atribut tambahan yang khusus digunakan untuk barang fashion:

```java
private String ukuran;
private String warna;
```

Atribut `ukuran` digunakan untuk menyimpan ukuran barang fashion, sedangkan `warna` digunakan untuk menyimpan warna barang.

Constructor `JastipFashion` menggunakan `super()` untuk memanggil constructor dari superclass.

Selain itu, class ini melakukan overriding terhadap method `tampilkanData()` untuk menambahkan informasi ukuran dan warna.

```java
@Override
public void tampilkanData() {
    super.tampilkanData();
    System.out.println("Ukuran           : " + ukuran);
    System.out.println("Warna            : " + warna);
}
```

---

# 🧴 JastipSkincare sebagai Subclass

`JastipSkincare` juga merupakan subclass dari `PesananJastip`.

Class ini mewarisi data umum pesanan dan memiliki atribut tambahan:

```java
private String jenisKulit;
private int ukuranProduk;
```

`jenisKulit` digunakan untuk menyimpan jenis kulit yang sesuai dengan produk skincare, sedangkan `ukuranProduk` digunakan untuk menyimpan ukuran produk dalam satuan mililiter.

Constructor `JastipSkincare` menggunakan `super()` untuk memanggil constructor superclass.

Class ini juga melakukan overriding terhadap method `tampilkanData()`.

```java
@Override
public void tampilkanData() {
    super.tampilkanData();
    System.out.println("Jenis Kulit      : " + jenisKulit);
    System.out.println("Ukuran Produk    : " + ukuranProduk + " ml");
}
```

---

# 🔁 Polymorphism

Polymorphism merupakan salah satu **nilai tambah** yang diterapkan dalam program.

Polymorphism diterapkan melalui **method overriding**.

Pada superclass `PesananJastip` terdapat method:

```java
public void tampilkanData() {
    ...
}
```

Method tersebut kemudian di-override pada dua subclass.

## Pada JastipFashion

```java
@Override
public void tampilkanData() {
    super.tampilkanData();
    System.out.println("Ukuran           : " + ukuran);
    System.out.println("Warna            : " + warna);
}
```

## Pada JastipSkincare

```java
@Override
public void tampilkanData() {
    super.tampilkanData();
    System.out.println("Jenis Kulit      : " + jenisKulit);
    System.out.println("Ukuran Produk    : " + ukuranProduk + " ml");
}
```

Kedua class memiliki method dengan nama yang sama, yaitu `tampilkanData()`, tetapi hasil tampilannya berbeda sesuai dengan jenis objek.

Polymorphism juga didukung oleh penggunaan:

```java
ArrayList<PesananJastip>
```

ArrayList tersebut dapat menyimpan objek `JastipFashion` dan `JastipSkincare` karena keduanya merupakan turunan dari `PesananJastip`.

---

# 🗂️ Struktur Project

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

Struktur project dibuat dengan memisahkan class berdasarkan fungsi masing-masing agar program lebih terorganisir dan mudah dipahami.

## Model

Package `Model` berisi class yang digunakan untuk merepresentasikan data dalam sistem.

Class di dalamnya yaitu:

- `PesananJastip`
- `JastipFashion`
- `JastipSkincare`
- `Pelanggan`
- `Barang`
- `Pembayaran`

## Logic

Package `Logic` berisi class yang menangani proses pengelolaan data pesanan.

Class yang digunakan adalah:

`KelolaPesanan`

## Helper

Package `Helper` berisi class yang digunakan sebagai pendukung program.

Class yang digunakan adalah:

`ValidasiInput`

## Main

Package `com.mycompany.sistemjastip_minpro2` berisi class utama:

`SistemJastip_Minpro2`

Class ini menjalankan program, menampilkan menu, menerima input, dan mengatur alur program.

---

# 🏗️ Penerapan MVC

MVC diterapkan sebagai salah satu **nilai tambah** pada program.

Program menggunakan pendekatan MVC sederhana dengan memisahkan bagian program berdasarkan tanggung jawabnya.

## Model

Bagian Model berisi class yang digunakan untuk menyimpan dan merepresentasikan data.

Class tersebut terdiri dari:

- `PesananJastip`
- `JastipFashion`
- `JastipSkincare`
- `Pelanggan`
- `Barang`
- `Pembayaran`

## Controller / Logic

Bagian pengelolaan proses terdapat pada:

`KelolaPesanan`

Class ini menangani proses seperti:

- Menambah pesanan
- Menampilkan pesanan
- Mencari pesanan
- Mengubah pesanan
- Menghapus pesanan
- Mengubah status
- Menampilkan struk
- Menampilkan ringkasan

## View / Main

Bagian tampilan dan interaksi pengguna terdapat pada:

`SistemJastip_Minpro2`

Class tersebut menampilkan menu dan menerima input dari pengguna.

Karena program dibuat dalam bentuk aplikasi console, penerapan MVC pada project ini merupakan **pendekatan MVC sederhana**, bukan penggunaan framework MVC secara penuh.

---

# 📌 Nilai Tambah

Nilai tambah dalam project ini **dibedakan dari fitur kreatif**.

Nilai tambah merupakan konsep tambahan dalam penerapan pemrograman yang digunakan untuk memperkaya struktur dan penerapan OOP pada program.

Nilai tambah yang diterapkan dalam project ini adalah:

## 1. MVC

MVC diterapkan dengan memisahkan bagian program berdasarkan tanggung jawabnya menjadi Model, Logic/Controller, dan Main/View.

Penerapan ini membuat struktur program lebih terorganisir dan memudahkan pembagian fungsi setiap class.

## 2. Polymorphism

Polymorphism diterapkan melalui method overriding pada method `tampilkanData()`.

Method tersebut terdapat pada superclass `PesananJastip` dan di-override oleh:

- `JastipFashion`
- `JastipSkincare`

Penggunaan `ArrayList<PesananJastip>` juga memungkinkan objek dari kedua subclass disimpan dalam satu daftar.

### Ringkasan Nilai Tambah

| Nilai Tambah | Letak Penerapan |
|---|---|
| MVC | Package `Model`, `Logic`, `Helper`, dan Main |
| Polymorphism | Method `tampilkanData()` pada `PesananJastip`, `JastipFashion`, dan `JastipSkincare` |

> **Catatan:** Fitur seperti status pesanan, struk, ringkasan, ID otomatis, dan perhitungan biaya berdasarkan berat tidak dimasukkan sebagai nilai tambah. Fitur tersebut merupakan pengembangan atau kreativitas fungsi pada program.

---

# ✨ Fitur Kreatif Program

Fitur kreatif merupakan pengembangan fungsi yang dibuat agar program lebih sesuai dengan gambaran sistem jasa titip dalam penggunaan nyata.

Fitur kreatif ini **berbeda dengan nilai tambah**. Fitur kreatif tidak digunakan untuk menggantikan penerapan MVC atau Polymorphism sebagai nilai tambah.

## 1. ID Pesanan Otomatis

Program membuat ID pesanan secara otomatis berdasarkan jenis jastip.

Format yang digunakan:

- Fashion → `FSH-001`
- Skincare → `SKN-001`

Dengan fitur ini, pengguna tidak perlu menentukan ID pesanan secara manual.

## 2. Status Pesanan

Program menyediakan status untuk menggambarkan perkembangan pesanan:

1. Menunggu Pembayaran
2. Pembayaran Berhasil
3. Sedang Dibeli
4. Dalam Pengiriman
5. Pesanan Selesai

Fitur ini membuat sistem dapat menggambarkan perkembangan pesanan dari awal hingga selesai.

## 3. Perhitungan Biaya Jastip Berdasarkan Berat

Berat barang digunakan secara langsung dalam perhitungan biaya jastip.

Rumus yang digunakan:

```text
Biaya Jastip = Berat Barang × Jumlah × Rp50.000
```

Sedangkan total pembayaran dihitung dengan:

```text
Total Pembayaran = Harga Barang × Jumlah + Biaya Jastip
```

Dengan demikian, atribut `berat` memiliki fungsi nyata di dalam sistem dan ikut memengaruhi jumlah biaya yang harus dibayarkan.

## 4. Struk Pesanan

Program menyediakan menu **Lihat Struk** untuk menampilkan informasi transaksi secara lebih ringkas.

Struk berisi informasi pelanggan, barang, berat, jumlah, biaya jastip, metode pembayaran, total pembayaran, dan status pesanan.

Fitur ini dibuat agar pengguna dapat melihat informasi transaksi dalam bentuk yang lebih terstruktur.

## 5. Ringkasan Pesanan

Program menyediakan menu **Ringkasan Pesanan** untuk menampilkan informasi keseluruhan data.

Ringkasan berisi:

- Total pesanan
- Total Fashion
- Total Skincare
- Total berat
- Total pembayaran

Fitur ini membantu pengguna melihat kondisi seluruh pesanan tanpa harus membaca setiap data satu per satu.

---

# 🛡️ Input Validation

Input validation digunakan untuk memastikan data yang dimasukkan pengguna sesuai dengan ketentuan.

Validasi dibuat pada class:

`ValidasiInput`

Class tersebut memiliki tiga method utama:

```java
inputString()
inputInteger()
inputDouble()
```

## `inputString()`

Digunakan untuk memvalidasi input berupa teks.

Program akan memeriksa:

- Input tidak boleh kosong.
- Panjang input minimal sesuai ketentuan.
- Panjang input maksimal sesuai ketentuan.

## `inputInteger()`

Digunakan untuk menerima input berupa bilangan bulat.

Program akan memastikan:

- Input yang diberikan berupa angka.
- Nilai angka berada pada batas minimum dan maksimum.

Contohnya digunakan pada input:

- Pilihan menu
- Jumlah barang
- Pilihan metode pembayaran
- Pilihan status
- Ukuran produk skincare

## `inputDouble()`

Digunakan untuk menerima angka desimal.

Method ini digunakan untuk data seperti:

- Harga barang
- Berat barang

Program akan memastikan input berupa angka dan nilainya berada dalam batas yang telah ditentukan.

Validasi input membantu mengurangi kesalahan ketika pengguna memasukkan data ke dalam program.

---

# 📝 Penerapan CRUD

CRUD merupakan proses pengelolaan data yang diterapkan dalam program.

CRUD terdiri dari:

- **Create**
- **Read**
- **Update**
- **Delete**

## Create

Create diterapkan melalui menu:

**Tambah Pesanan**

Setelah objek pesanan dibuat, data dimasukkan ke dalam `ArrayList` menggunakan:

```java
daftarPesanan.add(pesanan);
```

## Read

Read diterapkan melalui menu:

**Lihat Pesanan**

Program membaca seluruh data yang terdapat dalam `ArrayList`.

```java
for (PesananJastip pesanan : daftarPesanan) {
    pesanan.tampilkanData();
}
```

## Update

Update diterapkan melalui menu:

**Ubah Pesanan**

Pengguna memasukkan ID pesanan, kemudian sistem mencari data tersebut dan memperbarui informasi:

- Pelanggan
- Barang
- Jumlah
- Pembayaran

## Delete

Delete diterapkan melalui menu:

**Hapus Pesanan**

Data yang ditemukan berdasarkan ID kemudian dihapus menggunakan:

```java
daftarPesanan.remove(pesanan);
```

Dengan adanya empat proses tersebut, program dapat melakukan pengelolaan data pesanan secara lengkap.

---

# 📚 Daftar Class dan Fungsinya

| Class | Package | Fungsi |
|---|---|---|
| `PesananJastip` | Model | Superclass yang menyimpan data dan fungsi dasar pesanan |
| `JastipFashion` | Model | Subclass untuk pesanan kategori Fashion |
| `JastipSkincare` | Model | Subclass untuk pesanan kategori Skincare |
| `Pelanggan` | Model | Menyimpan data pelanggan |
| `Barang` | Model | Menyimpan data barang dan berat barang |
| `Pembayaran` | Model | Menyimpan data pembayaran |
| `KelolaPesanan` | Logic | Mengelola proses CRUD dan proses pesanan |
| `ValidasiInput` | Helper | Melakukan validasi input pengguna |
| `SistemJastip_Minpro2` | Main | Menjalankan program dan mengatur menu utama |

---

# 📸 Dokumentasi Program

## 1. Tampilan Menu Utama

**Screenshot:**

> Masukkan screenshot tampilan menu utama di sini.

**Penjelasan:**

Tampilan ini menunjukkan menu utama **Sistem Jasa Titip Luar Negeri**. Pengguna dapat memilih berbagai proses yang tersedia, mulai dari menambah, melihat, mengubah, dan menghapus pesanan hingga melihat struk, mengubah status, melihat ringkasan, dan keluar dari program.

---

## 2. Tambah Pesanan

**Screenshot:**

> Masukkan screenshot proses Tambah Pesanan di sini.

**Penjelasan:**

Tampilan ini menunjukkan proses penambahan pesanan baru. Pengguna memilih jenis jastip, kemudian memasukkan data pelanggan, barang, berat, jumlah, dan metode pembayaran. Sistem membuat ID secara otomatis dan menghitung biaya jastip berdasarkan berat barang.

---

## 3. Lihat Pesanan

**Screenshot:**

> Masukkan screenshot hasil Lihat Pesanan di sini.

**Penjelasan:**

Tampilan ini menunjukkan seluruh data pesanan yang tersimpan dalam `ArrayList`. Data yang ditampilkan menyesuaikan jenis pesanan. Jastip Fashion menampilkan ukuran dan warna, sedangkan Jastip Skincare menampilkan jenis kulit dan ukuran produk.

---

## 4. Ubah Pesanan

**Screenshot:**

> Masukkan screenshot proses Ubah Pesanan di sini.

**Penjelasan:**

Tampilan ini menunjukkan proses perubahan data pesanan berdasarkan ID. Pengguna dapat mengubah informasi pelanggan, barang, berat, jumlah, dan data pembayaran. Setelah perubahan dilakukan, biaya jastip dan total pembayaran dihitung kembali.

---

## 5. Hapus Pesanan

**Screenshot:**

> Masukkan screenshot proses Hapus Pesanan di sini.

**Penjelasan:**

Tampilan ini menunjukkan proses penghapusan data pesanan berdasarkan ID. Jika ID ditemukan, data akan dihapus dari daftar pesanan.

---

## 6. Lihat Struk

**Screenshot:**

> Masukkan screenshot hasil Lihat Struk di sini.

**Penjelasan:**

Tampilan ini menunjukkan informasi pesanan dalam bentuk struk sederhana. Informasi yang ditampilkan meliputi pelanggan, barang, harga, berat, jumlah, biaya jastip, metode pembayaran, total pembayaran, dan status.

---

## 7. Ubah Status

**Screenshot:**

> Masukkan screenshot menu Ubah Status di sini.

**Penjelasan:**

Tampilan ini menunjukkan pilihan status yang dapat digunakan untuk memperbarui perkembangan pesanan. Status dapat diubah mulai dari menunggu pembayaran hingga pesanan selesai.

---

## 8. Ringkasan Pesanan

**Screenshot:**

> Masukkan screenshot hasil Ringkasan Pesanan di sini.

**Penjelasan:**

Tampilan ini menunjukkan ringkasan keseluruhan pesanan yang terdiri dari jumlah pesanan, jumlah berdasarkan kategori, total berat barang, dan total pembayaran.

---

# 📊 Ringkasan Penerapan Program

| Bagian | Penerapan |
|---|---|
| CRUD | Tambah, lihat, ubah, dan hapus pesanan |
| Constructor | Digunakan untuk membuat dan memberikan nilai awal objek |
| ArrayList | Menyimpan daftar objek pesanan |
| Access Modifier | `private` pada atribut dan `public` pada method/constructor yang diperlukan |
| Encapsulation | Getter dan setter digunakan untuk mengakses data |
| Inheritance | `PesananJastip` sebagai superclass dan dua subclass |
| Superclass | `PesananJastip` |
| Subclass | `JastipFashion` dan `JastipSkincare` |
| Input Validation | Class `ValidasiInput` |
| Dummy Data | Data Fashion dan Skincare dimasukkan sejak awal |
| Nilai Tambah - MVC | Pemisahan Model, Logic, Helper, dan Main |
| Nilai Tambah - Polymorphism | Overriding `tampilkanData()` |
| Fitur Kreatif | ID otomatis, status pesanan, biaya berdasarkan berat, struk, dan ringkasan |

---

# 🏁 Penutup

Program **Sistem Jasa Titip Luar Negeri** dibuat sebagai penerapan konsep Pemrograman Berorientasi Objek menggunakan Java.

Program telah menerapkan konsep utama yang dibutuhkan, yaitu **CRUD, constructor, ArrayList, access modifier, encapsulation, inheritance, superclass dan subclass, input validation, serta dummy data**.

Pada penerapan inheritance, `PesananJastip` digunakan sebagai superclass, sedangkan `JastipFashion` dan `JastipSkincare` digunakan sebagai subclass. Perbedaan karakteristik kedua jenis pesanan juga ditunjukkan melalui method overriding sebagai penerapan **polymorphism**.

Selain konsep utama tersebut, program menerapkan **MVC sederhana dan Polymorphism sebagai nilai tambah**.

Program juga dikembangkan dengan beberapa **fitur kreatif**, yaitu ID pesanan otomatis, status pesanan, perhitungan biaya jastip berdasarkan berat barang, struk pesanan, dan ringkasan pesanan.

Dengan adanya pembagian antara **ketentuan utama, nilai tambah, dan fitur kreatif**, setiap bagian dalam program dapat dijelaskan sesuai dengan fungsi dan tujuan masing-masing tanpa mencampurkan konsep nilai tambah dengan fitur kreativitas program.
