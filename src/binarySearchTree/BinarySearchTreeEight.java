package binarySearchTree;

import java.util.ArrayList;

public class BinarySearchTreeEight {

    Node root;
    BinarySearchTreeEight(){
        root = null;
    }
    class Node {

        Node right;
        Node left;
        int value;
        Node (int value){
            this.value = value;
            this.right = this.left = null;

        }
    }

    public void insert(int value){
        root = insertIntoTree(root,value);
    };
    public Node insertIntoTree(Node root, int value){

        if (root == null){
            Node newNode  = new Node(value);
            root = newNode;
            return root;
        }
        if(root.value > value){
            root.left = insertIntoTree(root.left,value);
        } else if (root.value < value) {
            root.right  = insertIntoTree(root.right,value);
        }
        return root;
    }

    public void inOrder(Node root){

        ArrayList<Integer> arr = new ArrayList<>();
        if (root == null){
            return ;
        }
        inOrder(root.left);
        System.out.print(root.value + " ");
        inOrder(root.right);
//        return;
    }

    public void searchNode(Node root,int value,Node parent){

        if (root == null){
            System.out.println("No key present");
            return;
        }

        if (root.value == value){
            if (parent == null){
                System.out.println("This is the parent node ");
            } else if (parent.value > value) {
                System.out.println("This is the left child of " + parent.value);
            }
            else {
                System.out.println("This is the right child of "+ parent.value);
            }
            return;
        }

        if (root.value > value){
            searchNode(root.left,value,root);
        }
        else {
            searchNode(root.right,value,root);
        }
    }
}

class EightMain{

    public static void main(String[] args) {

        BinarySearchTreeEight binarySearchTreeEight = new BinarySearchTreeEight();
        binarySearchTreeEight.insert(56);
        binarySearchTreeEight.insert(34);
        binarySearchTreeEight.insert(43);
        binarySearchTreeEight.insert(21);
        binarySearchTreeEight.insert(10);


        binarySearchTreeEight.inOrder(binarySearchTreeEight.root);
        binarySearchTreeEight.searchNode(binarySearchTreeEight.root,43,null);
//        System.out.println(binarySearchTreeEight.inOrder(binarySearchTreeEight.root));
    }
}