package M2.D26;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ADV105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strList = scanner.nextLine().split(" ");
        Set<String> set = new HashSet<>(Arrays.asList(strList));
        Set set2;
        System.out.println(set.size());
    }
}
