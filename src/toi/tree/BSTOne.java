package toi.tree;

public class BSTOne {

    Node root;

    BSTOne(){
        root = null;
    }
   static class Node{

       Node right;
       Node left;
       int value;

       Node(int value){
           this.value = value;
           right = left = null;
       }
    }


    public void addNode(int value){
        root = addToTree(root,value);
    }
    private Node addToTree(Node root,int value){

        if (root == null){
            root = new Node(value);
            return root;
        } else if (root.value > value) {
            root.left = addToTree(root.left,value);
        } else if (root.value < value) {
            root.right = addToTree(root.right,value);
        }
        return root;
    }

    public void inOrder(Node root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.value);
        inOrder(root.right);
    }

    public void deleteNode(int value){
        root = deletionHelper(root,value);
    }
    private Node deletionHelper(Node root,int value){

        if (root == null){
            return null;
        } else if (root.value > value) {
            root.left = deletionHelper(root.left,value);

        } else if (root.value < value) {
            root.right = deletionHelper(root.right,value);
        }
        else {

            if (root.right == null && root.left == null){
                return null;
            } else if (root.left == null) {
                root = root.right;
            } else if (root.right == null) {
                root = root.left;
            }
            else {
                int minValue = inOrderSuccessor(root.right);
                root.value  = minValue;
                root.right = deletionHelper(root.right,minValue);
            }

        }
        return root;
    }

    private int inOrderSuccessor(Node root){
        Node curr = root;
        while (curr.left!= null){
            curr = curr.left;
        }
        return curr.value;
    }




}

class BSTOneMain{

    public static void main(String[] args) {
        BSTOne bstOne = new BSTOne();
        bstOne.addNode(89);
        bstOne.addNode(56);
        bstOne.addNode(90);
        bstOne.addNode(12);

        bstOne.inOrder(bstOne.root);
        System.out.println("---------------");
        bstOne.deleteNode(90);
        bstOne.inOrder(bstOne.root);
    }
}