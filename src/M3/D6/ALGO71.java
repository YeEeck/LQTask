package M3.D6;

import java.util.Scanner;

public class ALGO71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strList = scanner.nextLine().split(" ");
        for (int i = 0; i < Math.min(strList[0].length(), strList[1].length()); i++) {
            if (strList[0].charAt(i) != strList[1].charAt(i)) {
                System.out.println(strList[0].charAt(i) - strList[1].charAt(i));
                return;
            }
        }
        System.out.println(0);
    }
}
