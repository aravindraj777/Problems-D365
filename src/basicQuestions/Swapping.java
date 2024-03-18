package basicQuestions;

public class Swapping {

    public static void main(String[] args) {

        int a = 10 , b = 20;

//        Temporary Variable
        int t = a;
        a = b;
        b = t;
        System.out.println(a+"value,"+b+"Value" );

//        one line

       int g = 10, h = 20;
       h = g+h - (g=h);
        System.out.println(g+"G,"+"H"+h);


    }
}
