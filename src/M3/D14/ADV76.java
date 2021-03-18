package M3.D14;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ADV76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int num = scanner.nextInt();
        System.out.println(df.format(Math.pow(1.1, num)));
    }
}
