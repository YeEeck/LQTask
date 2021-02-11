package M2.D3;

import java.util.Scanner;

public class ALGO84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder strBuild = new StringBuilder(scanner.nextLine());
        for (int i = 0; i < strBuild.length(); i++) {
            if (Character.isUpperCase(strBuild.charAt(i))) {
                strBuild.setCharAt(i, Character.toLowerCase(strBuild.charAt(i)));
            } else {
                strBuild.setCharAt(i, Character.toUpperCase(strBuild.charAt(i)));
            }
        }
        System.out.println(strBuild.toString());
    }
}
