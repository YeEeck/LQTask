package M2.D20;

import java.util.Scanner;

public class PREV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[3];
        int max = 0;
        for (int i = 0; i < 3; i++) {
            list[i] = scanner.nextInt();
            if (list[i] > max) {
                max = list[i];
            }
        }
        for (int i = max; i < 900; i++) {
            if (i % list[0] == 0 && i % list[1] == 0 && i % list[2] == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
