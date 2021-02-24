package M2.D21;

import java.util.Arrays;
import java.util.Scanner;

public class ADV138 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stuNum = Integer.parseInt(scanner.nextLine());
        String[] stuList = new String[stuNum];
        for (int i = 0; i < stuNum; i++) {
            stuList[i] = scanner.nextLine();
        }
        int[] scoreList = new int[stuNum];
        int examNum = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < examNum; i++) {
            int pos = -1;
            for (int j = 0; j < stuNum; j++) {
                String[] buf = scanner.nextLine().split(" ");
                int stuPos = -1;
                for (int k = 0; k < stuNum; k++) {
                    if (stuList[k].equals(buf[1])){
                        stuPos = k;
                    }
                }
                scoreList[stuPos] += Integer.parseInt(buf[0]);
                if (buf[1].equals("DaDa")) {
                    pos = scoreList[stuPos];
                }
            }
            int[] listBuf = scoreList.clone();
            Arrays.sort(listBuf);
            for (int j = stuNum - 1; j >= 0; j--) {
                if (listBuf[j] == pos) {
                    System.out.println(stuNum - j);
                    break;
                }
            }
        }
    }
}
