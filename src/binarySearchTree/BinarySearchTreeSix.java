package binarySearchTree;

public class BinarySearchTreeSix {

    Node root;
    BinarySearchTreeSix(){
        root = null;
    }
    class  Node {
        int value;
        Node right;
        Node left;
        Node(int value){
            this.value = value;
            this.right = this.left = null;
        }
    }

    public Node insertIntoNode(Node root, int value){

        if(root == null){
            root = new Node(value);
            return root;
        } else if (root.value > value) {
            root.left = insertIntoNode(root.left,value);
        } else if (root.value < value) {
            root.right = insertIntoNode(root.right,value);

        }
        return root;
    }
    public void insert(int value){
        root = insertIntoNode( root, value);
    }

    public void  delete(int value){
        root = deleteNode(root,value);
    }
    public Node deleteNode(Node root,int value){

        if(root == null){
            return null;
        } else if (root.value < value) {
            root.right = deleteNode(root.right,value);
        }
        else if (root.value > value){
            root.left = deleteNode(root.left,value);
        }

        else{
            if(root.right == null && root.left == null){
                return null;
            }
            else if(root.left == null){
                root = root.right;
            }
            else if(root.right == null){
                root = root.left;
            }
            else {
                int minimumVal = minimumVal(root.right);
                root.value = minimumVal;
                root.right = deleteNode(root.right,minimumVal);
            }
        }
        return root;
    }

    public int minimumVal(Node root){

        Node curr = root;
        while (curr.left!= null){
            curr = curr.left;
        }
        return curr.value;
    }
}

class SixMain {

    public static void main(String[] args) {

        BinarySearchTreeSix binarySearchTreeSix = new BinarySearchTreeSix();
        binarySearchTreeSix.insert(343);
        System.out.println(binarySearchTreeSix.root.value);
    }
}