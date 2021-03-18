package M3.D12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ALGO78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] banList = {"a", "e", "i", "o", "u"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(banList));
        for (int i = 0; i < str.length(); i++) {
            if (list.contains(Character.toString(str.charAt(i)))) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(0);
    }
}
