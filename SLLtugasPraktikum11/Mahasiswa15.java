package SLLtugasPraktikum11;

public class Mahasiswa15 {
    String nim, nama, kelas;

    public Mahasiswa15(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    public void tampilInformasi() {
        System.out.println("\tNIM:\t\t" + nim + "\tNAMA:\t\t" + nama + "\tKELAS:\t\t" + kelas);
    }
}
