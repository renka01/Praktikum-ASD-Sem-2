package SLLpraktikum11Jobsheet11;

public class SingleLinkedList15 {
    Node15 head;
    Node15 tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            Node15 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(Mahasiswa15 input) {
        Node15 ndInput = new Node15(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa15 input) {
        Node15 ndInput = new Node15(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa15 input) {
        Node15 ndInput = new Node15(input, null);
        Node15 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa15 input) {
        if (index < 0) {
            System.out.println("Index salah");
        } else {
            Node15 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node15(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    public void getData(int index) {
        Node15 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.data.tampilInformasi();
    }

    public int indexOf(String key) {
        Node15 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;

        }

        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void RemoveFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih Kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void RemoveLast() {
        if (isEmpty()) {
            System.out.println("Linked list masih Kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node15 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            tail.next = null;
            tail = temp;
        }
    }
    public void remove(String key){
        if (isEmpty()){
            System.out.println("Linked list masih Kosong, tidak dapat dihapus");
        }else{
            Node15 temp = head;
            while (temp != null){
                if (temp.data.nama.equalsIgnoreCase(key) && (temp == head)){
                    this.RemoveFirst();
                    break;
                } else if (temp.data.nama.equalsIgnoreCase(key)){
                    temp.next = temp.next.next;
                    if (temp.next == null);
                    tail = temp;
                    break;
                }
                temp = temp.next;
            }
        }
    }
    public void removeAt(int index){
        if (index == 0){
            RemoveFirst();
        } else {
            Node15 temp = head;
            for (int i = 0;  i < index -1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null){
                tail = temp;
            }
        }
    }
}
