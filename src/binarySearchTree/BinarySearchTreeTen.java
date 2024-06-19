package binarySearchTree;

public class BinarySearchTreeTen {

    Node root;
    BinarySearchTreeTen(){
        root = null;
    }
    class Node {
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
            this.left = this.right  = null;
        }
    }

    public void insert(int value){
        root = insertionHelper(root,value);
    };
    public Node insertionHelper(Node root,int value){

        if (root == null){
            Node newNode  = new Node(value);
            root  = newNode;
            return root;
        } else if (root.value < value) {
            root.right = insertionHelper(root.right,value);

        }
        else if (root.value > value){
            root.left = insertionHelper(root.left,value);
        }
        return root;
    }

    public void delete(int value){
       root =  deletionHelper(root,value);
    }
    public Node deletionHelper(Node root,int value){

        if (root == null){
            return null;
        } else if (root.value < value) {
            root.right = deletionHelper(root.right,value);
        } else if (root.value > value) {
            root.left = deletionHelper(root.left,value);
        }
        else {
            if(root.right == null && root.left == null){
                return null;
            }
            else if( root.right == null){
                root = root.left;
            } else if (root.left == null) {
                root = root.right;
            }
            else {
                int minimumValue = rightMinValue(root.right);
                root.value = minimumValue;
                root.right = deletionHelper(root.right,minimumValue);
            }
        }
        return root;
    }

    public int rightMinValue(Node  root){

        Node curr = root;
        while (curr.left != null){
            curr = curr.left;
        }
        return curr.value;
    }

    public void inOrder(Node root){

        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.value + " ");
        inOrder(root.right);
    }
}

class TenMain{

    public static void main(String[] args) {

        BinarySearchTreeTen binarySearchTreeTen = new BinarySearchTreeTen();
        binarySearchTreeTen.insert(45);
        binarySearchTreeTen.insert(32);
        binarySearchTreeTen.insert(12);
        binarySearchTreeTen.insert(22);

        binarySearchTreeTen.inOrder(binarySearchTreeTen.root);
        System.out.println(binarySearchTreeTen.root.value);
        System.out.println("--------------------------");
        binarySearchTreeTen.delete(45);
        binarySearchTreeTen.inOrder(binarySearchTreeTen.root);
        System.out.println(binarySearchTreeTen.root.value);

    }
}
























