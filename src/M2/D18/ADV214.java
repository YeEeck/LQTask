package M2.D18;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ADV214 {
    public static void main(String[] args) {
        final double PI = 3.1415926536;
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000000000");
        double r = scanner.nextDouble();
        double sCir = PI * r * r;
        StringBuilder blank1 = new StringBuilder();
        for (int i = 0; i < 20 - df.format(sCir).length(); i++) {
            blank1.append(" ");
        }
        double sOutBall = 4 * PI * r * r;
        StringBuilder blank2 = new StringBuilder();
        for (int i = 0; i < 20 - df.format(sOutBall).length(); i++) {
            blank2.append(" ");
        }
        double vBall = (4.0 / 3.0) * PI * Math.pow(r, 3);
        StringBuilder blank3 = new StringBuilder();
        for (int i = 0; i < 20 - df.format(vBall).length(); i++) {
            blank3.append(" ");
        }
        System.out.println(df.format(sCir) + blank1.toString() + df.format(sOutBall) + blank2.toString() + df.format(vBall) + blank3.toString());
    }
}
