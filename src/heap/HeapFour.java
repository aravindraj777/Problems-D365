package heap;

import java.util.ArrayList;

public class HeapFour {

   public void buildHeap(ArrayList<Integer> arr){

       int n = arr.size();
       for (int i= (n/2)-1 ;i >= 0 ;i++){

           heapify(arr,i,n);
       }
   }
   public void heapify(ArrayList<Integer> arr , int idx ,int n){

       int left = 2*idx+1;
       int right = 2*idx+2;
       int mid = idx;

       if (left < n && arr.get(left) < arr.get(mid)){
           mid = idx;
       }
   }
}
