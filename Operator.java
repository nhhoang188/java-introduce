import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        float width; // khai báo biến width kiểu float
        float height;
        Scanner scanner = new Scanner(System.in); // tạo đối tượng scanner từ class Scanner
        System.out.println("Enter width: ");
        width = scanner.nextFloat(); // width = giá trị của ng dùng nhập vào
        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        float area = width * height; // biến area bằng width * height;
        System.out.println("Area is: " + area);
    }

}
