package M3.D13;

import java.util.Scanner;

public class ALGO73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        for (char t : scanner.nextLine().toCharArray()) {
            if (Character.isDigit(t)){
                num++;
            }
        }
        System.out.println(num);
    }
}
