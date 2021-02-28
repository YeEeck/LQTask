package M2.D26;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ADV81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(num * num + " " + df.format(Math.sqrt(num)) + " " + df.format(1.0 / num));
    }
}
