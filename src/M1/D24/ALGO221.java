package M1.D24;

import java.util.Scanner;

public class ALGO221 {
    static void swap(int[] twoNum) {
        int temp = twoNum[0];
        twoNum[0] = twoNum[1];
        twoNum[1] = temp;
    }

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int[] twoNum = new int[2];
        twoNum[0] = scanner.nextInt();
        twoNum[1] = scanner.nextInt();
        swap(twoNum);
        System.out.println(twoNum[0] + " " + twoNum[1]);
    }
}
