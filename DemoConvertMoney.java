import java.util.Scanner;
public class DemoConvertMoney {
    public static void main(String[] args) {
        double vnd = 23000.0;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Money USD: ");
        usd = scanner.nextDouble();
        double convert= usd * vnd;
        System.out.print(usd +" USD =" + convert + " VND");
    }
}
