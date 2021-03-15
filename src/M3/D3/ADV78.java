package M3.D3;

import java.util.Scanner;

public class ADV78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strList = scanner.nextLine().split(" ");
        int max = 0;
        String res = "";
        for (String str : strList) {
            if (str.length() > max) {
                max = str.length();
                res = str;
            }
        }
        System.out.println(res);
    }
}
