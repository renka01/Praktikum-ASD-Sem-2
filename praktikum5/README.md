# Jawaban Pertanyaan Praktikum 5 (Sorting)

Berikut adalah jawaban dari pertanyaan 5.2.5 terkait algoritma sorting:

### 1. Jelaskan fungsi kode program berikut!
```java
if (data[j-1]>data[j]){
    temp=data[j];
    data[j]=data[j-1];
    data[j-1]=temp;
}
```
**Jawaban:**  
Kode program di atas berfungsi untuk menukar paksa (*swap*) dua elemen yang posisinya saling bersebelahan di dalam array.  
Proses penukaran ini akan terjadi **jika** elemen di sebelah kiri (`data[j-1]`) bernilai **lebih besar** daripada elemen di sebelah kanan (`data[j]`). Pertukaran terbantu dengan disimpannya nilai sementara di dalam memori/variabel kosong bernama `temp` agar nilainya tidak hilang saat ditimpa.
Ini merupakan mekanisme blok logika fundamental untuk penyortiran menaik (*Ascending*) secara **Bubble Sort**.

---

### 2. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada Selection Sort!
**Jawaban:**  
Algoritma pencarian nilai minimum pada *Selection Sort* berfokus mengasumsikan indeks saat ini sebagai nilai terkecil pada awal perulangan, kemudian membandingkannya dengan indeks-indeks di sisa array berikutnya untuk menemukan letak/indeks terkecil yang sesungguhnya.

Kodenya adalah sebagai berikut:
```java
int min = i; // Asumsi awal indeks 'i' adalah yang terkecil
for (int j = i + 1; j < jumData; j++) {
    // Kalau indeks 'j' memiliki nilai lebih kecil dari indeks min saat ini...
    if (data[j] < data[min]) {
        // Maka rekam 'j' menjadi indeks nilai terkecil yang baru
        min = j; 
    }
}
```

---

### 3. Pada Insertion Sort, jelaskan maksud dari kondisi pada perulangan: `while (j>=0 && data[j]>temp)` !
**Jawaban:**  
Kondisi pada *statement* `while` di atas mengatur batasan sampai kapan proses penggeseran elemen ke kanan terus berlangsung. Loop ini hanya akan berjalan apabila memenuhi 2 syarat berikut secara bersamaan:
1. `j>=0` ➡ Memastikan indeks tidak bernilai negatif, artinya proses mengecek elemen belum melewati batas awal/paling kiri dari array (indeks `0`).
2. `data[j]>temp` ➡ Memastikan proses penggeseran hanya selalu terjadi apabila elemen saat ini (`data[j]`) yang sedang dipegang di tangan bernilai **lebih besar** daripada angka beban yang mau kita letakkan/sisipkan (`temp`).

---

### 4. Pada Insertion Sort, apakah tujuan dari perintah `data[j+1]= data[j];` !
**Jawaban:**  
Tujuan dari perintah tersebut adalah untuk **menggeser** nilai sebuah elemen array maju satu indeks ke arah kanan. 
Penggeseran secara berturut-turut akan menciptakan "celah kosong" atau memberikan sebuah ruang secara memori agar kita pada akhirnya bisa meletakkan/menyisipkan nilai baru (`temp`) di antara urutan yang semestinya.

<br>

***

<br>

Berikut adalah jawaban dari pertanyaan **5.3.4**:

### 1a. Mengapa syarat dari perulangan `i` adalah `i<listMhs.length-1` ?
**Jawaban:**  
Karena pada saat tahap akhir penyortiran (ketika elemen lainnya sudah dicek sebanyak `panjang_data - 1` ronde), satu elemen sisanya yang berada di posisi array paling depan (indeks ke-0) secara logika **sudah pasti merupakan angka terkecil dan terurut**. Oleh karena itu, kita tidak perlu lagi membuang waktu melakukan satu ronde pengecekan tambahan untuk sisa 1 elemen tersebut.

### 1b. Mengapa syarat dari perulangan `j` adalah `j<listMhs.length-i` ?
**Jawaban:**  
Karena algoritma *Bubble Sort* selalu memposisikan angka/elemen terbesar ke posisi ujung paling kanan di setiap akhir dari satu putaran (ronde) iterasi `i`.  
Nilai pada batas `listMhs.length-i` membuat jalur pengecekan putaran `j` **menjadi semakin menyempit** setiap rondenya. Tujuannya agar program tidak mengulangi pengecekan bagian array ujung kanan yang elemennya sudah terjamin *terurut* hasil dari operasi *swap* angka terbesar di memori ronde sebelumnya.

### 1c. Jika banyak data di dalam listMhs adalah 50, maka berapa kali perulangan `i` akan berlangsung? Dan ada berapa Tahap *bubble sort* yang ditempuh?
**Jawaban:**  
- Perulangan `i` akan dieksekusi sebanyak **49 kali** (Karena kondisinya `i < 50 - 1`), dimulai dari `i = 0` hingga `i = 48`.  
- Terdapat **49 tahap (pass) / ronde** *Bubble Sort* yang perlu ditempuh agar seluruh elemen mahasiswa tersebut terurut dengan sempurna.

<br>

***

<br>

Berikut adalah jawaban dari pertanyaan **5.3.7**:

### Untuk apakah proses dari blok kode `idxMin` pada Selection Sort?
**Jawaban:**  
Blok program tersebut bertugas secara spesifik untuk **mencari lokasi/indeks dari mahasiswa yang memiliki IPK terkecil** pada barisan data sisa yang belum terurut.  
Pada mulanya, program mengasumsikan elemen terdepan yang belum fix diurutkan (elemen ke-`i`) adalah pemegang IPK yang paling kecil (`idxMin=i`). Kemudian, melalui *for loop* `j` dan kondisi *if*, program berkeliling mengecek satu per satu ke posisi sebelahnya hingga akhir array. Jika di tengah pengecekan ternyata ditemukan mahasiswa yang memiliki IPK bernilai lebih kecil dari asumsi awal kita (`< listMhs[idxMin].ipk`), maka posisi minimum `idxMin` segera direvisi ke letak si mahasiswa tersebut (`j`). Di akhir perulangan ini, nilai variabel `idxMin` dijamin otentik memegang alamat/indeks posisi mahasiswa dengan IPK paling kecil secara valid.

<br>

***

<br>

Berikut adalah jawaban dari pertanyaan **5.4.3**:

### Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting dengan cara descending.
**Jawaban:**  
Untuk mengubah *Insertion Sort* menjadi penataan secara *descending* (menurun/tertinggi ke terendah), kita diwajibkan untuk **mengubah tanda lebih besar (`>`) menjadi lebih kecil (`<`)** pada syarat perulangan `while`-nya.  

**Modifikasi Kode Terpusat Pada Kondisi While:**
```java
void insertionSort() {
    for (int i = 1; i < listMhs.length; i++) {
        Mahasiswa temp = listMhs[i];
        int j = i;
        // UBAH TANDA PADA BAGIAN INI (< temp.ipk):
        while (j > 0 && listMhs[j - 1].ipk < temp.ipk) { 
            listMhs[j] = listMhs[j - 1];
            j--;
        }
        listMhs[j] = temp;
    }
}
```
**Alasan Logika:**  
Kondisi `listMhs[j - 1].ipk < temp.ipk` membuat program selalu menggeser mahasiswa-mahasiswa yang nilai IPK-nya **lebih kecil** ke arah kanan. Akibatnya, secara fisik akan terus tersaji celah kosong di sebelah kiri untuk diduduki oleh kartu mahasiswa awal (`temp`) yang memiliki IPK **lebih besar**. Alhasil, susunan array-nya menjadi berurut secara Descending (IPK besar -> IPK kecil).
