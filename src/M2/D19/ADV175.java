package M2.D19;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ADV175 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            pq.add(-scanner.nextInt());
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(-pq.poll() + " ");
        }
    }
}
