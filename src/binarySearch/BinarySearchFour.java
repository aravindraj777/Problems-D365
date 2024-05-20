package binarySearch;

public class BinarySearchFour {

    public static void main(String[] args) {

        int[] arr = {4,6,7,8,9,20};
        int target = 9;
        int position = binaryHelper(arr,target);
        System.out.println("value found at the position "+ position);
    }

    private static int binaryHelper(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] < target){
                start = mid +1;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
