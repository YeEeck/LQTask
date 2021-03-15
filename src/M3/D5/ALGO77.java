package M3.D5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ALGO77 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        if (x1 == x2) {
            System.out.println("INF");
            return;
        }
        System.out.println(df.format((double) (y2 - y1) / (double) (x2 - x1)));
    }
}
