package QUEUEpraktikum2Jobsheet10;

public class AntrianKRS {
    Mahasiswa[] data;
    int front, rear, size, max;
    int totalSudahKRS;
    final int MAKS_DPA = 30;

    public AntrianKRS(int n) {
        max = n;
        data = new Mahasiswa[max];
        front = 0;
        rear = -1;
        size = 0;
        totalSudahKRS = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        totalSudahKRS = 0;
    }

    public void tambahMahasiswa(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh (Maksimal 10)");
        } else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk ke antrean");
        }
    }

}
