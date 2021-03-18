package M3.D13;

import java.util.Scanner;

public class ALGO67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt(), min = max;
        for (int i = 0; i < 10; i++) {
            int buf = scanner.nextInt();
            if (buf > max) {
                max = buf;
            }
            if (buf < min) {
                min = buf;
            }
        }
        System.out.println(max + " " + min);
    }
}
