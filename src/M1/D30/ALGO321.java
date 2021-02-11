package M1.D30;

import java.util.Scanner;

public class ALGO321 {
    public static void main(String[] arg) {
        int[] list = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(list[m - 1]);
    }
}
