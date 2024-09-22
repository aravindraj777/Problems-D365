package github.solid.interfaceSegmented;

/**
 This is for that each of the roles have a separate interface so that they only
 need to implement their needed methods without implementing the unnecessary methods.
 */
public interface WaiterInterface {

    void serveCustomers();
    void takeOrder();
}

interface ChefInterface{

    void cookFood();
    void decideMenu();

}

class Waiter implements  WaiterInterface{

    @Override
    public void serveCustomers() {
        System.out.println("Serve customers");
    }

    @Override
    public void takeOrder() {

        System.out.println("Take order from customers");
    }
}

class Chef implements  ChefInterface{

    @Override
    public void cookFood() {
        System.out.println("Cook food");
    }

    @Override
    public void decideMenu() {
        System.out.println("Making menu for customers");
    }
}