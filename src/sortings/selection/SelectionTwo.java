package sortings.selection;

import java.util.Arrays;

public class SelectionTwo {

    public static void main(String[] args) {

        int[] arr = {67,23,32,12,10};
        System.out.println(Arrays.toString(sort(arr)));


    }
    public static int[] sort(int[] arr){
        for (int i=0 ;i< arr.length ;i++){
            int min = i;
            for (int j = i+1; j<arr.length;j++){
                if (arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
