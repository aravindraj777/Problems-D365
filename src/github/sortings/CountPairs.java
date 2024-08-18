package github.sortings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountPairs {

//    2824. Count Pairs Whose Sum is Less than Target

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(-6,2,5,-2,-7,-1,3);
        int countPairs = countPairs(nums,-2);
        System.out.println(countPairs);
    }

    public static int countPairs(List<Integer> nums, int target) {


//        BrutForce

//        int count  = 0;
//        for (int i = 0 ; i < nums.size() ; i++){
//            for (int j = i+1 ; j < nums.size() - 1 ; j++){
//                if (nums.get(i) + nums.get(j) < target){
//                    count+=1;
//                }
//            }
//        }
//        return count;


//        Optimized

        int left = 0 ;
        int right = nums.size() - 1;
        int count  = 0;
        Collections.sort(nums);

        while (left < right){

            int sum = nums.get(left) + nums.get(right);

            if (target > sum){
                count += (right - left);
                left++;
            }
            else {
                right--;
            }
        }
        return count;


    }


}
