package M3.D17;

import java.util.Scanner;

public class PREV33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int col = scanner.nextInt(), row = scanner.nextInt();
        int[][] map = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                map[j][i] = scanner.nextInt();
            }
        }
        scanner.nextLine();
        String[] ant = scanner.nextLine().split(" ");
        int x = Integer.parseInt(ant[0]);
        int y = Integer.parseInt(ant[1]);
        String face = ant[2];
        String[] dFace = {"U", "L", "D", "R"};
        int times = Integer.parseInt(ant[3]);
        for (int i = 0; i < times; i++) {
            if (map[x][y] == 0) {
                
            }
        }
    }
}
