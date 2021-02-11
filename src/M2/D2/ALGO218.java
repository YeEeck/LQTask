package M2.D2;

import java.util.Scanner;

public class ALGO218 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder str = new StringBuilder(scanner.nextLine());
        int i = 1, j = str.length() - 1;
        if (j % 2 == 0) {
            j--;
        }
        while (i < j) {
            char temp = str.charAt(i);
            str.setCharAt(i, str.charAt(j));
            str.setCharAt(j, temp);
            i += 2;
            j -= 2;
        }
        System.out.println(str.toString());
    }
}
