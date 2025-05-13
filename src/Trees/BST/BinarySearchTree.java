package Trees.BST;

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearchTree {

    Node root;
    class Node{

        Node right;
        Node left;
        int value;
        Node(int value){
            this.value = value;
            this.left = this.right = null;
        }

    }

    public void insert(int value){
        root = insertIntoTree(value, root);
    }

    public Node insertIntoTree(int value, Node root){

        if (root == null){
            root = new Node(value);
            return root;
        }
        if (root.value > value){
            root.left = insertIntoTree(value, root.left);
        }
        else if (root.value < value){
            root.right = insertIntoTree(value,root.right);
        }
        return root;
    }

    public void inOrder(Node root){

        ArrayList<Integer> arr = new ArrayList<>();
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.value);
        inOrder(root.right);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(20);
        tree.insert(30);
        tree.insert(15);
        tree.insert(33);

        tree.inOrder(tree.root);
    }
}
