package basic;

import java.util.Arrays;
import java.util.OptionalInt;

public class NthLargestArr {

    public static void main(String[] args) {

        int[] arr = {45,12,7,54,90,23,56,213};

       OptionalInt nthLargestValue =  nthLargestElement(arr,4);
        System.out.println(nthLargestValue.getAsInt());
    }

    private static OptionalInt nthLargestElement(int[] arr, int n){

        int[] filteredArray = Arrays.copyOf(arr, arr.length);

        for (int i = 1; i < n; i++) {
            OptionalInt max = findMax(filteredArray);
            if (max.isPresent()) {
                filteredArray = Arrays.stream(filteredArray)
                        .filter(num -> num != max.getAsInt())
                        .toArray();
            } else {
                return OptionalInt.empty();
            }
        }
        return findMax(filteredArray);
    }


    private static OptionalInt findMax(int[] arr){
       return Arrays.stream(arr).max();
    }
}
