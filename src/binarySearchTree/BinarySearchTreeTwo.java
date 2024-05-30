package binarySearchTree;

public class BinarySearchTreeTwo {

    Node root;


    class Node {
        Node right;
        Node left;
        int value;

        Node(int value){
            this.value = value;
            this.right  = this.left = null;

        }
    }

    BinarySearchTreeTwo(){
        root = null;
    }

    public Node insert(Node root,int data){
        Node newNode = new Node(data);

        if(root == null){
            root = newNode;
            return root;
        }

        if(data < root.value){
            root.left = insert(root.left,data);
        } else if (data > root.value) {
            root.right = insert(root.right,data);
        }
        return root;
    }

    public void insertInToTree(int data){
        root = insert(root,data);
    }
}

class Main{

    public static void main(String[] args) {

        BinarySearchTreeTwo binarySearchTreeTwo =  new BinarySearchTreeTwo();
        binarySearchTreeTwo.insertInToTree(45);
        binarySearchTreeTwo.insertInToTree(30);
        binarySearchTreeTwo.insertInToTree(21);
        binarySearchTreeTwo.insertInToTree(60);


        System.out.println(binarySearchTreeTwo.root.value);
        System.out.println(binarySearchTreeTwo.root.left.value);
        System.out.println(binarySearchTreeTwo.root.left.left.value);
        System.out.println(binarySearchTreeTwo.root.right.value);
    }
}
