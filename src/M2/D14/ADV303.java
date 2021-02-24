package M2.D14;

import java.util.Scanner;

public class ADV303 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int len = scanner.nextInt();
        int[] list = new int[num + len];
        for (int i = 0; i < num; i++) {
            list[i] = scanner.nextInt();
        }
        if (len >= 0) System.arraycopy(list, 0, list, num, len);
        int max = 0;
        for (int i = 0; i < num; i++) {
            int sum = 0;
            for (int j = 0; j < len; j++) {
                sum += list[i + j];
            }
            if (sum > max){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
