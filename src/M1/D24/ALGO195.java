package M1.D24;

import java.util.Scanner;

public class ALGO195 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 0) {
            System.out.println(0);
            return;
        }
        int[] his = new int[num];
        his[0] = 1;
        int len = Integer.toString(num).length();

        for (int i = 1; i < len; i++) {
            his[i] = his[i - 1] * 10 + (int) Math.pow(10, i);
        }
        for (int i = num + 1; i < (int) Math.pow(10, len); i++) {
            String str = Integer.toString(i);
            for (char t : str.toCharArray()) {
                if (t == '1') {
                    his[len - 1]--;
                }
            }
        }
        System.out.println(his[len-1]);
    }
}
