package binarySearch;

import java.io.Console;

public class BinarySearchSeven {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(binaryHelper(3,arr)+ "Value Found in this position");
    }

    public static int binaryHelper(int target,int[] arr){

        int start = 0;
        int end= arr.length - 1;


        while (start <= end){

            int mid = start + (end - start)/2;

            if (arr[mid] > target){
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid+1;
            }
            else{
                return mid;
            }
        }

      return  -1;
    }
}
