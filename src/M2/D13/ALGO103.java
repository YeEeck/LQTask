package M2.D13;

import java.util.Scanner;

public class ALGO103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
