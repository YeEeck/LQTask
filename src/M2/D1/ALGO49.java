package M2.D1;

import java.util.Scanner;

public class ALGO49 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int max = 0, maxPos = 0;
        for (int i = 0; i < num; i++) {
            int buf = scanner.nextInt();
            if (buf > max) {
                max = buf;
                maxPos = i;
            }
        }
        System.out.println(max + " " + maxPos);
    }
}
