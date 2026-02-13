package minggu1;
import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        
        // Ambil 2 digit terakhir
        int n = Integer.parseInt(nim.substring(nim.length() - 2));
        
        // Jika n < 10, tambahkan 10
        if (n < 10) {
            n += 10;
        }
        
        System.out.println("n : " + n);
        
        for (int i = 1; i <= n; i++) {
            // Bilangan 10 dan 15 tidak dicetak 
            if (i == 6 || i == 10) { 
                 continue;
            }
            
            // Logika pencetakan
            if (i % 2 == 0) {
                 // Genap
                 if (i % 3 == 0) {
                     // bilang "Genap SELAIN kelipatan 3 dicetak angka".
                     System.out.print("# ");
                 } else {
                     System.out.print(i + " ");
                 }
            } else {
                // Ganjil
                // Cek apakah kelipatan 3?
                if (i % 3 == 0) {
                    System.out.print("# ");
                } else {
                    // Ganjil bukan kelipatan 3 -> *
                    System.out.print("* ");
                }
            }
        }
    }
}