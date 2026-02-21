package minggu2;

public class MataKuliah15 {

    // Deklarasi Atribut 
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    // Konstruktor Default
    public MataKuliah15() {
    }

    // Konstruktor Berparameter
    public MataKuliah15(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    // Method untuk menampilkan informasi matkul 
    void tampilInformasi() {
        System.out.println("Kode MK    : " + kodeMK);
        System.out.println("Nama MK    : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
        System.out.println("---------------------------------");
    }

    // Method untuk mengubah SKS 
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS mata kuliah " + nama + " telah diubah menjadi: " + sks);
    }

    // Method untuk menambah jam 
    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jam berhasil ditambah. Total jam sekarang: " + jumlahJam);
    }

    // Method untuk mengurangi jam dengan pengecekan kelayakan 
    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jam berhasil dikurangi. Sisa jam: " + jumlahJam);
        } else {
            System.out.println("Pengurangan gagal! Jumlah jam saat ini (" + jumlahJam + ") tidak mencukupi untuk dikurangi " + jam + " jam.");
        }
    }
}
