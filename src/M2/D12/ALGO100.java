package M2.D12;

import java.util.Scanner;

public class ALGO100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        int factor = scanner.nextInt();
        for (int i = min; i <= max; i++) {
            if (i % factor == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
