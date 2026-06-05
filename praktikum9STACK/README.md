# Laporan Jawaban Pertanyaan Praktikum - Stack (Tumpukan)

Dokumen ini berisi jawaban lengkap atas pertanyaan-pertanyaan praktikum pada sub-bab **2.1.3** dan **2.2.3** mengenai struktur data Stack dan Konversi Desimal ke Biner.

---

## 2.1.3 Pertanyaan (Percobaan 1: Stack Tugas Mahasiswa)

### 1. Perbaikan Kode Program agar Keluaran Sesuai Percobaan
Untuk memperbaiki keluaran program agar sesuai, ada 2 bagian utama yang diperbaiki:

* **A. Perbaikan Parameter Konstruktor (`MahasiswaDemo15.java`)**
  * **Penyebab**: Urutan parameter saat instansiasi terbalik antara Nama dan NIM.
  * **Sebelumnya**: `Mahasiswa15 mhs = new Mahasiswa15(nama, nim, kelas);`
  * **Perbaikan**: `Mahasiswa15 mhs = new Mahasiswa15(nim, nama, kelas);`

* **B. Perbaikan Format Output Print (`StackTugasMahasiswa15.java`)**
  * **Penyebab**: Urutan pencetakan data mahasiswa tidak cocok dengan header `"NIM\tNama\tKelas\tNilai"` serta data `nilai` tidak ditampilkan.
  * **Sebelumnya**: `System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);`
  * **Perbaikan**: `System.out.println(stack[i].nim + "\t" + stack[i].nama + "\t" + stack[i].kelas + "\t" + stack[i].nilai);`

---

### 2. Kapasitas Maksimum Penampung Tugas pada Stack
Stack dapat menampung maksimal **5 data tugas**.

* **Potongan Kode Inisialisasi (`MahasiswaDemo15.java` Baris 10)**:
  ```java
  StackTugasMahasiswa15 stack = new StackTugasMahasiswa15(5);
  ```
* **Potongan Kode Konstruktor (`StackTugasMahasiswa15.java` Baris 8-12)**:
  ```java
  public StackTugasMahasiswa15(int size) {
      this.size = size;
      this.stack = new Mahasiswa15[size];
      this.top = -1;
  }
  ```

---

### 3. Pentingnya Pengecekan Kondisi `!isFull()` pada Method `push`
* **Mengapa perlu pengecekan?**
  Pengecekan `!isFull()` memastikan bahwa tumpukan masih memiliki ruang kosong sebelum kita memasukkan data baru. Hal ini mencegah terjadinya **Stack Overflow** (penuh melebihi alokasi memori array).
* **Dampaknya jika dihapus**:
  Jika kondisi if-else dihapus dan kita memaksakan menaruh data saat stack penuh, penunjuk indeks `top` akan bertambah melebihi batas ukuran array (`top >= size`). Hal ini akan menyebabkan program mengalami error runtime **`ArrayIndexOutOfBoundsException`** dan langsung keluar dari jalannya sistem (*crash*).

---

### 4. Modifikasi Menampilkan "Tugas Terbawah" (Pertama Kali Dikumpulkan)
Tugas pertama kali dikumpulkan berada di posisi paling dasar stack, yakni indeks **`0`**.

* **Tambahan Method di `StackTugasMahasiswa15.java`**:
  ```java
  public Mahasiswa15 peekBottom() {
      if (!isEmpty()) {
          return stack[0];
      } else {
          System.out.println("Stack tugas kosong!");
          return null;
      }
  }
  ```
* **Tambahan Pilihan Menu 5 di `MahasiswaDemo15.java`**:
  ```java
  case 5:
      Mahasiswa15 terbawah = stack.peekBottom();
      if (terbawah != null) {
          System.out.printf("Tugas pertama kali dikumpulkan oleh %s\n", terbawah.nama);
      }
      break;
  ```

---

### 5. Tambahan Method Menghitung Jumlah Tugas Saat Ini
Jumlah tugas yang sudah masuk dalam tumpukan dihitung berdasarkan nilai dari **`top + 1`**.

* **Tambahan Method di `StackTugasMahasiswa15.java`**:
  ```java
  public int getJumlahTugas() {
      return top + 1;
  }
  ```
* **Tambahan Pilihan Menu 6 di `MahasiswaDemo15.java`**:
  ```java
  case 6:
      System.out.printf("Jumlah tugas yang sudah dikumpulkan saat ini: %d\n", stack.getJumlahTugas());
      break;
  ```

---

## 2.2.3 Pertanyaan (Percobaan 2: Konversi Desimal Ke Biner)

### 1. Alur Kerja dari Method `konversiDesimalKeBiner(int nilai)`
1. **Inisialisasi**: Menerima input bilangan desimal bertipe `int` (misal: `nilai = 85`), lalu instansiasi objek `StackKonversi15 stack` berukuran 32 elemen.
2. **Pencarian Sisa Bagi & Pengisian Stack (Loop 1)**:
   * Selama `nilai > 0`, ambil sisa pembagian dengan angka 2 (`int sisa = nilai % 2`), lalu masukkan ke stack (`stack.push(sisa)`).
   * Nilai diperbarui dengan membaginya dengan 2 (`nilai = nilai / 2`).
   * *Contoh sisa yang didapatkan untuk angka 85*: `1`, `0`, `1`, `0`, `1`, `0`, `1` (dari bawah ke atas).
3. **Penyusunan Hasil Biner (Loop 2)**:
   * Mengambil semua elemen dari stack satu-persatu secara LIFO (Last In First Out) menggunakan `stack.pop()`.
   * Gabungkan hasil pop tersebut ke dalam variabel string `biner`. Karena dikeluarkan dari urutan terakhir masuk, susunan biner otomatis berbalik menjadi urutan biner yang sah: `1010101`.
4. **Hasil Akhir**: Mengembalikan string `biner`.

---

### 2. Mengubah Kondisi Perulangan menjadi `while (nilai != 0)`
* **Hasilnya**: Hasil konversi akan **tetap sama/identik** dengan kondisi sebelumnya jika angka desimal yang dikonversikan bernilai **positif**.
* **Alasannya**: Proses pembagian bilangan positif bulat dengan 2 akan terus berkurang secara bertahap dan pasti berakhir tepat di nilai `0`. Oleh karena itu, kondisi `nilai > 0` dan `nilai != 0` akan bernilai `false` pada waktu yang sama ketika nilai habis mencapai angka 0.
* **Perbedaannya**: Perbedaan baru akan terjadi apabila input bilangannya adalah **bilangan negatif** (misalnya `-5`). 
  * Pada kondisi lama (`nilai > 0`), perulangan tidak akan berjalan sama sekali (mengembalikan string kosong).
  * Pada kondisi baru (`nilai != 0`), perulangan akan terus membagi angka negatif tersebut secara matematis (dapat mengakibatkan infinite loop/sisa pembagian negatif).
