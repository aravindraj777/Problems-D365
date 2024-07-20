package github.heapGithubPractice;

import java.util.ArrayList;
import java.util.List;

public class MaxHeap {

    private List<Integer> heap;

    MaxHeap(){
        heap = new ArrayList<>();
    }

    public void buildMaxHeap(int index){

        int parentIndex = (index - 1) / 2;
        if (index > 0 && heap.get(index) > heap.get(parentIndex)){
            swap(parentIndex,index);
            buildMaxHeap(parentIndex);
        }
    }

    private void swap(int parentIndex, int index){

        int temp = heap.get(parentIndex);
        heap.set(parentIndex,heap.get(index));
        heap.set(index,temp);
    }

    public void insert(int value){
        heap.add(value);
        buildMaxHeap(heap.size() - 1);
    }

    private void printHeap(){
        System.out.println(heap);
    }
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap();
        maxHeap.insert(55);
        maxHeap.insert(33);
        maxHeap.insert(20);
        maxHeap.insert(90);

        maxHeap.printHeap();
    }
}
