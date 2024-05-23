package sortings.bubble;

import java.util.Arrays;

public class BubbleTwo {

    public static void main(String[] args) {

        int[] arr = {43,12,32,15,90,32};
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[] sort(int[] arr){
        for (int i = 0 ;i< arr.length-1 ;i++){
            for (int j=i+1 ; j<arr.length ;j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
