package minggu1;

import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("========================");

        System.out.print("Masukkan Nilai Tugas: ");
        int tugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        int kuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        int uts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int uas = sc.nextInt();

        System.out.println("========================");
        System.out.println("========================");

        // Validasi input 0 - 100 
        if ((tugas < 0 || tugas > 100) || (kuis < 0 || kuis > 100) || 
            (uts < 0 || uts > 100) || (uas < 0 || uas > 100)) {
            System.out.println("nilai tidak valid");
            System.out.println("========================");
            System.out.println("========================");
        } else {
            // Hitung Nilai Akhir 
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);
            
            String nilaiHuruf;
            String kualifikasi;

            // Konversi Nilai 
            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
                kualifikasi = "Sangat Baik";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
                kualifikasi = "Lebih dari Baik";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
                kualifikasi = "Baik";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
                kualifikasi = "Lebih dari Cukup";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
                kualifikasi = "Cukup";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
                kualifikasi = "Kurang";
            } else {
                nilaiHuruf = "E";
                kualifikasi = "Gagal";
            }

            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("========================");
            System.out.println("========================");

            // Status Lulus/Tidak Lulus 
            if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
                System.out.println("MAAF ANDA TIDAK LULUS");
            } else {
                System.out.println("SELAMAT ANDA LULUS");
            }
        }
    }
}