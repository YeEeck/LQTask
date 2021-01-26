package M1.D26;

import java.math.BigInteger;
import java.util.Scanner;

public class ADV370 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();
        BigInteger bigInteger1 = new BigInteger(num1);
        BigInteger bigInteger2 = new BigInteger(num2);
        System.out.println(bigInteger1.divide(bigInteger2).toString());
    }
}
