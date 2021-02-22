package M1.D30;

import java.util.Scanner;

public class ALGO320 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        long sum = 0;
        for (int i = min; i <= max; i++) {
            sum += (long) i * (long) i;
        }
        System.out.println(sum);
    }
}
