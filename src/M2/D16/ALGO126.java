package M2.D16;

import java.util.Scanner;

public class ALGO126 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int numB = num;
        int sum = (int) Math.pow(numB % 10, 3);
        while ((numB /= 10) != 0) {
            sum += (int) Math.pow(numB % 10, 3);
        }
        if (sum == num){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
