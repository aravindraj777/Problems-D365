package github.basicQuestions;

import java.util.Scanner;

public class AddDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        int sum = 0;
        while (number > 0) {

            int extNum = number % 10;
            sum = sum + extNum;
            number = number / 10;
        }
    }
}
