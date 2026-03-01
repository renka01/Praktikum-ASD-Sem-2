package minggu3;

import java.util.Scanner;

public class DosenDemo15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kode, nama, jkDummy, dummy;
        int usia;
        Boolean jenisKelamin;

        System.out.println("Masukkan jumlah dosen yang ingin di-input");
        int elemen = Integer.parseInt(sc.nextLine());

        Dosen15[] arrayOfDosen = new Dosen15[elemen];

        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));

            System.out.println("Kode: ");
            kode = sc.nextLine();
            System.out.println("Nama: ");
            nama = sc.nextLine();
            System.out.println("Jenis Kelamin (Pria/Wanita): ");
            jkDummy = sc.nextLine();

            if (jkDummy.equalsIgnoreCase("Pria")) {
                jenisKelamin = true;
            } else {
                jenisKelamin = false;
            }

            System.out.println("Usia: ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);

            System.out.println("-----------------------------------");

            arrayOfDosen[i] = new Dosen15(kode, nama, jenisKelamin, usia);

        }
        DataDosen15.dataSemuaDosen(arrayOfDosen);
        DataDosen15.jumlahDosenPerJenisKelamin(arrayOfDosen);
        DataDosen15.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        DataDosen15.InfoDosenPalingTua(arrayOfDosen);
        DataDosen15.InfoDosenPalingMuda(arrayOfDosen);
    }
}
