import java.util.Scanner;
import java.util.Stack;

public class BalikKata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        System.out.println("=== Membalikkan Sebuah Kata ===\n");

        System.out.print("Masukkan kata: ");
        String kata = input.nextLine();

        for (int i = 0; i < kata.length(); i++) {
            stack.push(kata.charAt(i));
        }

        String hasil = "";
        while (!stack.isEmpty()) {
            hasil += stack.pop();
        }

        System.out.println("Kata setelah dibalik: " + hasil);
    }
}
