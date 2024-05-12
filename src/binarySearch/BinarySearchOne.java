package binarySearch;

public class BinarySearchOne {

    public static void main(String[] args) {

        int[] arr = {2,5,34,89,99,121};
        int target = 6;
        int position =  binarySearch(arr,target);
        System.out.println("Value Found at position"+position);

    }

    static int binarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start )/2;
            if(target < arr[mid]){
                end = mid-1;

            }
            else if (target > arr[mid]){
                start = mid+1;
            }
            else {
                return mid;

            }
        }
        return -1;
    }
}
