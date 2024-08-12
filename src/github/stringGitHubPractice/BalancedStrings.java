package github.stringGitHubPractice;

public class BalancedStrings {

    /*
    1221. Split a String in Balanced Strings,
    * Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

Given a balanced string s, split it into some number of substrings such that:

Each substring is balanced.
Return the maximum number of balanced strings you can obtain.



Example 1:

Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
Example 2:


    * */

    public static void main(String[] args) {

      String  s = "RLRRRLLRLL";
      int maximumBalancedCount = balancedStringSplit(s);
        System.out.println(maximumBalancedCount);
    }
    private static int balancedStringSplit(String s){
        int balancedCount = 0;
        int maximumBalancedCount = 0;
        for (int i = 0 ; i< s.length() ;i++){
            if (s.charAt(i) == 'R') balancedCount++;
            if (s.charAt(i) == 'L') balancedCount--;
            if (balancedCount == 0) maximumBalancedCount++;
        }
        return maximumBalancedCount;
    }
}
