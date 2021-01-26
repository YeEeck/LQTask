package M1.D26;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class ADV367 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getInstance();
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("NO");
        } else if (delta == 0) {
            System.out.println(nf.format((-b) / (2 * a)));
        } else {
            double[] list = new double[2];
            list[0] = -((-b) + Math.sqrt(delta)) / (2 * a);
            list[1] = -((-b) - Math.sqrt(delta)) / (2 * a);
            Arrays.sort(list);
            if ((int) list[0] == 0) {
                nf.setMaximumFractionDigits(6);
            } else {
                String strtt = java.lang.String.valueOf(Math.abs((int) list[0]));
                int len = strtt.length();
                nf.setMaximumFractionDigits(6 - len);
            }
            String num1 = nf.format(-list[0]);

            if ((int) list[1] == 0) {
                nf.setMaximumFractionDigits(6);
            } else {
                String strtt = java.lang.String.valueOf(Math.abs((int) list[1]));
                int len = strtt.length();
                nf.setMaximumFractionDigits(6 - len);
            }
            String num2 = nf.format(-list[1]);
            System.out.print(num1 + " " + num2);
        }
    }
}
