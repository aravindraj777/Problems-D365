package github.binarySearchTree;

public class BinarySearchTreeImpl {

    public Node root;
    private int height;

    BinarySearchTreeImpl(){
        root = null;
        height = 0;
    }
    class Node {
        int value;
        Node right;
        Node left;

        Node(int value){
            this.value = value;
            right = left = null;
        }
    }

    public void insertValue(int value){
        root = insertionHelper(root,value);
    }

    private Node insertionHelper(Node root , int value){

        if (root == null){
            root = new Node(value);
            return root;
        } else if (root.value > value) {
            root.left = insertionHelper(root.left , value);
        } else if (root.value < value) {
            root.right = insertionHelper(root.right , value);
        }
        return root;
    }

    public void inOrderTraversal(Node root){

        if (root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.value+ " ");
        inOrderTraversal(root.right);
    }
}

class BinarySearchTreeMain{

    public static void main(String[] args) {

        BinarySearchTreeImpl binarySearchTree = new BinarySearchTreeImpl();
        binarySearchTree.insertValue(23);
        binarySearchTree.insertValue(12);
        binarySearchTree.insertValue(90);
        binarySearchTree.insertValue(13);

        binarySearchTree.inOrderTraversal(binarySearchTree.root);
    }
}