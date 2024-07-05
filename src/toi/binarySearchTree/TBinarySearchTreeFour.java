package toi.binarySearchTree;

public class TBinarySearchTreeFour {


    Node root;
    TBinarySearchTreeFour(){
        root = null;
    }

    static  class Node{


        Node right;
        Node left;
        int value;

        Node (int value){
            this.value = value;
           right = left = null;
        }
    }

    public void  insertion(int value){
        root = insertionHelper(value,root);
    }

    public Node  insertionHelper(int value,Node root){

        if (root == null){
            root = new Node(value);
            return root;
        }

        else if (root.value < value){
            root.right = insertionHelper(value,root.right);
        } else if (root.value > value) {
            root.left = insertionHelper(value,root.left);
        }
        return root;

    }

    public void inOrderTraversal(Node root){

        if (root == null){
            return;
        }

        inOrderTraversal(root.left);
        System.out.println(root.value);
        inOrderTraversal(root.left);
    }


    public static void main(String[] args) {

        TBinarySearchTreeFour treeFour = new TBinarySearchTreeFour();
        treeFour.insertion(45);
        treeFour.insertion(21);
        treeFour.insertion(34);
        treeFour.insertion(89);
        treeFour.insertion(10);

        treeFour.inOrderTraversal(treeFour.root);
    }
}
