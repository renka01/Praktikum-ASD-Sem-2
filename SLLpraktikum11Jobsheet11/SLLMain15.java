package SLLpraktikum11Jobsheet11;

public class SLLMain15 {

    public static void main(String[] args) {
        // Membuat objek SingleLinkedList15
        SingleLinkedList15 sll = new SingleLinkedList15();

Mahasiswa15 mhs1 = new Mahasiswa15("24212200", "Alvaro", "1A", 4.0);
Mahasiswa15 mhs2 = new Mahasiswa15("23212201", "Bimon", "2B", 3.8);
Mahasiswa15 mhs3 = new Mahasiswa15("22212202", "Cintia", "3C", 3.5);
Mahasiswa15 mhs4 = new Mahasiswa15("21212203", "Dirga", "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("Data Mahasiswa an Bimbon berada pada index : " + sll.indexOf("Bimon"));
        System.out.println();

        sll.RemoveFirst();
        sll.RemoveLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    } 
}


