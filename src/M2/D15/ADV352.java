package M2.D15;

import java.util.Scanner;

public class ADV352 {
    static int power(int a, int b){
        int res = 1;
        for (int i = 0; i < b; i++) {
            res *= a;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int res = 1;
        for (int i = 0; i < b; i++) {
            res *= a;
        }
        System.out.println(res);
    }
}
