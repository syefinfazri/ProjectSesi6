import java.util.Stack;

public class StackSayur {
    public static void main(String[] args) {
    
    Stack<String> sayur = new Stack<>();

    System.out.println("=== Implementasi Stack menggunakan Library java.util.Stack ===\n");

    sayur.push("Tomat");
    sayur.push("Brokoli");
    sayur.push("Bawang Merah");

    System.out.println("Isi Stack Awal: " + sayur);

    System.out.println("Elemen teratas (peek): " + sayur.peek());

    System.out.println("\nPop (menghapus elemen terakhir: " + sayur.pop());
    System.out.println("Isi Stack setelah pop: " + sayur);

    sayur.push("Bayam");
    System.out.println("\nSetelah menambah Bayam: " + sayur);
    System.out.println("Posisi Brokoli dalam Stack: " + sayur.search("Brokoli"));
    
    sayur.clear();
    System.out.println("\nSetelah Clear(), isi Stack: " + sayur);
    System.out.println("Apakah Stack kosong? " + sayur.isEmpty());
    }
}


