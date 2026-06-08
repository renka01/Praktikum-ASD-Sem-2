package DLLpraktikum12Jobsheet12;

import java.util.Scanner;

public class DLLmain15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkList15 dll = new DoubleLinkList15();

        int pilih;
        do {
            System.out.println("===== Menu Double Link List ===== ");
            System.out.println("1 Tambah data di awal");
            System.out.println("2 Tambah data di akhir");
            System.out.println("3 Tambah data di tengah (setelah NIM)");
            System.out.println("4 Hapus data di awal");
            System.out.println("5 Hapus data di akhir");
            System.out.println("6 Tampilkan data");
            System.out.println("7 Tampilkan data terbalik (dari belakang)");
            System.out.println("0. Keluar");
            System.out.println("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    Mahasiswa15 mhsAwal = inputMahasiswa(sc);
                    dll.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa15 mhsAkhir = inputMahasiswa(sc);
                    dll.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.println("Masukkan NIM yang dicari : ");
                    String keyNim = sc.nextLine();
                    System.out.println("Masukkan data baru: ");
                    Mahasiswa15 dataBaru = inputMahasiswa(sc);
                    dll.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    dll.removeFirst();
                    break;
                case 5:
                    dll.removeLast();
                    break;
                case 6:
                    dll.print();
                    break;
                case 7:
                    dll.printReverse();
                    break;
                case 0:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih >=0 && pilih <= 7 );
        sc.close();
    }

    private static Mahasiswa15 inputMahasiswa(Scanner sc) {
        System.out.println("Masukkan NIM: ");
        String nim = sc.nextLine();
        System.out.println("Masukkan Nama: ");
        String nama = sc.nextLine();
        System.out.println("Masukkan Kelas: ");
        String kelas = sc.nextLine();
        System.out.println("Masukkan IPK: ");
        double ipk = sc.nextDouble();
        sc.nextLine();
        return new Mahasiswa15(nim, nama, kelas,ipk);
    }
}  
