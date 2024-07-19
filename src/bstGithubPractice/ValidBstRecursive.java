package bstGithubPractice;

     /*
    Determine whether a given binary tree is a BST or not
     */

public class ValidBstRecursive {

    Node root;
    ValidBstRecursive(){
        root = null;
    }
    class Node {
        int value;
        Node right;
        Node left;

        Node(int value){
            this.value = value;
            left = right = null;
        }
    }


    public void insert(int value){
        root = insertionHelper(root,value);
    }

    public Node insertionHelper(Node root,int value){

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

    public void isValidBst(Node root){

        if (isValidBst(root,Integer.MIN_VALUE,Integer.MAX_VALUE)){
            System.out.println("This tree is a binary search tree");
        }
        else {
            System.out.println("This is not a binary search tree");
        }
    }

    public boolean isValidBst(Node root, Integer min, Integer max){

        if (root == null){
            return true;
        }

        if (root.value < min || root.value > max){
            return false;
        }

        return isValidBst(root.left,min,root.value) && isValidBst(root.right,root.value,max);
    }

    public void inOrder(Node root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.value);
        inOrder(root.right);
    }

}

class MainValidBinarySearchTree{

    public static void main(String[] args) {
        ValidBstRecursive validation = new ValidBstRecursive();
        validation.insert(45);
        validation.insert(22);
        validation.insert(11);
        validation.insert(90);
        validation.insert(56);
        validation.insert(46);

        validation.inOrder(validation.root);
        validation.isValidBst(validation.root);
    }

}