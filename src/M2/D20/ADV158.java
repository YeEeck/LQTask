package M2.D20;

import java.util.Scanner;

public class ADV158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int[] list = new int[2012];
        for (int i = 0; i < num; i++) {
            String[] command = scanner.nextLine().split(" ");
            if (command[0].equals("New")) {
                for (int j = 0; j < 2012; j++) {
                    if (list[j] == 0) {
                        list[j] = 1;
                        System.out.println(j + 1);
                        break;
                    }
                }
            } else if (command[0].equals("Delete")){
                int pos = Integer.parseInt(command[1]) - 1;
                if (list[pos] == 1){
                    list[pos] = 0;
                    System.out.println("Successful");
                } else {
                    System.out.println("Failed");
                }
            }
        }
    }
}
