package github.stringGitHubPractice;


//You are given a string s. The score of a string is defined as the sum of
// the absolute difference between the ASCII values of adjacent characters.
//
//        Return the score of s.
//
//
//
//        Example 1:
//
//        Input: s = "hello"
//
//        Output: 13
//
//        Explanation:
//
//        The ASCII values of the characters in s are: 'h' = 104, 'e' = 101, 'l' = 108, 'o' = 111.
//        So, the score of s would be |104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13.
//
//        Example 2:
//
//        Input: s = "zaz"

public class ScoreOfAString {

    public static void main(String[] args) {
        int scoreOfString = score("hello");
        System.out.println(scoreOfString);
    }

    private static int score(String s){

        int score = 0;
        for (int i = 0 ; i < s.length()-1; i++){
           score += Math.abs(s.charAt(i) - s.charAt(i+1));
        }
        return score;
    }
}
