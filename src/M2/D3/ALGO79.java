package M2.D3;

import java.util.Scanner;

public class ALGO79 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        int num = scan1.nextInt();
        int len = num;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < num; i++) {
            int buf = scan1.nextInt();
            if (buf != 0) {
                res.append(buf).append(" ");
            } else {
                len--;
            }
        }
        System.out.println(len);
        System.out.println(res);
    }
}
