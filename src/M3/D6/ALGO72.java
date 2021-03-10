package M3.D6;

import java.util.Scanner;

public class ALGO72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        if (score < 60) {
            System.out.println("E");
        } else if (score < 70) {
            System.out.println("D");
        } else if (score < 80) {
            System.out.println("C");
        } else if (score < 90) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }
}
