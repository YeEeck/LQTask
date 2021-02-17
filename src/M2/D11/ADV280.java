package M2.D11;

import java.util.ArrayList;
import java.util.Scanner;

public class ADV280 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        if (n == 1){
            System.out.println(m);
            return;
        }
        for (int i = 1; i <= m; i++) {
            list.add(i);
        }
        int num = 1;
        int l = 0;
        int size = list.size();
        while (size != 1) {
            if (num == n) {
                list.remove(l);
                size--;
                num = 1;
                if (l > size - 1) {
                    l = 0;
                    continue;
                }
            }
            num++;
            if (l + 1 > size - 1) {
                l = 0;
            } else {
                l++;
            }
        }
        System.out.println(list.get(0));
    }
}
