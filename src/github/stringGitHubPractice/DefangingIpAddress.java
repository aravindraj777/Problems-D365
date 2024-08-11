package github.stringGitHubPractice;

public class DefangingIpAddress {

//    1108. Defanging an IP Address

//    Given a valid (IPv4) IP address, return a defanged version of that IP address.
//
//    A defanged IP address replaces every period "." with "[.]".
//
//
//
//    Example 1:
//
//    Input: address = "1.1.1.1"
//    Output: "1[.]1[.]1[.]1"


    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defanging(address));
    }
    private static String defanging(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        for(int i = 0 ; i< stringBuilder.length(); i++){
            if(stringBuilder.charAt(i) == '.'){
               stringBuilder.replace(i,i+1,"[.]");
               i+=2;
            }
        }
        return stringBuilder.toString();
    }
}
