package github.heapGithubPractice;

import java.util.ArrayList;
import java.util.List;

public class HeapBuild {


    private List<Integer> heap;

    public HeapBuild(){
        this.heap = new ArrayList<>();
    }

    public void insert(int value){
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }

    private void heapifyUp(int index){

        int parentIndex = (index - 1) / 2;
        if (index > 0 && heap.get(index) > heap.get(parentIndex)){
            swap(index,parentIndex);
            heapifyUp(parentIndex);
        }
    }

    private void swap(int index1, int index2){
        int temp = heap.get(index1);
        heap.set(index1,heap.get(index2));
        heap.set(index2,temp);
    }

    public void printHeap(){
        System.out.println(heap);
    }

    public static void main(String[] args) {

        HeapBuild heap = new HeapBuild();
        heap.insert(66);
        heap.insert(21);
        heap.insert(20);
        heap.insert(90);
        heap.insert(33);

        heap.printHeap();
    }

}
