package M3.D8;

import java.util.Scanner;

public class ALGO80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += scanner.nextInt();
        }
        System.out.println(sum / num);
    }
}
