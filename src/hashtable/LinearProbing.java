package hashtable;

public class LinearProbing {

    private Node[] bucket;

    private int size = 10;
    LinearProbing(){
        bucket = new Node[size];

    }
    class Node{
        String key;
        String value;
        Node next;

        Node(String key, String value){
            this.key = key;
            this.value = value;
        }

    }

    public int hash(String key){
        int hash = 0;
        char[] chars = key.toCharArray();
        for (int val : chars) {
            hash = (hash + val) % size;
        }
        return hash;
    }

    public void set(String key, String  value){
        Node newNode = new Node(key,value);
        int index = hash(key);
        if (bucket[index] == null){
            bucket[index] = newNode;
        }
        else {
            for (int i = 0 ;i < size ;i++){
                index = (index + i)% size;
                if (bucket[index] == null){
                    bucket[index] = newNode;
                    break;
                }
            }
        }
    }

    public void print (){
        for (int i = 0 ;i< bucket.length ;i++){
            System.out.print(i+ ":");
            Node temp = bucket[i];
            while (temp != null){
                System.out.println(temp.key + "  "+ temp.value);
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        LinearProbing hashTable = new LinearProbing();
        hashTable.set("Aswin","24");
        hashTable.set("Arvind","24");
        hashTable.set("Abhiraj","25");
        hashTable.set("Sreekanth","28");
        hashTable.set("Aswinn","40");

        hashTable.print();
    }
}
