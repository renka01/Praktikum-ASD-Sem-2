package praktikum5;
import java.util.Scanner;

public class DosenMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);
        DataDosen data = new DataDosen();
        int menu;

        do {
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Seluruh Data Dosen");
            System.out.println("3. Urutkan Usia (ASC - Termuda ke Tertua)");
            System.out.println("4. Urutkan Usia (DSC - Tertua ke Termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("\n-- Masukkan Data Dosen --");
                    System.out.print("Kode Dosen: ");
                    String kode = scString.nextLine();
                    System.out.print("Nama Dosen: ");
                    String nama = scString.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    String jkInput = scString.nextLine();
                    boolean jk = jkInput.equalsIgnoreCase("L");
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();

                    Dosen dsnBaru = new Dosen(kode, nama, jk, usia);
                    data.tambah(dsnBaru);
                    System.out.println("Data berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\n-- Seluruh Data Dosen --");
                    data.tampil();
                    break;

                case 3:
                    System.out.println("\n-- Data Dosen Berdasarkan Usia (ASC) --");
                    data.sortingASC();
                    data.tampil();
                    break;

                case 4:
                    System.out.println("\n-- Data Dosen Berdasarkan Usia (DSC) --");
                    data.sortingDSC();
                    data.tampil();
                    break;

                case 5:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid!");
            }
        } while (menu != 5);
        
        sc.close();
        scString.close();
    }
}
