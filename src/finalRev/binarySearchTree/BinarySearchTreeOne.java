package finalRev.binarySearchTree;

public class BinarySearchTreeOne {


    Node root;
    BinarySearchTreeOne(){
        root = null;
    }
    class Node {
        String value;
        Node right;
        Node left;

        Node (String value){
            this.value = value;
            left = right = null;
        }
    }

    public void addNode(String value){
        root = addNodeHelper(root,value);
    }

    private Node addNodeHelper(Node root,String value){

        if (root == null){
            root = new Node(value);
            return root;
        }
        else if (root.value.compareTo(value) < 0){
            root.right = addNodeHelper(root.right,value);
        } else if (root.value.compareTo(value) > 0) {
            root.left = addNodeHelper(root.left,value);
        }
        return root;
    }

    public void inOrderTraversal(Node root){
        if (root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.value);
        inOrderTraversal(root.right);
    }


}

class BinarySearchTreeOneMain{

    public static void main(String[] args) {

        BinarySearchTreeOne binarySearchTreeOne = new BinarySearchTreeOne();
        binarySearchTreeOne.addNode("G");
        binarySearchTreeOne.addNode("A");
        binarySearchTreeOne.addNode("B");
        binarySearchTreeOne.addNode("I");
        binarySearchTreeOne.addNode("Z");

        binarySearchTreeOne.inOrderTraversal(binarySearchTreeOne.root);
    }
}