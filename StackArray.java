public class StackArray {
    private int maxSize;
    private String[] stackArray;
    private int top;

    // Konstruktor
    public StackArray(int size) {
        maxSize = size;
        stackArray = new String[maxSize];
        top = -1;
    }

    // Menambah elemen ke stack
    public void push(String data) {
        if (isFull()) {
            System.out.println("Stack penuh! Tidak bisa menambahkan data: " + data);
        } else {
            stackArray[++top] = data;
            System.out.println("Push: " + data);
        }
    }

    // Menghapus elemen teratas
    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak bisa menghapus data.");
            return null;
        } else {
            return stackArray[top--];
        }
    }

    // Melihat elemen teratas
    public String peek() {
        if (isEmpty()) {
            return "Stack kosong!";
        } else {
            return stackArray[top];
        }
    }

    // Mengecek apakah stack penuh
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Mengecek apakah stack kosong
    public boolean isEmpty() {
        return (top == -1);
    }

    // Menampilkan isi stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack kosong!");
        } else {
            System.out.print("Isi Stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
}