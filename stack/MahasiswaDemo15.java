package stack;

import java.util.Scanner;

public class MahasiswaDemo15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        StackTugasMahasiswa15 stack = new StackTugasMahasiswa15(5);

        int pilihan;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Menghitung Jumlah Tugas");
            System.out.println("Pilih: ");

            pilihan = scan.nextInt();
            scan.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.println("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM:");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa15 mhs = new Mahasiswa15(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;

                case 2:
                    Mahasiswa15 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.print("Menilai tugas dari : " + dinilai.nama);
                        System.out.print("Masukkan nilai: ");
                        int nilai = scan.nextInt();
                        scan.nextLine();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Tugas %s berhasil dinilai dengan nilai %d\n", dinilai.nama, dinilai.nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa15 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.printf("Tugas terakhir dikumpulkan oleh %s\n", lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas:");
                    System.out.println("NIM\tNama\tKelas\tNilai");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa15 terbawah = stack.peekBottom();
                    if (terbawah != null) {
                        System.out.printf("Tugas pertama kali dikumpulkan oleh %s\n", terbawah.nama);
                    }
                    break;
                case 6:
                    System.out.printf("Jumlah tugas yang sudah dikumpulkan saat ini: %d\n", stack.getJumlahTugas());
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan >= 1 && pilihan <= 6);
    }
}