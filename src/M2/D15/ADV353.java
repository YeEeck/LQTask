package M2.D15;

import java.math.BigInteger;
import java.util.Scanner;

public class ADV353 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger bigInteger1 = new BigInteger(scanner.nextLine());
        BigInteger bigInteger2 = new BigInteger(scanner.nextLine());
        System.out.println(bigInteger1.multiply(bigInteger2).toString());
    }
}
