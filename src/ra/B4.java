package ra;

import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập điểm môn Toán: ");
        double Math = scanner.nextDouble();
        System.out.println("Mời bạn nhập điểm môn Lý : ");
        double Physical = scanner.nextDouble();
        System.out.println("Mời bạn nhập điểm môn Hóa : ");
        double Chemistry = scanner.nextDouble();
        System.out.println("Mời bạn nhập điểm môn Văn : ");
        double Literature = scanner.nextDouble();
        System.out.println("Mời bạn nhập điểm môn Anh : ");
        double English = scanner.nextDouble();

        double average = (Math + Physical + Chemistry + Literature + English) / 5;
        System.out.println("Điểm trung bình các môn là : " +average);
    }

}
