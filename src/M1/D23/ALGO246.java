package M1.D23;

import java.util.Scanner;

public class ALGO246 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextInt();
        double y = scanner.nextInt();
        double z = scanner.nextInt();
        double x1 = scanner.nextInt();
        double y1 = scanner.nextInt();
        double z1 = scanner.nextInt();
        int p = scanner.nextInt();
        double sum = x1 / x + y1 / y + z1 / z;
        sum = Math.round(sum * Math.pow(10, p)) / Math.pow(10, p);
        System.out.println(String.format("%.2f", sum));
    }
}
