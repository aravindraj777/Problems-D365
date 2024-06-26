package enumWorkouts;

public class mainEnum {

    public static void main(String[] args) {

        EnumSample var = EnumSample.TUESDAY;
        var.dummyMethod();
        EnumSample tue = EnumSample.TUESDAY;
        System.out.println(tue.ordinal());
        EnumSample mon = EnumSample.MONDAY;
        mon.dummyMethod();
    }

}
