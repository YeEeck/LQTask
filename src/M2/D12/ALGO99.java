package M2.D12;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ALGO99 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        float hour = scanner.nextFloat();
        float perMoney = scanner.nextFloat();
        if (hour < 40) {
            System.out.println(df.format(hour * perMoney));
        } else if (hour <= 50) {
            System.out.println(df.format(40 * perMoney + (hour - 40) * perMoney * 1.5));
        } else {
            System.out.println(df.format(40 * perMoney + 10 * perMoney * 1.5 + (hour - 50) * perMoney * 2));
        }
    }
}
