package M3.D10;

import java.util.Scanner;

public class ADV381_fail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] list = new int[num];
        for (int i = 0; i < num; i++) {
            list[i] = scanner.nextInt();
        }
        int l = 0, r = num - 1;
        int sumL = list[l], sumR = list[r];
        while (r - l > 1) {
            if (sumL < sumR) {
                l++;
                sumL += list[l];
            } else {
                r--;
                sumR += list[r];
            }
        }
        System.out.println(Math.min(sumL, sumR));
    }
}
