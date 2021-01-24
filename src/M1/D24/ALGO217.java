package M1.D24;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ALGO217 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            pq.add(scanner.nextInt() * -1);
        }
        for (int i = 0; i < num; i++) {
            System.out.print(pq.poll() * -1);
            if (i != num - 1) {
                System.out.print(" ");
            }
        }
    }
}
