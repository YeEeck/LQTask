package M1.D23;

import java.util.Scanner;

public class ALGO220 {
    static int[] GetTwoInts() {
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[2];
        list[0] = scanner.nextInt();
        list[1] = scanner.nextInt();
        return list;
    }

    public static void main(String[] arg) {
        int[] list = GetTwoInts();
        System.out.println(list[0] + list[1]);
    }
}
