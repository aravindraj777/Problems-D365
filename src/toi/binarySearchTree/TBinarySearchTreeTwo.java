package toi.binarySearchTree;

import binarySearchTree.BinarySearchTreeTwo;

public class TBinarySearchTreeTwo {

    Node root;
    TBinarySearchTreeTwo(){
        root = null;
    }
    static class Node{

        Node right;
        Node left;
        int value;

        Node(int value){
            this.value = value;
            this.left = this.right = null;

        }
    }

    public void insert(int value){
        root = insertionHelper(root,value);
    }
    public Node insertionHelper(Node root,int value){

        if (root == null){
            root = new Node(value);
            return root;
        } else if (root.value < value) {
            root.right = insertionHelper(root.right,value);

        } else if (root.value > value) {
            root.left = insertionHelper(root.left,value);
        }
        return root;
    }

    public void inOrder(Node root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.value + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
       TBinarySearchTreeTwo binarySearchTreeTwo = new TBinarySearchTreeTwo();
       binarySearchTreeTwo.insert(89);
       binarySearchTreeTwo.insert(87);
       binarySearchTreeTwo.insert(21);
       binarySearchTreeTwo.insert(20);

       binarySearchTreeTwo.inOrder(binarySearchTreeTwo.root);
    }
}
