package enumWorkouts;

public enum EnumSample {

    MONDAY {
        @Override
        public void dummyMethod() {
            System.out.println("This is for monday dummyMethod");
        }
    },
    TUESDAY,
    WEDNESDAY,
    THURSDAY;

    public void dummyMethod(){
        System.out.println("Dummy method");
    }
}

