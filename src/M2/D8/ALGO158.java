package M2.D8;

import java.util.Scanner;

public class ALGO158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        if (num < 0) {
            System.out.println(-1);
        } else if (num == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
