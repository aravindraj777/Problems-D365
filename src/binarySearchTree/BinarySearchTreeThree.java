package binarySearchTree;

public class BinarySearchTreeThree {

    Node root;

    BinarySearchTreeThree(){
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
       root =  insert(root,value);
    }

    public Node insert(Node root, int data){
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

}


class ThreeMain{

    public static void main(String[] args) {

        BinarySearchTreeThree binarySearchTreeThree = new BinarySearchTreeThree();
        binarySearchTreeThree.insert(45);
        binarySearchTreeThree.insert(49);
        binarySearchTreeThree.insert(12);
        binarySearchTreeThree.insert(23);

        System.out.println(binarySearchTreeThree.root.value);
    }
}