package github.divideAndConquer;

public class FirstOrLastOccurrence {

    public static void main(String[] args) {

        int[] arr = {1,2,2,2,2,2,3,3,3,3,4,4,4,4,5,6};
        int target = 4;
       int firstOccurrence =  findFirstOccurrence(arr,target);
        System.out.println(firstOccurrence + " occurred");
    }

    private static int findFirstOccurrence(int[] arr, int target){

        int left = 0;
        int right = arr.length - 1;

        int result = -1;

        while (left <= right){
            int mid = (left + right) / 2;

            if (target == arr[mid]){
                result = mid;
                right = mid - 1;
            }
            else if (target < arr[mid]){
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return result;
    }
}
