package github.stringGitHubPractice;

import java.util.HashMap;
import java.util.Map;

public class PermutationDifference {

    /*
    3146. Permutation Difference between Two Strings
    You are given two strings s and t such that every character occurs at most once in s and t is a permutation of s.

The permutation difference between s and t is defined as the sum of the absolute difference between the index of
the occurrence of each character in s and the index of the occurrence of the same character in t.

Return the permutation difference between s and t.



Example 1:

Input: s = "abc", t = "bac"

Output: 2
    */

    public static void main(String[] args) {

        String s = "abc";
        String t = "bac";

        int normalFunction = findPermutationDifference(s,t);
        System.out.println(normalFunction);
        int usingMap = usingMap(s,t);
        System.out.println(usingMap);


    }

    public static int findPermutationDifference(String s, String t){

//        using normal function
        int result  = 0;
        for(int i = 0 ;i< s.length() ; i++){
            for (int j = 0 ; j < t.length() ; j++){
                if (s.charAt(i) == t.charAt(j)) {
                    result += Math.abs(i-j);
                }
            }
        }
        return result;


//        using hashMap

    }

    public static int usingMap(String s, String t){
        int result = 0;
        Map<Character,Integer> position = new HashMap<>();
        for (int i = 0 ; i < s.length() ;i++){
            position.put(s.charAt(i),i);
        }

        for (int j = 0 ; j < t.length() ; j++){
            if (position.containsKey(t.charAt(j))){
                int i = position.get(t.charAt(j));
                result += Math.abs(i - j);

            }
        }
        return result;
    }
}
