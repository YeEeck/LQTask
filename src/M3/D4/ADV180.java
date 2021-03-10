package M3.D4;

import java.util.Scanner;

public class ADV180 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int height = scanner.nextInt() + 30;
        int count = 0;
        for (int i = 0; i < num; i++) {
            if (scanner.nextInt() > height){
                count++;
            }
        }
        System.out.println(count);
    }
}
