package interfaceOperations;

public interface PrivateMethodDemo {


    public static  int canFly(){
        publicStaticMethod();
        return privateMethod();
    }

    static void publicStaticMethod(){
        System.out.println("THis is a public static method");
    }

    private static int privateStaticMethod(){
        return 4+5;
    }

    private static int privateMethod(){
        System.out.println("Coming in this method");
        return privateStaticMethod();
    }
}
