package arrayGithubPractice;

import java.util.Arrays;

public class IsVowelOrConstant {

    public static void main(String[] args) {

        char ch = 'b';
        boolean isVowel = isVowel(ch);
        System.out.println(ch + " is vowel " + isVowel);


    }

    private static boolean isVowel(char word) {
       String vowels = "aeiouAEIOU";
       return vowels.indexOf(word) != -1;
    }


}
