package binarySearchTree;

import java.util.ArrayList;

public class BinarySearchTreeFour {

    Node root;
    class Node {

        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
            this.right = this.left = null;
        }
    }

    BinarySearchTreeFour(){
        root = null;
    }

    public void insert(int value){
        root = insertIntoTree(root,value);
    }

    public Node insertIntoTree(Node root, int value){


        if(root == null){
            Node newNode = new Node(value);
            root = newNode;
            return root;
        }
        if(value < root.value){
            root.left = insertIntoTree(root.left,value);
        } else if (value > root.value) {
            root.right = insertIntoTree(root.right,value);
        }
        return root;
    }

    public void delete(int value){
        root = deleteFromTree(root,value);
    }

    public Node deleteFromTree(Node root, int value){


        if(root == null){
            return null;
        }
        if(value < root.value){
            root.left = deleteFromTree(root.left,value);
        }
        else if(value > root.value){
            root.right = deleteFromTree(root.right,value);
        }
        else {
            if(root.left == null && root.right == null){
                return null;
            } else if (root.left == null) {
                root = root.right;
            } else if (root.right == null) {
                root = root.left;
            }
            else {
                int subTreeMin =minValue(root.right);
                root.value  = subTreeMin;
                root.right = deleteFromTree(root.right,subTreeMin);
            }

        }
        return root;
    }

        public int  minValue(Node root){
            Node curr = root;
            while (curr!= null){
                curr = curr.left;
            }
            return curr.value;
        }

        public void inOrder(){
            inOrder(root);
        }
        public void inOrder(Node root){
            if(root == null){
                return ;
            }
            inOrder(root.left);
            System.out.println(root.value+ " ");
            inOrder(root.right);
        }

        public ArrayList<Integer> validationHelper(Node  root,ArrayList<Integer> arr){

        if(root == null){
            return null;

        }
        validationHelper(root.left,arr);
        arr.add(root.value);
        validationHelper(root.right,arr);
        return arr;
        }

        public void validate(){
            ArrayList<Integer> arr = validationHelper(root,new ArrayList<>());
            int flag = 0;
            for (int i = 0 ; i< arr.size()-1 ; i ++){
                if(arr.get(i) > arr.get(i+1)){
                    flag  = 1;
                    break;
                }
            }


            if (flag == 0){
                System.out.println("Valid BST");
            }
            else {
                System.out.println("Not a valid BST");
            }

        }
}

class MainFour {

    public static void main(String[] args) {
        BinarySearchTreeFour binarySearchTreeFour = new BinarySearchTreeFour();
        binarySearchTreeFour.insert(45);
        binarySearchTreeFour.insert(34);
        binarySearchTreeFour.insert(80);
//
//        System.out.println(binarySearchTreeFour.root.value);
//        System.out.println(binarySearchTreeFour.root.left.value);
        binarySearchTreeFour.inOrder();
        binarySearchTreeFour.validate();
    }
}