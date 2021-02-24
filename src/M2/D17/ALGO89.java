package M2.D17;

import java.util.Scanner;

public class ALGO89 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder strB = new StringBuilder();
        String ban = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ban.charAt(0)){
                strB.append(str.charAt(i));
            }
        }
        System.out.println(strB.toString());
    }
}
