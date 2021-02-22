package M2.D4;

import java.util.Scanner;

public class ADV355 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int len = 0;
        StringBuilder res = new StringBuilder();
        loop:
        for (int i = 2; i < num; i++) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    continue loop;
                }
            }
            res.append(i).append(" ");
            len++;
        }
        System.out.println(len);
        System.out.println(res);
    }
}
