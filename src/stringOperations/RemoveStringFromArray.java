package stringOperations;

public class RemoveStringFromArray {

    public static int removeString(String[] arr,String target, int index,int size){

        if (index == size){
            return size;
        }

        if (arr[index].equals(target)){
            arr[index] = arr[size - 1];
            arr[size - 1] = null;
            return removeString(arr,target,index,size-1);
        }
        return removeString(arr,target,index+1,size);
    }


}
