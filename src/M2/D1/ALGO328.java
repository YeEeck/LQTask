package M2.D1;

import java.util.Scanner;

public class ALGO328 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder strBuffer = new StringBuilder(scanner.nextLine());
        strBuffer.setCharAt(0, Character.toUpperCase(strBuffer.charAt(0)));
        for (int i = 0; i < strBuffer.length() - 1; i++) {
            char t = strBuffer.charAt(i), t1 = strBuffer.charAt(i + 1);
            if ((t == ' ' || t == '\t' || t == '\n' || t == '\r') && t1 != ' ' && t1 != '\t' && t1 != '\n' && t1 != '\r') {
                strBuffer.setCharAt(i + 1, Character.toUpperCase(strBuffer.charAt(i + 1)));
            }
        }
        System.out.println(strBuffer.toString());
    }
}
