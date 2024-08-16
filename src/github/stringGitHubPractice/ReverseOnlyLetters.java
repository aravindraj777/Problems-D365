package github.stringGitHubPractice;

import java.util.Stack;

public class ReverseOnlyLetters {

    public static void main(String[] args) {

        String str = "Test1ng-Leet=code-Q!";

        System.out.println(reverseOnlyCharacters(str));


    }

    private static String reverseOnlyCharacters(String str){
        Stack<Character> letters = new Stack<>();

        for (char ch : str.toCharArray()){
            if (Character.isLetter(ch)){
                letters.push(ch);
            }
        }
        String result = "";

        for (char ch : str.toCharArray()){
            if (Character.isLetter(ch)){
                result += letters.pop();
            }
            else {
                result += ch;
            }

        }
        return result;
    }
}
