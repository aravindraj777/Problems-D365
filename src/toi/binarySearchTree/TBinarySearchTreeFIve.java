package toi.binarySearchTree;

public class TBinarySearchTreeFIve {

    Node root;
    TBinarySearchTreeFIve(){
        root = null;
    }
   static class Node {

       Node right;
       Node left;
       int value;

       Node (int value){
           this.value = value;
           this.right = this.left = null;
       }
    }

    public void insert(int value){
         root = insertionHelper(root,value);
    }

    private Node insertionHelper(Node root,int value){

        if (root == null){
            root = new Node(value);
            return root;
        } else if (root.value > value) {
            root.left = insertionHelper(root.left,value);
        }
        else if (root.value < value) {
            root.right = insertionHelper(root.right, value);
        }
        return root;
    }

    public void printTreeInOrder(Node root){

        if (root == null){
            return;
        }
        printTreeInOrder(root.left);
        System.out.println(root.value + " ");
        printTreeInOrder(root.right);

    }

    public void deleteValueFromTree(int value){
        root = deletionHelper(value,root);
    }
    private Node deletionHelper(int value,Node root){

        if (root == null){
            return null;
        } else if (root.value > value) {
            root.left = deletionHelper(value,root.left);
        } else if (root.value < value) {
            root.right = deletionHelper(value,root.right);
        }

        else {

            if (root.left == null && root.right == null){
                return null;
            } else if (root.left == null) {
                root = root.right;
            }
            else if (root.right == null){
                root = root.left;
            }
            else {
                int minValueFromRight = minValueFromRight(root.right);
                root.value = minValueFromRight;
                root.right = deletionHelper(minValueFromRight,root.right);
            }

        }
        return root;
    }

    private int minValueFromRight(Node root){

        Node curr = root;
        while (curr.left != null){
            curr = curr.left;
        }
        return curr.value;
    }
}

class TreeFiveMain{

    public static void main(String[] args) {

        TBinarySearchTreeFIve tBinarySearchTreeFIve = new TBinarySearchTreeFIve();
        tBinarySearchTreeFIve.insert(56);
        tBinarySearchTreeFIve.insert(22);
        tBinarySearchTreeFIve.insert(12);
        tBinarySearchTreeFIve.insert(90);

        tBinarySearchTreeFIve.printTreeInOrder(tBinarySearchTreeFIve.root);
        tBinarySearchTreeFIve.deleteValueFromTree(22);
        System.out.println("============");
        tBinarySearchTreeFIve.printTreeInOrder(tBinarySearchTreeFIve.root);
    }
}
