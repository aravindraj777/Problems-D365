package generic.bounded;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class BoundedGenerics<T extends Animal> {

    public static void main(String[] args) throws NoSuchMethodException {
            Dogs dogs = new Dogs();
            Cats cats = new Cats();

            BoundedGenerics<Animal> dogsBoundedGenerics = new BoundedGenerics<>();
            dogsBoundedGenerics.displayAnimal(dogs);
            dogsBoundedGenerics.displayAnimal(cats);

        Method method = BoundedGenerics.class.getMethod("displayAnimal", Animal.class);
        System.out.println("Method signature"+method);

        Type superClass  = BoundedGenerics.class.getGenericSuperclass();
        System.out.println("Superclass Type" + superClass);

    }

    public void displayAnimal(T animal){
        animal.print();
    }
}


