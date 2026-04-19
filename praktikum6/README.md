# Jawaban Pertanyaan Praktikum 6 - Sequential Search

1. **Jelaskan perbedaan metod `tampilDataSearch` dan `tampilPosisi` pada class `MahasiswaBerprestasi`!**
   - Method `tampilPosisi` digunakan untuk menampilkan informasi posisi/indeks array di mana data mahasiswa dengan nilai yang dicari (misal IPK) ditemukan, atau menampilkan pesan peringatan jika data tersebut tidak ditemukan.
   - Method `tampilDataSearch` digunakan untuk menampilkan secara rinci seluruh data/informasi mahasiswa (NIM, nama, kelas, dan IPK) yang berada pada indeks hasil pencarian tersebut.

2. **Jelaskan fungsi `break` pada kode program di bawah ini!**
   Fungsi perintah `break` pada kode di atas (yang ada di dalam blok kondisi `if`) adalah untuk menghentikan proses perulangan (`for` loop) secara langsung sesaat setelah data yang dicari berhasil ditemukan. Hal ini membuat algoritma lebih efisien karena program tidak perlu lagi mengecek sisa elemen array lainnya setelah tujuan pencarian tercapai.

3. **Apa fungsi variabel `pos` atau indeks hasil pencarian dalam program sequential search?**
   Variabel `pos` (atau indeks hasil pencarian) berfungsi untuk menyimpan posisi indeks elemen di dalam array yang nilainya cocok dengan kriteria pencarian. Nilai indeks ini nantinya dapat digunakan untuk mengakses data lengkap pada elemen tersebut untuk ditampilkan atau diproses lebih lanjut. Jika data tidak ditemukan, variabel ini biasanya menyimpan nilai `-1` sebagai penanda.

4. **Jika terdapat lebih dari satu data dengan nilai yang sama, hasil pencarian sequential search yang dibuat di atas akan menampilkan data ke berapa? Jelaskan.**
   Hasil pencarian akan menampilkan **data yang pertama kali ditemukan** (yang memiliki indeks paling kecil/awal di array). Hal ini dikarenakan adanya perintah `break`. Begitu program menemukan data pertama yang sesuai, `break` akan dieksekusi dan perulangan langsung dihentikan, sehingga elemen-elemen berikutnya (meskipun mungkin memiliki nilai yang sama) tidak akan dievaluasi lagi.

5. **Berkaitan dengan pertanyaan nomor 2 di atas, apa yang terjadi jika perintah `break` dihapus dari kode di atas?**
   Jika perintah `break` dihapus, maka perulangan `for` akan terus berjalan secara penuh memeriksa seluruh isi array dari awal hingga akhir, meskipun data yang dicari sudah ditemukan di tengah-tengah. Akibatnya:
   - Program menjadi kurang efisien karena melakukan iterasi yang tidak perlu.
   - Jika terdapat **lebih dari satu data** dengan nilai yang sama, variabel penyimpan posisi (`posisi`) nilainya akan terus diperbarui (tertimpa), sehingga pada akhirnya ia akan menyimpan indeks dari data yang **terakhir kali ditemukan**, bukan yang pertama kali.

---
# Jawaban Pertanyaan Praktikum 6 - Binary Search (6.3.3)

1. **Tunjukkan pada kode program yang mana proses *divide* dijalankan!**
   Proses *divide* (pembagian) dijalankan pada baris kode `mid = (left + right) / 2;` di dalam method `findBinarySearch`. Baris ini membagi rentang pencarian menjadi dua bagian yang sama besar dengan mencari nilai tengahnya.

2. **Tunjukkan pada kode program yang mana proses *conquer* dijalankan!**
   Proses *conquer* (penaklukan) dijalankan pada baris pemanggilan fungsi secara rekursif, yaitu ketika program menentukan apakah data berada di bagian kiri atau kanan, lalu memanggil fungsi dirinya sendiri dengan rentang array yang lebih sempit/kecil: 
   - `return findBinarySearch(cari, left, mid - 1);`
   - `return findBinarySearch(cari, mid + 1, right);`

3. **Apa fungsi `left`, `right`, dan `mid`?**
   - `left`: Menyimpan indeks batas paling kiri (awal) dari rentang array yang sedang dicari saat ini.
   - `right`: Menyimpan indeks batas paling kanan (akhir) dari rentang array yang sedang dicari.
   - `mid`: Menyimpan indeks nilai tengah dari rentang array (`left` sampai `right`), digunakan sebagai acuan pembanding dan titik potong pencarian.

4. **Jika data IPK yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian?**
   Jika tidak urut, program **tetap berjalan tanpa error (tidak crash)**, namun **algoritma Binary Search akan gagal menemukan angka yang dicari dengan benar**. Hal ini karena syarat mutlak dari Binary Search adalah elemen harus terurut (ascending/descending). Algoritma ini membuang setengah bagian array berdasarkan perbandingan nilai tengah. Jika datanya acak, pembuangan rentang (ke kiri atau ke kanan) tersebut akan menjadi salah sasaran.

5. **Jika IPK yang dimasukkan dari IPK terbesar ke terkecil (misal: 3.8, 3.7, 3.5, 3.4, 3.2) dan elemen yang dicari adalah 3.2. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program *binary seach* agar hasilnya sesuai.**
   Jika menggunakan kode bawan aslinya, hasilnya **tidak akan sesuai** (menghasilkan `-1` atau tidak ditemukan) karena arah pencarian kodenya diformat untuk data *Ascending* (terkecil ke terbesar), sedangkan datanya *Descending*.
   Untuk membuatnya sesuai, kita harus memodifikasi syarat perbandingan di percabangan, mengubah `> cari` menjadi `< cari`. (Modifikasi ini sudah saya terapkan secara langsung pada file `MahasiswaBerprestasi.java` di bagian `findBinarySearch`).

6. **Jelaskan bagaimana *binary search* menentukan bahwa data yang dicari tidak ditemukan di dalam array.**
   Data dianggap tidak ditemukan jika indeks acuan saling tumpang tindih / bersilang, yaitu ketika nilai `right` sudah menjadi lebih kecil dari `left` (yang berarti `right >= left` bernilai `false`). Hal ini menandakan bahwa rentang pencarian sudah habis tak tersisa. Pada kode program, program akan mengembalikan nilai `-1` sebagai penanda gagal pencarian.

7. **Modifikasi program di atas yang mana jumlah mahasiswa yang diinputkan sesuai dengan masukan dari keyboard.**
   Modifikasi ini telah selesai dilakukan. Pada file `MahasiswaDemo.java`, ditambahkan input menggunakan `Scanner` untuk menentukan `jumMhs` di awal program. Pada file `MahasiswaBerprestasi.java`, ditambahkan juga constructor yang menerima argumen panjang array (`new MahasiswaBerprestasi(jumMhs)`) sehingga panjang `listMhs` bersifat dinamis.
