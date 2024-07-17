package finalRev.hashTable;

public class HashTableTwo {

    Node[] bucket;
    int size;

    HashTableTwo(int size){
        this.size = size;
        bucket = new Node[size];
    }
    class Node {

        String key;
        int value;
        Node next;

        Node (String key , int value){
            this.key  = key;
            this.value = value;
        }
    }

    private int hash(String key){
        int hash = 0;
        char[] ch = key.toCharArray();
        for (char c : ch){
            int ascii = c;
            System.out.println(ascii);
            hash = (hash + ascii) % bucket.length;

        }
        return hash;
    }

    public void setValue(String key , int value){
        Node newNode = new Node(key,value);
        int index = hash(key);
        if (bucket[index] == null){
            bucket[index] = newNode;
        }
        else{
            Node temp = bucket[index];
            while (temp.next!= null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
}
