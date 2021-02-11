package M1.D28;

public class ALGO324 {
    public static void main(String[] arg){
        int[] last = new int[2];
        last[0] = 1;
        last[1] = 2;
        System.out.println(1);
        System.out.println(2);
        for (int i = 0; i < 18; i++) {
            int res = last[0] + last[1];
            System.out.println(res);
            last[0] = last[1];
            last[1] = res;
        }
    }
}
