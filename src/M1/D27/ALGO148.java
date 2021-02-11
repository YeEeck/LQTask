package M1.D27;

import java.util.Scanner;

public class ALGO148 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        int at = a, bt = b;
        int r;
        while ((r = a % b) != 0) {
            a = b;
            b = r;
        }
        System.out.println(at * bt / b);

    }
}
