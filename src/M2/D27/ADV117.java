package M2.D27;

import java.util.Scanner;

public class ADV117 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine(), 16);
        System.out.println(Integer.toString(num, 16).toUpperCase() + " " + Integer.toString(num, 10) + " " + Integer.toString(num, 8));
    }
}
