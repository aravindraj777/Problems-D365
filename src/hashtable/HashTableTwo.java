package hashtable;

public class HashTableTwo {

    private final Node[] datamap;

    HashTableTwo (){
        int size = 10;
        datamap = new Node[size];
    }


    static class Node {
        String key;
        int value;
        Node next;

        Node (String key,int value){
            this.key = key;
            this.value = value;
        }
    }

    private int hash (String key){
        int hash = 0;
        char[] arr = key.toCharArray();
        for (int i=0;i<arr.length; i++){
            int ascii = arr[i];
            hash = (hash+ascii)% datamap.length;
        }
        return hash;
    }

    public void set(String key, int value){
        Node newNode = new Node(key,value);
        int index = hash(key);
        if(datamap[index] == null){
            datamap[index] = newNode;
        }
        else {
            Node temp = datamap[index];
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void print(){
        for (int i=0; i < datamap.length ;i++){
            Node temp = datamap[i];
            while (temp != null ){
                System.out.println(temp.key + " : " + temp.value);
                temp = temp.next;
            }

        }
    }

}

class HashOneMain {

    public static void main(String[] args) {

        HashTableTwo hashTableTwo = new HashTableTwo();
        hashTableTwo.set("Subash",67);
        hashTableTwo.set("Subash",62);
        hashTableTwo.set("Subash",63);
        hashTableTwo.set("Subash",64);
        hashTableTwo.set("Subash",65);
        hashTableTwo.set("Subash",66);

        hashTableTwo.print();
    }
}