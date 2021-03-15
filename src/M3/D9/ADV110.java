package M3.D9;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ADV110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int c = scanner.nextInt();
        System.out.println(df.format(c * 1.8 + 32));
    }
}
