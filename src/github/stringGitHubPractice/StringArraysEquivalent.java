package github.stringGitHubPractice;

public class StringArraysEquivalent {

    /*
    * 1662. Check If Two String Arrays are Equivalent
    * Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.



Example 1:

Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
Example 2:

Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false
    * */


    public static void main(String[] args) {

        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        boolean result = arrayStringsAreEqual(word1,word2);
        System.out.println(result);
    }

//    iterative more complexity
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i = 0 ; i < word1.length ; i++){

            sb.append(word1[i]);
        }
        for (int j = 0 ;j < word2.length ; j++){
            sb2.append(word2[j]);
        }

        if (sb.toString().contentEquals(sb2)){
            return true;
        }

        else {
            return false;
        }
//        One line solution
//         if(word1.length == 0 || word2.length == 0) return false;
//        return (String.join("",word1).equals(String.join("",word2)));

    }
}
