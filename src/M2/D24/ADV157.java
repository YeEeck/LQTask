package M2.D24;

import java.util.Scanner;

public class ADV157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int i = 1; i <= str.length(); i++) {
            if (str.length() % i != 0) {
                continue;
            }
            String sub = str.substring(0, i);
            int flag = 0;
            for (int j = i; j < str.length(); j += i) {
                if (!str.substring(j - i, j).equals(sub)) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println(str.length() / i);
                return;
            }
        }
    }
}
