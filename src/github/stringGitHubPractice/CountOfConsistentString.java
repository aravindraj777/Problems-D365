package github.stringGitHubPractice;

public class CountOfConsistentString {

    public static void main(String[] args) {

       String allowed = "abc"; String[] words = {"a","b","c","ab","ac","bc","abc"};
       int countOfConsistentStrings = countConsistentStrings(allowed,words);
        System.out.println("Count "+ countOfConsistentStrings);

    }

    public static int countConsistentStrings(String allowed, String[] words) {

        int count = 0 ;
        for (String s : words){
            boolean isConsistent = true;

            for (char ch : s.toCharArray()){
                if(!allowed.contains(String.valueOf(ch))){
                    isConsistent = false;
                }
            }
            if (isConsistent){
                count++;
            }
        }
        return count;
    }
}
