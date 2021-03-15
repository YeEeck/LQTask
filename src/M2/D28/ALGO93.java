package M2.D28;

import java.util.Scanner;

public class ALGO93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = reserveNum(a) + reserveNum(b);
        System.out.println(reserveNum(sum));
    }

    private static int reserveNum(int num) {
        StringBuilder strBuild = new StringBuilder(Integer.toString(num));
        return Integer.parseInt(strBuild.reverse().toString());
    }
}
