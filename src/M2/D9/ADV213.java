package M2.D9;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ADV213 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float money = scanner.nextFloat();
        float cent = scanner.nextFloat();
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.UP);
        System.out.println(df.format(money + cent * money * 0.95 * 0.01));
    }
}
