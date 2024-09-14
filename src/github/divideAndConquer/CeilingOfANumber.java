package github.divideAndConquer;

public class CeilingOfANumber {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,6,7,8,9,10};
        int target = 5;
        int ceiling = findCeiling(arr,target);

        System.out.println("Ceiling of "+target+" is "+ ceiling);

    }

    private static int findCeiling(int[] arr,int target){

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (arr[mid] < target){
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                return arr[mid];
            }
        }

        if (start < arr.length){
            return arr[start];
        }
        return -1;

    }
}
