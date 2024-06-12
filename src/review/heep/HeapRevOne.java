package review.heep;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class HeapRevOne {

    public void buildHeap(ArrayList<Integer> arr){
        int n = arr.size();
        for (int i=(n/2)-1 ; i>=0 ;i--){
            heapify(arr,i,n);
        }
    }

    public void heapify(ArrayList<Integer> arr , int idx ,int n){
        int left = 2*idx+1;
        int right = 2*idx+2;
        int mid = idx;

        if (left < arr.size() && arr.get(left) > arr.get(mid)){
            mid = left;
        }

        if (right < arr.size() && arr.get(right) > arr.get(mid)){
            mid = right;
        }
        if (mid != idx){
            Collections.swap(arr,mid,idx);
            heapify(arr,mid,n);
        }
    }
}
