package minggu1;

import java.util.Scanner;

public class Tugas2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Input jumlah jadwal dari pengguna
        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        // Baris = jadwal ke-i, Kolom = informasi (Matkul, Ruang, Hari, Jam)
        String[][] jadwal = new String[n][4];

        // Memanggil fungsi input data
        inputJadwal(jadwal);

        int pilihan;
        do {
            // Menu utama program
            System.out.println("\n=== Menu Jadwal Kuliah ===");
            System.out.println("1. Tampilkan Seluruh Jadwal");
            System.out.println("2. Cari Jadwal Berdasarkan Hari");
            System.out.println("3. Cari Jadwal Berdasarkan Mata Kuliah");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanTabel(jadwal);
                    break;
                case 2:
                    cariBerdasarkanHari(jadwal);
                    break;
                case 3:
                    cariBerdasarkanMatkul(jadwal);
                    break;
            }
        } while (pilihan != 4);
    }

    // Fungsi untuk menginput data jadwal ke array 2 dimensi
    static void inputJadwal(String[][] j) {
        for (int i = 0; i < j.length; i++) {
            System.out.println("\nInput Jadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            j[i][0] = sc.nextLine();
            System.out.print("Ruang            : ");
            j[i][1] = sc.nextLine();
            System.out.print("Hari             : ");
            j[i][2] = sc.nextLine();
            System.out.print("Jam Kuliah       : ");
            j[i][3] = sc.nextLine();
        }
    }

    // Fungsi menampilkan seluruh jadwal dalam bentuk tabel
    static void tampilkanTabel(String[][] j) {
        System.out.println("\n----------------------------------------------------------------------------");
        System.out.printf("| %-20s | %-10s | %-10s | %-15s |\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("----------------------------------------------------------------------------");
        
        // Cek apakah data kosong (opsional, jaga-jaga)
        if (j.length == 0) {
            System.out.println("Data jadwal kosong.");
        } else {
            for (String[] baris : j) {
                System.out.printf("| %-20s | %-10s | %-10s | %-15s |\n", baris[0], baris[1], baris[2], baris[3]);
            }
        }
        System.out.println("----------------------------------------------------------------------------");
    }

    // Fungsi menampilkan jadwal berdasarkan hari tertentu
    static void cariBerdasarkanHari(String[][] j) {
        System.out.print("Masukkan hari yang dicari: ");
        String hari = sc.nextLine();
        System.out.println("\nJadwal pada hari " + hari + ":");
        
        boolean ditemukan = false; // Penanda apakah data ketemu

        for (String[] baris : j) {
            if (baris[2].equalsIgnoreCase(hari)) {
                System.out.printf("- %s (%s) Jam %s di %s\n", baris[0], baris[2], baris[3], baris[1]);
                ditemukan = true; // Tandai kalau ketemu
            }
        }

        // Jika tidak ada satupun yang cocok
        if (!ditemukan) {
            System.out.println("Maaf, tidak ada jadwal kuliah pada hari tersebut.");
        }
    }

    // Fungsi menampilkan jadwal berdasarkan nama mata kuliah
    static void cariBerdasarkanMatkul(String[][] j) {
        System.out.print("Masukkan nama mata kuliah: ");
        String matkul = sc.nextLine();
        
        boolean ditemukan = false; // Penanda apakah data ketemu

        for (String[] baris : j) {
            if (baris[0].equalsIgnoreCase(matkul)) {
                System.out.printf("\nDetail Matkul: %s | Ruang: %s | Hari: %s | Jam: %s\n", 
                                  baris[0], baris[1], baris[2], baris[3]);
                ditemukan = true; // Tandai kalau ketemu
            }
        }

        // Jika tidak ada satupun yang cocok
        if (!ditemukan) {
            System.out.println("Maaf, mata kuliah tersebut tidak ditemukan.");
        }
    }
}