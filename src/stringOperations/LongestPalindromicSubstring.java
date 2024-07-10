package stringOperations;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String str = "mam====";
        System.out.println("All possible substrings of '" + str + "' are:");

        String longestPalindrome = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substring = str.substring(i, j);
                System.out.println(substring);
                if (isPalindrome(substring) && substring.length() > longestPalindrome.length()) {
                    longestPalindrome = substring;
                }
            }
        }

        System.out.println("The longest palindromic substring is: " + longestPalindrome);
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
