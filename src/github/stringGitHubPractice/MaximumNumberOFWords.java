package github.stringGitHubPractice;

import java.util.Arrays;

public class MaximumNumberOFWords {

        /*Q: 2114
        * A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

        You are given an array of strings sentences, where each sentences[i] represents a single sentence.

        Return the maximum number of words that appear in a single sentence.
        *
        */

    public static void main(String[] args) {

        String[] sentences = {"please wait", "continue to fight", "continue to win"};
       int largestCount =  mostWordsFound(sentences);
        System.out.println(largestCount);
    }

    private static int mostWordsFound(String[] sentences) {

        int largest = 0;
        for (int i = 0 ; i< sentences.length ; i++){
           int  wordCount = (int) Arrays.stream(sentences[i].split("\\s")).count();
           if (largest < wordCount){
               largest = wordCount;
           }
        }
        return largest;
    }

}