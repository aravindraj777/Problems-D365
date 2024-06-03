package binarySearchTree;

public class BinarySearchTreeEleven {


    Node root;

    BinarySearchTreeEleven(){
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

        root = insertHelper(root,value);
    }

    public Node insertHelper(Node root,int value){

        if(root == null){
            Node newNode = new Node(value);
            root = newNode;
            return root;
        }

        if(value > root.value){
            root.right = insertHelper(root.right,value);
        }
        if(value < root.value){
            root.left = insertHelper(root.right,value);
        }
        return root;

    }


    public void delete(int value){
        root = deleteHelper(root,value);
    }

    public Node deleteHelper(Node root,int data){

        if(root == null){
            return null;
        }

        else if(root.value > data){
            root.left = deleteHelper(root.left,data);
        }
        else if (root.value < data){
            root.right = deleteHelper(root.right,data);
        }

        else{

            if(root.right == null && root.left ==null){
                return null;
            }

            else if(root.left == null){
                root = root.right;
            }
            else if (root.right == null){
                root = root.left;
            }
            else{

                int minimumVal = minimumValue(root.right);
                root.value = minimumVal;
                root.right = deleteHelper(root.right,minimumVal);
            }
        }
        return root;
    }

    public int minimumValue(Node root){

        Node curr = root;
        while (curr!= null){
            curr = curr.left;

        }
        return curr.value;
    }

}
