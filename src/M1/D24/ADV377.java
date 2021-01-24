package M1.D24;

import java.util.Scanner;

public class ADV377 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the dividend:");
        int a = scanner.nextInt();
        System.out.println("Please enter the divisor:");
        int b;
        do {
            b = scanner.nextInt();
            if (b == 0) {
                System.out.println("Error: divisor can not be zero! Please enter a new divisor:");
            }
        } while (b == 0);
        System.out.println(a / b);

    }
}
