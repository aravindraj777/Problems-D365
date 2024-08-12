package github.stringGitHubPractice;

public class ToLowerCase {


    /*
    * Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.



     Example 1:

     Input: s = "Hello"
     Output: "hello"
    * */

    public static void main(String[] args) {

        String str = "Hello";
        String lowerCaseConversion = toLowerCase(str);
        System.out.println(lowerCaseConversion);
    }
    private static String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                sb.append((char) (s.charAt(i)+ 32));
            } else {
                sb.append((char) s.charAt(i));
            }
        }
        return sb.toString();
    }
}
