package M1.D26;

public class test {
    public static void main(String[] arg) {
        int num = 0;
        for (int i = 1; i < 1000; i++) {
            String str = Integer.toString(i);
            int flag = 0;
            for (char t : str.toCharArray()) {
                if (t == '0') {
                    num++;
                    if (flag == 0) {
                        System.out.print(i + ",");
                        flag = 1;
                    }
                }
            }
        }
        System.out.println("\n" + num);
    }
}
