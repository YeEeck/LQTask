package M3.D16;

import java.util.ArrayList;
import java.util.Scanner;

public class PREV10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt(), end = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 3; i < end; i += 2) {
            list.add(i);
        }
        for (int i = 2; i < list.size(); i++) {
            int model = list.get(i);
            for (int j = model; j < list.size(); j += model - 1) {
                list.remove(j);
            }
        }
        int count = 0;
        for (int t:list){
            if (t > start){
                count++;
            }
        }
        System.out.println(count);
    }
}
