package M1.D24;

public class test {
    public static void main(String[] arg) {
        int num = 0;
        for (int i = 0; i < 1000; i++) {
            String str = Integer.toString(i);
            for (char t : str.toCharArray()) {
                if (t == '1'){
                    num++;
                }
            }
        }
        System.out.println(num);
    }
}
