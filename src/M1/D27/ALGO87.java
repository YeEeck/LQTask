package M1.D27;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ALGO87 {
    public static void main(String[] arg) {
        Map<String, Integer> bukkit = new HashMap<>();
        Map<String, Integer> line = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        String str = scanner.next();
        int lineN = 1;
        for (int i = len; i <= str.length(); i++) {
            for (int j = 0; j <= str.length() - i; j++) {
                String strBuf = str.substring(j, j + i);
                if (bukkit.containsKey(strBuf)) {
                    bukkit.put(strBuf, bukkit.get(strBuf) + 1);
                } else {
                    bukkit.put(strBuf, 1);
                }
                if (!line.containsKey(strBuf)) {
                    line.put(strBuf, lineN);
                    lineN++;
                }
            }
        }
        int max = 0;
        int linekey = 10000000;
        String maxStr = "";
        for (Map.Entry<String, Integer> entry : bukkit.entrySet()) {
            if (maxStr.equals("")) {
                maxStr = entry.getKey();
            }
            if (entry.getValue() > max) {
                maxStr = entry.getKey();
                max = entry.getValue();
                linekey = line.get(entry.getKey());
            } else if (entry.getValue() == max) {
                if (entry.getKey().length() > maxStr.length()) {
                    maxStr = entry.getKey();
                    linekey = line.get(entry.getKey());
                } else if (line.get(entry.getKey()) < linekey && entry.getKey().length() == maxStr.length()) {
                    maxStr = entry.getKey();
                    linekey = line.get(entry.getKey());
                }


            }
        }
        System.out.println(maxStr);
    }
}
