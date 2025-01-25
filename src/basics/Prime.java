package basics;

public class Prime {

    public static void main(String[] args) {

        int number = 1;
        boolean isPrime = true;

        if (number <= 1){
            isPrime = false;
        }
        else {
            for (int i = 2 ; i < number/2 ;i++){
                if (number % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime){
            System.out.println(number + " is prime");
        }
        else {
            System.out.println("Not prime");
        }
    }
}
