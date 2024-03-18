package basicQuestions;

public class ReverseStringValue {


    public static void main(String[] args) {

        String str = "ABCD";
        int length = str.length();
        String rev = " ";
//        for (int i = length-1;i >=0 ; i--){
//            rev = rev+str.charAt(i);
//        }
//        System.out.println(rev);

        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse());
    }
}
