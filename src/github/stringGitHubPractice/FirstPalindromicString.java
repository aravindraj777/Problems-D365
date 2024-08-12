package github.stringGitHubPractice;

public class FirstPalindromicString {

    public static void main(String[] args) {

        String[] words = {"abc","car","ada","racecar","cool"};
        String firstPalindrome = firstPalindrome(words);
        System.out.println(firstPalindrome);
    }

    public static String firstPalindrome(String[] words) {

       for (String word : words) {
           StringBuilder sb = new StringBuilder(word);
           if (sb.reverse().toString().equals(word)) {
               return sb.toString();
           }
       }
       return "";
    }
}
