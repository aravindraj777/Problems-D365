package review.trees;

public class BTreeThree {

    Node root;
    BTreeThree(){
        root = null;
    }
    class Node{

        Node right;
        Node left;
        int value;
        Node(int value){
            this.value = value;
            right = left  = null;
        }
    }

    public void addToTree(int value){
        root = insertionHelper(root,value);
    }

    public Node insertionHelper(Node root,int value){

        if (root == null){
            root = new Node(value);
            return root;
        } else if (root.value > value) {
            root.left = insertionHelper(root.left,value);
        } else if (root.value < value) {
            root.right = insertionHelper(root.right,value);
        }
        return root;
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
            }
            else if (root.right == null){
               root = root.left;
            }
            else if (root.left == null){
                root = root.right;
            }
            else {
                int minValue = inOrderSuccessor(root.right);
                root.value = minValue;
                root.right = deletionHelper(root.right,minValue);
            }
        }
        return root;
    }

    private int inOrderSuccessor(Node root){

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

class BThreeMain{

    public static void main(String[] args) {

        BTreeThree bTreeThree = new BTreeThree();
        bTreeThree.addToTree(50);
        bTreeThree.addToTree(21);
        bTreeThree.addToTree(32);
        bTreeThree.addToTree(54);
        bTreeThree.addToTree(20);

        bTreeThree.inOrder(bTreeThree.root);
        System.out.println("==============");
        bTreeThree.deleteNode(21);
        bTreeThree.inOrder(bTreeThree.root);
    }
}
