package minggu1;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array 1 dimensi untuk kode plat
        char[] KODE = {'A', 'B', 'D', 'E', 'G', 'H', 'L', 'N', 'M', 'T'};

        // Array 2 dimensi untuk nama kota (disusun per karakter)
        char[][] KOTA = {
            {'B', 'A', 'N', 'T', 'E', 'N'},               // A
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},          // B
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},          // D
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},          // E
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'}, // G
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},    // H
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},    // L
            {'M', 'A', 'L', 'A', 'N', 'G'},               // N
            {'M', 'A', 'D', 'U', 'R', 'A'},               // M
            {'T', 'E', 'G', 'A', 'L'}                     // T
        };

        System.out.print("Masukkan Kode Plat Nomor: ");
        char input = sc.next().toUpperCase().charAt(0);

        int index = -1;
        // Mencari index yang cocok di array KODE
        for (int i = 0; i < KODE.length; i++) {
            if (input == KODE[i]) {
                index = i;
                break;
            }
        }

        // Menampilkan hasil berdasarkan index yang ditemukan
        if (index != -1) {
            System.out.print("Kota: ");
            for (int j = 0; j < KOTA[index].length; j++) {
                System.out.print(KOTA[index][j]);
            }
            System.out.println();
        } else {
            System.out.println("Maaf, kode plat tidak ditemukan.");
        }
    }
}