package M2.D17;

import java.util.Scanner;

public class ADV357 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (Character.isUpperCase(str.charAt(0))){
            System.out.println(str.toLowerCase());
        } else {
            System.out.println(str.toUpperCase());
        }
    }
}
