package M2.D9;

import java.util.*;

public class ADV198 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] banList = scanner.nextLine().split(" ");
        String[] strList = scanner.nextLine().split(" ");
        for (String s1 : banList) {
            for (String s2 : strList) {
                if (s1.length() == s2.length()) {
                    char[] buf1 = s1.toCharArray();
                    char[] buf2 = s2.toCharArray();
                    Arrays.sort(buf1);
                    Arrays.sort(buf2);
                    if (Arrays.equals(buf1, buf2)) {
                        System.out.print(s1 + " ");
                    }
                }
            }
        }
    }
}
