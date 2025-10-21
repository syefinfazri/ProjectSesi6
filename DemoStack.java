import java.util.Stack;

public class DemoStack {

public static void main(String[] args) {
    Stack<String> kota = new Stack<>();

    System.out.println(" === Demo Stack Dasar ===\n");
    
    kota.push("Sukabumi");
    System.out.println("Push: Sukabumi ->" + kota);

    kota.push("Bandung");
    System.out.println("Push: Bandung ->" + kota);

    kota.push("Jakarta");
    System.out.println("Push: Jakarta ->" + kota);

    System.out.println("\nElemen teratas saat ini: " + kota.peek());
    
    System.out.println("\nPop (menghapus data terakhir): " + kota.pop());
    System.out.println("Isi Stack sekarang: " + kota);

    kota.pop();
    System.out.println("Setelah pop kedua: " + kota);

    System.out.println("Elemen teratas sekarang: " + kota.peek());

    kota.pop();
    System.out.println("\nStack Kosong? " + kota.isEmpty());
}

}
