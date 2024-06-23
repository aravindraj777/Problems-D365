package binarySearch;

public class BinarySearchEight {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = binarySearchHelper(arr,5);
        System.out.println("value found at"+target);

    }

    private static int binarySearchHelper(int[] arr,int target){

        int start = 0;
        int end = arr.length - 1;

        while (start < end){

            int midIndex = start+(end - start)/2;

            if (arr[midIndex] > target){
                start = midIndex + 1;
            } else if (arr[midIndex] < target) {
                end = midIndex - 1;
            }
            else {
                return midIndex;
            }
        }
        return -1;
    }
}
