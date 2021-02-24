package M2.D22;

import java.util.Scanner;

public class ADV320 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean[] vis = new boolean[n + 1];
        int[] prime = new int[n + 1];
        int x = 0;
        for (int i = 2; i <= n; i++) {
            if (!vis[i]) {
                prime[x++] = i;
            }
            for (int j = 2; i * j <= n; j++) {
                vis[i * j] = true;
            }
        }
        int sum = 0;
        for (int num : prime) {
            sum += num;
        }
        System.out.println(sum);
    }
}
