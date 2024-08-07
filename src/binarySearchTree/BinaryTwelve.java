package binarySearchTree;

public class BinaryTwelve {

    Node root;
    BinaryTwelve(){
        root = null;
    }
    class Node {
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
            right = left = null;
        }
    }

    public void insert(int value){
        root = insertionHelper(root,value);
    }
    private Node insertionHelper(Node root, int value){
        Node newNode  = new Node(value);
        if (root == null){
           return root = new Node(value);
        } else if (root.value > value) {
            root.left = insertionHelper(root.left,value);
        }
        else if (root.value < value){
            root.right = insertionHelper(root.right,value);
        }
        return root;
    }

    public void inOrder(Node root){
        if (root  == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.value);
        inOrder(root.right);
    }
}

class TMain{

    public static void main(String[] args) {
        BinaryTwelve bst = new BinaryTwelve();
        bst.insert(89);
        bst.insert(10);
        bst.insert(34);
        bst.insert(44);
        bst.insert(90);

        bst.inOrder(bst.root);
    }
}