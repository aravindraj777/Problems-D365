package github.stringGitHubPractice;

import java.util.Arrays;

public class InplaceStringReverse {

    public static void main(String[] args) {

        String str = "This is a sentence";
        System.out.println(reverse(str));
    }

    public static String reverse(String str){

       char[] charArray = str.toCharArray();

       int left = 0 ;
       int right = charArray.length - 1;

       while (left < right){
           char temp = charArray[left];
           charArray[left] = charArray[right];
           charArray[right] = temp;

           left++;
           right--;
       }
       return new String(charArray);
    }
}
