package praktikum6;
import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = Integer.parseInt(sc.nextLine());
        MahasiswaBerprestasi list = new MahasiswaBerprestasi(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("------------------------------------");
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK : ");
            String ip = sc.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("---------------------------------------");
            list.tambah(new Mahasiswa(nim, nama, kelas, ipk));
        }

        list.tampil();
        // melakukan pencarian data sequential
        System.out.println("---------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("---------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        String cr = sc.nextLine();
        double cari = Double.parseDouble(cr);

        System.out.println("menggunakan sequential searching");
        int posisi = list.sequentialSearching(cari);
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);

        //melakukan pencarian data Binary
        System.out.println("---------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("---------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs - 1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}
