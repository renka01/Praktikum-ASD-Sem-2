package minggu2;

public class MataKuliahMain15 {

    public static void main(String[] args) {
        System.out.println("--- LATIHAN MATA KULIAH OLEH FAREN HAFIZA (15) ---");

        // 1. Instansiasi objek pertama menggunakan konstruktor default 
        System.out.println("\n=== DATA MATA KULIAH 1 ===");
        MataKuliah15 mk1 = new MataKuliah15();
        mk1.kodeMK = "ASD26";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        // Memanggil semua method untuk objek mk1 
        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(10); // Uji coba: Pengurangan gagal karena sisa jam kurang
        mk1.kurangiJam(2);  // Uji coba: Pengurangan berhasil

        // 2. Instansiasi objek kedua menggunakan konstruktor berparameter 
        System.out.println("\n=== DATA MATA KULIAH 2 ===");
        MataKuliah15 mk2 = new MataKuliah15("PBO26", "Pemrograman Berorientasi Objek", 3, 6);

        // pemanggilan semua method untuk objek matakuliah2 
        mk2.tampilInformasi();
        mk2.ubahSKS(2);
        mk2.tambahJam(1);
    }
}
