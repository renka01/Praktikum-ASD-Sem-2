package stack;

import java.util.Scanner;

public class SuratDemo15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int kapasitas = 5; // default kapasitas
        while (true) {
            System.out.print("Masukkan kapasitas maksimum stack surat izin: ");
            if (scan.hasNextInt()) {
                kapasitas = scan.nextInt();
                scan.nextLine(); // Bersihkan buffer
                if (kapasitas > 0) {
                    break;
                }
            } else {
                scan.nextLine(); // Bersihkan buffer jika bukan int
            }
            System.out.println("Kapasitas tidak valid! Harus berupa angka positif.");
        }

        StackSurat15 stack = new StackSurat15(kapasitas);

        int pilihan;
        do {
            System.out.println("\n==================================");
            System.out.println("   MENU MANAJEMEN SURAT IZIN   ");
            System.out.println("==================================");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat berdasarkan Nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            if (!scan.hasNextInt()) {
                System.out.println("Input tidak valid. Harap masukkan angka!");
                scan.nextLine();
                pilihan = 0;
                continue;
            }

            pilihan = scan.nextInt();
            scan.nextLine(); // Bersihkan buffer

            switch (pilihan) {
                case 1:
                    if (stack.isFull()) {
                        System.out.println("Stack Penuh! Tidak dapat menerima surat izin baru.");
                        break;
                    }
                    System.out.print("Masukkan ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = scan.nextLine();
                    
                    char jenis = ' ';
                    while (true) {
                        System.out.print("Masukkan Jenis Izin (S = Sakit, I = Izin Keperluan Lain): ");
                        String inputJenis = scan.nextLine();
                        if (!inputJenis.isEmpty()) {
                            jenis = inputJenis.charAt(0);
                            if (jenis == 'S' || jenis == 's' || jenis == 'I' || jenis == 'i') {
                                // Mengubah ke uppercase agar seragam
                                jenis = Character.toUpperCase(jenis);
                                break;
                            }
                        }
                        System.out.println("Jenis izin tidak valid! Harus 'S' atau 'I'.");
                    }

                    int durasi = 0;
                    while (true) {
                        System.out.print("Masukkan Durasi Izin (hari): ");
                        if (scan.hasNextInt()) {
                            durasi = scan.nextInt();
                            scan.nextLine(); // Bersihkan buffer
                            if (durasi > 0) {
                                break;
                            }
                        } else {
                            scan.nextLine(); // Bersihkan buffer jika bukan int
                        }
                        System.out.println("Durasi tidak valid! Harus berupa angka positif.");
                    }

                    Surat15 suratBaru = new Surat15(id, nama, kelas, jenis, durasi);
                    stack.push(suratBaru);
                    break;

                case 2:
                    System.out.println("\n--- Memproses Surat Izin ---");
                    Surat15 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("ID Surat        : " + diproses.idSurat);
                        System.out.println("Nama Mahasiswa  : " + diproses.namaMahasiswa);
                        System.out.println("Kelas           : " + diproses.kelas);
                        String ket = (diproses.jenisIzin == 'S') ? "Sakit" : "Izin Keperluan Lain";
                        System.out.println("Jenis Izin      : " + ket + " (" + diproses.jenisIzin + ")");
                        System.out.println("Durasi          : " + diproses.durasi + " hari");
                        System.out.println("Status          : BERHASIL DIPROSES & DIVALIDASI");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Surat Izin Teratas (Terakhir Masuk) ---");
                    Surat15 teratas = stack.peek();
                    if (teratas != null) {
                        System.out.println("ID Surat        : " + teratas.idSurat);
                        System.out.println("Nama Mahasiswa  : " + teratas.namaMahasiswa);
                        System.out.println("Kelas           : " + teratas.kelas);
                        String ket = (teratas.jenisIzin == 'S') ? "Sakit" : "Izin Keperluan Lain";
                        System.out.println("Jenis Izin      : " + ket + " (" + teratas.jenisIzin + ")");
                        System.out.println("Durasi          : " + teratas.durasi + " hari");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan Nama Mahasiswa yang dicari: ");
                    String namaCari = scan.nextLine();
                    stack.cariSurat(namaCari);
                    break;

                case 5:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Harap masukkan angka 1-5.");
            }
        } while (pilihan != 5);

        scan.close();
    }
}
