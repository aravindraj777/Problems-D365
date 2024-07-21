package github.heapGithubPractice;

import java.util.ArrayList;

public class HeapBuildHeapifyDown {

    private ArrayList<Integer> heap;

    HeapBuildHeapifyDown(){
        heap = new ArrayList<>();
    }

    public void insert(int value){
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }
    private void heapifyUp(int index){

        int parentIndex = (index - 1)/2;
        if (index > 0 && heap.get(index) > heap.get(parentIndex)){
            swap(index,parentIndex);
            heapifyUp(parentIndex);
        }
    }

    private void swap(int index,int parentIndex){
        int temp = heap.get(index);
        heap.set(index,heap.get(parentIndex));
        heap.set(parentIndex,temp);
    }

    private void printHeap(){
        System.out.println(heap);
    }



    public void heapSort(){
        buildMaxHeap();
        int n = heap.size();
        for (int i = n-1 ; i> 0 ;i-- ){
            swap(0,i);
            heapifyDown(0,i);
        }
    }

    private void buildMaxHeap(){
        int n = heap.size();
        for (int i = n/2 - 1; i >= 0 ; i--){
            heapifyDown(i,n);
        }
    }

    private void heapifyDown(int index, int size) {
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;
        int largestIndex = index;

        if (leftChildIndex < size && heap.get(leftChildIndex) > heap.get(largestIndex)) {
            largestIndex = leftChildIndex;
        }

        if (rightChildIndex < size && heap.get(rightChildIndex) > heap.get(largestIndex)) {
            largestIndex = rightChildIndex;
        }

        if (largestIndex != index) {
            swap(index, largestIndex);
            heapifyDown(largestIndex, size);
        }
    }

    public static void main(String[] args) {

        HeapBuildHeapifyDown heap = new HeapBuildHeapifyDown();
        heap.insert(30);
        heap.insert(22);
        heap.insert(10);
        heap.insert(90);
        heap.insert(100);

        heap.printHeap();
        heap.heapSort();
        System.out.println("===========");
        heap.printHeap();
    }
}
