package minggu3;

import java.util.Scanner;

public class MataKuliahDemo15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah15[] arrayOfMataKuliah = new MataKuliah15[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            System.out.println("Kode: ");
            kode = sc.nextLine();
            System.out.println("Nama: ");
            nama = sc.nextLine();
            System.out.println("SKS: ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.println("Jumlah Jam: ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-----------------------------------");

            arrayOfMataKuliah[i] = new MataKuliah15(kode, nama, sks, jumlahJam);

        }
        System.out.println("\n=== HASIL DATA MAHASISWA ===");
        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo();

        }

    }
}
