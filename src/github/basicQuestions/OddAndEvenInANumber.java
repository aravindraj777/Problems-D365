package github.basicQuestions;

import java.util.Scanner;

public class OddAndEvenInANumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
//        int exitNum = 0;
        int oddNum = 0;
        int evenNum = 0;
        while (num > 0){
          int  exitNum = num % 10;
            if(exitNum % 2 != 0){
                oddNum++;
            }
            else {
                evenNum++;
            }
            num = num / 10;
        }
        System.out.println(oddNum+ "odd");
        System.out.println(evenNum+ "Even");
    }
}
