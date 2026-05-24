package stack;

public class StackTugasMahasiswa15 {
    Mahasiswa15[] stack;
    int size;
    int top;

    public StackTugasMahasiswa15(int size) {
        this.size = size;
        this.stack = new Mahasiswa15[size];
        this.top = -1; // -1 menandakan stack kosong
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa15 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack Penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa15 pop() {
        if (!isEmpty()) {
            Mahasiswa15 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack tugas kosong! Tidak ada tugas yang bisa diambil.");
            return null;
        }
    }

    public Mahasiswa15 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack tugas kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nim + "\t" + stack[i].nama + "\t" + stack[i].kelas + "\t" + stack[i].nilai);
        }
        System.out.print("");

    }

    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi15 stack = new StackKonversi15();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;

        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

    public Mahasiswa15 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack tugas kosong!");
            return null;
        }
    }

    public int getJumlahTugas() {
        return top + 1;
    }
}
