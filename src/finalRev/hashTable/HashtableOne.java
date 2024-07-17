package finalRev.hashTable;

public class HashtableOne {


    private final Node[] dataMap;

    int size;
    HashtableOne(int size){
        this.size = size;
        dataMap = new Node[size];
    }

    class Node {

        String key;
        int value;

        Node next;

        Node (String key ,int value){
            this.key = key;
            this.value = value;
        }
    }

    private int hash(String key){
        int hash = 0;
        char[] ch = key.toCharArray();
        for (int asci : ch) {
            hash = (hash + asci) % dataMap.length;
        }
        return hash;
    }

    public void setValue(String key,int value){
        Node newNode = new Node(key,value);
        int index = hash(key);

        if (dataMap[index] == null){
            dataMap[index] = newNode;
        }
        else {
            Node temp = dataMap[index];
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void printNode(){
        for (int i = 0 ;i<dataMap.length ;i++){
            Node temp = dataMap[i];
            while (temp!= null){
                System.out.println(temp.key + " "+ temp.value);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        HashtableOne ht = new HashtableOne(10);
        ht.setValue("apple", 100);
        ht.setValue("banana", 200);
        ht.setValue("orange", 300);
        ht.setValue("apple", 400); //

        ht.printNode();

    }
}
