package github.stringGitHubPractice;

import java.util.Arrays;
import java.util.HashMap;

public class ReversePrefix {


    /*
    * 2000. Reverse Prefix of Word
    *
    *  Given a 0-indexed string word and a character ch, reverse the segment of word that starts at
    *  index 0 and ends at the index of the first occurrence of ch (inclusive).
    *  If the character ch does not exist in word, do nothing.

For example, if word = "abcdefd" and ch = "d",
* then you should reverse the segment that starts at 0 and ends at 3 (inclusive).
* The resulting string will be "dcbaefd".
Return the resulting string.



Example 1:

Input: word = "abcdefd", ch = "d"
Output: "dcbaefd"
Explanation: The first occurrence of "d" is at index 3.
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
    *
    * */

    public static void main(String[] args) {
       String word = "abcdefd";
       char c = 'd';

        System.out.println((reversePrefix(word,c)));
    }

    private static String reversePrefix(String word, char ch){
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < word.length() ;i++){
            if (word.charAt(i) == ch){
                sb.append(word, 0, i+1);
                break;
            }
        }
        sb.reverse();
        sb.append(word.substring(sb.length()));
        return sb.toString();


    }


}
