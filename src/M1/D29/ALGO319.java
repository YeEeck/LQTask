package M1.D29;

import java.util.Scanner;

public class ALGO319 {
    public static void main(String[] arg) {
        int sum = 0;
        int[][] list = new int[4][4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                list[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            sum += list[i][i] + list[i][3 - i];
        }
        System.out.println(sum);
    }
}
