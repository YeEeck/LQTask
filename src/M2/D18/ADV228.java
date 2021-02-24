package M2.D18;

import java.util.Scanner;

public class ADV228 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder strBuild = new StringBuilder(scanner.nextLine());
        for (int i = 0; i < strBuild.length(); i++) {
            int flag = 0;
            for (int j = i + 1; j < strBuild.length(); j++) {
                if (strBuild.charAt(j) == strBuild.charAt(i)){
                    strBuild.deleteCharAt(j);
                    j--;
                    flag = 1;
                }
            }
            if (flag == 1){
                strBuild.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(strBuild.toString());
    }
}
