package DLLpraktikum12Jobsheet12;

public class Node15 {
    Mahasiswa15 data;
    Node15 next, prev;

    Node15(Node15 prev, Mahasiswa15 data, Node15 next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
