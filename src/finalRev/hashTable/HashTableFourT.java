package finalRev.hashTable;

public class HashTableFourT {

    Node[] bucket;
    int size;

    HashTableFourT(int size){
        this.size = size;
        bucket = new Node[size];
    }
    class Node {

        String key;
        int value;
        Node next;

        Node(String key,int value){
            this.key  = key;
            this.value = value;
        }
    }

    private int hash(String key){
        char[] ch = key.toCharArray();
        int hash = 0;
        for (char c : ch){

            hash = (hash+c) % bucket.length;
        }
        return hash;
    }

//    public void set(String key, int value){
//        int index = hash(key);
//        Node newNode = new Node(key,value);
//        if (bucket[index] == null){
//            bucket[index] = newNode;
//        }
//        else {
//            Node temp = bucket[index];
//            while (temp.next != null){
//                temp = temp.next;
//            }
//            temp.next = newNode;
//
//        }
//    }

    public void set(String key,int value){
        int index = hash(key);
        Node temp = bucket[index];
        while (temp != null){
            if (temp.key.equals(key)){
                temp.value = value;
                return;
            }
            temp = temp.next;
        }
        Node newNode = new Node(key,value);
        newNode.next = bucket[index];
        bucket[index] = newNode;
    }

    public void printHashTable(){

        for (int i = 0 ;i< bucket.length ;i++){
            Node temp = bucket[i];
            while (temp != null){
                System.out.println(temp.key + " "+temp.value);
                temp = temp.next;
            }
        }
    }

    public int get(String key){
        int index = hash(key);
        Node temp = bucket[index];
        while (temp != null){
            if (temp.key.equals(key)){
                return temp.value;
            }
            temp = temp.next;
        }
        return -1;
    }
}

class FourTMain{

    public static void main(String[] args) {
        HashTableFourT hashTable = new HashTableFourT(16);
        System.out.println(hashTable.size);
        hashTable.set("Arvind",24);
        hashTable.set("Shyam",24);
        hashTable.set("Subhash",25);
        hashTable.set("SanDisk",29);
        hashTable.set("Arvind",26);

        hashTable.printHashTable();
        System.out.println(hashTable.get("Arvind"));
    }


}
