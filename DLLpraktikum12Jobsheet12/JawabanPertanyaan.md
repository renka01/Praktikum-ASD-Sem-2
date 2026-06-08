# Laporan Praktikum Double Linked Lists

## 12.2.3 Pertanyaan (Percobaan 1)

1. **Jelaskan perbedaan struktur dan mekanisme traversal antara Single Linked List dan Double Linked List!**
   * **Struktur:** Single Linked List (SLL) setiap nodenya hanya memiliki satu pointer penunjuk yaitu `next` (menunjuk ke node setelahnya). Sedangkan Double Linked List (DLL) memiliki dua pointer penunjuk di setiap nodenya, yaitu `prev` (menunjuk ke node sebelumnya) dan `next` (menunjuk ke node setelahnya).
   * **Mekanisme Traversal:** Traversal pada SLL hanya bisa dilakukan secara searah (maju) dari `head` menuju `tail`. Sedangkan pada DLL, traversal bisa dilakukan dua arah: maju (dari `head` ke `tail` menggunakan `next`) maupun mundur (dari `tail` ke `head` menggunakan `prev`).

2. **Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Jelaskan fungsi masing-masing atribut tersebut pada proses traversal dan manipulasi node!**
   * Atribut `next` berfungsi untuk menunjuk ke node setelahnya. Pada traversal, `next` digunakan untuk melangkah maju ke node berikutnya (`current = current.next`). Pada manipulasi node, `next` digunakan untuk menyambungkan rantai ke node baru di depannya.
   * Atribut `prev` berfungsi untuk menunjuk ke node sebelumnya. Pada traversal, `prev` digunakan untuk melangkah mundur ke node sebelumnya (`current = current.prev`). Pada manipulasi node, `prev` digunakan untuk menyambungkan rantai kembali ke node di belakangnya, sehingga hubungan dua arah tetap terjaga tanpa kehilangan referensi.

3. **Perhatikan konstruktor pada class DoubleLinkedList. Jelaskan fungsi konstruktor tersebut terhadap kondisi awal linked list!**
   * Fungsi konstruktor adalah menginisialisasi keadaan awal Double Linked List saat objek pertama kali dibuat. Konstruktor mengatur pointer `head = null` and `tail = null` yang menandakan bahwa list dalam kondisi kosong (belum memiliki node sama sekali).

4. **Mengapa head dan tail harus menunjuk node yang sama ketika linked list masih kosong?**
   * Karena saat list masih kosong dan kita menambahkan node pertama (node baru), node tersebut otomatis menjadi satu-satunya elemen di dalam list. Oleh karena itu, node pertama tersebut bertindak sebagai elemen paling depan (`head`) sekaligus elemen paling belakang (`tail`).

5. **Modifikasi method print() agar menampilkan pesan "Linked List masih kosong" ketika tidak terdapat data pada linked list!**
   * Modifikasi dilakukan dengan menambahkan pengecekan `isEmpty()` di awal method. Jika bernilai true, maka program akan mencetak pesan "Linked List masih kosong." dan keluar dari method menggunakan `return`.

6. **Modifikasi kode program dengan menambahkan method printReverse() untuk menampilkan seluruh data pada Double Linked List secara terbalik, dimulai dari node tail menuju head!**
   * Penambahan method `printReverse()` dilakukan dengan melakukan traversal mulai dari pointer `tail`, lalu bergerak mundur menggunakan pointer `current = current.prev` hingga bernilai `null` (mencapai sebelum `head`).

---

## 12.3.3 Pertanyaan (Percobaan 2)

1. **Jelaskan fungsi masing-masing statement tersebut pada proses penghapusan node (`head = head.next;` dan `head.prev = null;`)!**
   * `head = head.next;` : Berfungsi untuk memindahkan/menggeser pointer `head` (penunjuk awal list) ke node berikutnya (node kedua). Dengan ini, node pertama yang lama tidak lagi dianggap sebagai kepala list.
   * `head.prev = null;` : Berfungsi untuk memutus pointer link `prev` (penunjuk ke node sebelumnya) milik node kepala yang baru. Karena kepala list tidak boleh menunjuk ke elemen sebelumnya (harus bernilai `null`), langkah ini memastikan node lama yang telah dihapus terputus seluruh koneksinya sehingga dapat dibersihkan oleh Garbage Collector.

2. **Modifikasi method removeFirst() dan removeLast() agar program menampilkan data yang berhasil dihapus!**
   * Modifikasi dilakukan dengan cara menyimpan data node yang akan dihapus ke dalam variabel sementara (`temp`), kemudian sebelum fungsi selesai atau setelah pointer diatur ulang, kita menampilkan informasi data tersebut menggunakan metode cetak (misalnya memanggil `temp.data.tampil()`), baru kemudian mengembalikan atau menghapus objek tersebut.
