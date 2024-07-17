package finalRev.sortings;

import java.util.Arrays;

public class BubbleOne {

    public static void main(String[] args) {

        int[] arr = {2,30,12,45,32};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void sort(int[] arr){

        for (int i = 0 ;i< arr.length ;i ++){
            for(int j = i+1 ;j < arr.length ; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
