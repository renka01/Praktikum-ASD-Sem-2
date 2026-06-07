package SLLtugasPraktikum11;

public class Queue {
    Node15 head, tail;
    int size;
    int maxCapacity;

    public Queue() {
        this.maxCapacity = 0;
    }

    public Queue(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxCapacity;
    }

    public void Enqueue(Mahasiswa15 data) {
        if (isFull()) {
            System.out.println("Antrean penuh");
            return;
        }
        Node15 ndInput = new Node15(data, null);

        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
        size++;
        System.out.println(data.nim + " berhasil masuk antrean");
    }

    public Mahasiswa15 Dequeue() {
        if (isEmpty()) {
            System.out.println("Antrean kosong");
            return null;
        }
        Mahasiswa15 tmp = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return tmp;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Antrean depan: ");
            head.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong");

        }

    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Antrian paling belakang: ");
            tail.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public int getSize() {
        return size;

    }
    public void clear(){
        head = null;
        tail = null;
        size = 0;
        System.out.println("Antrean berhasil dikosongkan");
    }

    public void print(){
        if (isEmpty()){
            System.out.println("Antrean kosong");
            return;

        }
        Node15 temp = head;
        System.out.println(" Daftar antrean Mahasiswa: ");
        while (temp != null){
            temp.data.tampilInformasi();
            temp = temp.next;
        }
        System.out.println();
    }
}
