package github.stringGitHubPractice;

import java.util.Arrays;

public class TruncateSentence {

    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
       String result =  truncateSentence(s,4);
        System.out.println(result);
    }

    public static String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");

        for (int i = 0; i < k; i++) {
            sb.append(words[i]);
            if (i < k - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
