package basicQuestions;

import java.util.Random;

public class GenerateRandomNumberAndStrings {


    public static void main(String[] args) {

//        Math class

        System.out.println(Math.random());

//        Random Class

        Random random = new Random();
        int num = random.nextInt(3);
        System.out.println(num);


    }
}
