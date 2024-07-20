package github.basicQuestions;

import java.util.ArrayList;

public class BinarySearchTreeReview {

    Node root;

    BinarySearchTreeReview(){
        root = null;
    }
    class Node{

        Node right;
        Node left;

        int value;

        Node (int value){
            this.value = value;
            this.right = this.left = null;
        }
    }

    public void insert(int value){
        root = insertHelper(root,value);
    }

    public Node insertHelper(Node root,int value){

        if (root == null){
            Node newNode  = new Node(value);
            root = newNode;
            return root;
        } else if (root.value < value) {
            root.right = insertHelper(root.right,value);
        } else if (root.value > value) {
            root.left = insertHelper(root.left,value);
        }
        return root;
    }


    public ArrayList<Integer> thirdHighest(Node root , ArrayList<Integer>arr){

        int height = 0;
        if (root == null){
            return null;
        }
        thirdHighest(root.left,arr);
        arr.add(root.value);
        return arr;
    }



}

class MainReview {


    public static void main(String[] args) {

        BinarySearchTreeReview binarySearchTreeReview = new BinarySearchTreeReview();
        binarySearchTreeReview.insert(34);
        binarySearchTreeReview.insert(21);
        binarySearchTreeReview.insert(12);



        ArrayList<Integer> arr = binarySearchTreeReview.thirdHighest(binarySearchTreeReview.root,new ArrayList<>());




//        System.out.println(binarySearchTreeReview.height(binarySearchTreeReview.root));
    }


}
