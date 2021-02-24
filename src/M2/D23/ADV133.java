package M2.D23;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ADV133 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set1 = new HashSet<>();
        int[] award = new int[8];
        int num = scanner.nextInt();
        for (int i = 0; i < 7; i++) {
            set1.add(scanner.nextInt());
        }
        for (int i = 0; i < num; i++) {
            int earn = 0;
            for (int j = 0; j < 7; j++) {
                if (set1.contains(scanner.nextInt())) {
                    earn++;
                }
            }
            award[earn]++;
        }
        for (int i = 7; i >= 1; i--) {
            System.out.print(award[i] + " ");
        }
    }
}
