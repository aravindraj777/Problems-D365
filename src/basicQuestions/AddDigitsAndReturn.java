package basicQuestions;

import java.util.Scanner;

public class AddDigitsAndReturn {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a two digit number");

        int num = sc.nextInt();

       int theSum  =  AddDigitsAndReturn.findTheSum(num);

        System.out.println(theSum);

    }

        public static int findTheSum(int num){

            int sum = 0;

            while (num > 0) {

                int exitNum = num % 10;
                sum = sum + exitNum;
                num = num / 10;


            }
            if (sum >= 10) {
               return findTheSum(sum);
            }
            return sum;
        }

}
