package SLLpraktikum11Jobsheet11;

public class Mahasiswa15 {
    String nim, nama, kelas;
    Double ipk;

    public Mahasiswa15(String nim, String nama, String kelas, Double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println(nama + "\t\t" + nim + "\t\t" + kelas + "\t\t" + ipk);
    }
}
