package M3.D15;

import java.util.ArrayList;
import java.util.Scanner;

public class PREV5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> list = new ArrayList<>();
        int same = -1;
        int min = 0, max = 0;
        boolean first = true;
        for (int i = 0; i < line; i++) {
            StringBuilder res = new StringBuilder();
            String str = scanner.nextLine();
            boolean flag = true;
            for (char t : str.toCharArray()) {
                if (t == ' ') {
                    if (flag) {
                        res.append(' ');
                        flag = false;
                    }
                } else {
                    res.append(t);
                    flag = true;
                }
            }
            String[] strL = res.toString().split(" ");
            for (String strP : strL) {
                int num = Integer.parseInt(strP);
                if (first) {
                    max = num;
                    min = num;
                    first = false;
                }
                if (num > max) max = num;
                if (num < min) min = num;
                if (list.contains(num)) {
                    same = num;
                } else {
                    list.add(num);
                }
            }
        }
        for (int i = min; i <= max; i++) {
            if (!list.contains(i)) {
                System.out.print(i + " ");
                break;
            }
        }
        System.out.println(same);
    }
}
