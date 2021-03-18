package M3.D17;

import java.util.Scanner;

public class PREV23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextInt();
        int banner = scanner.nextInt();
        int destTimes = scanner.nextInt();
        long i = 1;
        long loopNum = 1;
        long sum = 1;
        for (int userTimes = 1; userTimes < destTimes; userTimes++) {
            loopNum = ((num * i + num * (num - 1) / 2) + loopNum) % banner;        //下一个数字
            sum += loopNum;
            i = i + num;        //下一次的起始变量
        }
        System.out.println(sum);
    }
}
