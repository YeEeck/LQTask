package M2.D23;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ADV182 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            pq.add(-scanner.nextInt());
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(-pq.poll() + " ");
        }
    }
}
