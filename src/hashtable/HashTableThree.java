package hashtable;

public class HashTableThree {

    private final Node[] bucket;
    HashTableThree(){
        int size = 10;
        bucket = new Node[size];
    }

    static class Node{

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
        for (int i=0 ;i < arr.length ; i++){
            int ascii = arr[i];
            System.out.println(ascii);
            hash = (hash + ascii) % bucket.length;
        }
        return hash;
    }

    public void setValue(String key,int value){
        Node newNode  = new Node(key,value);
        int index = hash(key);

        if (bucket[index] == null){
            bucket[index] = newNode;
        }
        else{
           Node temp =  bucket[index];
           while (temp.next!= null){
               temp = temp.next;

           }
           temp.next = newNode;
        }
    }

    public void printTable(){
        for (Node temp : bucket){
            while (temp!= null){
                System.out.println(temp.key + " "+temp.value);
                temp = temp.next;
            }
        }
    }
}

class HashThreeMain{

    public static void main(String[] args) {

        HashTableThree hashTableThree = new HashTableThree();
        hashTableThree.setValue("ACC",1);
        hashTableThree.setValue("BCC",2);
        hashTableThree.setValue("CAA",3);
        hashTableThree.setValue("DOO",4);

        hashTableThree.printTable();
//       int val =  hashTableThree.hash("Hello");
//        System.out.println(val+"val");
    }
}
