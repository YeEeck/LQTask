package M1.D25;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ALGO97 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < 3; i++) {
            pq.add(-1 * scanner.nextInt());
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(-1 * pq.poll());
            if (i != 2) {
                System.out.print(" ");
            }
        }

    }
}
