package M2.D10;

public class ALGO129 {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            int sum = i % 10;
            int buf = i;
            while ((buf /= 10) != 0) {
                sum += buf%10;
            }
            if (sum == 10){
                System.out.println(i);
            }
        }
    }
}
