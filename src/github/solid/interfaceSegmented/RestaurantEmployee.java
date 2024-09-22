package github.solid.interfaceSegmented;

/**
 Interfaces should be such , that client should not implement unnecessary functions they do not need.

 * */
public interface RestaurantEmployee {

    void washDishes();
    void serveCustomers();
    void cookFood();


    /*
    In this case , for particular sections of the restaurant , all of them need to extend all the methods in it .
    eg(waiter doesn't need to implement washDishes() method , cook doesn't need to implement serveCustomers() method )
    */


}
