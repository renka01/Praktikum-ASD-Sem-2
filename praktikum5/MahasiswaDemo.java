package praktikum5;
import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah kuota mahasiswa: ");
        int kuota = sc.nextInt();
        sc.nextLine(); // membersihkan newline 
        
        MahasiswaBerprestasi list = new MahasiswaBerprestasi(kuota);

        for (int i = 0; i < kuota; i++) {
            System.out.println("------------------------------------");
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine(); // membersihkan newline
            
            Mahasiswa m = new Mahasiswa(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("\nData mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) dengan BUBBLE SORT: ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DSC): ");
        list.insertionSort();
        list.tampil();
    }
}
