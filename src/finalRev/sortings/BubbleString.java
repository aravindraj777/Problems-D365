package finalRev.sortings;

import java.util.Arrays;

public class BubbleString {

    public static void main(String[] args) {

        String[] arr = {"D","C","B","A"};
        stringBubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void stringBubble(String[] arr){

        for (int i = 0 ;i<arr.length ; i++){
            for (int j = i+1 ;j<arr.length ;j++){
                if (arr[i].compareTo(arr[j]) > 0){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
