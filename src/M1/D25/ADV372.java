package M1.D25;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ADV372 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            pq.add(-scanner.nextInt());
        }
        System.out.println(-pq.poll());
    }
}
