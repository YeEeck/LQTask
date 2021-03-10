package M3.D10;

import java.util.Scanner;

public class ADV162 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int fir = scanner.nextInt();
        int max = fir, min = fir;
        for (int i = 0; i < num - 1; i++) {
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
