package github.divideAndConquer;

public class SearchTheTarget {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 9;
        int place = search(arr,target);
        System.out.println("The target is in index "+ place);
    }

    private static int search(int[] arr, int target){

        int left = 0;
        int right = arr.length - 1;


        while (left <= right){
            int mid = left+ (right - left)/2;

            if (arr[mid] < target){
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            }
            else {
                return mid;
            }

        }

        return -1;
    }
}
