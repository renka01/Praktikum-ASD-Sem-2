package minggu1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Daftar mata kuliah sesuai contoh output
        String[] matkul = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        // Bobot SKS masing-masing mata kuliah (semester 1)
        int[] sks = {2, 2, 2, 3, 2, 2, 3, 2}; 
        
        // Array untuk menyimpan data nilai
        double[] nilaiAngka = new double[matkul.length];
        String[] nilaiHuruf = new String[matkul.length];
        double[] bobotNilai = new double[matkul.length];

        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        // Loop untuk input nilai dari pengguna
        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + matkul[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

            // Konversi Nilai Angka ke Nilai Huruf dan Bobot
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.00;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.50;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.00;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.50;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.00;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.00;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.00;
            }
        }

        System.out.println("\n==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");
        
        // Header Tabel
        System.out.printf("%-40s %-15s %-15s %-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalNilaiSetara = 0;
        double totalSKS = 0;

        // Loop untuk menampilkan hasil dan menghitung total
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%-40s %-15.2f %-15s %-15.2f\n", matkul[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
            
            // Hitung total bobot dikali SKS
            totalNilaiSetara += (bobotNilai[i] * sks[i]);
            totalSKS += sks[i];
        }

        System.out.println("==============================");

        // Hitung IP Semester
        double ipSemester = totalNilaiSetara / totalSKS;
        System.out.printf("IP : %.2f\n", ipSemester);
    }
}