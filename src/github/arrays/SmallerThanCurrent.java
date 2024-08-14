package github.arrays;

import java.util.Arrays;

public class SmallerThanCurrent {

//    1365. How Many Numbers Are Smaller Than the Current Number


    public static void main(String[] args) {

       int[] nums = {8,1,2,2,3};
       int[] resultArr = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(resultArr));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] newArr = new int[nums.length];
        for (int i = 0 ; i < nums.length ; i++){
            int count = 0 ;
            for (int num : nums) {
                if (nums[i] > num) {
                    count++;
                }
            }
            newArr[i] = count;

        }
        return newArr;
    }
}
