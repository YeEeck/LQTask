package M2.D5;

import java.util.Scanner;

public class ADV313 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int len = str1.length() < str2.length() ? str1.length() : str2.length();
        if (str1.equals(str2)) {
            System.out.println(0);
        } else {
            for (int i = 0; i < len; i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    int a = str1.charAt(i) - str2.charAt(i);
                    System.out.println(-(a) / Math.abs(a));
                    break;
                }
            }
        }
    }
}
