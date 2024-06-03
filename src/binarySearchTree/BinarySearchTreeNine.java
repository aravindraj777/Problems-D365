package binarySearchTree;

public class BinarySearchTreeNine {


    Node root;

    BinarySearchTreeNine (){
        root = null;
    }
    class Node {

        int value;
        Node right;
        Node left;

        Node (int value){
            this.value = value;
            this.right = this.left = null;
        }
    }

    public void insert(int value){
        root = insertionHelper(root,value);
    };
    public Node insertionHelper(Node root,int value){

        if (root == null){
            Node newNode =  new Node(value);
            root = newNode;
            return root;
        } else if (value < root.value) {
           root.left = insertionHelper(root.left,value);
        }
        else if (value > root.value){
            root.right = insertionHelper(root.right,value);
        }
        return root;
    }

    public void inOrder(Node root){

        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.value + " ");
        inOrder(root.right);
    }

    public void delete (int value){
        root  = deleteFromTree(root,value);
    }

    public Node  deleteFromTree(Node root, int value){


        if(root == null){
            return null;
        } else if (root.value > value) {
            root.left = deleteFromTree(root.left,value);
        }
        else if (root.value < value){
            root.right = deleteFromTree(root.right,value);
        }

        else {

            if(root.right == null && root.left == null){
                return null;
            } else if (root.left == null) {
                root = root.right;
            }
            else if (root.right == null){
                root = root.left;
            }
            else {

                int minimumValue = subTreeMin(root.right);
                root.value = minimumValue;
                root.right = deleteFromTree(root.right,minimumValue);
            }
        }
        return root;
    }

    public int subTreeMin(Node root){
       Node curr = root;

       while (curr != null){
           curr = curr.left;
        }
       return curr.value;
    }
}

class NineMain {

    public static void main(String[] args) {

        BinarySearchTreeNine binarySearchTreeNine = new BinarySearchTreeNine();
        binarySearchTreeNine.insert(56);
        binarySearchTreeNine.insert(21);
        binarySearchTreeNine.insert(32);
        binarySearchTreeNine.insert(33);
        binarySearchTreeNine.insert(22);

//      binarySearchTreeNine.inOrder(binarySearchTreeNine.root);
        binarySearchTreeNine.delete(21);
        binarySearchTreeNine.inOrder(binarySearchTreeNine.root);
    }
}
