package github.arrays;

public class MinimumNumber {

    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5,6,7,8,-1};
        System.out.println("Minimum number is "+findMinimum(arr));
    }

    public static int findMinimum(int[] arr){

        int minimum = arr[0];

        for (int num : arr) {

            if (num < minimum) {
                minimum = num;
            }
        }
        return minimum;
    }
}
