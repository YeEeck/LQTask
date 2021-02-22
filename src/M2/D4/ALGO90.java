package M2.D4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ALGO90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num <= 0){
            return;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num; i++) {
            int buf = scanner.nextInt();
            if (map.containsKey(buf)) {
                map.put(buf, map.get(buf) + 1);
            } else {
                map.put(buf, 1);
            }
        }
        int max = 0;
        int maxNum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxNum = entry.getKey();
            }
        }
        System.out.println(maxNum);
    }
}
