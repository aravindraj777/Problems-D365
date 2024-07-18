package finalRev.string;

public class LongestPalindromeSubStr {

    public static void main(String[] args) {

        String str = "malayalam";
        String longestPalindromicSubStr = "";

        for (int i = 0 ;i<str.length() ;i++){
            for (int j = i+1 ;j<str.length() ;j++){
                String substring = str.substring(i,j);

                if(isPalindrome(substring) && substring.length() > longestPalindromicSubStr.length()){
                    longestPalindromicSubStr = substring;
                }
            }
        }
        System.out.println("Longest palindrome is " + longestPalindromicSubStr);
    }

    private static boolean isPalindrome(String subStr){

        int left = 0;
        int right = subStr.length() - 1;

        while (left < right){
            if (subStr.charAt(left) != subStr.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
