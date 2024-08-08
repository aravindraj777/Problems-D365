package basic;

import java.util.Arrays;
import java.util.OptionalInt;

public class SecondLargestD {

    public static void main(String[] args) {

        int[] arr = {7,2,5,10,44,65,30,94};
        int secondLargest = secondLargestIterative(arr);
        System.out.println("SecondLargest "+ secondLargest );
        usingStreams(arr);

    }

    private static int secondLargestIterative(int[] arr){

        int firstLargest = arr[0];
        int secondLargest = arr[0];

        for (int j : arr) {
            if (j >= firstLargest) {
                secondLargest = firstLargest;
                firstLargest = j;
            } else if (j >= secondLargest) {
                secondLargest = j;
            }

        }
        return secondLargest;

    }


    private static void usingStreams(int[] arr){

        OptionalInt max = Arrays.stream(arr).max();

        if (max.isPresent()){
           OptionalInt secondHighest =  Arrays.stream(arr).filter(num -> num!= max.getAsInt()).max();
           if (secondHighest.isPresent()){
               System.out.println("Second Highest value "+ secondHighest);
           }
           else {
               System.out.println("No value");
           }
        }
        else {
            System.out.println("No value inside array");
        }
    }
}
