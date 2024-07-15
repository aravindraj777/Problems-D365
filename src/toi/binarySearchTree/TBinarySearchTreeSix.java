package toi.binarySearchTree;

public class TBinarySearchTreeSix {

    Node root ;
    TBinarySearchTreeSix(){
        root = null;
    }
    static class Node {
        Node right;
        Node left;
        int value;
        Node (int value){
            this.value = value;
            left = right = null;
        }
    }

    public void insert(int value){
        root = insertionHelper(value,root);
    }

    private Node insertionHelper(int value,Node root){

        if (root == null){
            root = new Node(value);
            return root;
        } else if (root.value > value) {
            root.left = insertionHelper(value,root.left);
        } else if (root.value < value) {
            root.right = insertionHelper(value,root.right);
        }
        return root;
    }

    public void inOrderTraversal(Node root){
        if (root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.value + " ");
        inOrderTraversal(root.right);
    }
}
class mainTreeSix {
    public static void main(String[] args) {
        TBinarySearchTreeSix tBinarySearchTreeSix = new TBinarySearchTreeSix();
        tBinarySearchTreeSix.insert(66);
        tBinarySearchTreeSix.insert(43);
        tBinarySearchTreeSix.insert(22);
        tBinarySearchTreeSix.insert(11);

        tBinarySearchTreeSix.inOrderTraversal(tBinarySearchTreeSix.root);
    }
}