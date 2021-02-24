package M2.D17;

import java.math.BigInteger;
import java.util.Scanner;

public class ADV360 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger bigInteger1 = scanner.nextBigInteger();
        BigInteger bigInteger2 = scanner.nextBigInteger();
        System.out.println(bigInteger1.subtract(bigInteger2).toString());
    }
}
