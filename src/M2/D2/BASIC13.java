package M2.D2;

import java.util.PriorityQueue;
import java.util.Scanner;

public class BASIC13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < num; i++) {
            pq.add(scanner.nextInt());
        }
        while (pq.size() != 0) {
            System.out.print(pq.poll() + " ");
        }
    }
}
