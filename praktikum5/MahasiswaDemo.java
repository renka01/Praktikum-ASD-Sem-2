package praktikum5;

public class MahasiswaDemo {
    public static void main(String[] args) {
        MahasiswaBerprestasi list = new MahasiswaBerprestasi();

        Mahasiswa m1 = new Mahasiswa("123", "Zidan", "2A", 3.2);
        Mahasiswa m2 = new Mahasiswa("124", "Ayu", "2A", 3.5);
        Mahasiswa m3 = new Mahasiswa("125", "Sofi", "2A", 3.1);
        Mahasiswa m4 = new Mahasiswa("126", "Sita", "2A", 3.9);
        Mahasiswa m5 = new Mahasiswa("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) dengan BUBBLE SORT: ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC): ");
        list.insertionSort();
        list.tampil();
    }
}
