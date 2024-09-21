package github.arrays;

import java.util.Arrays;

/**
 Find two number that is added to n
 */
public class TwoNumberAdded {


    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};
        int n = 3;
        System.out.println(Arrays.toString(findTwoNumbers(arr,n)));

    }

    public static int[] findTwoNumbers(int[] arr , int n){

        Arrays.sort(arr);
        int p1 = 0;
        int p2 = arr.length - 1;
        int sum = 0;
        int[] result = new int[2];

        while (p1 != p2){

            sum =   arr[p1] + arr[p2];

            if (sum < n){
                p1++;
            }
            else if (sum > n){
                p2--;
            }
            else {

                result[0] = arr[p1];
                result[1] = arr[p2];
                return result;
            }
        }
        return arr;
    }

}
