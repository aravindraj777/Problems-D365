package github.hashtable;

public class LinearProbing {

    private Node[] bucket;
    private int size;

    LinearProbing(int size){
        this.size = size;
        bucket = new Node[size];
    }

    class Node {
        String key;
        String value;
        Node next;

        Node(String key, String  value){
            this.key = key;
            this.value = value;
        }
    }

    public void put(String key, String value){
        Node newNode = new Node(key,value);
        int index = hash(key);
        if (bucket[index] == null){
            bucket[index]  = newNode;
        }
        else {
         for (int i = 0 ; i< size ; i++){
             index = (index + i) % size;
             if (bucket[index] == null){
                 bucket[index] = newNode;
                 return;
             }

             if (bucket[index].key.equals(key)){
                 bucket[index].value = value;
                 return;
             }
         }
        }
    }

    private int hash(String key){
        int hash = 0;
        for (char ch : key.toCharArray()){
            hash = (hash+ (int) ch) % bucket.length;
        }
        return hash;
    }

    public void printTable(){
        for (int i = 0 ; i < bucket.length ;i++){
            Node temp = bucket[i];
            while (temp != null){
                System.out.println(temp.key + " , " + temp.value);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinearProbing linearProbing = new LinearProbing(6);
        linearProbing.put("A","Aravind");
        linearProbing.put("B","Arun");
        linearProbing.put("C","Rahul");
        linearProbing.put("D","Mohan");

        linearProbing.printTable();
    }
}
