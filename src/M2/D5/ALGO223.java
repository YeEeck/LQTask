package M2.D5;

import java.util.Scanner;

public class ALGO223 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int n = scanner.nextInt();
        if (str1.substring(0, n).equals(str2.substring(0, n))) {
            System.out.println(0);
        } else {
            for (int i = 0; i < n; i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    int a = str1.charAt(i) - str2.charAt(i);
                    System.out.println((a) / Math.abs(a));
                    break;
                }
            }
        }
    }
}
