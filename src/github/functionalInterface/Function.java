package github.functionalInterface;

public class Function {

    public static void main(String[] args) {

        java.util.function.Function<String,String> integerToString = (String num)->{
            String output = String.valueOf(Integer.parseInt(num)+"gggg");
            return output;
        };

        System.out.println(integerToString.apply("88"));
    }
}
