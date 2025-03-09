package generic;

public class GenericEl {

    public static void main(String[] args) {
        Dog<String, Integer> d1 = new Dog<>("Jimmy",1);
        d1.print();
    }


}

class Dog<E,V>{

    V iD;
    E name;
    public Dog(E name, V iD){
        this.name = name;
        this.iD = iD;
    }

    public void print(){
        System.out.println("Dog name is "+name+ " with id "+iD);
    }
}
