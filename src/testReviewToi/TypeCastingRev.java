package testReviewToi;

public class TypeCastingRev {

    public static void main(String[] args) {

        String str = "Aravind";
        char[] ch = str.toCharArray();

        for (char c : ch){
            int val  = c;
            System.out.println(val);
        }

        int a = 10;
        float b = (int) a;
        System.out.println(b);
    }
}
