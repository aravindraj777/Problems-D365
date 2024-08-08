package basic;

import java.util.Arrays;

public class ArrayDuplicates {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,4,5,4};

        int[] uniqueArray = Arrays.stream(arr)
                .distinct().toArray();


        System.out.println(Arrays.toString(uniqueArray));
    }
}
