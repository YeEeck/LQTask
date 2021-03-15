package M3.D2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ADV130 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map1 = new HashMap<>();
        int num = Integer.parseInt(scanner.nextLine());
        int max = 1;
        int count = 0;
        for (int i = 0; i < num; i++) {
            String buf = scanner.nextLine();
            if (map1.containsKey(buf)) {
                map1.put(buf, map1.get(buf) + 1);
                if (map1.get(buf) > max) {
                    max = map1.get(buf);
                    count = 0;
                }
            } else {
                map1.put(buf, 1);
            }
            if (map1.get(buf) == max){
                count++;
            }
        }
        String[] res = new String[count];
        int x = 0;
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            if (entry.getValue() == max){
                res[x++] = entry.getKey();
            }
        }
        Arrays.sort(res);
        for (String str : res){
            System.out.println(str);
        }
    }
}
