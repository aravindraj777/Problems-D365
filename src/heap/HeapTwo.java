package heap;

import java.util.ArrayList;

public class HeapTwo {


    public void buildHeap(ArrayList<Integer> arrayList){
        int n = arrayList.size();
        for (int i = (n/2)-1 ; i>=0 ;i--){
            heapify(arrayList,i,n);
        }
    }

    public void heapify(ArrayList<Integer> arr,int i , int n){

        int right = 2*i+2;
        int left = 2*i-1;
        int mid = i;

        if(right < n && arr.get(right) > arr.get(mid)){
            mid  = right;
        }

        if(left < n && arr.get(left) > arr.get(mid)){
            mid = left;
        }

        if(mid!= i){
            int temp = arr.get(i);
            arr.set(i,arr.get(mid));
            arr.set(mid,temp);
            heapify(arr,mid,n);
        }
    }

    public void heapSort(ArrayList<Integer> arr){
        int n = arr.size();
        buildHeap(arr);

        for (int i= n-1 ; i>=0 ; i--){
            int temp = arr.get(0);
            arr.set(0,arr.get(i));
            arr.set(i,temp);
            heapify(arr,0,i);
        }
    }

}
