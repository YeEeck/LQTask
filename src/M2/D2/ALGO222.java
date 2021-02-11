package M2.D2;

import java.util.Scanner;
import java.util.Stack;

public class ALGO222 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        while (true) {
            int buf = scanner.nextInt();
            if (buf == 0) break;
            stack.add(buf);
        }
        while (stack.size() != 0) {
            System.out.print(stack.pop() + " ");
        }
    }
}
