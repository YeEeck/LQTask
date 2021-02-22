package M2.D11;

import java.util.Scanner;

public class ADV103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int pos = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("0")) {
                pos = i;
                break;
            }
        }
        for (int i = pos - 1; i >= 0; i--) {
            System.out.print(input[i] + " ");
        }
    }
}
