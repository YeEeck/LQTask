package M2.D23;

import java.util.Scanner;

public class ADV183 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stuNum = scanner.nextInt();
        int teacherNum = scanner.nextInt();
        int[] student = new int[stuNum];
        for (int i = 0; i < teacherNum; i++) {
            int Li = scanner.nextInt();
            int Ri = scanner.nextInt();
            int Ci = scanner.nextInt();
            for (int j = Li - 1; j <= Ri - 1; j++) {
                student[j] += Ci;
            }
        }
        for (int i : student) {
            System.out.print(i + " ");
        }
    }
}
