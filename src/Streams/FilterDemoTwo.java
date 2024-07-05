package Streams;


import java.util.ArrayList;
import java.util.List;

class Product{

    int id;
    String name;
    Double price;

    Product(int id, String name ,Double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class FilterDemoTwo {


    public static void main(String[] args) {

        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1,"Iphone",6767.0));
        productList.add(new Product(2,"Galaxy",7767.0));
        productList.add(new Product(3,"Canon",8767.0));
        productList.add(new Product(4,"Sony",9767.0));
        productList.add(new Product(5,"Pixel",10767.0));

        productList.stream().filter(p -> p.price > 8000 ).forEach(pr -> System.out.println(pr.name + " "+ pr.price));


    }
}
