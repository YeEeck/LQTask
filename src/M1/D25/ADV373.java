package M1.D25;

import java.util.Arrays;
import java.util.Scanner;

public class ADV373 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        float[] list = new float[10];
        for (int i = 0; i < 10; i++) {
            list[i] = scanner.nextFloat();
        }
        Arrays.sort(list);
        float max = 0;
        int maxP1 = 0, maxP2 = 0;
        for (int i = 1; i < 10; i++) {
            if (Math.abs(list[i] - list[i - 1]) > max) {
                max = Math.abs(list[i] - list[i - 1]);
                maxP1 = i;
            }
        }
        max = 0;
        for (int i = 1; i < 10; i++) {
            if (i == maxP1) continue;
            if (Math.abs(list[i] - list[i - 1]) > max) {
                max = Math.abs(list[i] - list[i - 1]);
                maxP2 = i;
            }
        }

        if (maxP1 > maxP2) {
            int temp = maxP1;
            maxP1 = maxP2;
            maxP2 = temp;
        }
        float sum = 0;
        for (int i = 0; i < maxP1; i++) {
            sum += list[i];
        }
        System.out.println(sum / maxP1);
        sum = 0;
        for (int i = maxP1; i < maxP2; i++) {
            sum += list[i];
        }
        System.out.println(sum / (maxP2 - maxP1));
        sum = 0;
        for (int i = maxP2; i < 10; i++) {
            sum += list[i];
        }
        System.out.println(sum / (10 - maxP2));
    }
}
