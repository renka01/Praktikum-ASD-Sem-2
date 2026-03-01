package minggu3;

public class MataKuliah15 {

    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    // Konstruktor untuk inisialisasi data
    public MataKuliah15(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void cetakInfo() {
        System.out.println("Kode: " + this.kode);
        System.out.println("Nama: " + this.nama);
        System.out.println("SKS: " + this.sks);
        System.out.println("Jumlah Jam: " + this.jumlahJam);
        System.out.println("-----------------------------------");

    }
}
