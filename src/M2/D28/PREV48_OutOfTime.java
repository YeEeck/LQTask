package M2.D28;

import java.util.Scanner;

public class PREV48_OutOfTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long[] list = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            list[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int command = scanner.nextInt();
            if (command == 1) {
                int l = scanner.nextInt();
                int r = scanner.nextInt();
                int d = scanner.nextInt();
                for (int j = l; j <= r; j++) {
                    list[j] += d;
                }
            } else if (command == 2) {
                int l1 = scanner.nextInt();
                int r1 = scanner.nextInt();
                int l2 = scanner.nextInt();
                int r2 = scanner.nextInt();
                long[] bufList = new long[r1 - l1 + 1];
                int x = 0;
                for (int j = l2; j <= r2; j++) {
                    bufList[x++] = list[j];
                }
                x = 0;
                for (int j = l1; j <= r1; j++) {
                    list[j] = bufList[x++];
                }
            } else if (command == 3) {
                long sum = 0;
                int l = scanner.nextInt();
                int r = scanner.nextInt();
                for (int j = l; j <= r; j++) {
                    sum += list[j];
                }
                System.out.println(sum);
            }

        }
    }
}
