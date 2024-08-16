package github.stringGitHubPractice;

public class ShuffleString {

//    1528. Shuffle String
    public static void main(String[] args) {

       String s = "codeleet";
       int[] indices = {4,5,6,7,0,2,1,3};

       String restoredString = restoreString(s,indices);
        System.out.println(restoredString);
    }

    public static String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder();
        char[] newChar = new char[s.length()];

            for (int j = 0 ; j < indices.length ; j++){
                newChar[indices[j]] = s.charAt(j);
            }
        return sb.append(newChar).toString();
    }
}
