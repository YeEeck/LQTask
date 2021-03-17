package M3.D17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class PREV22 {
    static class Ld {
        int u, v, w;

        Ld(int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.w = w;
        }
    }

    static int[] f;

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String[] command = br.readLine().split(" ");
        int n = Integer.parseInt(command[0]);
        int m = Integer.parseInt(command[1]);
        Ld[] lds = new Ld[m];
        f = new int[n + 1];
        for (int i = 0; i < m; i++) {
            command = br.readLine().split(" ");
            lds[i] = new Ld(Integer.parseInt(command[0]), Integer.parseInt(command[1]), Integer.parseInt(command[2]));
        }
        for (int i = 1; i <= n; i++) {
            f[i] = i;
        }

        Arrays.sort(lds, new Comparator<Ld>() {
            @Override
            public int compare(Ld o1, Ld o2) {
                return Integer.compare(o2.w, o1.w);
            }
        });

        int pre = -1;
        int res = 0;
        for (int i = 0; i < m; i++) {
            if (!Onion(lds[i].u, lds[i].v) && pre != lds[i].w) {
                pre = lds[i].w;
                res++;
            }
        }
        System.out.println(res);
    }

    static int find(int x) {
        return x == f[x] ? x : find(f[x]);
    }

    static boolean Onion(int v, int u) {
        v = find(v);
        u = find(u);
        if (v != u) {
            f[u] = v;
            return false;
        }
        return true;
    }
}
