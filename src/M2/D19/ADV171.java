package M2.D19;

import java.util.Scanner;

public class ADV171 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder strBuild = new StringBuilder(scanner.nextLine());
        strBuild.insert(6, "19");
        int[] multList = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        int[] endList = {1, 0, -1, 9, 8, 7, 6, 5, 4, 3, 2};
        int sum = 0;
        for (int i = 0; i < 17; i++) {
            sum += Integer.parseInt("" + strBuild.charAt(i)) * multList[i];
        }
        String endChar;
        if (sum % 11 == 2) {
            endChar = "x";
        } else {
            endChar = Integer.toString(endList[sum % 11]);
        }

        strBuild.append(endChar);
        System.out.println(strBuild);
    }
}
