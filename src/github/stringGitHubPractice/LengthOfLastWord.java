package github.stringGitHubPractice;

public class LengthOfLastWord {

    public static void main(String[] args) {

       String s = "   fly me   to   the moon  ";
       int length = lengthOfLastWord(s);
        System.out.println(length);

    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpaceIndex = s.lastIndexOf(" ");
        String lastWord = s.substring(lastSpaceIndex+1);
        return lastWord.length();
    }
}
