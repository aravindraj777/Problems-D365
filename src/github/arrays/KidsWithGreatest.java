package github.arrays;

import java.util.*;

public class KidsWithGreatest {

//    1431. Kids With the Greatest Number of Candies

    public static void main(String[] args) {

       int[] candies = {2,3,5,1,3}; int extraCandies = 3;
        List<Boolean> kidsList = kidsWithCandies(candies,extraCandies);
        System.out.println(kidsList);

    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {


        List<Boolean> checkList = new ArrayList<>();
        int largest = 0 ;
        for (int i = 0 ; i< candies.length ; i++){
            if (candies[i] > largest){
                largest = candies[i];
            }

        }
        for (int j = 0 ; j < candies.length ; j++){
            if (candies[j] + extraCandies >= largest){
                checkList.add(true);
            }
            else {
                checkList.add(false);
            }
        }

        return checkList;
    }
}
