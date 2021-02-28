package M2.D27;

import java.util.Scanner;

public class ADV119 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int numX = 0;
        for (int i = 0; i < num; i++) {
            int buf = scanner.nextInt();
            if (buf != 0) {
                System.out.print(buf + " ");
                numX++;
            }
        }
        System.out.println("\n" + numX);
    }
}
