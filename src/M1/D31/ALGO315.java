package M1.D31;

import java.util.Scanner;

public class ALGO315 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a % b == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
