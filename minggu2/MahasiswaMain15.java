package minggu2;

public class MahasiswaMain15 {

    public static void main(String[] args) {
        // PERCOBAAN 2: Menggunakan konstruktor default 
        System.out.println("=== DATA MHS 1 ===");
        Mahasiswa15 mhs1 = new Mahasiswa15();
        mhs1.nama = "Bagaskara Pratama";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        System.out.println("\nSetelah diubah:");
        mhs1.tampilkanInformasi();

        // PERCOBAAN 3: Menggunakan konstruktor berparameter 
        System.out.println("\n=== DATA MHS 2 ===");
        Mahasiswa15 mhs2 = new Mahasiswa15("Arga Candra Wirawan", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        // JAWABAN PERTANYAAN No 5: Objek atas nama sendiri 
        System.out.println("\n=== DATA MHS FAREN ===");
        Mahasiswa15 mhsFaren = new Mahasiswa15("Faren Hafiza Afanda", "254107020025", 3.85, "TI 1C");
        mhsFaren.tampilkanInformasi();
    }
}
