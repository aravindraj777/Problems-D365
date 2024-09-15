package github.thread;

public class MonitorLockExample {

    public synchronized void task1(){

        try {
            System.out.println("Inside task1");
            Thread.sleep(1000);
            System.out.println("Task1 completed");
        }
        catch (Exception e){
            System.out.println("This is in task1 catch block");
        }
    }

    public void task2(){
        System.out.println("task 2 before synchronized");
        synchronized (this){
            System.out.println("Task 2 inside synchronized");
        }
    }

    public void task3(){
        System.out.println("Task 3");
    }
}
