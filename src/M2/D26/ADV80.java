package M2.D26;

import java.util.Scanner;

public class ADV80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        for (int i = 0; i < 3; i++) {
            int buf = scanner.nextInt();
            if (buf > max){
                max = buf;
            }
        }
        System.out.println(max);
    }
}
