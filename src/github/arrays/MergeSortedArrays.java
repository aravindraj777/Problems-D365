package github.arrays;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {

        int[] arr = {1,3,5};
        int[] brr = {2,4,6};

        System.out.println(Arrays.toString(mergeArrays(arr,brr)));
    }


    public static int[] mergeArrays(int[] arr, int[] brr){

        int s1 = arr.length;
        int s2 = brr.length;

        int[] resultantArr = new int[s1+s2];

        int i = 0 , j = 0 , k = 0;

        while (i < s1 && j < s2){
            if (arr[i] < brr[j]){
                resultantArr[k++] = arr[i++];
            }
            else {
                resultantArr[k++] = brr[j++];
            }
        }


        while (i < s1){
            resultantArr[k++] = arr[i++];
        }
        while (j < s2){
            resultantArr[k++] = brr[j++];
        }
        return resultantArr;
    }
}
