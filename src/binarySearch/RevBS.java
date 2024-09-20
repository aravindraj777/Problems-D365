package binarySearch;

public class RevBS {

    public static void main(String[] args) {

        int[] arr = {1,3,4,5,6,7,8,9};
        int target = 4;
        System.out.println("value found at position"+ binaryHelper(target,arr));

    }

    public static int binaryHelper(int target, int[] arr){

        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int midIndex = start+ (end - start) / 2;

            if(arr[midIndex] < target){
                start = midIndex + 1;

            } else if (arr[midIndex] > target) {
                end = midIndex - 1;
            }
            else {
                return midIndex;
            }
        }
        return -1;

    }
}
