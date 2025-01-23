package github.thread.executorFramework.executorApproach;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorService {

    public static void main(String[] args) {

        java.util.concurrent.ExecutorService ex = Executors.newFixedThreadPool(3);
        java.util.concurrent.ExecutorService ex1 = Executors.newFixedThreadPool(2);
//      Creating the threadpool and limiting the worker threads to work
        for (int i = 0 ; i <=10; i++){
            if (i<=5){
                ex.execute(new Task(i));
            }
            else{
                ex1.execute(new Task(i));
            }

        }


    }
}

class Task implements Runnable {

    private int taskId;

    public Task(int taskId){
        this.taskId = taskId;
    }


    @Override
    public void run() {
        System.out.println("Task "+ taskId + "is running on the thread: "+
                Thread.currentThread().getName());
    }
}
