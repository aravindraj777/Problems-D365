//package hashtable;
//
//public class QuadraticProbing {
//
//    private Node[] bucket;
//    private int size;
//    QuadraticProbing(int size){
//        this.size = size;
//    }
//   class Node {
//
//       String key;
//       String value;
//       Node next;
//
//       Node (String key, String value){
//           this.key = key;
//           this.value = value;
//       }
//    }
//
//    public void set(String key, String value){
//
//    }
//
//    private int hashFunction(String key){
//        char[] ch = key.toCharArray();
//        int index = 0;
//        for (char c : ch){
//            index = (index + c) % size;
//        }
//    }
//}
