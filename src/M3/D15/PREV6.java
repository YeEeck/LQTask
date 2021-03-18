package M3.D15;

import java.util.Scanner;

public class PREV6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder start = new StringBuilder(scanner.nextLine());
        StringBuilder dest = new StringBuilder(scanner.nextLine());
        int times = 0;
        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i) != dest.charAt(i)) {
                for (int j = i; j < i + 2; j++) {
                    if (j == start.length()) break;
                    if (start.charAt(j) == '*') {
                        start.setCharAt(j, 'o');
                    } else {
                        start.setCharAt(j, '*');
                    }
                }
                times++;
            }
        }
        System.out.println(times);
    }
}
