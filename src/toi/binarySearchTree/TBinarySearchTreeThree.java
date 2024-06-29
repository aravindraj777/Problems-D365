package toi.binarySearchTree;

public class TBinarySearchTreeThree {

    Node root;
    TBinarySearchTreeThree(){
        root = null;
    }
    static class Node{
        Node right;
        Node left;
        int value;
        Node(int value){
            this.value = value;
            left = right = null;
        }
    }

    public void insertIntoTree(int value){
            root = insertionHelper(value,root);
    }


    public Node insertionHelper(int value,Node root){

        if (root == null){
            root = new Node(value);
            return root;
        } else if (root.value < value) {
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
        inOrderTraversal(root.right);
    }

    public void deleteFromTree(int value){
       root =  deletionHelper(root,value);
    }


    private Node deletionHelper(Node root,int value){
        if (root == null){
            return null;
        } else if (root.value > value) {
            root.left = deletionHelper(root.left,value);

        } else if (root.value < value) {
            root.right = deletionHelper(root.right,value);
        }
        else{

            if (root.right == null && root.left == null){
                return null;
            } else if (root.right == null) {
                root = root.left;
            } else if (root.left == null) {
                root = root.right;
            }
            else {
                int minValue = inOrderSuccessor(root.right);
                root.value = minValue;
                root.right = deletionHelper(root.right,minValue);
            }
        }
        return root;
    }

    private int inOrderSuccessor(Node root){

        Node curr = root;
        while (curr.left!= null){
            curr = curr.left;
        }
        return curr.value;
    }
    public static void main(String[] args) {

        TBinarySearchTreeThree treeThree = new TBinarySearchTreeThree();
        treeThree.insertIntoTree(90);
        treeThree.insertIntoTree(32);
        treeThree.insertIntoTree(56);

        treeThree.inOrderTraversal(treeThree.root);

        treeThree.deleteFromTree(32);
        System.out.println("=====================");
        treeThree.inOrderTraversal(treeThree.root);
    }



}
