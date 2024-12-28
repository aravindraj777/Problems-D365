package basic;

public class SumOfDigits {

    public static void main(String[] args) {

        int num = 12345;
        int sum = 0;

        while (num > 0){
            int lastNum = num % 10;
            sum = sum + lastNum;
            num = num / 10;
        }

        System.out.println(sum);
    }
}
