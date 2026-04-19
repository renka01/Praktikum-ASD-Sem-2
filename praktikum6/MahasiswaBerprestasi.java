package praktikum6;

public class MahasiswaBerprestasi {
    Mahasiswa[] listMhs;
    int idx;

    public MahasiswaBerprestasi() {
        listMhs = new Mahasiswa[5];
    }

    public MahasiswaBerprestasi(int jumMhs) {
        listMhs = new Mahasiswa[jumMhs];
    }

    void tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa m : listMhs) {
            if (m != null) {
                m.tampilInformasi();
                System.out.println("-------------------------");
            }
        }
    }


    // PENANDA: INI ADALAH METHOD UNTUK SEQUENTIAL SEARCH
    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j] != null && listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    
    // PENANDA: INI ADALAH METHOD UNTUK BINARY SEARCH
    int findBinarySearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk) {
                return (mid);
            // PROSES DIVIDE & CONQUER:
            } else if (listMhs[mid].ipk < cari) { // Tanda diubah dari > menjadi < untuk pengurutan DESCENDING
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("data mahasiswa dengan IPK : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("nim\t : " + listMhs[pos].nim);
            System.out.println("nama\t : " + listMhs[pos].nama);
            System.out.println("kelas\t : " + listMhs[pos].kelas);
            System.out.println("ipk\t : " + x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }
}
