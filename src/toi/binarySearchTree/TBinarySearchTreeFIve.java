package toi.binarySearchTree;

public class TBinarySearchTreeFIve {

    Node root;
    TBinarySearchTreeFIve(){
        root = null;
    }
   static class Node {

       Node right;
       Node left;
       int value;

       Node (int value){
           this.value = value;
           this.right = this.left = null;
       }
    }

    public void insert(int value){
         root = insertionHelper(root,value);
    }

    private Node insertionHelper(Node root,int value){

        if (root == null){
            root = new Node(value);
            return root;
        } else if (root.value > value) {
            root.left = insertionHelper(root.left,value);
        }
        else if (root.value < value) {
            root.right = insertionHelper(root.right, value);
        }
        return root;
    }

    public void printTreeInOrder(Node root){

        if (root == null){
            return;
        }
        printTreeInOrder(root.left);
        System.out.println(root.value + " ");
        printTreeInOrder(root.right);

    }
}

class TreeFiveMain{

    public static void main(String[] args) {

        TBinarySearchTreeFIve tBinarySearchTreeFIve = new TBinarySearchTreeFIve();
        tBinarySearchTreeFIve.insert(56);
        tBinarySearchTreeFIve.insert(22);
        tBinarySearchTreeFIve.insert(12);
        tBinarySearchTreeFIve.insert(90);

        tBinarySearchTreeFIve.printTreeInOrder(tBinarySearchTreeFIve.root);
    }
}
