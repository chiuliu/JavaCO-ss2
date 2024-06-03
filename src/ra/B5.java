package ra;

import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị đầu của khoảng : ");
        int start  = scanner.nextInt();
        System.out.println("Nhập giá trị cuối của khoảng : ");
        int end   = scanner.nextInt();
        int sum = 0;
        for (int i = start; i <= end ; i++) {
            if (i % 2 == 0) {
                sum += i;
            }

        }
        System.out.println(sum);
    }

}
