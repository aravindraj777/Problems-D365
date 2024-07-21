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
//        if (heap.isEmpty()) {
//            heap.add(value);
//            return;
//        }
//
//        // Add the new value at the end of the heap array
//        heap.add(heap.get(0)); // Temporarily add the current root at the end
//        heap.set(0, value);    // Place the new value at the root
//        heapifyDown(0);
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

////    private void heapifyDown(int index){
////
////        int leftChildIndex = 2 * index + 1;
////        int rightChildIndex = 2 * index + 2;
////        int largestIndex = index;
////
////        if (leftChildIndex < heap.size() && heap.get(leftChildIndex) > heap.get(largestIndex)){
////            largestIndex = leftChildIndex;
////        }
////        if (rightChildIndex < heap.size() && heap.get(rightChildIndex) > heap.get(largestIndex)){
////            largestIndex = rightChildIndex;
////        }
////        if (largestIndex != index){
////            swap(index,largestIndex);
////            heapifyDown(largestIndex);
////        }
//
//    }

    public static void main(String[] args) {

        HeapBuildHeapifyDown heap = new HeapBuildHeapifyDown();
        heap.insert(30);
        heap.insert(22);
        heap.insert(10);
        heap.insert(90);
        heap.insert(100);

        heap.printHeap();
    }
}
