public class MainStack {
    public static void main(String[] args) {
        StackArray stack = new StackArray(3);

        System.out.println("=== Implementasi Stack dengan Array ===\n");

        stack.push("Sukabumi");
        stack.display();

        stack.push("Bandung");
        stack.display();

        stack.push("Jakarta");
        stack.display();

        System.out.println("\nElemen teratas: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        stack.display();

        System.out.println("Pop: " + stack.pop());
        stack.display();

        System.out.println("Elemen teratas sekarang: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Apakah stack kosong? " + stack.isEmpty());
    }
}