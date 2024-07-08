package multithreading;

public class MonitorLockDemo {


    public synchronized  void taskOne (){

        try {
            System.out.println("Inside task One");
            Thread.sleep(10000);
            System.out.println("sleeping now");
        }
        catch (Exception e){
            System.out.println("Exception");
        }
    }

    public void taskTwo(){
        System.out.println("Task two not synchronized");
        synchronized (this){
            System.out.println("TaskTwo, inside synchronized");
        }
    }

    public void taskThree(){
        System.out.println("Task three");
    }
}

class MonitorMain {

    public static void main(String[] args) {

        MonitorLockDemo monitorLockDemo = new MonitorLockDemo();

        Thread tOne = new Thread(monitorLockDemo::taskOne);
        Thread tTwo = new Thread(monitorLockDemo::taskTwo);
        Thread tThree = new Thread(monitorLockDemo::taskThree);


        tOne.start();
        tTwo.start();
        tThree.start();
    }
}
