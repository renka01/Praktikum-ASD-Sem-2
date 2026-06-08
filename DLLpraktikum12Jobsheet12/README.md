# Laporan Praktikum Double Linked Lists

## 12.2.3 Pertanyaan

1. **Jelaskan perbedaan struktur dan mekanisme traversal antara Single Linked List dan Double Linked List!**
   * **Struktur:** Single Linked List (SLL) setiap nodenya hanya memiliki satu pointer penunjuk yaitu `next` (menunjuk ke node setelahnya). Sedangkan Double Linked List (DLL) memiliki dua pointer penunjuk di setiap nodenya, yaitu `prev` (menunjuk ke node sebelumnya) dan `next` (menunjuk ke node setelahnya).
   * **Mekanisme Traversal:** Traversal pada SLL hanya bisa dilakukan secara searah (maju) dari `head` menuju `tail`. Sedangkan pada DLL, traversal bisa dilakukan dua arah: maju (dari `head` ke `tail` menggunakan `next`) maupun mundur (dari `tail` ke `head` menggunakan `prev`).

2. **Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Jelaskan fungsi masing-masing atribut tersebut pada proses traversal dan manipulasi node!**
   * Atribut `next` berfungsi untuk menunjuk ke node setelahnya. Pada traversal, `next` digunakan untuk melangkah maju ke node berikutnya (`current = current.next`). Pada manipulasi node, `next` digunakan untuk menyambungkan rantai ke node baru di depannya.
   * Atribut `prev` berfungsi untuk menunjuk ke node sebelumnya. Pada traversal, `prev` digunakan untuk melangkah mundur ke node sebelumnya (`current = current.prev`). Pada manipulasi node, `prev` digunakan untuk menyambungkan rantai kembali ke node di belakangnya, sehingga hubungan dua arah tetap terjaga tanpa kehilangan referensi.

3. **Perhatikan konstruktor pada class DoubleLinkedList. Jelaskan fungsi konstruktor tersebut terhadap kondisi awal linked list!**
   * Fungsi konstruktor adalah menginisialisasi keadaan awal Double Linked List saat objek pertama kali dibuat. Konstruktor mengatur pointer `head = null` dan `tail = null` yang menandakan bahwa list dalam kondisi kosong (belum memiliki node sama sekali).

4. **Mengapa head dan tail harus menunjuk node yang sama ketika linked list masih kosong?**
   * Karena saat list masih kosong dan kita menambahkan node pertama (node baru), node tersebut otomatis menjadi satu-satunya elemen di dalam list. Oleh karena itu, node pertama tersebut bertindak sebagai elemen paling depan (`head`) sekaligus elemen paling belakang (`tail`).

5. **Modifikasi method print() agar menampilkan pesan "Linked List masih kosong" ketika tidak terdapat data pada linked list!**
   * Modifikasi dilakukan dengan menambahkan pengecekan `isEmpty()` di awal method. Jika bernilai true, maka program akan mencetak pesan "Linked List masih kosong." dan keluar dari method menggunakan `return`.

6. **Modifikasi kode program dengan menambahkan method printReverse() untuk menampilkan seluruh data pada Double Linked List secara terbalik, dimulai dari node tail menuju head!**
   * Penambahan method `printReverse()` dilakukan dengan melakukan traversal mulai dari pointer `tail`, lalu bergerak mundur menggunakan pointer `current = current.prev` hingga bernilai `null` (mencapai sebelum `head`).
