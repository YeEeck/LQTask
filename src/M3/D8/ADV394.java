package M3.D8;

import java.util.HashMap;
import java.util.Scanner;

public class ADV394 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        for (String t : scanner.nextLine().split("")) {
            if (!map.containsKey(t)) {
                map.put(t, 1);
            } else {
                map.put(t, map.get(t) + 1);
            }
        }
        int max = 0;
        String chr = "";
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                chr = entry.getKey();
            }
        }
        System.out.println(chr + "\n" + max);
    }
}
