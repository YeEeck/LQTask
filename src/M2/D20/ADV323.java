package M2.D20;

import java.util.Scanner;

public class ADV323 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder strBuild = new StringBuilder(scanner.nextLine());
        String banStr = scanner.nextLine();
        int pos;
        while ((pos = strBuild.indexOf(banStr)) != -1) {
            strBuild.delete(pos, pos + banStr.length());
        }
        System.out.println(strBuild);
    }
}
