package M3.D14;

import java.util.Scanner;

public class ADV75 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split(" ");
        switch (command[0]){
            case "+":
                System.out.println(Integer.parseInt(command[1]) + Integer.parseInt(command[2]));
                break;
            case "-":
                System.out.println(Integer.parseInt(command[1]) - Integer.parseInt(command[2]));
                break;
            case "*":
                System.out.println(Integer.parseInt(command[1]) * Integer.parseInt(command[2]));
                break;
            case "/":
                System.out.println(Integer.parseInt(command[1]) / Integer.parseInt(command[2]));
                break;
        }
    }
}
