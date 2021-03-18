package M3.D15;

import com.sun.corba.se.impl.util.SUNVMCID;

import java.util.Scanner;

public class PREV4 {
    static int[][] a = new int[10][10];
    static int[] dx = {1, 0, -1, 0}, dy = {0, 1, 0, -1};
    static boolean[][] vis = new boolean[10][10];
    static int M, N, SUM;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        M = scanner.nextInt();
        N = scanner.nextInt();
        SUM = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                a[i][j] = scanner.nextInt();
                SUM += a[i][j];
            }
        }
        if (SUM % 2 != 0) {
            System.out.println(0);
            return;
        }
        vis[1][1] = true;
        System.out.println(dfs(1, 1, a[1][1]));
    }

    static int dfs(int x, int y, int num) {
        if (num == SUM / 2) {
            return 1;
        }
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (judge(nx, ny, num)) {
                continue;
            }
            vis[nx][ny] = true;
            int res = dfs(nx, ny, num + a[nx][ny]);
            if (res != 0) return res + 1;
            vis[nx][ny] = false;
        }
        return 0;
    }

    static boolean judge(int x, int y, int num) {
        if (x < 1 || y < 1 || x > N || y > M) {
            return true;
        }
        if (vis[x][y]) {
            return true;
        }
        if (num + a[x][y] > SUM / 2) {
            return true;
        }
        return false;
    }
}
