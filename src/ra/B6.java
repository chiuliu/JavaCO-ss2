package ra;

import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {
        int N = 1;
        while (true){
            if (N % 5 == 0 && N % 7 == 0 && N % 11 == 0){
                break;
            }
            N ++;
        }
        System.out.println("Giá trị N là : " +N);


        }

    }

