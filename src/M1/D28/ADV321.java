package M1.D28;

import java.util.*;

public class ADV321 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] list = new int[num];
        for (int i = 0; i < num; i++) {
            list[i] = scanner.nextInt();
        }
        Arrays.sort(list);
        Set<Integer> set = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        int len = 0;
        for (int i : list) {
            if (!set.contains(i)) {
                queue.add(i);
                set.add(i);
                len++;
            }
        }
        System.out.println(len);
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
}
