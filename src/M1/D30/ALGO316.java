package M1.D30;

import java.util.Scanner;

public class ALGO316 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strList = str.split(" ");
        for (int i = strList.length - 1; i >= 0; i--) {
            System.out.print(strList[i] + " ");
        }
    }
}
