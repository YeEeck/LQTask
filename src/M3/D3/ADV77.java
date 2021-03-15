package M3.D3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ADV77 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int[] sumList = new int[4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sumList[j] += scanner.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(df.format(sumList[i] / 4.0));
        }
    }
}
