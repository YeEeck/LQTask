package M3.D9;

        import java.text.DecimalFormat;
        import java.util.Scanner;

public class ADV72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println(df.format((-b) / a));
    }
}
