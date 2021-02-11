package M2.D10;

public class ALGO147 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int sum = (int) Math.pow(i % 10, 3);
            int bufI = i;
            while (bufI / 10 != 0) {
                bufI /= 10;
                sum += (int) Math.pow(bufI % 10, 3);
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
