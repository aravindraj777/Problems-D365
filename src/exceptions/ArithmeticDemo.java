package exceptions;

public class ArithmeticDemo {


    public static void main(String[] args) {


        try {
            int val = 5/0;
            System.out.println(val);
        }
       catch (ArithmeticException e){
           System.out.println("Cannot divide number by zero"+e.getMessage());
       }

    }
}
