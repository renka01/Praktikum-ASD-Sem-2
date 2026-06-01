# Laporan Praktikum - Queue (Antrean)

Dokumen ini berisi jawaban atas pertanyaan praktikum mengenai konsep Queue (Antrean Melingkar) di dalam pemrograman Java.

---

## 2.1.3. Pertanyaan & Jawaban

### 1. Pada konstruktor, mengapa nilai awal atribut `front` dan `rear` bernilai `-1`, sementara atribut `size` bernilai `0`?
**Jawaban:**
* Nilai awal `front` dan `rear` diatur ke `-1` untuk menandakan bahwa **Queue masih kosong** dan belum menunjuk ke indeks array mana pun (karena indeks array valid dimulai dari `0`). Jika nilai awal diatur ke `0`, hal tersebut secara keliru menyatakan bahwa sudah ada elemen di indeks ke-0.
* Atribut `size` bernilai `0` karena saat Queue baru diinisialisasi/dibuat, **jumlah elemen aktif** di dalamnya memang masih nol.

---

### 2. Pada method `Enqueue`, jelaskan maksud dan kegunaan dari potongan kode berikut!
```java
if (rear == max - 1) {
    rear = 0;
}
```
**Jawaban:**
Potongan kode ini berfungsi untuk menerapkan konsep **Circular Queue** (Antrean Melingkar):
* Ketika penunjuk belakang (`rear`) sudah mencapai batas akhir indeks array (`max - 1`), namun Queue secara keseluruhan belum penuh (masih ada slot kosong di bagian depan karena proses `dequeue` sebelumnya), maka nilai `rear` akan **diputar kembali ke indeks `0`**.
* Hal ini memungkinkan penggunaan memori array yang efisien dengan memanfaatkan kembali slot kosong di awal array.

---

### 3. Pada method `Dequeue`, jelaskan maksud dan kegunaan dari potongan kode berikut!
```java
if (front == max - 1) {
    front = 0;
}
```
**Jawaban:**
Sama seperti pada method `Enqueue`, potongan kode ini mendukung mekanisme **Circular Queue**:
* Ketika penunjuk elemen terdepan (`front`) sudah berada di ujung akhir array (`max - 1`) dan elemen tersebut dikeluarkan (`dequeue`), maka penunjuk `front` berikutnya akan **berputar kembali menunjuk ke indeks `0`** di awal array.
* Hal ini memastikan pergeseran elemen terdepan berjalan secara melingkar.

---

### 4. Pada method `print`, mengapa pada proses perulangan variabel `i` tidak dimulai dari `0` (`int i = 0`), melainkan `int i = front`?
**Jawaban:**
Karena akibat dari operasi `dequeue` dan sifat melingkar (circular) dari antrean ini, **elemen terdepan dari Queue tidak selalu berada pada indeks `0`**. Indeks elemen terdepan yang sah selalu ditunjuk oleh atribut `front`. Oleh karena itu, perulangan cetak data harus dimulai dari `front` agar urutan data yang ditampilkan sesuai dengan urutan masuknya (prinsip FIFO - *First-In, First-Out*).

---

### 5. Perhatikan kembali method `print`, jelaskan maksud dari potongan kode berikut!
```java
i = (i + 1) % max;
```
**Jawaban:**
Formula `i = (i + 1) % max` digunakan untuk **menggeser indeks `i` secara melingkar (circular)**:
* Operasi sisa hasil bagi (`% max`) memastikan bahwa ketika nilai `i` mencapai indeks terakhir (`max - 1`), langkah berikutnya akan langsung berputar kembali ke `0`.
* Ini mencegah terjadinya error indeks di luar batas (`ArrayIndexOutOfBoundsException`) saat mencetak Queue melingkar.

---

### 6. Tunjukkan potongan kode program yang merupakan queue overflow!
**Jawaban:**
**Queue Overflow** terjadi ketika program mendeteksi bahwa Queue sudah penuh (`isFull()`) namun pengguna masih mencoba memasukkan data baru (`Enqueue`). Potongan kode yang menanganinya di dalam method `Enqueue` adalah:
```java
if (isFull()) {
    System.out.println("Queue sudah penuh");
    System.out.println("Program dihentikan (Queue Overflow)");
    System.exit(0);
}
```

---

### 7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi queue overflow dan queue underflow, program dihentikan!
**Jawaban:**
Program telah berhasil dimodifikasi dengan menambahkan perintah **`System.exit(0);`** setelah pesan kesalahan ditampilkan agar jalannya program langsung dihentikan ketika terdeteksi overflow maupun underflow.

#### Modifikasi pada `Queue.java`:
* **Queue Overflow (dalam method `Enqueue`):**
  ```java
  if (isFull()) {
      System.out.println("Queue sudah penuh");
      System.out.println("Program dihentikan (Queue Overflow)");
      System.exit(0);
  }
  ```
* **Queue Underflow (dalam method `dequeue`):**
  ```java
  if (isEmpty()) {
      System.out.println("Queue Masih Kosong");
      System.out.println("Program dihentikan (Queue Underflow)");
      System.exit(0);
  }
  ```
