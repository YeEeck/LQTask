package M2.D6;

import java.util.Scanner;

public class ALGO143 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strL = scanner.nextLine().split(" ");
        StringBuilder strB = new StringBuilder(strL[1]);
        switch (strL[0]) {
            case "1":
                System.out.println(strB.toString().toUpperCase());
                break;
            case "2":
                System.out.println(strB.toString().toLowerCase());
                break;
            case "3":
                System.out.println(strB.reverse().toString());
                break;
            case "4":
                for (int i = 0; i < strB.length(); i++) {
                    char buf = strB.charAt(i);
                    if (Character.isUpperCase(buf)) {
                        strB.setCharAt(i, Character.toLowerCase(buf));
                    } else {
                        strB.setCharAt(i, Character.toUpperCase(buf));
                    }
                }
                System.out.println(strB.toString());
                break;
            case "5":
                StringBuilder buf = new StringBuilder(strB.toString().toLowerCase());
                StringBuilder res = new StringBuilder();
                if (buf.length() <= 2) {
                    System.out.println(buf.toString());
                    return;
                }
                int len = buf.length();
                char last = buf.charAt(0);
                res.append(buf.charAt(0));
                int flag = 0;
                for (int i = 1; i < len - 1; i++) {
                    if (buf.charAt(i) == last + 1 && buf.charAt(i + 1) == last + 2) {
                        if (flag == 0) {
                            res.append('-');
                            flag = 1;
                        }
                    } else {
                        res.append(buf.charAt(i));
                        if (flag == 1) {
                            flag = 0;
                            continue;
                        }
                    }
                    last = buf.charAt(i);
                }
                res.append(buf.charAt(buf.length() - 1));
                System.out.println(res.toString());
                break;
        }
    }
}
