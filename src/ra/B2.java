package ra;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập số : \t");
        int n = Integer.parseInt(scanner.nextLine());
        if (n % 5 == 0 && n % 3 == 0){
            System.out.printf("%d chia hết cho cả 3 và 5",n);
        }
        else if (n % 3 == 0 && n % 5 != 0){
            System.out.printf("%d chỉ chia hết cho 3, không chia hết cho 5", n);
        }
        else if (n % 5 == 0 && n % 3 != 0){
            System.out.printf("%d chỉ chia hết cho 5, không chia hết cho 3", n);
        }
        else {
            System.out.printf("%d không chia hết cho cả 3 và 5", n);
        }

    }
}
