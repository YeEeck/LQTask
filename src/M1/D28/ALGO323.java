package M1.D28;

public class ALGO323 {
    public static void main(String[] arg) {
        for (int i = 2; i < 1000; i++) {
            int sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
