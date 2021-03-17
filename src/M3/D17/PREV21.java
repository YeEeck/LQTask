package M3.D17;

import java.util.Scanner;

public class PREV21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean flag = true;
        for (int i = 10000; i < 1000000; i++) {
            if (("" + i).equals(new StringBuilder("" + i).reverse().toString()) && getSum(i) == num) {
                System.out.println(i);
                flag = false;
            }
        }
        if (flag) {
            System.out.println(-1);
        }
    }

    static int getSum(int a) {
        int sum = a % 10;
        while ((a /= 10) != 0) {
            sum += a % 10;
        }
        return sum;
    }
}
