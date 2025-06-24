package github.bitManipulation;

public class EvenOrOdd {

    public static void main(String[] args) {

        int num = 11;

        if ((num & 1) == 1){
            System.out.println("Odd number" + num);
        }
        else {
            System.out.println("Even" + num);
        }
    }
}
