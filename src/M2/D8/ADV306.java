package M2.D8;

import java.util.Scanner;

public class ADV306 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        for (int i = 0; i < 2; i++) {
            int buf = scanner.nextInt();
            if (buf > max){
                max = buf;
            }
        }
        System.out.println(max);
    }
}
