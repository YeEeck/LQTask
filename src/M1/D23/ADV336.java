package M1.D23;

import java.util.Scanner;

public class ADV336 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int se = Integer.parseInt(scanner.nextLine());
        int num = Integer.parseInt(scanner.nextLine());
        if (se == 0){
            str = str.toUpperCase();
        }
        for (int i = 0; i < num; i++) {
            String strBuf = scanner.nextLine();
            String temp = strBuf;
            if (se == 0){
                temp = strBuf.toUpperCase();
            }
            if (temp.contains(str)){
                System.out.println(strBuf);
            }
        }
    }
}
