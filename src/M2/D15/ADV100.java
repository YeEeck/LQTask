package M2.D15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ADV100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int buf = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        while (buf != 0){
            list.add(buf);
            buf = scanner.nextInt();
        }
        list.sort(Comparator.reverseOrder());
        System.out.println(list.get(1));
    }
}
