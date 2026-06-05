package praktikum9STACK;

public class StackSurat15 {
    Surat15[] data;
    int size;
    int top;

    public StackSurat15(int size) {
        this.size = size;
        this.data = new Surat15[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat15 s) {
        if (!isFull()) {
            top++;
            data[top] = s;
            System.out.printf("Surat dengan ID %s berhasil dimasukkan ke stack.\n", s.idSurat);
        } else {
            System.out.println("Stack Penuh! Tidak dapat menerima surat izin baru.");
        }
    }

    public Surat15 pop() {
        if (!isEmpty()) {
            Surat15 s = data[top];
            top--;
            return s;
        } else {
            System.out.println("Stack Kosong! Tidak ada surat yang bisa diproses.");
            return null;
        }
    }

    public Surat15 peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            System.out.println("Stack Kosong! Tidak ada surat terakhir.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        if (isEmpty()) {
            System.out.println("Stack Kosong! Tidak ada data surat untuk dicari.");
            return;
        }

        boolean ditemukan = false;
        System.out.println("Hasil pencarian surat untuk nama \"" + nama + "\":");
        // Mencari dari tumpukan teratas (LIFO)
        for (int i = top; i >= 0; i--) {
            if (data[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("----------------------------------------");
                System.out.println("ID Surat        : " + data[i].idSurat);
                System.out.println("Nama Mahasiswa  : " + data[i].namaMahasiswa);
                System.out.println("Kelas           : " + data[i].kelas);
                String keteranganIzin = (data[i].jenisIzin == 'S' || data[i].jenisIzin == 's') ? "Sakit" : "Izin Keperluan Lain";
                System.out.println("Jenis Izin      : " + keteranganIzin + " (" + data[i].jenisIzin + ")");
                System.out.println("Durasi          : " + data[i].durasi + " hari");
                System.out.println("Posisi di Stack : Indeks ke-" + i + " (Tingkat ke-" + (top - i + 1) + " dari atas)");
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat dengan nama mahasiswa \"" + nama + "\" tidak ditemukan.");
        } else {
            System.out.println("----------------------------------------");
        }
    }
}
