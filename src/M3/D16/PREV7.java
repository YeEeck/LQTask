package M3.D16;

import java.util.Scanner;

public class PREV7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] list = new int[num];
        int count = 0;
        for (int i = 0; i < num; i++) {
            list[i] = scanner.nextInt();
        }
        int max, min;
        for (int i = 0; i < num; i++) {
            max = min = list[i];
            for (int j = i; j < num; j++) {
                if (list[j] > max) max = list[j];
                if (list[j] < min) min = list[j];
                if (max - min == j - i) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
