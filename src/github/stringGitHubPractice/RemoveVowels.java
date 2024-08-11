package github.stringGitHubPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveVowels {

//    1119. Remove Vowels from a String

    public static void main(String[] args) {

        String str = "leetcodeisacommunityforcoders";
        System.out.println(removeVowels(str));

    }

    private static String removeVowels(String str){

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');


        StringBuilder result = new StringBuilder();
        for(int i = 0 ;i < str.length() ; i++){
            char c = str.charAt(i);
            if (!vowels.contains(c)){
                result.append(c);
            }
        }
        return result.toString();

    }
}
