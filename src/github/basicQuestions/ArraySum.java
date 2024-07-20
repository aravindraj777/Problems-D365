package github.basicQuestions;

import java.util.Arrays;

public class ArraySum {

    public static void main(String[] args) {

        int[] num = {1,2,3,4,5};

        int sum = Arrays.stream(num).sum();
        System.out.println(sum);
    }
}
