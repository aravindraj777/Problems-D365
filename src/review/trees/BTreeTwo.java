package review.trees;

public class BTreeTwo {

    Node root;
    BTreeTwo(){
        root = null;
    }
    class Node{

        int value;
        Node right;
        Node left;

        Node(int value){
            this.value  = value;
            this.right = this.left = null;
        }
    }

    public void addNode(int value){
        root = addNodeHelper(root,value);
    }

    public Node addNodeHelper(Node root,int value){

        if (root == null){
            root = new Node(value);
            return root;
        } else if (root.value < value) {
            root.right = addNodeHelper(root.right,value);
        } else if (root.value > value) {
            root.left = addNodeHelper(root.left,value);
        }
        return root;
    }

    public void deleteNode(int value){
        root  = deletionHelper(root,value);
    }

    private Node deletionHelper(Node root,int value){

        if (root == null){
            return null;
        }

        else if (root.value < value){
            root.right = deletionHelper(root.right,value);
        } else if (root.value > value) {
            root.left = deletionHelper(root.left,value);
        }
        else{

            if (root.right == null && root.left == null){
                return null;
            } else if (root.left == null) {
                root = root.right;
            }
            else if (root.right == null){
                root = root.left;
            }
            else{
                int minimumVal = inOrderSuccessor(root.right);
                root.value = minimumVal;
                root.right = deletionHelper(root.right,minimumVal);
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
        System.out.println(root.value);
        inOrder(root.right);
    }
}

class BTTwoMain{

    public static void main(String[] args) {

        BTreeTwo bTreeTwo = new BTreeTwo();
        bTreeTwo.addNode(45);
        bTreeTwo.addNode(12);
        bTreeTwo.addNode(21);
        bTreeTwo.addNode(90);
        bTreeTwo.addNode(34);

        bTreeTwo.inOrder(bTreeTwo.root);
        System.out.println("==================");

        bTreeTwo.deleteNode(45);
        bTreeTwo.inOrder(bTreeTwo.root);
    }
}
