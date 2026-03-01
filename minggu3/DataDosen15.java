package minggu3;

public class DataDosen15 {

    public static void dataSemuaDosen(Dosen15[] arrayOfDosen) {
        System.out.println("=== DATA SEMUA DOSEN ===");
        for (Dosen15 dsn : arrayOfDosen) {
            String jk = dsn.jenisKelamin ? "Pria" : "Wanita";
            System.out.println("Kode: " + dsn.kode);
            System.out.println("Nama: " + dsn.nama);
            System.out.println("Jenis Kelamin: " + jk);
            System.out.println("Usia: " + dsn.usia);
            System.out.println("-----------------------------------");

        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen15[] arrayOfDosen) {
        int pria = 0;
        int wanita = 0;

        for (Dosen15 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("JUMLAH DOSEN PER JENIS KELAMIN");
        System.out.println("Jumlah Pria   : " + pria);
        System.out.println("Jumlah Wanita : " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen15[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen15 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin) {
                totalUsiaPria += dsn.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += dsn.usia;
                jumlahWanita++;
            }

        }
        System.out.println("=== RATA-RATA USIA DOSEN ===");
        if (jumlahPria > 0) {
            System.out.println("Pria : " + (double) totalUsiaPria / jumlahPria);
        }
        if (jumlahWanita > 0) {
            System.out.println("Wanita : " + (double) totalUsiaWanita / jumlahWanita);
        }

    }

    public static void InfoDosenPalingTua(Dosen15[] arrayOfDosen) {
        Dosen15 tertua = arrayOfDosen[0];
        for (Dosen15 dsn : arrayOfDosen) {
            if (dsn.usia > tertua.usia) {
                tertua = dsn;
            }
        }
        System.out.println("\n=== DOSEN PALING TUA ===");
        System.out.println("Nama : " + tertua.nama);
        System.out.println("Usia : " + tertua.usia);

    }

    public static void InfoDosenPalingMuda(Dosen15[] arrayOfDosen) {
        Dosen15 termuda = arrayOfDosen[0];
        for (Dosen15 dsn : arrayOfDosen) {
            if (dsn.usia < termuda.usia) {
                termuda = dsn;
            }
        }
        System.out.println("\n=== DOSEN PALING MUDA ===");
        System.out.println("Nama : " + termuda.nama);
        System.out.println("Usia : " + termuda.usia);
    }

}
