package finalRev.binarySearch;

public class BinarySearchOne {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        System.out.println(binarySearch(arr,2));
    }

    private static int binarySearch(int[] arr,int target){

        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int midIndex = start + (end - start)/2;
            if (target < arr[midIndex]){
                end = midIndex-1;
            }
            else if (arr[midIndex] < target){
                start = midIndex + 1;
            }
            else {
                return midIndex;
            }
        }
        return -1;
    }
}
