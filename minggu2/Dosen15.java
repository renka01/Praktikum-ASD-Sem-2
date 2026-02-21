package minggu2;

public class Dosen15 {

    // Deklarasi Atribut
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    // Konstruktor Default
    public Dosen15() {
    }

    // Konstruktor Berparameter
    public Dosen15(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    // Method untuk menampilkan informasi dosen
    void tampilInformasi() {
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama Dosen      : " + nama);
        System.out.println("Status Aktif    : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        System.out.println("---------------------------------");
    }

    // Method untuk mengatur status aktif
    void setStatusAktif(boolean status) {
        statusAktif = status;
        System.out.println("Status aktif dosen " + nama + " diubah menjadi: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }

    // Method untuk menghitung masa kerja
    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    // Method untuk mengubah bidang keahlian
    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian " + nama + " diubah menjadi: " + bidangKeahlian);
    }
}
