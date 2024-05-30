package binarySearch;

public class BinarySearchSix {

    public static void main(String[] args) {

        int[] arr = {9,10,11,12,43,56};
        int target = 11;

        int position = binaryHelper(target,arr);
        System.out.println("Value found at position "+ position);
    }

    public static int binaryHelper(int target, int[] arr){

        int start = 0;
        int end = arr.length - 1;

        while (start <= end){

            int midIndex = start + (end - start) / 2;
            if (arr[midIndex] < target){
                start  = midIndex + 1 ;
            } else if (arr[midIndex] > target) {
                end = midIndex + 1;
            }
            else {
                return midIndex;
            }
        }
        return -1;
    }
}
