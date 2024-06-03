package ra;

public class B7 {
    public static void main(String[] args) {
        // let i= 2 ; i<= math.sqrt (number); N++{
        // }
        int count = 0;
        int number = 2;
        System.out.print("20 số nguyên tố đầu tiên là : ");
        while (count < 20){
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(number); i++ ){
                if (number % i == 0){
                    flag = false;
                    break;
                }

            }
            if (flag){
                System.out.printf(number +" ");
                count ++;
            }
            number++;
        }

    }
}
