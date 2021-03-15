package M3.D8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ADV393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int n = scanner.nextInt();

        int min = scanner.nextInt();
        int max = min;
        int sum = max;
        for (int i = 0; i < n - 1; i++) {
            int buf = scanner.nextInt();
            if (buf > max) {
                max = buf;
            } else if (buf < min) {
                min = buf;
            }
            sum += buf;
        }
        System.out.println(max + "\n" + min + "\n" + df.format((double) sum / (double) n));
    }
}
