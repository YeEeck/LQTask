package M2.D7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ALGO238 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += scanner.nextDouble();
        }
        System.out.println(df.format(sum));
        System.out.println(df.format(sum / 10));
    }
}
