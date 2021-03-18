package M3.D12;

import java.util.Scanner;

public class ALGO68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Integer.parseInt(scanner.nextLine());
        } catch (Exception e){
            System.out.println("no");
            return;
        }
        System.out.println("yes");
    }
}
