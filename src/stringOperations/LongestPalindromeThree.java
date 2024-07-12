package stringOperations;

public class LongestPalindromeThree {

    public static void main(String[] args) {

        String str = "maadaammalayalam";
        String longestPalindrome = "";

        for (int i = 0; i< str.length() ;i++){
            for (int j = i+1 ; j<=str.length();j++){
                String substring = str.substring(i,j);
                if (isPalindrome(substring) && substring.length() > longestPalindrome.length()){
                    longestPalindrome = substring;
                }
            }
        }
        System.out.println("Longest palindrome is "+ longestPalindrome);
    }

    private static boolean isPalindrome(String substring){

        int left = 0;
        int right = substring.length() - 1;

        while (left < right){

            if (substring.charAt(left) != substring.charAt(right)){
                return false;
            }
            left++;
            right -- ;
        }
        return true;
    }
}
