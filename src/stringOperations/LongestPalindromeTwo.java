package stringOperations;

public class LongestPalindromeTwo {

    public static void main(String[] args) {

        String str = "malayala";

        String longestPalindrome = "";

        for (int i = 0 ; i < str.length() ;i++){
            for (int j = i+1 ; j<= str.length() ;j++){
                String subString = str.substring(i,j);
                if (isPalindrome(subString) && subString.length() > longestPalindrome.length()){
                    longestPalindrome = subString;
                }
            }
        }
        System.out.println(longestPalindrome + " is the longest palindrome");
    }

    public static boolean isPalindrome(String subStr){

        int left = 0;
        int right = subStr.length() - 1;

        while (left < right){

            if (subStr.charAt(left) != subStr.charAt(right)){
                return false;
            }
            left ++ ;
            right -- ;
        }
        return true;
    }
}
