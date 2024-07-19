//package testReviewToi;
//
//import java.util.Arrays;
//
//public class StringDuplicate {
//
//    public static void main(String[] args) {
//
//        String str = "dfasdtnmghfgdfsfhgguumlp";
//        int size = 0;
//
//        char[] ch = str.toCharArray();
//        int length = ch.length;
//        for ( int i = 0 ;i < length ; i++){
//            for (int j = i+1 ; j< length ; j++){
//                if (ch[i] == ch[j]){
//                    size++;
//                    char [] brr = new char[size];
//                    brr[i] = ch[i];
//                    length --;
//                }
//            }
//        }
//
//    }
//}
//
//SELECT salary from EMPLOYEE WHERE SALARY = (SELECT SALARY FROM EMPLOYEE ORDER BY SALARY DESC LIMIT(1) OFFSET(1))
//
//UPDATE salary INC(SALARY * 10) from EMPLOYEE WHERE JOB_DESC = "HR"