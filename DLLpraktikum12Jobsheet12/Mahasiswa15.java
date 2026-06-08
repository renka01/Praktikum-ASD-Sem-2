package DLLpraktikum12Jobsheet12;

public class Mahasiswa15 {
    String nim, nama, kelas;
    Double ipk;

    public Mahasiswa15(String nim,String nama,String kelas,Double ipk){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    public void tampil(){
        System.out.println(
            "NIM : "+nim+"\t"
            +"\tNama : "+nama+"\t"
            +"\tKelas : "+kelas+"\t"
            +"\tIPK : "+ipk+"\n"
        );
    }
}
