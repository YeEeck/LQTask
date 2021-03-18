package M3.D18;

import java.util.ArrayList;
import java.util.Scanner;

public class PREV13 {
    static int n, m, sum;
    static ArrayList<Integer>[] road;
    static boolean[] vis;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        vis = new boolean[n + 1];
        road = new ArrayList[n + 1];
        for (int i = 1; i < n + 1; i++) {
            road[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            road[a].add(b);
            road[b].add(a);
        }

        for (int i = 1; i <= n; i++) {
            dfs(i, 0);
        }
        System.out.println(sum);
    }

    static void dfs(int cur, int pos) {
        if (pos == 2) {
            sum += road[cur].size() - 1;
            return;
        }
        vis[cur] = true;
        for (int point : road[cur]) {
            if (!vis[point]) {
                dfs(point, pos + 1);
            }
        }
        vis[cur] = false;
    }
}
