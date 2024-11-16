package github.generics.genericMethod;

public class Print {

    public <T> void printValue(T obj){
        System.out.println("This is a generic method ");
    }
}