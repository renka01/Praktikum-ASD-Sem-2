package minggu1;

public class Fungsi {
    // Data stok bunga (Baris = Cabang, Kolom = Jenis Bunga)
    static int[][] stok = {
        {10, 5, 15, 7}, // RoyalGarden 1
        {6, 11, 9, 12}, // RoyalGarden 2
        {2, 10, 10, 5}, // RoyalGarden 3
        {5, 7, 12, 9}   // RoyalGarden 4
    };

    // Harga masing-masing bunga
    static int[] harga = {75000, 50000, 60000, 10000};

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("Laporan Pendapatan Cabang RoyalGarden");
        System.out.println("==============================================");
        tampilkanPendapatanDanStatus();
    }

    // Fungsi untuk menghitung pendapatan dan menentukan status
    static void tampilkanPendapatanDanStatus() {
        for (int i = 0; i < stok.length; i++) {
            int totalPendapatan = 0;
            
            // Hitung total pendapatan per cabang
            for (int j = 0; j < stok[i].length; j++) {
                totalPendapatan += (stok[i][j] * harga[j]);
            }

            // Tentukan status
            String status = (totalPendapatan > 1500000) ? "Sangat Baik" : "Perlu Evaluasi";

            // Tampilkan hasil
            System.out.printf("RoyalGarden %d | Pendapatan: Rp %,d | Status: %s\n", 
                              (i + 1), totalPendapatan, status);
        }
        System.out.println("==============================================");
    }
}