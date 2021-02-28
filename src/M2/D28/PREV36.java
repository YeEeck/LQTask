package M2.D28;

import java.util.Scanner;

public class PREV36 {
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] a = new int[105];
        int[] vis = new int[10000];
        for (int i = 0; i < num; i++) {
            a[i] = scanner.nextInt();
        }
        int g = a[0];
        for (int i = 1; i < num; i++) {
            g = gcd(g, a[i]);
        }
        if (g != 1) {
            System.out.println("INF");
        } else {
            vis[0] = 1;
            for (int i = 0; i < num; i++) {
                for (int j = 0; j + a[i] < 10000; j++) {
                    if (vis[j] == 1) {
                        vis[j + a[i]] = 1;
                    }
                }
            }
            int count = 0;
            for (int n : vis) {
                if (n == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }


}
