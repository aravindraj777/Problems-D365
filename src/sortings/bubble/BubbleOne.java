package sortings.bubble;

import java.util.Arrays;

public class BubbleOne {

    public static void main(String[] args) {
        int[] arr = {43,12,30,23,11,45};

        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[] sort(int[] arr){

        for (int i = 0 ; i< arr.length ;i++){
            for (int j = i+1 ; j <arr.length ;j++){
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
