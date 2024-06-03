package ra;

import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("********** MENU **********");
        System.out.println("1. Kiểm tra tính chãn lẻ của 1 số :");
        System.out.println("2. Kiểm tra số nguyên tố :");
        System.out.println("3. Kiểm tra 1 số có chia hết cho 3 không ? :");
        System.out.println("0. Exit");
        System.out.println("Mời bạn lựa chọn :");
        int choice = Integer.parseInt(scanner.nextLine());
        int number = scanner.nextInt();

while (true){
    switch (choice) {
        case 1 :
            if (number % 2 == 0) {
                System.out.println(number + " là số chẵn.");
            } else {
                System.out.println(number + " là số lẻ.");
            }

            break;
        case 2 :
            break;
        case 3:
            break;
        case 0:
            System.exit(0);
        default:
            System.err.println("Lựa chọn k hợp lệ, vui lòng nhập lại");
    }

}


    }
}
