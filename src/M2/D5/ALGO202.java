package M2.D5;

import java.util.Scanner;

public class ALGO202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int num = 0;
        for (int i = l; i <= r; i++) {
            String strBuf = Integer.toString(i, 2);
            for (char t : strBuf.toCharArray()) {
                if (t == '1') {
                    num++;
                }
            }
        }
        System.out.println(num);
    }
}
