package basicQuestions;

public class PalindromeNumber {


    public static void main(String[] args) {

        int num = 13131;
        int rev = 0;
        int org_num = num;

        while (num != 0){
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        if(rev == org_num){
            System.out.println(org_num+"is palindrome  = "+ rev);

        }
        else {
            System.out.println("Not palindrome ");
        }
    }
}
