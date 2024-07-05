package priorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueOne {

    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(45);
        priorityQueue.add(32);
        priorityQueue.add(24);
        priorityQueue.add(31);

        priorityQueue.forEach(System.out::println);

        while (!priorityQueue.isEmpty()){
            int val = priorityQueue.poll();
            System.out.println("Value removed "+ val);

        }


        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b - a);
        maxHeap.add(78);
        maxHeap.add(56);
        maxHeap.add(33);
        maxHeap.add(12);
        maxHeap.add(90);


        maxHeap.forEach(System.out::println);
    }
}
