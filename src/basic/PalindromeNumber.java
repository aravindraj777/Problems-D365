package basic;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check ");
        int number = sc.nextInt();
        int rev = 0;
        int org_num = number;

        while (number != 0){

            rev = rev * 10 + number % 10;
            number = number / 10;
        }

        if (rev == org_num){
            System.out.println("This is a palindrome number");
        }
        else {
            System.out.println("This number is not a palindrome");
        }
    }
}
