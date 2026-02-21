package minggu2;

public class DosenMain15 {

    public static void main(String[] args) {
        // 1. Instansiasi objek pertama menggunakan konstruktor default
        System.out.println("\n=== DATA DOSEN 1 ===");
        Dosen15 dsn1 = new Dosen15();
        dsn1.idDosen = "199308112019032025";
        dsn1.nama = "Vivi Nur Wijayaningrum, S.Kom., M.Kom.";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2012;
        dsn1.bidangKeahlian = "Pemograman Algotritma dan Struktur Data";

        // Memanggil semua method untuk objek dsn1
        dsn1.tampilInformasi();
        dsn1.setStatusAktif(false);
        System.out.println("Masa Kerja Dosen    : " + dsn1.hitungMasaKerja(2026) + " tahun");
        dsn1.ubahKeahlian("Keamanan Siber");

        // 2. Instansiasi objek kedua menggunakan konstruktor berparameter
        System.out.println("\n=== DATA DOSEN 2 ===");
        Dosen15 dsn2 = new Dosen15("198406102008121004", "Imam Fahrur Rozi, S.T., M.T.", false, 2020, "Machine Learning");

        // Memanggil semua method untuk objek dsn2
        dsn2.tampilInformasi();
        dsn2.setStatusAktif(true);
        System.out.println("Masa Kerja Dosen    : " + dsn2.hitungMasaKerja(2026) + " tahun");
        dsn2.ubahKeahlian("Data Science");
    }
}
