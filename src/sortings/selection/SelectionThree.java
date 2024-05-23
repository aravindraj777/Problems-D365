package sortings.selection;

import java.util.Arrays;

public class SelectionThree {

    public static void main(String[] args) {

        int[] arr = {34,12,10,32,20};
        System.out.println(Arrays.toString(sort(arr)));

    }
    public static int[] sort(int[] arr){
        for (int i= 0;i<arr.length ; i++){
            int min = i;
            for (int j = i+1 ; j<arr.length ;j++){
                if (arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min]  = temp;
        }
        return arr;
    }
}
