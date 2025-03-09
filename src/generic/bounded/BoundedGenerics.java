package generic.bounded;

public class BoundedGenerics<T extends Animal> {

    public static void main(String[] args) {
            Dogs dogs = new Dogs();
            Cats cats = new Cats();

            BoundedGenerics<Animal> dogsBoundedGenerics = new BoundedGenerics<>();
            dogsBoundedGenerics.displayAnimal(dogs);
            dogsBoundedGenerics.displayAnimal(cats);

    }

    public void displayAnimal(T animal){
        animal.print();
    }
}


