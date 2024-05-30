package binarySearchTree;

public class BinarySearchTreeOne {

    Node root;
    class Node {

        int data;
        Node right;
        Node left;

        Node(int data){
            this.data = data;
        }
    }


    private Node rInsert(Node currentNode, int data){
        if(currentNode == null){
            return new Node(data);
        }
        if(data < currentNode.data){
            currentNode.left = rInsert(currentNode.left,data);
        }
        else if(data > currentNode.data){
            currentNode.right = rInsert(currentNode.right,data);
        }
        return currentNode;
    };

    public void rInsert(int data){
        if(root == null){
            root = new Node(data);
        }
        rInsert(root,data);
    }


}

class BinarySearchTreeOneMain {

    public static void main(String[] args) {

        BinarySearchTreeOne binarySearchTreeOne = new BinarySearchTreeOne();

        binarySearchTreeOne.rInsert(67);
        binarySearchTreeOne.rInsert(60);
        binarySearchTreeOne.rInsert(21);
        binarySearchTreeOne.rInsert(20);

        System.out.println(binarySearchTreeOne.root.data);
        System.out.println(binarySearchTreeOne.root.left.data);
        System.out.println(binarySearchTreeOne.root.left.left.data);
    }
}
