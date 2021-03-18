package M3.D14;

import java.util.Scanner;

public class ADV79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int day = 0;
        int hour = 0;
        if (min > 1440) {
            day = min / 1440;
        }
        if (min > 60) {
            hour = (min - day * 1440) / 60;
        }
        min = min - day * 1440 - hour * 60;
        System.out.println(day + " " + hour + " " + min);
    }
}
