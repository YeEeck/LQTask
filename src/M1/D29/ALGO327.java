package M1.D29;

import java.util.Scanner;

public class ALGO327 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int timeS = scanner.nextInt();
        int timeM;
        int timeH;
        timeM = timeS / 60;
        timeS %= 60;
        timeH = timeM / 60;
        timeM %= 60;
        System.out.println(timeH + ":" + timeM + ":" + timeS);
    }
}
