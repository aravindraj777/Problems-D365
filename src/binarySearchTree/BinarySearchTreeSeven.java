package binarySearchTree;

public class BinarySearchTreeSeven {

    Node root;
    BinarySearchTreeSeven(){
        root = null;
    }
    class Node {

        Node right;
        Node left;
        int value;

        Node(int value){
            this.value = value;
            this.right = this.left = null;
        }
    }

    public void insert(int value){

       root =  insertInToTree(root,value);
    }
    public Node insertInToTree(Node root,int value){
        if (root == null) {
            root = new Node(value);
            return root;
        }
        else if (root.value > value){
            root.left = insertInToTree(root.left,value);
        } else if (root.value < value) {
            root.right = insertInToTree(root.right,value);
        }
        return root;

    }


    public void inOrder(Node root){

        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.value + " ");
        inOrder(root.right);
    }

    public void inOrder(){
        inOrder(root);
    }





}

class SevenMain {
    public static void main(String[] args) {

        BinarySearchTreeSeven binarySearchTreeSeven = new BinarySearchTreeSeven();
        binarySearchTreeSeven.insert(56);
        binarySearchTreeSeven.insert(56);
        binarySearchTreeSeven.insert(67);
        binarySearchTreeSeven.insert(32);
        binarySearchTreeSeven.insert(90);

//        System.out.println(binarySearchTreeSeven.root.value);
//        System.out.println(binarySearchTreeSeven.root.left.value);
//        System.out.println(binarySearchTreeSeven.root.right.value);

        binarySearchTreeSeven.inOrder();


    }
}
