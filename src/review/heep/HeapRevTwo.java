package review.heep;

import java.util.ArrayList;
import java.util.Collections;

public class HeapRevTwo{

    public void buildHeap(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }
    }

    private void heapify(ArrayList<Integer> arr, int idx, int n) {
        int left = 2 * idx + 1;
        int right = 2 * idx + 2;
        int largest = idx;

        if (left < n && arr.get(left) > arr.get(largest)) {
            largest = left;
        }
        if (right < n && arr.get(right) > arr.get(largest)) {
            largest = right;
        }
        if (largest != idx) {
            Collections.swap(arr, idx, largest);
            heapify(arr, largest, n);
        }
    }

    public void heapSort(ArrayList<Integer> arr) {
        int n = arr.size();

        // Build heap (rearrange array)
        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            Collections.swap(arr, 0, i);

            // call max heapify on the reduced heap
            heapify(arr, 0, i);
        }
    }
}

class RevHeapOneMain {

    public static void main(String[] args) {

        HeapRevTwo heapRevTwo = new HeapRevTwo();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(78);
        arr.add(21);
        arr.add(32);
        arr.add(10);
        arr.add(54);

        // Build heap
        heapRevTwo.buildHeap(arr);
        System.out.println("Heap: " + arr);

        // Perform heap sort
        heapRevTwo.heapSort(arr);
        System.out.println("Sorted: " + arr);
    }
}
