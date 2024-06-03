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
//        System.out.println(binarySearchTreeEight.inOrder(binarySearchTreeEight.root));
    }
}