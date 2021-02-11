package M2.D8;

import java.util.Arrays;
import java.util.Scanner;

public class ALGO234 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] strL = str.toCharArray();
        Arrays.sort(strL);
        for (char t : strL) {
            System.out.print(t);
        }
    }
}
