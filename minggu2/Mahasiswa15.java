package minggu2;

public class Mahasiswa15 {

    // Deklarasi Atribut (Percobaan 1) 
    String nama;
    String nim;
    String kelas;
    double ipk;

    // Konstruktor Default (Percobaan 3) 
    public Mahasiswa15() {
    }

    // Konstruktor Berparameter (Percobaan 3)
    public Mahasiswa15(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }

    // Method menampilkan informasi 
    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    // Method mengubah kelas
    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    // Modifikasi Method updateIpk untuk validasi 0.0 - 4.0 (Jawaban Pertanyaan 2.1.3 No 4) 
    void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    // Method mengevaluasi kinerja 
    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
}
