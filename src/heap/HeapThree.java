package heap;

import java.util.ArrayList;

public class HeapThree {


    public void buildHeap(ArrayList<Integer> arr){
        int n = arr.size();
        for (int i = (n/2)-1 ; i>= 0 ; i--){


        }

    }

    public void heapify(ArrayList<Integer> arrayList, int i ,int n){

        int right = 2*i+2;
        int left = 2*i+1;
        int mid = i;

        if(left < n && arrayList.get(left) > arrayList.get(mid)){
            mid = left;
        }
        if(right < n && arrayList.get(right) > arrayList.get(mid)){
            mid = left;
        }


        if(mid!=i){
            int temp = arrayList.get(i);
            arrayList.set(i,arrayList.get(mid));
            arrayList.set(mid,temp);
            heapify(arrayList,mid,n);
        }
    }

    public void heapSort(ArrayList<Integer> arr){
        int n = arr.size();
        buildHeap(arr);

        for (int i = n-1 ; i>=0 ;i--){
            int temp = arr.get(0);
            arr.set(0,arr.get(i));
            arr.set(i,temp);
            heapify(arr,0,i);
        }
    }
}
