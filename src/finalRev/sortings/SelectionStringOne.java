package finalRev.sortings;

import java.util.Arrays;

public class SelectionStringOne {

    public static void main(String[] args) {

        String[] arr = {"D","C","B","A"};
        selectionSortString(arr);
        System.out.println(Arrays.toString(arr));

    }
    private static void selectionSortString(String[] arr){

        for (int i = 0 ; i< arr.length ;i++){
            int min = i;
            for(int j = i+1 ; j < arr.length ;j++){
                if (arr[min].compareTo(arr[j]) > 0){
                    min = j;
                }
            }

            String temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
