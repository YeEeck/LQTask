package M1.D31;

import java.util.Scanner;

public class PREV55 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());
        long sum = 0, num = 0;
        int firstFlag = 1;
        int base = 10;
        int type = 0;
        for (int i = 0; i < times; i++) {
            String[] buf = scanner.nextLine().split(" ");
            if (buf[0].equals("NUM")) {
                if (firstFlag == 1) {
                    sum = Long.parseLong(buf[1], base);
                    firstFlag = 0;
                    continue;
                } else {
                    num = Long.parseLong(buf[1], base);
                }

                if (type == 1){
                    sum += num;
                } else if (type == 2){
                    sum -= num;
                } else if (type == 3){
                    sum *= num;
                } else if (type == 4){
                    sum /= num;
                } else if (type == 5){
                    sum %= num;
                }
                type = 0;
                continue;
            }
            if (buf[0].equals("CHANGE")) {
                base = Integer.parseInt(buf[1]);
                continue;
            }
            if (buf[0].equals("EQUAL")) {
                System.out.println(Long.toString(sum, base).toUpperCase());
                continue;
            }
            if (buf[0].equals("CLEAR")){
                sum = 0;
                num = 0;
                firstFlag = 1;
                continue;
            }
            switch (buf[0]) {
                case "ADD":
                    type = 1;
                    break;
                case "SUB":
                    type = 2;
                    break;
                case "MUL":
                    type = 3;
                    break;
                case "DIV":
                    type = 4;
                    break;
                case "MOD":
                    type = 5;
                    break;
            }
        }
    }
}
