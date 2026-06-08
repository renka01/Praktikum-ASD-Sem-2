package DLLpraktikum12Jobsheet12;

public class DoubleLinkList15 {
    Node15 head, tail;

    public DoubleLinkList15() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa15 data) {
        Node15 newNode = new Node15(null,data,head);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa15 data) {
        Node15 newNode = new Node15(tail,data,null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa15 data) {
        Node15 current = head;
        while (current != null && !current.data.nim.equalsIgnoreCase(keyNim)) {
            current = current.next;
        }
        if (current != null) {
            System.out.println("Data dengan NIM " + keyNim + "tidak ditemukan");
            return;
        }
        Node15 newNode = new Node15(current,data,current.next);
        if (current == tail){
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }
    public Node15 removeFirst(){
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return null;
        }
        Node15 temp = head;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        return temp;
    }
    public Node15 removeLast(){
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return null;
        }
        Node15 temp = tail;
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        return temp;
    }

    public void printReverse(){
        if (isEmpty()){
            System.out.println("Linked List masih kosong");
            return;
        }
        Node15 current = tail;
        while (current != null){
            current.data.tampil();
            current = current.prev;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node15 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }

    }

}
