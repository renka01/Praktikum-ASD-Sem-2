package SLLtugasPraktikum11;

import java.util.Scanner;

public class QueueMain15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah antrean: ");
        int jumlah = sc.nextInt();
        Queue antrean = new Queue(jumlah);

        int menu;
        do {
            System.out.println("\n===== Menu Antrian =====");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Peek Rear");
            System.out.println("5. Size");
            System.out.println("6. Print");
            System.out.println("7. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Masukkan NIM: ");
                    String nim = sc.next();
                    System.out.println("Masukkan Nama: ");
                    String nama = sc.next();
                    System.out.println("Masukkan Kelas: ");
                    String kelas = sc.next();
                    Mahasiswa15 mhs = new Mahasiswa15(nim, nama, kelas);
                    antrean.Enqueue(mhs);
                    break;
                case 2:
                    antrean.Dequeue();
                    break;
                case 3:
                    antrean.peek();
                    break;
                case 4:
                    antrean.peekRear();
                    break;
                case 5:
                    System.out.println("Size antrean: " + antrean.getSize());
                    break;
                case 6:
                    antrean.print();
                    break;
                case 7:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (menu != 7);
    }
}
