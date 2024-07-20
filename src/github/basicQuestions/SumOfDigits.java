package github.basicQuestions;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num  = sc.nextInt();
        int sum = 0;
        while (num > 0){
            int exit = num % 10;
            sum = sum + exit;
            num = num / 10;
        }
        System.out.println(sum+"Sum");
    }
}
