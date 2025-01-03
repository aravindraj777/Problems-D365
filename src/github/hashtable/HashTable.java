//package github.hashtable;
//
//import hashtable.HashTableFour;
//
//public class HashTable {
//
//    private Node[] bucket;
//
//    private int size;
//    HashTable(int size){
//        this.size = size;
//        bucket = new Node[size];
//    }
//    class Node{
//        String key;
//        String value;
//        Node next;
//
//        Node(String key ,String value){
//            this.key = key;
//            this.value = value;
//        }
//    }
///
//
//    public void put(String key, String value){
//
//        HashTableFour.Node newNode = new HashTableFour.Node(key,value);
//        int index = hash(key);
//        if (bucket[index] == null){
//            bucket[index] = newNode;
//        }
//        else {
//            HashTableFour.Node temp = bucket[index];
//            while (temp.next!= null){
//                temp = temp.next;
//            }
//            temp.next = newNode;
//        }
//    }
//
//    private int hash(String key){
//        int hash = 0;
//        for (char ch : key.toCharArray()){
//            int ascii = ch;
//            hash = (hash+ascii) % bucket.length;
//        }
//        return hash;
//    }
//
//    public void printTable(){
//        for (HashTableFour.Node node : bucket) {
//            HashTableFour.Node temp = node;
//            while (temp != null) {
//                System.out.println(temp.key + "," + temp.value);
//                temp = temp.next;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//
//
//        HashTableFour hashTable = new HashTableFour(16);
//        hashTable.put("Reentrant","@77Annekathrin");
//        hashTable.put("Arvind","@77Arvind");
//        hashTable.put("Vishnu","@99Vishnu");
//        hashTable.put("Abi","Aa");
//        hashTable.put("Arv","@77hello");
//
//        hashTable.printTable();
//    }
//}
