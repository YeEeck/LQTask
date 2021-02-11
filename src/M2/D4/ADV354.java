package M2.D4;

import java.util.Scanner;

public class ADV354 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int len = 0;
        loop:
        for (int i = 2; i < num; i++) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    continue loop;
                }
            }
            System.out.print(i + " ");
            len++;
        }
        System.out.print("\n" + len);
    }
}
