package finalRev.hashTable;

import java.util.Hashtable;

public class HashTableThree {

    public Node[] bucket;
    public int size;

    HashTableThree(int size){
        this.size = size;
        bucket = new Node[size];
    }
    class Node {
        Node next;
        String key;
        int value;

        Node(String key,int value){
            this.key = key;
            this.value = value;
        }
    }

    private int hash(String key){
        int hash = 0;
        char[] ch = key.toCharArray();
        for (char c : ch){
            hash = (hash + c) % bucket.length;
        }
        return hash;
    }

    public void set(String key, int value){
        Node newNode =  new Node(key,value);
        int index = hash(key);

        if (bucket[index] == null){
            bucket[index] = newNode;
        }
        else {
            Node temp = bucket[index];
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void printHashTable(){
        for (Node node : bucket) {
            Node temp = node;
            while (temp != null) {
                System.out.println(temp.key + " " + temp.value);
                temp = temp.next;
            }
        }
    }
}

class TableThreeMain{

    public static void main(String[] args) {



        HashTableThree hashTable = new HashTableThree(16);
        hashTable.set("Anand",45);
        hashTable.set("Apple",55);
        hashTable.set("Orange",10);
        hashTable.set("Guava",33);

        hashTable.printHashTable();
    }
}
