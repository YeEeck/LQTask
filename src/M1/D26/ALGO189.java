package M1.D26;

import java.util.Scanner;

public class ALGO189 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        long a = 1;
        for (int i = 2; i <= num; i++) {
            a *= i;
            while (a % 10 == 0) {
                a /= 10;
            }
            a %= 100000000;
        }
        a %= 10;
        System.out.println(a);
    }
}
