package M2.D3;

import java.util.Scanner;

public class ADV309 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 0) {
            System.out.println(0);
            return;
        }
        System.out.println("0" + Integer.toString(num, 8));
    }
}
