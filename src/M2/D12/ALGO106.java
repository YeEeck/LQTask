package M2.D12;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ALGO106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] list = {'a', 'e', 'i', 'o', 'u'};
        Set<Character> set = new HashSet<>();
        for (char t : list) {
            set.add(t);
        }
        for (int i = 0; i < str.length(); i++) {
            if (set.contains(str.charAt(i))) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(0);
    }
}
