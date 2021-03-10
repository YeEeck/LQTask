package M3.D10;

import java.util.ArrayList;
import java.util.Scanner;

public class ADV266 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        if (num == 0) {
            System.out.println(0);
            return;
        } else if (num == 1) {
            System.out.println(1);
            return;
        }
        ArrayList<Long> list = new ArrayList<>();
        long div = 1;
        while (div <= num) {
            list.add(div);
            div *= 2;
        }
        int count = 1;
        num -= list.get(list.size() - 1);
        for (int i = list.size() - 2; i >= 0; i--) {
            if (list.get(i) <= num) {
                count++;
                num -= list.get(i);
            }
        }
        System.out.println(count);
    }
}
