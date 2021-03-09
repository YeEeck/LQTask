package M3.D8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ADV380 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        long n = scanner.nextInt(), m = scanner.nextInt(), MOD = scanner.nextInt();
        int cnt = 1;
        for(int i = 0; i < m; i++){
            cnt *= n - i;
            cnt /= i + 1;
        }
        System.out.println(cnt % MOD);
    }
}
