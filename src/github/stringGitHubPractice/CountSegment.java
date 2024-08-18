package github.stringGitHubPractice;

public class CountSegment {

//    1784. Check if Binary String Has at Most One Segment of Ones


    public static void main(String[] args) {

        String s = "11011";
        boolean checkOnes = checkOnesSegment(s);
        System.out.println(checkOnes);
    }

    public static boolean checkOnesSegment(String s) {
        for(int i = 0 ; i < s.length()-1 ;i++){
            if(s.charAt(i) == '0' && s.charAt(i+1) == '1'){
                return false;
            }
        }
        return true;
    }
}
