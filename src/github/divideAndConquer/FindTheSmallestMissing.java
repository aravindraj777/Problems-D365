package github.divideAndConquer;

public class FindTheSmallestMissing {

    public static void main(String[] args) {

        String str = "abc2345fg";
        for (char ch : str.toCharArray()){
            int hash = ch;
            System.out.println(hash+ ":"+ch);

        }
    }
}
