package ra;
import java.util.Scanner;

public class B9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("=== Menu ===");
            System.out.println("1. Tính chu vi và diện tích hình chữ nhật.");
            System.out.println("2. Tính chu vi và diện tích hình tam giác.");
            System.out.println("3. Tính chu vi và diện tích hình tròn.");
            System.out.println("4. Thoát.");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculateRectangle(scanner);
                    break;
                case 2:
                    calculateTriangle(scanner);
                    break;
                case 3:
                    calculateCircle(scanner);
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return; // Kết thúc chương trình
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
                    break;
            }
        }
    }

    public static void calculateRectangle(Scanner scanner) {
        System.out.print("Nhập chiều dài: ");
        double length = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double width = scanner.nextDouble();

        double perimeter = 2 * (length + width);
        double area = length * width;

        System.out.println("Chu vi hình chữ nhật: " + perimeter);
        System.out.println("Diện tích hình chữ nhật: " + area);
    }

    public static void calculateTriangle(Scanner scanner) {
        System.out.print("Nhập cạnh a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập cạnh b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập cạnh c: ");
        double c = scanner.nextDouble();

        double perimeter = a + b + c;
        double s = perimeter / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Chu vi hình tam giác: " + perimeter);
        System.out.println("Diện tích hình tam giác: " + area);
    }

    public static void calculateCircle(Scanner scanner) {
        System.out.print("Nhập bán kính: ");
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Chu vi hình tròn: " + perimeter);
        System.out.println("Diện tích hình tròn: " + area);
    }
}
