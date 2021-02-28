package M2.D27;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ADV118 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        System.out.print("please input a number:\n");
        double num = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("please input a string:");
        String str = scanner.nextLine();
        System.out.println(df.format(num));
        System.out.println(str);
    }
}
