package M1.D23;

import java.util.Scanner;

public class ALGO201 {
    public static void main(String[] arg) {
        long num = 0;
        long i = 1;
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        while (true) {
            if (num >= target){
                System.out.println(num);
                break;
            }
            num = i * i;
            i++;
        }
    }
}
