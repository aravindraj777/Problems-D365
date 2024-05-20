package hashtable;

public class HashTableOne {

    private final Node[] dataMap;

    HashTableOne(){
        int size = 10;
        dataMap = new Node[size];
    }

   class Node {

       String key;
       int value;
       Node next;

       Node(String key,int value){
           this.key = key;
           this.value = value;
       }
   }

   public int hash(String key){
        int hash = 0;
        char[] arr = key.toCharArray();
        for(int i = 0;i < arr.length; i++){
            int ascii = arr[i];
            hash = (hash+ascii)%dataMap.length;
        }
        return hash;
   }


   public void set(String key, int value){
        Node newNode = new Node(key,value);
        int index = hash(key);
        if (dataMap[index] == null){
            dataMap[index] = newNode;
        }
        else{
            Node temp = dataMap[index];
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
   }

   public void print(){
        for (int i = 0; i< dataMap.length ; i++){
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println(" "+ temp.key+ " "+temp.value);
                temp = temp.next;
            }
        }
   }

}

class MainHashOne{

    public static void main(String[] args) {
        HashTableOne hashTableOne = new HashTableOne();
        hashTableOne.set("Arvind",90);
        hashTableOne.set("Abhimanyu",89);
        hashTableOne.set("Dia",67);
        hashTableOne.set("Priya",90);
        hashTableOne.print();
    }
}
