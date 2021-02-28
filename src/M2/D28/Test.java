package M2.D28;

import java.util.Scanner;

public class Test {
    static int[] a = new int[110];
    static int[] dp = new int[10005];
    static int N;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        N = sc.nextInt();
        for (int i = 0; i < N; i++)
            a[i] = sc.nextInt();
        int g = a[0];
        for (int i = 1; i < N; i++)
            g = gcd(g, a[i]);
        if (g != 1) {
            System.out.println("INF");
        } else {
            dp[0] = 1;
            for (int i = 0; i < N; i++)
                for (int j = 0; j + a[i] <= 10000; j++) {
                    if (dp[j] == 1) dp[j + a[i]] = 1; //标记可以组成的数，有点像完全背包，对于每一个下标为i的包子数，又可以凑出什么新的数
                }
            int count = 0;
            for (int i = 1; i <= 10000; i++) {
                if (dp[i] == 0) count++;
            }
            System.out.println(count);
        }

    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
