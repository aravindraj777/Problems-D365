package recursion;

public class FactorialRecursive {

    public static void main(String[] args) {

        int factorial = factorial(2);
        System.out.println(factorial);
    }

    private static int factorial(int number){

        if (number == 1){
            return 1;
        }
        else {
            return number * factorial(number - 1);
        }
    }
}
