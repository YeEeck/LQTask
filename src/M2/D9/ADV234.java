package M2.D9;

import java.util.Scanner;

public class ADV234 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int start = scanner.nextInt();
        int step = scanner.nextInt();
        int i = start;
        while (i < str.length()) {
            System.out.print(str.charAt(i));
            i += step;
        }
    }
}
