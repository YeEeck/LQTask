package M2.D6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ALGO200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        int sex = scanner.nextInt();
        double father = scanner.nextDouble(), mother = scanner.nextDouble();
        if (sex == 0) {
            double res = (father * 0.923 + mother) / 2;
            System.out.println(df.format(res));
        } else {
            double res = ((father + mother) / 2 * 1.08);
            System.out.println(df.format(res));
        }
    }
}
