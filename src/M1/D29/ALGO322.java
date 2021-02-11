package M1.D29;

import java.util.Scanner;

public class ALGO322 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
