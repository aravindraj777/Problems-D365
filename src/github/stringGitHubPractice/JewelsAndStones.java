package github.stringGitHubPractice;

import java.util.*;

public class JewelsAndStones {

    /*
    771. Jewels and Stones

    You're given strings jewels representing the types of stones that are jewels,
    and stones representing the stones you have. Each character in stones is a type of stone you have.
    You want to know how many of the stones you have are also jewels.

     Letters are case sensitive, so "a" is considered a different type of stone from "A".

     Example 1:

       Input: jewels = "aA", stones = "aAAbbbb"
       Output: 3
        Example 2:

    Input: jewels = "z", stones = "ZZ"
     Output: 0
    * */


    public static void main(String[] args) {

        String jewels = "aA";
        String stones = "aAAbbbb";

        int jewelCount  = numJewelsInStones(jewels,stones);
        System.out.println(jewelCount);
    }

    public static  int numJewelsInStones(String jewels, String stones) {

        int jewelCount = 0;
        Set<Character> jewelSet = new TreeSet<>();
        for (int i = 0 ;i < jewels.length() ; i++){
            jewelSet.add(jewels.charAt(i));
        }

        for (int j = 0 ; j< stones.length() ; j++){
            if (jewelSet.contains(stones.charAt(j))){
                jewelCount+=1;
            }
        }
        return jewelCount;
    }
}
