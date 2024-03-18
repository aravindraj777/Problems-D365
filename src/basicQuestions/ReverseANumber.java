package basicQuestions;

import java.util.Scanner;

public class ReverseANumber {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int rev = 0;

//        while (num != 0){
//            rev = rev * 10 + num% 10;
//            num = num / 10;
//        }
//        System.out.println(rev);

//        Using string builder

        StringBuilder sb = new StringBuilder(String.valueOf(num));
        StringBuilder reversed =  sb.reverse();
        System.out.println(reversed);

//        Can use StringBuffer class and the method is same as that of StringBuilder
    }
}
