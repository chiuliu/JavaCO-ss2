package ra;

import java.util.Scanner;

public class descisionMarking {
    public static void main(String[] args) {
//        // 1. Xuây dựng ứng dụng xem phim 18+, nếu > 18 tuổi thì thông báo cho phép xem phim
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vào tuổi của bạn");
//        int age = Integer.parseInt(scanner.nextLine());
//        if (age >= 18){
//            System.out.println("Mời bạn xem phim");
//
//        }
//        else {
//            System.out.printf("Bạ cần ăn thêm để đủ tuổi xem phim");
//        }
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số nguyên bất kỳ");
//        int number = Integer.parseInt(scanner.nextLine());
//        if (number % 5 == 0) {
//            System.out.printf("%d chia hết cho 5 \n", number);
//        } else if (number % 5 == 1) {
//            System.out.printf("%d chia 5 dư 1\n", number);
//        } else if (number % 5 == 2) {
//            System.out.printf("%d chia 5 dư 2\n", number);
//        } else if (number % 5 == 3) {
//            System.out.printf("%d chia 5 dư 3\n", number);
//        } else {
//            System.out.printf("%d chia 5 dư 4\n", number);
//        }
int ticket = 7000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        if (age < 6 || age >60){
            System.out.println("Bạn được miễn phí vé ");
        }
        else if ( age <18){
            System.out.println("Giá vé của bạn là "+ticket/2 + "VNĐ");

        }
        else {
            System.out.println("Giá vé của bạn là 7000VNĐ");
        }


    }
}

// Nhập vào 1 số nguyên , in ra số dư trong phep chua 3

// Nhập 1 số nguyên , in ra số dư tỏng phép chia 5

