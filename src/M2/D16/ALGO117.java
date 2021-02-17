package M2.D16;

import java.util.Scanner;

public class ALGO117 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum1 = 0, sum2 = 0;
        for (int i = 1; i <= num1 / 2; i++) {
            if (num1 % i == 0) {
                sum1 += i;
            }
        }
        for (int i = 1; i <= num2 / 2; i++) {
            if (num2 % i == 0) {
                sum2 += i;
            }
        }
        if (sum1 == num2 && sum2 == num1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
