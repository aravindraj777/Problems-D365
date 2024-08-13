package github.arrays;

import java.util.Arrays;

public class ShuffleTheArray {

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(shuffle(num,3)));
    }


    public static int[] shuffle(int[] nums, int n) {
        int[] shuffledArray = new int[nums.length];

        int m = 0;
        for(int i =  0; i < nums.length/2 ; i ++){
            shuffledArray[m] = nums[i];
            shuffledArray[m+1] = nums[i+(nums.length/2)];
            m+=2;

        }
        return shuffledArray;
    }
}
