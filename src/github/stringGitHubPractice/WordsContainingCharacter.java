package github.stringGitHubPractice;

import java.util.ArrayList;
import java.util.List;

public class WordsContainingCharacter {


//    2942. Find Words Containing Character

    /*
    * You are given a 0-indexed array of strings words and a character x.

Return an array of indices representing the words that contain the character x.

Note that the returned array may be in any order.



Example 1:

Input: words = ["leet","code"], x = "e"
Output: [0,1]
Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.
Example 2:

Input: words = ["abc","bcd","aaaa","cbc"], x = "a"
Output: [0,2]
Explanation: "a" occurs in "abc", and "aaaa". Hence, we return indices 0 and 2.

    */

    public static void main(String[] args) {

        String[] words = {"leet","code"};
        char x = 'e';
       List<Integer> result =  findWordsContaining(words,x);
        System.out.println(result);

    }

    public static List<Integer> findWordsContaining(String[] words, char x){

        List<Integer> resultList = new ArrayList<>();
        for (int i = 0 ; i < words.length ; i++){
            for (int j = 0 ; j< words[i].length()  ; j++){
                if (words[i].charAt(j) == x){
                    resultList.add(i);
                    break;
                }
            }
        }
        return resultList;
    }


}
