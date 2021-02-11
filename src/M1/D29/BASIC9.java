package M1.D29;

import java.util.Scanner;

public class BASIC9 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 10000; i < 1000000; i++) {
            String buf = String.valueOf(i);
            int sum = 0;
            if (buf.contentEquals(new StringBuffer(buf).reverse())) {
                for (char t : buf.toCharArray()) {
                    sum += Integer.parseInt(String.valueOf(t));
                }
            }
            if (sum == n){
                System.out.println(i);
            }
        }
    }
}
