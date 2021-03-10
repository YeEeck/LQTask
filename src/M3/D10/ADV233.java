package M3.D10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ADV233 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            String[] commandBuf = scanner.nextLine().split(" ");
            switch (commandBuf[0]) {
                case "1":
                    queue.add(Integer.parseInt(commandBuf[1]));
                    break;
                case "2":
                    if (queue.size() == 0){
                        System.out.println("no");
                        return;
                    }
                    System.out.println(queue.poll());
                    break;
                case "3":
                    System.out.println(queue.size());
                    break;
            }
        }
    }
}
