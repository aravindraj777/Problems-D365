package heap;

import java.util.ArrayList;

public class HeapOne {



    public void buildHeap(ArrayList<Integer> arr){

        int n = arr.size();
        for (int i = (n/2) - 1 ; i>=0 ; i--){

        }
    }

    public void heapify(ArrayList<Integer> arr,int i, int n){

        int right = 2*i+2;
        int left = 2*i+1;
        int mid = i;

        if (left < n && arr.get(left) > arr.get(mid)){
            mid = left;
        }
        if(right < n && arr.get(right) > arr.get(mid)){
            mid = right;
        }
        if(mid!=i){
            int temp = arr.get(i);
            arr.set(i,arr.get(mid));
            arr.set(mid,temp);
            heapify(arr,mid,n);
        }


    }
}
