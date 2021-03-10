package M3.D9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ADV17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strList = scanner.nextLine().split(" ");
        ArrayList<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int length = 0;
        for (String str : strList) {
            str = str.toUpperCase();
            if (str.charAt(str.length() - 1) == ',' || str.charAt(str.length() - 1) == '.') {
                str = str.substring(0, str.length() - 1);
            }
            if (str.length() > length) {
                length = str.length();
            }
            if (!list.contains(str)) {
                list.add(str);
            }
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        for (String str : list) {
            StringBuilder blank = new StringBuilder();
            StringBuilder star = new StringBuilder();
            for (int i = 0; i < length - str.length(); i++) {
                blank.append(" ");
            }
            for (int i = 0; i < map.get(str); i++) {
                star.append("*");
            }
            System.out.println(blank + str + ":" + star + map.get(str));
        }
    }
}
